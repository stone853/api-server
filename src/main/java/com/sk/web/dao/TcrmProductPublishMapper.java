package com.sk.web.dao;

import com.sk.web.model.TcrmProductPublish;
import com.sk.web.model.TcrmProductPublishExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TcrmProductPublishMapper {
    long countByExample(TcrmProductPublishExample example);

    int deleteByExample(TcrmProductPublishExample example);

    int insert(TcrmProductPublish record);

    int insertSelective(TcrmProductPublish record);

    List<TcrmProductPublish> selectByExample(TcrmProductPublishExample example);

    int updateByExampleSelective(@Param("record") TcrmProductPublish record, @Param("example") TcrmProductPublishExample example);

    int updateByExample(@Param("record") TcrmProductPublish record, @Param("example") TcrmProductPublishExample example);
}