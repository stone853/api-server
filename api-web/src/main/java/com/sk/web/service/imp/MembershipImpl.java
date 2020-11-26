package com.sk.web.service.imp;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.sk.web.constant.CommonConstant;
import com.sk.web.mapper.MembershipMapper;
import com.sk.web.model.Membership;
import com.sk.web.model.MembershipExample;
import com.sk.web.service.MembershipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;


@Service
public class MembershipImpl extends BaseImpl<Membership, MembershipExample> implements MembershipService{
    @Autowired
    protected MembershipMapper<Membership> mapper;


    public String getToken(Membership user) {
        System.out.println(new Date(System.currentTimeMillis() + CommonConstant.EXPIRE_TIME));
        String token="";
        token= JWT.create().withExpiresAt(new Date(System.currentTimeMillis() + CommonConstant.EXPIRE_TIME))
                .withAudience(String.valueOf(user.getName()))
                .sign(Algorithm.HMAC256(user.getpassword()));
        return token;
    }

}
