package com.sk.web.service;


import com.sk.model.ResultModel;
import com.sk.web.model.CouponInfo;
import com.sk.web.model.CouponInfoExample;
import com.sk.web.model.api.CouponInsertForWxModel;

public interface CouponInfoService extends BaseService<CouponInfo, CouponInfoExample>{
    ResultModel<CouponInfo> insertWx(CouponInsertForWxModel t);
}
