package com.sk.web.model.api;

import com.sk.web.model.CouponInfo;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Transient;

/**
 * @Author jinshi
 * @Date 2021/3/3 15:57
 * @Version 1.0
 */
public class BaseModel{
    @ApiModelProperty(value = "wechatCode", required = false)
    @Transient
    private String wechatCode;

    public BaseModel setWechatCode(String wechatCode) {
        this.wechatCode = wechatCode;
        return this;
    }

    public String getWechatCode() {
        return wechatCode;
    }
}
