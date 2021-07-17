package com.sk.web.service;


import com.sk.model.ResultJsonModel;
import com.sk.model.ResultListModel;
import com.sk.page.PageRequest;
import com.sk.page.PageResult;

public interface BaseService<T,T1> {
    ResultListModel selectAll(T record);
    ResultListModel selectAll();
    ResultJsonModel selectOne(T record);
    ResultJsonModel<T> insert(T record);
    ResultJsonModel<T> update (T record, T1 object);
    ResultJsonModel<T> delete (T record);
    PageResult findPage(PageRequest pageRequest,T t);
}
