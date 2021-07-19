package com.sk.web.service.imp;

import com.sk.web.mapper.UserAddressMapper;
import com.sk.web.model.UserAddress;
import com.sk.web.model.UserAddressExample;
import com.sk.web.service.UserAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserAddressImpl extends BaseImpl<UserAddress, UserAddressExample> implements UserAddressService {


    @Autowired
    public void setMapper(UserAddressMapper<UserAddress> mapper) {
        this.mapper = mapper;
    }


}
