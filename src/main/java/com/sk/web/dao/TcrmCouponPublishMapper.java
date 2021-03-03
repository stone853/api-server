package com.sk.web.dao;

import com.sk.web.model.TcrmCouponPublish;
import com.sk.web.model.TcrmCouponPublishExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TcrmCouponPublishMapper {
    long countByExample(TcrmCouponPublishExample example);

    int deleteByExample(TcrmCouponPublishExample example);

    int insert(TcrmCouponPublish record);

    int insertSelective(TcrmCouponPublish record);

    List<TcrmCouponPublish> selectByExample(TcrmCouponPublishExample example);

    int updateByExampleSelective(@Param("record") TcrmCouponPublish record, @Param("example") TcrmCouponPublishExample example);

    int updateByExample(@Param("record") TcrmCouponPublish record, @Param("example") TcrmCouponPublishExample example);
}