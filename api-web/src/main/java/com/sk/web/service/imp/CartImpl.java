package com.sk.web.service.imp;

import com.sk.model.ResultEnum;
import com.sk.model.ResultJsonModel;
import com.sk.web.mapper.CartMapper;
import com.sk.web.model.Cart;
import com.sk.web.model.CartExample;
import com.sk.web.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartImpl extends BaseImpl<Cart, CartExample> implements CartService {


    @Autowired
    public void setMapper(CartMapper<Cart> mapper) {
        this.mapper = mapper;
    }



    @Override
    public ResultJsonModel<Cart> insert(Cart record) {
        Cart tmp = new Cart();
        tmp.setPid(record.getPid())
                .setColor(record.getColor())
                .setSize(record.getSize())
                .setOpenid(record.getOpenid());
        Cart c = mapper.selectOne(tmp);
        if (c != null) {
            CartExample e = new CartExample();
            e.createCriteria().andIdEqualTo(c.getId());
            return new ResultJsonModel<Cart>().setCode(mapper.updateByExample(c.setCount(c.getCount() + 1),e)).setMessage(ResultEnum.SUCCESS.getMsg());
        } else {
            return new ResultJsonModel<Cart>().setCode(mapper.insert(record)).setMessage(ResultEnum.SUCCESS.getMsg());
        }
    }


}
