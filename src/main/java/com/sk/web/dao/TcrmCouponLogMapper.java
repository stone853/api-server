package com.sk.web.dao;

import com.sk.web.model.TcrmCouponLog;
import com.sk.web.model.TcrmCouponLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TcrmCouponLogMapper {
    long countByExample(TcrmCouponLogExample example);

    int deleteByExample(TcrmCouponLogExample example);

    int insert(TcrmCouponLog record);

    int insertSelective(TcrmCouponLog record);

    List<TcrmCouponLog> selectByExample(TcrmCouponLogExample example);

    int updateByExampleSelective(@Param("record") TcrmCouponLog record, @Param("example") TcrmCouponLogExample example);

    int updateByExample(@Param("record") TcrmCouponLog record, @Param("example") TcrmCouponLogExample example);
}