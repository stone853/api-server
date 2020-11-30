package com.sk.web.service.imp;

import com.alibaba.fastjson.JSONObject;
import com.sk.model.ResultEnum;
import com.sk.model.ResultModel;
import com.sk.web.service.BaseService;
import tk.mybatis.mapper.common.Mapper;

import java.util.ArrayList;
import java.util.List;

public abstract class BaseImpl<T,T1> implements BaseService<T,T1> {

    protected Mapper<T> mapper;

    public Mapper<T> getMapper() {
        return mapper;
    }

    public ResultModel<T> selectAll(T record) {
        return new ResultModel<T>().setCode(ResultEnum.SUCCESS.getCode()).setNote(ResultEnum.SUCCESS.getMsg()).setList(mapper.select(record));
    }

    public ResultModel<T> selectAll() {
        ResultModel<T> result = new ResultModel();
        JSONObject json = new JSONObject();
        json.put("list",mapper.selectAll());
        return result.setCode(ResultEnum.SUCCESS.getCode()).setNote(ResultEnum.SUCCESS.getMsg()).setList(mapper.selectAll());
    }

    public ResultModel<T> selectOne(T record) {
        ResultModel<T> result = new ResultModel();
        List<T> list = new ArrayList();
        list.add(mapper.selectOne(record));
        return result.setCode(ResultEnum.SUCCESS.getCode()).setNote(ResultEnum.SUCCESS.getMsg()).setList(list);
    }

    public ResultModel<T> insert(T record) {
        return new ResultModel<T>().setCode(mapper.insert(record));
    }

    public ResultModel<T> update (T record,T1 object) {
        return new ResultModel<T>().setCode(mapper.updateByExample(record,object)).setNote(ResultEnum.SUCCESS.getMsg());
    }

    public ResultModel<T> delete (T record) {
        return new ResultModel<T>().setCode(mapper.delete(record)).setNote(ResultEnum.SUCCESS.getMsg());
    }

}