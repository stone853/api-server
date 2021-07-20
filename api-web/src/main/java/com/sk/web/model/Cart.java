package com.sk.web.model;

import javax.persistence.Table;
import java.math.BigDecimal;

@Table(name = "tcrm_cart")
public class Cart {
    private Integer id;

    private Integer pid;

    private String name;

    private BigDecimal price;

    private Integer count;

    private String imgUrl;

    private String color;

    private Double size;

    private String openid;

    private String createTime;

    public Integer getId() {
        return id;
    }

    public Cart setId(Integer id) {
        this.id = id;
        return this;
    }

    public Integer getPid() {
        return pid;
    }

    public Cart setPid(Integer pid) {
        this.pid = pid;
        return this;
    }

    public String getName() {
        return name;
    }

    public Cart setName(String name) {
        this.name = name == null ? null : name.trim();
        return this;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public Cart setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }

    public Integer getCount() {
        return count;
    }

    public Cart setCount(Integer count) {
        this.count = count;
        return this;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public Cart setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl == null ? null : imgUrl.trim();
        return this;
    }

    public String getColor() {
        return color;
    }

    public Cart setColor(String color) {
        this.color = color == null ? null : color.trim();
        return this;
    }

    public Double getSize() {
        return size;
    }

    public Cart setSize(Double size) {
        this.size = size;
        return this;
    }

    public String getOpenid() {
        return openid;
    }

    public Cart setOpenid(String openid) {
        this.openid = openid == null ? null : openid.trim();
        return this;
    }

    public String getCreateTime() {
        return createTime;
    }

    public Cart setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
        return this;
    }
}