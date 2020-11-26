package com.sk.model;

import com.alibaba.fastjson.JSONObject;

/**
 * @Author jinshi
 * @Date 2020/11/26 10:54
 * @Version 1.0
 */
public class ResultModel {
    private int code;
    private String note;
    private JSONObject data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public void setData(JSONObject data) {
        this.data = data;
    }

    public JSONObject getData() {
        return data;
    }
}
