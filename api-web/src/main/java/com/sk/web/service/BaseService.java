package com.sk.web.service;
import com.sk.model.ResultModel;
import com.sk.page.PageRequest;
import com.sk.page.PageResult;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;



public interface BaseService<T,T1> {
    ResultModel<T> selectAll(T record);
    ResultModel<T> selectAll();
    ResultModel<T> selectOne(T record);
    ResultModel<T> insert(T record);
    ResultModel<T> update (T record,T1 object);
    ResultModel<T> delete (T record);
}
