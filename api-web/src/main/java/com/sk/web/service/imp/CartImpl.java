package com.sk.web.service.imp;

import com.sk.model.ResultEnum;
import com.sk.model.ResultListModel;
import com.sk.page.PageRequest;
import com.sk.page.PageResult;
import com.sk.page.PageUtils;
import com.sk.web.mapper.CartMapper;
import com.sk.web.model.Cart;
import com.sk.web.model.CartExample;
import com.sk.web.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CartImpl extends BaseImpl<Cart, CartExample> implements CartService {


    @Autowired
    public void setMapper(CartMapper<Cart> mapper) {
        this.mapper = mapper;
    }


}
