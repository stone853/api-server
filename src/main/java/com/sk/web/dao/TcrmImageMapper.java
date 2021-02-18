package com.sk.web.dao;

import com.sk.web.model.TcrmImage;
import com.sk.web.model.TcrmImageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TcrmImageMapper {
    long countByExample(TcrmImageExample example);

    int deleteByExample(TcrmImageExample example);

    int insert(TcrmImage record);

    int insertSelective(TcrmImage record);

    List<TcrmImage> selectByExample(TcrmImageExample example);

    int updateByExampleSelective(@Param("record") TcrmImage record, @Param("example") TcrmImageExample example);

    int updateByExample(@Param("record") TcrmImage record, @Param("example") TcrmImageExample example);
}