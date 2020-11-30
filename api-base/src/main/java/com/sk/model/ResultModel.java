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
    private String note;
    private List<T> list;

    public int getCode() {
        return code;
    }

    public ResultModel<T> setCode(int code) {
        this.code = code;
        return this;
    }

    public String getNote() {
        return note;
    }

    public ResultModel<T> setNote(String note) {
        this.note = note;
        return this;
    }

    public ResultModel<T> setList(List<T> list) {
        this.list = list;
        return this;
    }

    public List<T> getList() {
        return list;
    }
}
