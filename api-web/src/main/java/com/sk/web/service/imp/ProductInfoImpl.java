package com.sk.web.service.imp;

import com.alibaba.fastjson.JSONObject;
import com.sk.model.ResultEnum;
import com.sk.model.ResultJsonModel;
import com.sk.model.ResultListModel;
import com.sk.web.mapper.DictMapper;
import com.sk.web.mapper.ProductDictMapper;
import com.sk.web.mapper.ProductInfoMapper;
import com.sk.web.mapper.ProductPublishMapper;
import com.sk.web.model.*;
import com.sk.web.service.ProductInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ProductInfoImpl extends BaseImpl<Productinfo, ProductinfoExample> implements ProductInfoService{

    @Autowired
    ProductInfoMapper<Productinfo> productMapper;

    @Autowired
    ProductPublishMapper publishMapper;

    @Autowired
    ProductDictMapper productDictMapper;

    @Autowired
    public void setMapper(ProductInfoMapper<Productinfo> mapper) {
        this.mapper = mapper;
    }


    public ResultListModel<Productinfo> publish() {
        List<ProductPublish> list = publishMapper.publish();
        if (list == null || list.size() == 0) {
            return null;
        }
        String[] ids = list.get(0).getProductIds().split(",");
        return new ResultListModel<Productinfo>().setCode(ResultEnum.SUCCESS.getCode()).setMessage(ResultEnum.SUCCESS.getMsg()).setList(productMapper.publish(ids));
    }

    public ResultJsonModel selectDictProduct() {
        ProductDict tmp = new ProductDict();
        List d1 = productDictMapper.selectIdName(tmp.setParentcode("1"));
        List d2 = productDictMapper.selectIdName(tmp.setParentcode("100000"));
        List d3 = productDictMapper.selectIdName(tmp.setParentcode("101000"));
        JSONObject data = new JSONObject();
        data.put("t1",d1);
        data.put("t2",d2);
        data.put("t3",d3);

        List<Productinfo> proList = productMapper.select(new Productinfo().setType("101000"));
        data.put("prod",proList);
        return new ResultJsonModel().setCode(ResultEnum.SUCCESS.getCode()).setMessage(ResultEnum.SUCCESS.getMsg()).setData(data);

    }


    public ResultJsonModel selectDictProductII(String store,String pid) {
        ProductDict tmp = new ProductDict();
        List d3 = productDictMapper.selectIdName(tmp.setParentcode(pid));
        JSONObject data = new JSONObject();
        data.put("t3",d3);
        List proList = null;
        if (d3 !=null && d3.size() >0) {
            Map<String,String> j3 = (Map) d3.get(0);
            proList = productMapper.select(new Productinfo().setType(j3.get("id")));
        }
        data.put("prod",proList);
        return new ResultJsonModel().setCode(ResultEnum.SUCCESS.getCode()).setMessage(ResultEnum.SUCCESS.getMsg()).setData(data);

    }

    public ResultJsonModel selectDictProductIII(String store,String pid) {
        return new ResultJsonModel().setCode(ResultEnum.SUCCESS.getCode()).setMessage(ResultEnum.SUCCESS.getMsg()).setData(productMapper.select(new Productinfo().setType(pid)));

    }
}
