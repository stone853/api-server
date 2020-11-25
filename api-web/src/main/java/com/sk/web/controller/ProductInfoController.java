package com.sk.web.controller;

import com.sk.web.model.Productinfo;
import com.sk.web.model.ProductinfoExample;
import com.sk.web.service.ProductInfoService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.Map;

@Api(tags = "产品信息")
@RestController
@RequestMapping("/product")
public class ProductInfoController {
    @Autowired
    ProductInfoService productInfoService;

    @ApiOperation("查询所有产品")
    @ApiImplicitParam
    @GetMapping("/v1/selectAll")
    public Map<String, Object> selectAll(){
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("product",productInfoService.selectAll());


        return map;
    }

    @ApiOperation("查询单个产品")
    @ApiImplicitParams(value = {@ApiImplicitParam(name = "productInfo",dataTypeClass = Productinfo.class , value ="")})
    @GetMapping("/v1/selectOne")
    public Productinfo selectOne(@RequestBody Productinfo t){
        return productInfoService.selectOne(t);
    }

    @ApiOperation("增加产品")
    @ApiImplicitParams(value = {@ApiImplicitParam(name = "productInfo",dataTypeClass = Productinfo.class , value ="")})
    @PostMapping("/v1/insert")
    public String insert(@RequestBody Productinfo t) {
        productInfoService.insert(t);
        return "1";
    }

    @ApiOperation("删除产品")
    @ApiImplicitParams(value = {@ApiImplicitParam(name = "productInfo",dataTypeClass = Productinfo.class , value ="")})
    @PostMapping("/v1/delete")
    public int delete(@RequestBody Productinfo t){
        return productInfoService.delete(t);
    }

    @ApiOperation("更新产品信息")
    @ApiImplicitParams(value = {@ApiImplicitParam(name = "productInfo",dataTypeClass = Productinfo.class , value ="")})
    @PostMapping("/v1/update")
    public int update(@RequestBody Productinfo t){
        ProductinfoExample e = new ProductinfoExample();
        e.createCriteria().andIdEqualTo(t.getId());
        return productInfoService.update(t,e);
    }

}
