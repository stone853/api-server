package com.sk.web.dao;

import com.sk.web.model.TcrmConsume;
import com.sk.web.model.TcrmConsumeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TcrmConsumeMapper {
    long countByExample(TcrmConsumeExample example);

    int deleteByExample(TcrmConsumeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TcrmConsume record);

    int insertSelective(TcrmConsume record);

    List<TcrmConsume> selectByExample(TcrmConsumeExample example);

    TcrmConsume selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TcrmConsume record, @Param("example") TcrmConsumeExample example);

    int updateByExample(@Param("record") TcrmConsume record, @Param("example") TcrmConsumeExample example);

    int updateByPrimaryKeySelective(TcrmConsume record);

    int updateByPrimaryKey(TcrmConsume record);
}