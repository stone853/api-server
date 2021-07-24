package com.sk.web.model;

import javax.persistence.Table;

@Table(name = "tcrm_product_dict")
public class ProductDict {
    private Short id;

    private String dictname;

    private String dictcode;

    private String parentcode;

    public Short getId() {
        return id;
    }

    public ProductDict setId(Short id) {
        this.id = id;
        return this;
    }

    public String getDictname() {
        return dictname;
    }

    public ProductDict setDictname(String dictname) {
        this.dictname = dictname == null ? null : dictname.trim();
        return this;
    }

    public String getDictcode() {
        return dictcode;
    }

    public ProductDict setDictcode(String dictcode) {
        this.dictcode = dictcode == null ? null : dictcode.trim();
        return this;
    }

    public String getParentcode() {
        return parentcode;
    }

    public ProductDict setParentcode(String parentcode) {
        this.parentcode = parentcode == null ? null : parentcode.trim();
        return this;
    }
}