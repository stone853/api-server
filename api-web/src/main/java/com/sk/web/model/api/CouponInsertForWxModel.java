package com.sk.web.model.api;

import com.sk.web.model.CouponInfo;
import io.swagger.annotations.ApiModelProperty;

/**
 * @Author jinshi
 * @Date 2021/3/3 15:57
 * @Version 1.0
 */
public class CouponInsertForWxModel extends CouponInfo implements  RequestBodyModel {
    @ApiModelProperty(value = "code", required = true)
    private String code;

    public CouponInsertForWxModel setCode(String code) {
        this.code = code;
        return this;
    }

    public String getCode() {
        return code;
    }
}
