package com.sk.web.service.imp;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sk.model.ResultEnum;
import com.sk.model.ResultJsonModel;
import com.sk.model.ResultListModel;
import com.sk.model.ResultModelImp;
import com.sk.page.PageRequest;
import com.sk.page.PageResult;
import com.sk.page.PageUtils;
import com.sk.web.mapper.BaseMapper;
import com.sk.web.service.BaseService;

import java.util.ArrayList;
import java.util.List;

/**
 * jinshi on 20201119
 * @param <T>
 * @param <T1>
 */

public abstract class BaseImpl<T,T1> implements BaseService<T,T1> {

    protected BaseMapper<T> mapper;

    public BaseMapper<T> getMapper() {
        return mapper;
    }

    public ResultListModel selectAll(T record) {
        return new ResultListModel<T>().setCode(ResultEnum.SUCCESS.getCode()).setMessage(ResultEnum.SUCCESS.getMsg()).setList(mapper.select(record));
    }

    public ResultListModel selectAll() {
        return new ResultListModel().setCode(ResultEnum.SUCCESS.getCode()).setMessage(ResultEnum.SUCCESS.getMsg()).setList(mapper.selectAll());
    }

    public ResultJsonModel selectOne(T record) {
        return new ResultJsonModel().setCode(ResultEnum.SUCCESS.getCode()).setMessage(ResultEnum.SUCCESS.getMsg()).setData(mapper.selectOne(record));
    }

    public ResultJsonModel<T> insert(T record) {
        return new ResultJsonModel<T>().setCode(mapper.insert(record)).setMessage(ResultEnum.SUCCESS.getMsg());
    }

    public ResultJsonModel<T> update (T record, T1 object) {
        return new ResultJsonModel<T>().setCode(mapper.updateByExampleSelective(record,object)).setMessage(ResultEnum.SUCCESS.getMsg());
    }

    public ResultJsonModel<T> delete (T record) {
        mapper.delete(record);
        return new ResultJsonModel<T>().setCode(ResultEnum.SUCCESS.getCode()).setMessage(ResultEnum.SUCCESS.getMsg());
    }


    public PageResult findPage(PageRequest pageRequest,T t) {
        return PageUtils.getPageResult(pageRequest, getPageInfo(pageRequest,t));
    }

    /**
     * 调用分页插件完成分页
     * @param
     * @return
     */
    protected PageInfo getPageInfo(PageRequest pageRequest,T t) {
        int pageNum = pageRequest.getPageNum();
        int pageSize = pageRequest.getPageSize();
        PageHelper.startPage(pageNum, pageSize);
        List sysMenus = mapper.selectPage(t);
        return new PageInfo(sysMenus);
    }

}