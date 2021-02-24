package com.sk.web.service.imp;

import com.sk.web.mapper.DictMapper;
import com.sk.web.model.Dict;
import com.sk.web.model.DictExample;
import com.sk.web.service.DictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DictImpl extends BaseImpl<Dict, DictExample> implements DictService {

    @Autowired
    public void setMapper(DictMapper<Dict> mapper) {
        this.mapper = mapper;
    }



}
