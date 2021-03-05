package com.sk.web.model;

import com.sk.web.model.api.BaseModel;

import javax.persistence.Table;

@Table(name = "tcrm_coupon_log")
public class CouponLog extends BaseModel {
    private Integer id;

    private Integer couponId;

    private String openId;

    private String phone;

    private String createtime;

    private String status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCouponId() {
        return couponId;
    }

    public CouponLog setCouponId(Integer couponId) {
        this.couponId = couponId;
        return this;
    }

    public String getOpenId() {
        return openId;
    }

    public CouponLog setOpenId(String openId) {
        this.openId = openId == null ? null : openId.trim();
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public CouponLog setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
        return this;
    }

    public String getCreatetime() {
        return createtime;
    }

    public CouponLog setCreatetime(String createtime) {
        this.createtime = createtime == null ? null : createtime.trim();
        return this;
    }

    public String getStatus() {
        return status;
    }

    public CouponLog setStatus(String status) {
        this.status = status == null ? null : status.trim();
        return this;
    }
}