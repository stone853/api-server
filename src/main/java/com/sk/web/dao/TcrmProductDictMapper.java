package com.sk.web.dao;

import com.sk.web.model.TcrmProductDict;
import com.sk.web.model.TcrmProductDictExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TcrmProductDictMapper {
    long countByExample(TcrmProductDictExample example);

    int deleteByExample(TcrmProductDictExample example);

    int insert(TcrmProductDict record);

    int insertSelective(TcrmProductDict record);

    List<TcrmProductDict> selectByExample(TcrmProductDictExample example);

    int updateByExampleSelective(@Param("record") TcrmProductDict record, @Param("example") TcrmProductDictExample example);

    int updateByExample(@Param("record") TcrmProductDict record, @Param("example") TcrmProductDictExample example);
}