package com.sk.web.dao;

import com.sk.web.model.TcrmPurchaseDetail;
import com.sk.web.model.TcrmPurchaseDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TcrmPurchaseDetailMapper {
    long countByExample(TcrmPurchaseDetailExample example);

    int deleteByExample(TcrmPurchaseDetailExample example);

    int insert(TcrmPurchaseDetail record);

    int insertSelective(TcrmPurchaseDetail record);

    List<TcrmPurchaseDetail> selectByExample(TcrmPurchaseDetailExample example);

    int updateByExampleSelective(@Param("record") TcrmPurchaseDetail record, @Param("example") TcrmPurchaseDetailExample example);

    int updateByExample(@Param("record") TcrmPurchaseDetail record, @Param("example") TcrmPurchaseDetailExample example);
}