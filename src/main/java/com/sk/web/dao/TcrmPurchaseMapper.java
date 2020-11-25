package com.sk.web.dao;

import com.sk.web.model.TcrmPurchase;
import com.sk.web.model.TcrmPurchaseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TcrmPurchaseMapper {
    long countByExample(TcrmPurchaseExample example);

    int deleteByExample(TcrmPurchaseExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TcrmPurchase record);

    int insertSelective(TcrmPurchase record);

    List<TcrmPurchase> selectByExample(TcrmPurchaseExample example);

    TcrmPurchase selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TcrmPurchase record, @Param("example") TcrmPurchaseExample example);

    int updateByExample(@Param("record") TcrmPurchase record, @Param("example") TcrmPurchaseExample example);

    int updateByPrimaryKeySelective(TcrmPurchase record);

    int updateByPrimaryKey(TcrmPurchase record);
}