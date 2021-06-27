package com.sk.web.model;

import com.sk.web.model.api.BaseModel;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Table(name = "tcrm_productinfo")
public class Productinfo extends BaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    //@NotNull(message = "产品名称不能为空")
    private String name;

    private String type;

    private String imgUrl;

    private String des;

    private String detail;

    private BigDecimal price;

    private BigDecimal priceDiscount;

    private String tag;

    private String subhead;

    private String isDiscount;

    private String createtime;

    private Integer orderNumber;

    public void setDes(String des) {
        this.des = des;
    }

    public String getDes() {
        return des;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    public Integer getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(Integer orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setIsDiscount(String isDiscount) {
        this.isDiscount = isDiscount;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getPriceDiscount() {
        return priceDiscount;
    }

    public void setPriceDiscount(BigDecimal priceDiscount) {
        this.priceDiscount = priceDiscount;
    }

    public String getTag() {
        return tag;
    }

    public void setSubhead(String subhead) {
        this.subhead = subhead;
    }

    public String getIsDiscount() {
        return isDiscount;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getSubhead() {
        return subhead;
    }


    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }


    public void setDetail(String detail) {
        this.detail = detail;
    }


    public String getImgUrl() {
        return imgUrl;
    }

    public String getDetail() {
        return detail;
    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

}