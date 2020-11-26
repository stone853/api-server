package com.sk.web.model;

import javax.persistence.Table;
import java.math.BigDecimal;

@Table(name = "tcrm_membership")
public class Membership {
    private Integer id;

    private String name;

    private String password;

    private String phone;

    private Integer sex;

    private String level;

    private BigDecimal balance;

    private Integer count;

    public Integer getId() {
        return id;
    }

    public Membership setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Membership setName(String name) {
        this.name = name == null ? null : name.trim();
        return this;
    }

    public Membership setpassword(String password) {
        this.password = password;
        return this;
    }

    public String getpassword() {
        return password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level == null ? null : level.trim();
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}