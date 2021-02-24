package com.sk.web.controller;

import com.sk.model.ResultModel;
import com.sk.web.model.Purchase;
import com.sk.web.model.PurchaseExample;
import com.sk.web.service.PurchaseService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Api(tags = "进货信息")
@RestController
@RequestMapping("/purchase")
public class PurchaseController {
    @Autowired
    PurchaseService PurchaseService;

    @ApiOperation("查询进货信息")
    @ApiImplicitParam
    @GetMapping("/v1/selectAll")
    public ResultModel<Purchase> selectAll(Purchase t){
        return PurchaseService.selectAll(t);
    }

    @ApiOperation("查询单个进货")
    @ApiImplicitParams(value = {@ApiImplicitParam(name = "Purchase",dataTypeClass = Purchase.class , value ="")})
    @GetMapping("/v1/selectOne")
    public ResultModel<Purchase> selectOne(@RequestBody Purchase t){
        return PurchaseService.selectOne(t);
    }

    @ApiOperation("增加进货")
    @ApiImplicitParams(value = {@ApiImplicitParam(name = "Purchase",dataTypeClass = Purchase.class , value ="")})
    @PostMapping("/v1/insert")
    public ResultModel<Purchase> insert(@RequestBody Purchase t){
        return PurchaseService.insert(t);
    }

    @ApiOperation("删除进货")
    @ApiImplicitParams(value = {@ApiImplicitParam(name = "Purchase",dataTypeClass = Purchase.class , value ="")})
    @PostMapping("/v1/delete")
    public ResultModel<Purchase> delete(@RequestBody Purchase t){
        return PurchaseService.delete(t);
    }

    @ApiOperation("更新进货信息")
    @ApiImplicitParams(value = {@ApiImplicitParam(name = "Purchase",dataTypeClass = Purchase.class , value ="")})
    @PostMapping("/v1/update")
    public ResultModel<Purchase> update(@RequestBody Purchase t){
        PurchaseExample e = new PurchaseExample();
        e.createCriteria().andIdEqualTo(t.getId());
        return PurchaseService.update(t,e);
    }

}
