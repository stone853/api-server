package com.sk.web.dao;

import com.sk.web.model.TcrmProductinfo;
import com.sk.web.model.TcrmProductinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TcrmProductinfoMapper {
    long countByExample(TcrmProductinfoExample example);

    int deleteByExample(TcrmProductinfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TcrmProductinfo record);

    int insertSelective(TcrmProductinfo record);

    List<TcrmProductinfo> selectByExample(TcrmProductinfoExample example);

    TcrmProductinfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TcrmProductinfo record, @Param("example") TcrmProductinfoExample example);

    int updateByExample(@Param("record") TcrmProductinfo record, @Param("example") TcrmProductinfoExample example);

    int updateByPrimaryKeySelective(TcrmProductinfo record);

    int updateByPrimaryKey(TcrmProductinfo record);
}