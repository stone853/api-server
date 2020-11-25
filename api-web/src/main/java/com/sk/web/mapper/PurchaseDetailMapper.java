package com.sk.web.mapper;

import com.sk.web.model.PurchaseDetail;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.common.Mapper;

@org.apache.ibatis.annotations.Mapper
@Component
public interface PurchaseDetailMapper<T> extends Mapper<PurchaseDetail> {

}
