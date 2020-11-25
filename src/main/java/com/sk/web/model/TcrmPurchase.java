package com.sk.web.model;

import java.math.BigDecimal;

public class TcrmPurchase {
    private Integer id;

    private BigDecimal preMoney;

    private String status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getPreMoney() {
        return preMoney;
    }

    public void setPreMoney(BigDecimal preMoney) {
        this.preMoney = preMoney;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}