package com.sk.web.model;

import com.sk.web.model.api.BaseModel;

import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "tcrm_consume_his")
public class ConsumeHis extends BaseModel {
    private Integer id;

    private Integer consumeId;

    private String status;

    private BigDecimal price;

    private Date time;

    private BigDecimal prePrice;

    private Date preTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getConsumeId() {
        return consumeId;
    }

    public void setConsumeId(Integer consumeId) {
        this.consumeId = consumeId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public BigDecimal getPrePrice() {
        return prePrice;
    }

    public void setPrePrice(BigDecimal prePrice) {
        this.prePrice = prePrice;
    }

    public Date getPreTime() {
        return preTime;
    }

    public void setPreTime(Date preTime) {
        this.preTime = preTime;
    }
}