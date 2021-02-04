package com.sk.web.mapper;


import tk.mybatis.mapper.annotation.RegisterMapper;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @Author jinshi
 * @Date 2021/2/4 11:43
 * @Version 1.0
 */
@RegisterMapper
public interface BaseMapper<T> extends Mapper<T> {
    List<T> selectPage();
}
