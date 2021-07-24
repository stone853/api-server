package com.sk.web.mapper;

import java.util.List;

import com.alibaba.fastjson.JSONObject;
import com.sk.web.model.ProductDict;
import org.springframework.stereotype.Component;

@Component
public interface ProductDictMapper<T> extends BaseMapper<ProductDict> {
    List selectIdName(T t);
}