package com.sk.web.dao;

import com.sk.web.model.TcrmConsumeDetail;
import com.sk.web.model.TcrmConsumeDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TcrmConsumeDetailMapper {
    long countByExample(TcrmConsumeDetailExample example);

    int deleteByExample(TcrmConsumeDetailExample example);

    int insert(TcrmConsumeDetail record);

    int insertSelective(TcrmConsumeDetail record);

    List<TcrmConsumeDetail> selectByExample(TcrmConsumeDetailExample example);

    int updateByExampleSelective(@Param("record") TcrmConsumeDetail record, @Param("example") TcrmConsumeDetailExample example);

    int updateByExample(@Param("record") TcrmConsumeDetail record, @Param("example") TcrmConsumeDetailExample example);
}