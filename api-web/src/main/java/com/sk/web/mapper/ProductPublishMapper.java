package com.sk.web.mapper;

import java.util.List;

import com.sk.web.model.ProductPublish;
import org.springframework.stereotype.Component;

@Component
public interface ProductPublishMapper<T> extends BaseMapper<ProductPublish> {
    List<ProductPublish> publish();
}