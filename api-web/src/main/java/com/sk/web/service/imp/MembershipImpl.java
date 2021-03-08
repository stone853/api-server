package com.sk.web.service.imp;

import com.alibaba.fastjson.JSONObject;
import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;;
import com.sk.utils.HttpUtil;
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
    public void setMapper(MembershipMapper<Membership> mapper) {
        this.mapper = mapper;
    }

    public String getToken(Membership t) {
        return JWT.create().withExpiresAt(new Date(System.currentTimeMillis() + CommonConstant.EXPIRE_TIME))
                .withAudience(String.valueOf(t.getOpenId()))
                .sign(Algorithm.HMAC256(t.getPassword()));
    }


    public String getOpenId(int type,String code) {
        if (type == 0) {
            return "ole3v4pAwwi7OAMOC0_LZ44PPqzY";
        } else if (type == 1) { //从token中取
            return JWT.decode(code).getAudience().get(0);
        } else { //取微信
            if (null == code || "".equals(code)) {
                return null;
            }
            String result = new HttpUtil().sendGet("https://api.weixin.qq.com/sns/jscode2session", "appid=wx398d94f63a862743&secret=69173f5518a3099be7c9995953f301f3&js_code="+code+"&grant_type=authorization_code");
            JSONObject json = JSONObject.parseObject(result);
            if (!json.containsKey("openid")) {
                return null;
            }
            return json.getString("openid");
        }


    }
}
