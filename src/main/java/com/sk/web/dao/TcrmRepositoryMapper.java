package com.sk.web.dao;

import com.sk.web.model.TcrmRepository;
import com.sk.web.model.TcrmRepositoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TcrmRepositoryMapper {
    long countByExample(TcrmRepositoryExample example);

    int deleteByExample(TcrmRepositoryExample example);

    int insert(TcrmRepository record);

    int insertSelective(TcrmRepository record);

    List<TcrmRepository> selectByExample(TcrmRepositoryExample example);

    int updateByExampleSelective(@Param("record") TcrmRepository record, @Param("example") TcrmRepositoryExample example);

    int updateByExample(@Param("record") TcrmRepository record, @Param("example") TcrmRepositoryExample example);
}