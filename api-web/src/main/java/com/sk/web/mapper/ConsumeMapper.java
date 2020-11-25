package com.sk.web.mapper;

import com.sk.web.model.Consume;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.common.Mapper;

@org.apache.ibatis.annotations.Mapper
@Component
public interface ConsumeMapper<T> extends Mapper<Consume> {

}
