package com.sk.web.mapper;

import com.sk.web.model.Purchase;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.common.Mapper;

@org.apache.ibatis.annotations.Mapper
@Component
public interface PurchaseMapper<T> extends Mapper<Purchase> {

}
