package com.sk.web.service.imp;

import com.sk.web.mapper.RefundInfoMapper;
import com.sk.web.model.RefundInfo;
import com.sk.web.model.RefundInfoExample;
import com.sk.web.service.RefundInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class RefundInfoImpl extends BaseImpl<RefundInfo, RefundInfoExample> implements RefundInfoService{
    @Autowired
    protected RefundInfoMapper<RefundInfo> mapper;


}
