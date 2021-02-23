package com.sk.model;

import com.alibaba.fastjson.JSONObject;

import java.util.List;

/**
 * @Author jinshi
 * @Date 2020/11/26 10:54
 * @Version 1.0
 */
public class ResultModel<T> {
    private int code;
    private String message;
    private List<T> list;

    public int getCode() {
        return code;
    }

    public ResultModel<T> setCode(int code) {
        this.code = code;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public ResultModel<T> setMessage(String message) {
        this.message = message;
        return this;
    }

    public ResultModel<T> setList(List<T> list) {
        if (null != list || list.size() >0) {
            this.list = list;
        }
        return this;
    }

    public List<T> getList() {
        return list;
    }
}
