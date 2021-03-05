package com.sk.web.model;

import com.sk.web.model.api.BaseModel;

import javax.persistence.Table;

@Table(name = "tcrm_product_image")
public class ProductImage extends BaseModel {
    private Integer id;

    private Integer productId;

    private String imgUrl;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl == null ? null : imgUrl.trim();
    }
}