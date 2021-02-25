package com.sk.web.controller;

import com.sk.model.ResultModel;
import com.sk.page.PageRequest;
import com.sk.page.PageResult;
import com.sk.web.constant.RequestCommonPathConstant;
import com.sk.web.model.Productinfo;
import com.sk.web.model.ProductinfoExample;
import com.sk.web.service.ProductInfoService;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.Map;

@Api(tags = "产品信息")
@RestController
@RequestMapping(RequestCommonPathConstant.REQUEST_PROJECT_PATH+"/product")
public class ProductInfoController {
    Logger log = LoggerFactory.getLogger(ProductInfoController.class);

    @Autowired
    ProductInfoService productInfoService;

    @ApiOperation("查询所有产品")
    @GetMapping("/v1/selectAll")
    public ResultModel<Productinfo> selectAll(@RequestHeader("token") String token,Productinfo t){
        return productInfoService.selectAll(t);
    }

    @ApiOperation("分页查询所有产品")
    @ApiImplicitParams(value = {@ApiImplicitParam(name = "PageRequest",dataTypeClass = PageRequest.class , value ="")})
    @GetMapping("/v1/selectPage")
    public PageResult selectPage(@RequestHeader("token") String token,PageRequest pageQuery,Productinfo t){
        return productInfoService.findPage(pageQuery,t);
    }


    @ApiOperation("查询单个产品")
    @ApiImplicitParams(value = {@ApiImplicitParam(name = "productInfo",dataTypeClass = Productinfo.class , value ="")})
    @GetMapping("/v1/selectOne")
    public ResultModel<Productinfo> selectOne(@RequestHeader("token") String token,Productinfo t){
        return productInfoService.selectOne(t);
    }

    @ApiOperation("增加产品")
    @ApiImplicitParams(value = {@ApiImplicitParam(name = "productInfo",dataTypeClass = Productinfo.class , value ="")})
    @PostMapping("/v1/insert")
    public ResultModel<Productinfo> insert(@RequestHeader("token") String token,@RequestBody Productinfo t) {
        return productInfoService.insert(t);
    }

    @ApiOperation("删除产品")
    @ApiImplicitParams(value = {@ApiImplicitParam(name = "productInfo",dataTypeClass = Productinfo.class , value ="")})
    @PostMapping("/v1/delete")
    public ResultModel<Productinfo> delete(@RequestHeader("token") String token,@RequestBody Productinfo t){
        return productInfoService.delete(t);
    }

    @ApiOperation("更新产品信息")
    @ApiImplicitParams(value = {@ApiImplicitParam(name = "productInfo",dataTypeClass = Productinfo.class , value ="")})
    @PostMapping("/v1/update")
    public ResultModel<Productinfo> update(@RequestHeader("token") String token,@RequestBody Productinfo t){
        ProductinfoExample e = new ProductinfoExample();
        e.createCriteria().andIdEqualTo(t.getId());
        return productInfoService.update(t,e);
    }

}
