package com.sk.web.controller;

import com.sk.web.model.PurchaseDetail;
import com.sk.web.model.PurchaseDetailExample;
import com.sk.web.service.PurchaseDetailService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Api(tags = "进货单详情")
@RestController
@RequestMapping("/purchase_detail")
public class PurchaseDetailController {
    @Autowired
    PurchaseDetailService PurchaseDetailService;

    @ApiOperation("查询所有进货详情")
    @ApiImplicitParam
    @GetMapping("/v1/selectAll")
    public Map<String, Object> selectAll(){
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("purchase_detail",PurchaseDetailService.selectAll());


        return map;
    }

    @ApiOperation("查询单个进货详情")
    @ApiImplicitParams(value = {@ApiImplicitParam(name = "PurchaseDetail",dataTypeClass = PurchaseDetail.class , value ="")})
    @GetMapping("/v1/selectOne")
    public PurchaseDetail selectOne(@RequestBody PurchaseDetail t){
        return PurchaseDetailService.selectOne(t);
    }

    @ApiOperation("增加进货详情")
    @ApiImplicitParams(value = {@ApiImplicitParam(name = "PurchaseDetail",dataTypeClass = PurchaseDetail.class , value ="")})
    @PostMapping("/v1/insert")
    public String insert(@RequestBody PurchaseDetail t) {
        PurchaseDetailService.insert(t);
        return "1";
    }

    @ApiOperation("删除进货详情")
    @ApiImplicitParams(value = {@ApiImplicitParam(name = "PurchaseDetail",dataTypeClass = PurchaseDetail.class , value ="")})
    @PostMapping("/v1/delete")
    public int delete(@RequestBody PurchaseDetail t){
        return PurchaseDetailService.delete(t);
    }

    @ApiOperation("更新进货详情信息")
    @ApiImplicitParams(value = {@ApiImplicitParam(name = "PurchaseDetail",dataTypeClass = PurchaseDetail.class , value ="")})
    @PostMapping("/v1/update")
    public int update(@RequestBody PurchaseDetail t){
        PurchaseDetailExample e = new PurchaseDetailExample();
        e.createCriteria().andIdEqualTo(t.getId());
        return PurchaseDetailService.update(t,e);
    }

}
