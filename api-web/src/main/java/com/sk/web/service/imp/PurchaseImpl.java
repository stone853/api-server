package com.sk.web.service.imp;

import com.sk.web.mapper.PurchaseMapper;
import com.sk.web.model.Purchase;
import com.sk.web.model.PurchaseExample;
import com.sk.web.service.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PurchaseImpl extends BaseImpl<Purchase, PurchaseExample> implements PurchaseService {

    @Autowired
    public void setMapper(PurchaseMapper<Purchase> mapper) {
        this.mapper = mapper;
    }
}
