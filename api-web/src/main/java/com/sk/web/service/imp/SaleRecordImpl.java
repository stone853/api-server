package com.sk.web.service.imp;

import com.sk.web.mapper.SaleRecordMapper;
import com.sk.web.model.SaleRecord;
import com.sk.web.model.SaleRecordExample;
import com.sk.web.service.SaleRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SaleRecordImpl extends BaseImpl<SaleRecord, SaleRecordExample> implements SaleRecordService{

    @Autowired
    public void setMapper(SaleRecordMapper<SaleRecord> mapper) {
        this.mapper = mapper;
    }



}
