package com.sk.web.model;

import javax.persistence.Table;
import java.math.BigDecimal;

@Table(name = "tcrm_membership")
public class Membership {
    private int id;

    private String name;

    private String password;

    private String phone;

    private int sex;

    private String level;

    private BigDecimal balance;

    private int count;

    public int getId() {
        return id;
    }

    public Membership setId(int id) {
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

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
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

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}