package com.sk.web.dao;

import com.sk.web.model.TcrmStore;
import com.sk.web.model.TcrmStoreExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TcrmStoreMapper {
    long countByExample(TcrmStoreExample example);

    int deleteByExample(TcrmStoreExample example);

    int insert(TcrmStore record);

    int insertSelective(TcrmStore record);

    List<TcrmStore> selectByExample(TcrmStoreExample example);

    int updateByExampleSelective(@Param("record") TcrmStore record, @Param("example") TcrmStoreExample example);

    int updateByExample(@Param("record") TcrmStore record, @Param("example") TcrmStoreExample example);
}