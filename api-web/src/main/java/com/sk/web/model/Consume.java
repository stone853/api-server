package com.sk.web.model;

import com.sk.web.model.api.BaseModel;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "tcrm_consume")
public class Consume extends BaseModel {
    private Integer id;

    private Integer memId;

    private Date time;

    private Integer count;

    private BigDecimal price;

    private BigDecimal prePrice;

    private Date preTime;

    private String status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Consume setMemId(Integer memId) {
        this.memId = memId;
        return this;
    }

    public Integer getMemId() {
        return memId;
    }

    public Integer getCount() {
        return count;
    }

    public Consume setCount(Integer count) {
        this.count = count;
        return this;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public Consume setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }

    public BigDecimal getPrePrice() {
        return prePrice;
    }

    public Consume setPrePrice(BigDecimal prePrice) {
        this.prePrice = prePrice;
        return this;
    }

    public Date getPreTime() {
        return preTime;
    }

    public Consume setPreTime(Date preTime) {
        this.preTime = preTime;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public Consume setStatus(String status) {
        this.status = status == null ? null : status.trim();
        return this;
    }
}