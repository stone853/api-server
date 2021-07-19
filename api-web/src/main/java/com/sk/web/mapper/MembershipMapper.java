package com.sk.web.mapper;

import com.alibaba.fastjson.JSONObject;
import com.sk.web.model.Membership;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public interface MembershipMapper<T> extends BaseMapper<Membership> {
    Map selectFullMem(T t);
}
