package com.sk.web.mapper;

import com.sk.web.model.Membership;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.common.Mapper;

@org.apache.ibatis.annotations.Mapper
@Component
public interface MembershipMapper<T> extends Mapper<Membership> {

}
