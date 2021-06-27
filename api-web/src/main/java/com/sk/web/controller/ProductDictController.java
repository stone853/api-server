package com.sk.web.controller;

import com.sk.model.ResultModel;
import com.sk.page.PageRequest;
import com.sk.page.PageResult;
import com.sk.web.constant.RequestCommonPathConstant;

import com.sk.web.model.ProductDict;
import com.sk.web.model.Productinfo;
import com.sk.web.service.ProductDictService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Api(tags = "产品字典")
@RestController
@RequestMapping(RequestCommonPathConstant.REQUEST_PROJECT_PATH+"/product_dict")
public class ProductDictController {
    Logger log = LoggerFactory.getLogger(ProductDictController.class);

    @Autowired
    ProductDictService productDictService;

    @ApiOperation("查询列表")
    @GetMapping("/v1/selectAll")
    public ResultModel<ProductDict> selectAll(ProductDict t){
        return productDictService.selectAll(t);
    }


    @ApiOperation("分页查询所有字典")
    @ApiImplicitParams(value = {@ApiImplicitParam(name = "PageRequest",dataTypeClass = PageRequest.class , value ="")})
    @GetMapping("/v1/selectPage")
    public PageResult selectPage(@RequestHeader("token") String token, PageRequest pageQuery, ProductDict t){
        return productDictService.findPage(pageQuery,t);
    }

}
