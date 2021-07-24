package com.sk.web.service.imp;

import com.sk.web.mapper.StoreMapper;
import com.sk.web.model.Store;
import com.sk.web.model.StoreExample;
import com.sk.web.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class StoreImpl extends BaseImpl<Store, StoreExample> implements StoreService {


    @Autowired
    public void setMapper(StoreMapper<Store> mapper) {
        this.mapper = mapper;
    }


}
