package com.sk.web.service.imp;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sk.model.ResultEnum;
import com.sk.model.ResultModel;
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

    public ResultModel<T> selectAll(T record) {
        return new ResultModel<T>().setCode(ResultEnum.SUCCESS.getCode()).setNote(ResultEnum.SUCCESS.getMsg()).setList(mapper.select(record));
    }

    public ResultModel<T> selectAll() {
        JSONObject json = new JSONObject();
        json.put("list",mapper.selectAll());
        return new ResultModel().setCode(ResultEnum.SUCCESS.getCode()).setNote(ResultEnum.SUCCESS.getMsg()).setList(mapper.selectAll());
    }

    public ResultModel<T> selectOne(T record) {
        List<T> list = new ArrayList();
        list.add(mapper.selectOne(record));
        return new ResultModel().setCode(ResultEnum.SUCCESS.getCode()).setNote(ResultEnum.SUCCESS.getMsg()).setList(list);
    }

    public ResultModel<T> insert(T record) {
        return new ResultModel<T>().setCode(mapper.insert(record)).setNote(ResultEnum.SUCCESS.getMsg());
    }

    public ResultModel<T> update (T record,T1 object) {
        return new ResultModel<T>().setCode(mapper.updateByExampleSelective(record,object)).setNote(ResultEnum.SUCCESS.getMsg());
    }

    public ResultModel<T> delete (T record) {
        return new ResultModel<T>().setCode(mapper.delete(record)).setNote(ResultEnum.SUCCESS.getMsg());
    }


    public PageResult findPage(PageRequest pageRequest) {
        return PageUtils.getPageResult(pageRequest, getPageInfo(pageRequest));
    }

    /**
     * 调用分页插件完成分页
     * @param
     * @return
     */
    private PageInfo<T> getPageInfo(PageRequest pageRequest) {
        int pageNum = pageRequest.getPageNum();
        int pageSize = pageRequest.getPageSize();
        PageHelper.startPage(pageNum, pageSize);
        List<T> sysMenus = mapper.selectPage();
        return new PageInfo<T>(sysMenus);
    }

}