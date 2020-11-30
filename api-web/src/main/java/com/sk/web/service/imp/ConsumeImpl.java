package com.sk.web.service.imp;

import com.sk.web.mapper.ConsumeMapper;
import com.sk.web.model.Consume;
import com.sk.web.model.ConsumeExample;
import com.sk.web.service.ConsumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConsumeImpl extends BaseImpl<Consume, ConsumeExample> implements ConsumeService{

    @Autowired
    public void setMapper(ConsumeMapper<Consume> mapper) {
        this.mapper = mapper;
    }
}
