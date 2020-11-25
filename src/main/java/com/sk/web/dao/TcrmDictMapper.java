package com.sk.web.dao;

import com.sk.web.model.TcrmDict;
import com.sk.web.model.TcrmDictExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TcrmDictMapper {
    long countByExample(TcrmDictExample example);

    int deleteByExample(TcrmDictExample example);

    int insert(TcrmDict record);

    int insertSelective(TcrmDict record);

    List<TcrmDict> selectByExample(TcrmDictExample example);

    int updateByExampleSelective(@Param("record") TcrmDict record, @Param("example") TcrmDictExample example);

    int updateByExample(@Param("record") TcrmDict record, @Param("example") TcrmDictExample example);
}