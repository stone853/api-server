package com.sk.web.model;

import com.sk.web.model.api.BaseModel;

import javax.persistence.Table;

@Table(name = "tcrm_coupon_info")
public class CouponInfo extends BaseModel {
    private Integer id;

    private String couponCode;

    private String phone;

    private String openId;

    private String createtime;

    private String isEnable;

    private String status;

    public Integer getId() {
        return id;
    }

    public CouponInfo setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getCouponCode() {
        return couponCode;
    }

    public CouponInfo setCouponCode(String couponCode) {
        this.couponCode = couponCode == null ? null : couponCode.trim();
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getOpenId() {
        return openId;
    }

    public CouponInfo setOpenId(String openId) {
        this.openId = openId == null ? null : openId.trim();
        return this;
    }

    public String getCreatetime() {
        return createtime;
    }

    public CouponInfo setCreatetime(String createtime) {
        this.createtime = createtime == null ? null : createtime.trim();
        return this;
    }

    public String getIsEnable() {
        return isEnable;
    }

    public void setIsEnable(String isEnable) {
        this.isEnable = isEnable == null ? null : isEnable.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}