package com.sk.web.service.imp;

import com.sk.web.mapper.CouponLogMapper;
import com.sk.web.model.*;
import com.sk.web.service.CouponLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CouponLogImpl extends BaseImpl<CouponLog, CouponLogExample> implements CouponLogService {

    @Autowired
    public void setMapper(CouponLogMapper<CouponLog> mapper) {
        this.mapper = mapper;
    }


}
