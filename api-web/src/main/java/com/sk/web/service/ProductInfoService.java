package com.sk.web.service;

import com.sk.model.ResultListModel;
import com.sk.web.model.Productinfo;
import com.sk.web.model.ProductinfoExample;


public interface ProductInfoService extends BaseService<Productinfo, ProductinfoExample>{
    ResultListModel<Productinfo> publish();
}
