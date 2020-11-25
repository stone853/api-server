package com.sk.web.dao;

import com.sk.web.model.TcrmRechargeinfo;
import com.sk.web.model.TcrmRechargeinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TcrmRechargeinfoMapper {
    long countByExample(TcrmRechargeinfoExample example);

    int deleteByExample(TcrmRechargeinfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TcrmRechargeinfo record);

    int insertSelective(TcrmRechargeinfo record);

    List<TcrmRechargeinfo> selectByExample(TcrmRechargeinfoExample example);

    TcrmRechargeinfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TcrmRechargeinfo record, @Param("example") TcrmRechargeinfoExample example);

    int updateByExample(@Param("record") TcrmRechargeinfo record, @Param("example") TcrmRechargeinfoExample example);

    int updateByPrimaryKeySelective(TcrmRechargeinfo record);

    int updateByPrimaryKey(TcrmRechargeinfo record);
}