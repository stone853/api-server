package com.sk.web.utils;

import com.auth0.jwt.JWT;

/**
 * @Author jinshi
 * @Date 2021/3/3 13:57
 * @Version 1.0
 */
public class UserHelper {
    public static String getPhone (String token) {
        if (null !=null && !"".equals(token)) {
            return JWT.decode(token).getAudience().get(0);
        }
        return "";

    }
}
