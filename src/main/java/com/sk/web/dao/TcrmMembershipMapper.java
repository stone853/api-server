package com.sk.web.dao;

import com.sk.web.model.TcrmMembership;
import com.sk.web.model.TcrmMembershipExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TcrmMembershipMapper {
    long countByExample(TcrmMembershipExample example);

    int deleteByExample(TcrmMembershipExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TcrmMembership record);

    int insertSelective(TcrmMembership record);

    List<TcrmMembership> selectByExample(TcrmMembershipExample example);

    TcrmMembership selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TcrmMembership record, @Param("example") TcrmMembershipExample example);

    int updateByExample(@Param("record") TcrmMembership record, @Param("example") TcrmMembershipExample example);

    int updateByPrimaryKeySelective(TcrmMembership record);

    int updateByPrimaryKey(TcrmMembership record);
}