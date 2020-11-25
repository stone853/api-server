package com.sk.web.mapper;

import com.sk.web.model.Repository;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.common.Mapper;

@org.apache.ibatis.annotations.Mapper
@Component
public interface RepositoryMapper<T> extends Mapper<Repository> {

}
