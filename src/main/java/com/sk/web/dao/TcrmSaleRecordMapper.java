package com.sk.web.dao;

import com.sk.web.model.TcrmSaleRecord;
import com.sk.web.model.TcrmSaleRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TcrmSaleRecordMapper {
    long countByExample(TcrmSaleRecordExample example);

    int deleteByExample(TcrmSaleRecordExample example);

    int insert(TcrmSaleRecord record);

    int insertSelective(TcrmSaleRecord record);

    List<TcrmSaleRecord> selectByExample(TcrmSaleRecordExample example);

    int updateByExampleSelective(@Param("record") TcrmSaleRecord record, @Param("example") TcrmSaleRecordExample example);

    int updateByExample(@Param("record") TcrmSaleRecord record, @Param("example") TcrmSaleRecordExample example);
}