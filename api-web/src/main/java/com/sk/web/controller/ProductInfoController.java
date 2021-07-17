package com.sk.web.controller;

import com.sk.model.ResultListModel;
import com.sk.model.ResultModelImp;
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

import java.text.SimpleDateFormat;
import java.util.Date;

@Api(tags = "产品信息")
@RestController
@RequestMapping(RequestCommonPathConstant.REQUEST_PROJECT_PATH+"/product")
public class ProductInfoController {
    Logger log = LoggerFactory.getLogger(ProductInfoController.class);

    @Autowired
    ProductInfoService productInfoService;

    @ApiOperation("查询所有产品")
    @GetMapping("/v1/selectAll")
    public ResultModelImp<Productinfo> selectAll(Productinfo t){
        return productInfoService.selectAll(t);
    }

    @ApiOperation("分页查询所有产品")
    @ApiImplicitParams(value = {@ApiImplicitParam(name = "PageRequest",dataTypeClass = PageRequest.class , value ="")})
    @GetMapping("/v1/selectPage")
    public PageResult selectPage(PageRequest pageQuery,Productinfo t){
        return productInfoService.findPage(pageQuery,t);
    }


    @ApiOperation("查询单个产品")
    @ApiImplicitParams(value = {@ApiImplicitParam(name = "productInfo",dataTypeClass = Productinfo.class , value ="")})
    @GetMapping("/v1/selectOne")
    public ResultModelImp<Productinfo> selectOne(Productinfo t){
        return productInfoService.selectOne(t);
    }

    @ApiOperation("增加产品")
    @ApiImplicitParams(value = {@ApiImplicitParam(name = "productInfo",dataTypeClass = Productinfo.class , value ="")})
    @PostMapping("/v1/insert")
    public ResultModelImp<Productinfo> insert(@RequestHeader("token") String token, @RequestBody Productinfo t) {
        t.setCreatetime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
        return productInfoService.insert(t);
    }

    @ApiOperation("删除产品")
    @ApiImplicitParams(value = {@ApiImplicitParam(name = "productInfo",dataTypeClass = Productinfo.class , value ="")})
    @PostMapping("/v1/delete")
    public ResultModelImp<Productinfo> delete(@RequestHeader("token") String token, @RequestBody Productinfo t){
        return productInfoService.delete(t);
    }

    @ApiOperation("更新产品信息")
    @ApiImplicitParams(value = {@ApiImplicitParam(name = "productInfo",dataTypeClass = Productinfo.class , value ="")})
    @PostMapping("/v1/update")
    public ResultModelImp<Productinfo> update(@RequestHeader("token") String token, @RequestBody Productinfo t){
        ProductinfoExample e = new ProductinfoExample();
        e.createCriteria().andIdEqualTo(t.getId());
        return productInfoService.update(t,e);
    }


    @ApiOperation("产品发布信息")
    @GetMapping("/v1/publish")
    public ResultListModel<Productinfo> publish(@RequestHeader("token") String token, Productinfo t){
        return productInfoService.publish();
    }






}
