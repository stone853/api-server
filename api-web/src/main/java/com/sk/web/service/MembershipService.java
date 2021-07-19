package com.sk.web.service;

import com.alibaba.fastjson.JSONObject;
import com.sk.model.ResultJsonModel;
import com.sk.web.model.Membership;
import com.sk.web.model.MembershipExample;


public interface MembershipService extends BaseService<Membership, MembershipExample>{
    String getToken (Membership user);
    String getOpenId (int type,String code);

    ResultJsonModel selectFullMy(Membership record);
}
