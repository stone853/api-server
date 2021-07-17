package com.sk.web.dao;

import com.sk.web.model.TcrmCart;
import com.sk.web.model.TcrmCartExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TcrmCartMapper {
    long countByExample(TcrmCartExample example);

    int deleteByExample(TcrmCartExample example);

    int insert(TcrmCart record);

    int insertSelective(TcrmCart record);

    List<TcrmCart> selectByExample(TcrmCartExample example);

    int updateByExampleSelective(@Param("record") TcrmCart record, @Param("example") TcrmCartExample example);

    int updateByExample(@Param("record") TcrmCart record, @Param("example") TcrmCartExample example);
}