package com.sk.web.service.imp;

import com.sk.web.mapper.ProductDictMapper;
import com.sk.web.model.ProductDict;
import com.sk.web.model.ProductDictExample;
import com.sk.web.service.ProductDictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductDictImpl extends BaseImpl<ProductDict, ProductDictExample> implements ProductDictService {

    @Autowired
    public void setMapper(ProductDictMapper<ProductDict> mapper) {
        this.mapper = mapper;
    }



}
