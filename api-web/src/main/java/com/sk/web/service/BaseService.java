package com.sk.web.service;
import java.util.List;

public interface BaseService<T,T1> {
    List<T> selectAll(T record);
    List<T> selectAll();
    T selectOne(T record);
    int insert(T record);
    int update (T record,T1 object);
    int delete (T record);
}
