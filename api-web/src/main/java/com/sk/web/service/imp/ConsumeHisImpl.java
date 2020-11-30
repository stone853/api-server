package com.sk.web.service.imp;

import com.sk.web.mapper.ConsumeHisMapper;
import com.sk.web.model.ConsumeHis;
import com.sk.web.model.ConsumeHisExample;
import com.sk.web.service.ConsumeHisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConsumeHisImpl extends BaseImpl<ConsumeHis, ConsumeHisExample> implements ConsumeHisService{

    @Autowired
    public void setMapper(ConsumeHisMapper<ConsumeHis> mapper) {
        super.mapper = mapper;
    }
}
