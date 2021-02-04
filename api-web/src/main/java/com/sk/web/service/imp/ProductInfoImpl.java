package com.sk.web.service.imp;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sk.page.PageRequest;
import com.sk.page.PageResult;
import com.sk.page.PageUtils;
import com.sk.web.mapper.ProductInfoMapper;
import com.sk.web.model.Productinfo;
import com.sk.web.model.ProductinfoExample;
import com.sk.web.service.ProductInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductInfoImpl extends BaseImpl<Productinfo, ProductinfoExample> implements ProductInfoService{

    @Autowired
    public void setMapper(ProductInfoMapper<Productinfo> mapper) {
        this.mapper = mapper;
    }



}
