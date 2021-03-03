package com.sk.web.service.imp;


import com.sk.web.mapper.CouponPublishMapper;
import com.sk.web.model.CouponPublish;
import com.sk.web.model.CouponPublishExample;
import com.sk.web.service.CouponPublishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CouponPublishImpl extends BaseImpl<CouponPublish, CouponPublishExample> implements CouponPublishService {

    @Autowired
    public void setMapper(CouponPublishMapper<CouponPublish> mapper) {
        this.mapper = mapper;
    }



}
