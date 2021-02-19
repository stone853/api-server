package com.sk.web.dao;

import com.sk.web.model.TcrmProductImage;
import com.sk.web.model.TcrmProductImageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TcrmProductImageMapper {
    long countByExample(TcrmProductImageExample example);

    int deleteByExample(TcrmProductImageExample example);

    int insert(TcrmProductImage record);

    int insertSelective(TcrmProductImage record);

    List<TcrmProductImage> selectByExample(TcrmProductImageExample example);

    int updateByExampleSelective(@Param("record") TcrmProductImage record, @Param("example") TcrmProductImageExample example);

    int updateByExample(@Param("record") TcrmProductImage record, @Param("example") TcrmProductImageExample example);
}