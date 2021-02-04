package com.sk.web.mapper;

import com.sk.web.model.Productinfo;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@org.apache.ibatis.annotations.Mapper
@Component
public interface ProductInfoMapper<T> extends Mapper<Productinfo> {
    List<Productinfo> selectPage();
}
