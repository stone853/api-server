package com.sk.web.dao;

import com.sk.web.model.TcrmConsumeDetail;
import com.sk.web.model.TcrmConsumeDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TcrmConsumeDetailMapper {
    long countByExample(TcrmConsumeDetailExample example);

    int deleteByExample(TcrmConsumeDetailExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TcrmConsumeDetail record);

    int insertSelective(TcrmConsumeDetail record);

    List<TcrmConsumeDetail> selectByExample(TcrmConsumeDetailExample example);

    TcrmConsumeDetail selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TcrmConsumeDetail record, @Param("example") TcrmConsumeDetailExample example);

    int updateByExample(@Param("record") TcrmConsumeDetail record, @Param("example") TcrmConsumeDetailExample example);

    int updateByPrimaryKeySelective(TcrmConsumeDetail record);

    int updateByPrimaryKey(TcrmConsumeDetail record);
}