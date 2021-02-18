package com.sk.web.dao;

import com.sk.web.model.TcrmConsumeHis;
import com.sk.web.model.TcrmConsumeHisExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TcrmConsumeHisMapper {
    long countByExample(TcrmConsumeHisExample example);

    int deleteByExample(TcrmConsumeHisExample example);

    int insert(TcrmConsumeHis record);

    int insertSelective(TcrmConsumeHis record);

    List<TcrmConsumeHis> selectByExample(TcrmConsumeHisExample example);

    int updateByExampleSelective(@Param("record") TcrmConsumeHis record, @Param("example") TcrmConsumeHisExample example);

    int updateByExample(@Param("record") TcrmConsumeHis record, @Param("example") TcrmConsumeHisExample example);
}