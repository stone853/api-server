package com.sk.web.service.imp;

import com.sk.model.ResultEnum;
import com.sk.model.ResultListModel;
import com.sk.web.mapper.ProductInfoMapper;
import com.sk.web.mapper.ProductPublishMapper;
import com.sk.web.model.ProductPublish;
import com.sk.web.model.Productinfo;
import com.sk.web.model.ProductinfoExample;
import com.sk.web.service.ProductInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductInfoImpl extends BaseImpl<Productinfo, ProductinfoExample> implements ProductInfoService{

    @Autowired
    ProductInfoMapper<Productinfo> productMapper;

    @Autowired
    ProductPublishMapper publishMapper;

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
}
