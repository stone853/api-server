package com.sk.web.service;

import com.sk.web.model.Membership;
import com.sk.web.model.MembershipExample;


public interface MembershipService extends BaseService<Membership, MembershipExample>{
    public String getToken(Membership user);
}
