package com.sk.web.dao;

import com.sk.web.model.TcrmPurchase;
import com.sk.web.model.TcrmPurchaseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TcrmPurchaseMapper {
    long countByExample(TcrmPurchaseExample example);

    int deleteByExample(TcrmPurchaseExample example);

    int insert(TcrmPurchase record);

    int insertSelective(TcrmPurchase record);

    List<TcrmPurchase> selectByExample(TcrmPurchaseExample example);

    int updateByExampleSelective(@Param("record") TcrmPurchase record, @Param("example") TcrmPurchaseExample example);

    int updateByExample(@Param("record") TcrmPurchase record, @Param("example") TcrmPurchaseExample example);
}