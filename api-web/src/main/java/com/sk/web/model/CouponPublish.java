package com.sk.web.model;

import javax.persistence.Table;
import java.math.BigDecimal;

@Table(name = "tcrm_coupon_publish")
public class CouponPublish {
    private Integer id;

    private String couponCode;

    private BigDecimal couponValue;

    private BigDecimal moneyOff;

    private String productType;

    private Integer count;

    private String publishTime;

    private String startTime;

    private String endTime;

    private String level;

    private String status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCouponCode() {
        return couponCode;
    }

    public CouponPublish setCouponCode(String couponCode) {
        this.couponCode = couponCode == null ? null : couponCode.trim();
        return this;
    }

    public BigDecimal getCouponValue() {
        return couponValue;
    }

    public void setCouponValue(BigDecimal couponValue) {
        this.couponValue = couponValue;
    }

    public BigDecimal getMoneyOff() {
        return moneyOff;
    }

    public void setMoneyOff(BigDecimal moneyOff) {
        this.moneyOff = moneyOff;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType == null ? null : productType.trim();
    }

    public Integer getCount() {
        return count;
    }

    public CouponPublish setCount(Integer count) {
        this.count = count;
        return this;
    }

    public String getPublishTime() {
        return publishTime;
    }

    public CouponPublish setPublishTime(String publishTime) {
        this.publishTime = publishTime == null ? null : publishTime.trim();
        return this;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime == null ? null : startTime.trim();
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime == null ? null : endTime.trim();
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level == null ? null : level.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}