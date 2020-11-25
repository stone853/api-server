package com.sk.web.dao;

import com.sk.web.model.TcrmRepository;
import com.sk.web.model.TcrmRepositoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TcrmRepositoryMapper {
    long countByExample(TcrmRepositoryExample example);

    int deleteByExample(TcrmRepositoryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TcrmRepository record);

    int insertSelective(TcrmRepository record);

    List<TcrmRepository> selectByExample(TcrmRepositoryExample example);

    TcrmRepository selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TcrmRepository record, @Param("example") TcrmRepositoryExample example);

    int updateByExample(@Param("record") TcrmRepository record, @Param("example") TcrmRepositoryExample example);

    int updateByPrimaryKeySelective(TcrmRepository record);

    int updateByPrimaryKey(TcrmRepository record);
}