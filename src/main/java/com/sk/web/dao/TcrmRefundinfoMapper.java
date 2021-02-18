package com.sk.web.dao;

import com.sk.web.model.TcrmRefundinfo;
import com.sk.web.model.TcrmRefundinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TcrmRefundinfoMapper {
    long countByExample(TcrmRefundinfoExample example);

    int deleteByExample(TcrmRefundinfoExample example);

    int insert(TcrmRefundinfo record);

    int insertSelective(TcrmRefundinfo record);

    List<TcrmRefundinfo> selectByExample(TcrmRefundinfoExample example);

    int updateByExampleSelective(@Param("record") TcrmRefundinfo record, @Param("example") TcrmRefundinfoExample example);

    int updateByExample(@Param("record") TcrmRefundinfo record, @Param("example") TcrmRefundinfoExample example);
}