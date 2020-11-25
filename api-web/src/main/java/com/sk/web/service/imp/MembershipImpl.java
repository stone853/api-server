package com.sk.web.service.imp;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.sk.web.mapper.MembershipMapper;
import com.sk.web.model.Membership;
import com.sk.web.model.MembershipExample;
import com.sk.web.service.MembershipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class MembershipImpl extends BaseImpl<Membership, MembershipExample> implements MembershipService{
    @Autowired
    protected MembershipMapper<Membership> mapper;


    public String getToken(Membership user) {
        String token="";
        token= JWT.create().withAudience(String.valueOf(user.getId()))
                .sign(Algorithm.HMAC256(user.getpassword()));
        return token;
    }

}
