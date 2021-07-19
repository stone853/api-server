package com.sk.web.dao;

import com.sk.web.model.TcrmUserAddress;
import com.sk.web.model.TcrmUserAddressExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TcrmUserAddressMapper {
    long countByExample(TcrmUserAddressExample example);

    int deleteByExample(TcrmUserAddressExample example);

    int insert(TcrmUserAddress record);

    int insertSelective(TcrmUserAddress record);

    List<TcrmUserAddress> selectByExample(TcrmUserAddressExample example);

    int updateByExampleSelective(@Param("record") TcrmUserAddress record, @Param("example") TcrmUserAddressExample example);

    int updateByExample(@Param("record") TcrmUserAddress record, @Param("example") TcrmUserAddressExample example);
}