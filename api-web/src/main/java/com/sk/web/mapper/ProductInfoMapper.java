package com.sk.web.mapper;

import com.sk.web.model.Productinfo;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ProductInfoMapper<T> extends BaseMapper<Productinfo> {
    List<Productinfo> publish(String[] ids);
}
