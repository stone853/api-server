package com.sk.web.model.api;

import io.swagger.annotations.ApiModelProperty;

/**
 * @Author jinshi
 * @Date 2021/2/22 14:54
 * @Version 1.0
 */
public class InsertForWxModel implements RequestBodyModel {
    @ApiModelProperty(value = "code", required = true)
    private String code;

    @ApiModelProperty(value = "名称", required = false)
    private String name;

    @ApiModelProperty(value = "性别", required = false)
    private int sex;

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getCode() {
        return code;
    }

}
