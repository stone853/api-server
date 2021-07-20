package com.sk.web.utils;

import com.auth0.jwt.JWT;
import com.sk.exception.BizException;

/**
 * @Author jinshi
 * @Date 2021/3/3 13:57
 * @Version 1.0
 */
public class UserHelper {
    public static String getPhone (String token) {
        if (null !=token && !"".equals(token)) {
            return JWT.decode(token).getAudience().get(0);
        }
        return "";

    }

    public static String getOpenId (String token) {
        try {
            if (null != token && !"".equals(token)) {
                return JWT.decode(token).getAudience().get(0);
            }
        } catch (BizException e) {
            e.printStackTrace();
        }
        return "";
    }
}
