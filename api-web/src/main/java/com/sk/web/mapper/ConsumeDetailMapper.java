package com.sk.web.mapper;

import com.sk.web.model.ConsumeDetail;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.common.Mapper;

@org.apache.ibatis.annotations.Mapper
@Component
public interface ConsumeDetailMapper<T> extends Mapper<ConsumeDetail> {

}
