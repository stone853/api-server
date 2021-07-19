package com.sk.web.model;

import javax.persistence.Table;

@Table(name = "tcrm_user_address")
public class UserAddress {
    private Integer id;

    private String address;

    private String phone;

    private String name;

    private Boolean isMain;

    private String openid;

    public Integer getId() {
        return id;
    }

    public UserAddress setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public UserAddress setAddress(String address) {
        this.address = address == null ? null : address.trim();
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public UserAddress setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
        return this;
    }

    public String getName() {
        return name;
    }

    public UserAddress setName(String name) {
        this.name = name == null ? null : name.trim();
        return this;
    }

    public Boolean getIsMain() {
        return isMain;
    }

    public UserAddress setIsMain(Boolean isMain) {
        this.isMain = isMain;
        return this;
    }

    public String getOpenid() {
        return openid;
    }

    public UserAddress setOpenid(String openid) {
        this.openid = openid == null ? null : openid.trim();
        return this;
    }
}