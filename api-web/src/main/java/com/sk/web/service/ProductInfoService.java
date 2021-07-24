package com.sk.web.service;

import com.sk.model.ResultJsonModel;
import com.sk.model.ResultListModel;
import com.sk.web.model.Productinfo;
import com.sk.web.model.ProductinfoExample;


public interface ProductInfoService extends BaseService<Productinfo, ProductinfoExample>{
    ResultListModel<Productinfo> publish();

    ResultJsonModel selectDictProduct();

    ResultJsonModel selectDictProductII(String code,String pid);

    ResultJsonModel selectDictProductIII(String code,String pid);
}

