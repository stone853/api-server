package com.sk.web.dao;

import com.sk.web.model.TcrmCouponInfo;
import com.sk.web.model.TcrmCouponInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TcrmCouponInfoMapper {
    long countByExample(TcrmCouponInfoExample example);

    int deleteByExample(TcrmCouponInfoExample example);

    int insert(TcrmCouponInfo record);

    int insertSelective(TcrmCouponInfo record);

    List<TcrmCouponInfo> selectByExample(TcrmCouponInfoExample example);

    int updateByExampleSelective(@Param("record") TcrmCouponInfo record, @Param("example") TcrmCouponInfoExample example);

    int updateByExample(@Param("record") TcrmCouponInfo record, @Param("example") TcrmCouponInfoExample example);
}