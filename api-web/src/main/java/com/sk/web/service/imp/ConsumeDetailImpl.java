package com.sk.web.service.imp;

import com.sk.web.mapper.ConsumeDetailMapper;
import com.sk.web.model.ConsumeDetail;
import com.sk.web.model.ConsumeDetailExample;
import com.sk.web.service.ConsumeDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ConsumeDetailImpl extends BaseImpl<ConsumeDetail, ConsumeDetailExample> implements ConsumeDetailService{
    @Autowired
    protected ConsumeDetailMapper<ConsumeDetail> mapper;


}
