package com.sk.web.service.imp;

import com.sk.web.mapper.PurchaseDetailMapper;
import com.sk.web.model.PurchaseDetail;
import com.sk.web.model.PurchaseDetailExample;
import com.sk.web.service.PurchaseDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PurchaseDetailImpl extends BaseImpl<PurchaseDetail, PurchaseDetailExample> implements PurchaseDetailService {

    @Autowired
    public void setMapper(PurchaseDetailMapper<PurchaseDetail> mapper) {
        this.mapper = mapper;
    }
}
