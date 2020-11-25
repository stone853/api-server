package com.sk.web.service.imp;

import com.sk.web.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public abstract class BaseImpl<T,T1> implements BaseService<T,T1> {
    @Autowired
    protected Mapper<T> mapper;

    public Mapper<T> getMapper() {
        return mapper;
    }

    @Override
    public List<T> selectAll(T record) {
        return mapper.select(record);
    }

    @Override
    public List<T> selectAll() {
        return mapper.selectAll();
    }

    public T selectOne(T record) {
        return mapper.selectOne(record);
    }


    public int insert(T record) {
        return mapper.insert(record);
    }

    public int update (T record,T1 object) {
        return mapper.updateByExample(record,object);
    }

    public int delete (T record) {
        return mapper.delete(record);
    }

}