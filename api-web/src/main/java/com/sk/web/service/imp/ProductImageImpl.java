package com.sk.web.service.imp;

import com.sk.web.mapper.ProductImageMapper;
import com.sk.web.model.ProductImage;
import com.sk.web.model.ProductImageExample;
import com.sk.web.service.ProductImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductImageImpl extends BaseImpl<ProductImage, ProductImageExample> implements ProductImageService {

    @Autowired
    public void setMapper(ProductImageMapper<ProductImage> mapper) {
        this.mapper = mapper;
    }


}
