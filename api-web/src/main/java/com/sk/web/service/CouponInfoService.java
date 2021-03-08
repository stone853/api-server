package com.sk.web.service;


import com.sk.model.ResultModel;
import com.sk.web.model.CouponInfo;
import com.sk.web.model.CouponInfoExample;

public interface CouponInfoService extends BaseService<CouponInfo, CouponInfoExample>{
    ResultModel<CouponInfo> update(CouponInfo t, CouponInfoExample e, String openId);
}
