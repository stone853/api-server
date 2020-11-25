package com.sk.web.service.imp;

import com.sk.web.mapper.RechargeInfoMapper;
import com.sk.web.model.RechargeInfo;
import com.sk.web.model.RechargeInfoExample;
import com.sk.web.service.RechargeInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class RechargeInfoImpl extends BaseImpl<RechargeInfo, RechargeInfoExample> implements RechargeInfoService{
    @Autowired
    protected RechargeInfoMapper<RechargeInfo> mapper;


}
