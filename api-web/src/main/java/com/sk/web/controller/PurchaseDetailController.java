package com.sk.web.controller;

import com.sk.model.ResultModelImp;
import com.sk.web.constant.RequestCommonPathConstant;
import com.sk.web.model.PurchaseDetail;
import com.sk.web.model.PurchaseDetailExample;
import com.sk.web.service.PurchaseDetailService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@Api(tags = "进货单详情")
@RestController
@RequestMapping(RequestCommonPathConstant.REQUEST_PROJECT_PATH+"/purchase_detail")
public class PurchaseDetailController {
    @Autowired
    PurchaseDetailService PurchaseDetailService;

    @ApiOperation("查询所有进货详情")
    @ApiImplicitParam
    @GetMapping("/v1/selectAll")
    public ResultModelImp<PurchaseDetail> selectAll(@RequestHeader("token") String token, PurchaseDetail t){
        return PurchaseDetailService.selectAll(t);
    }

    @ApiOperation("查询单个进货详情")
    @ApiImplicitParams(value = {@ApiImplicitParam(name = "PurchaseDetail",dataTypeClass = PurchaseDetail.class , value ="")})
    @GetMapping("/v1/selectOne")
    public ResultModelImp<PurchaseDetail> selectOne(@RequestHeader("token") String token, PurchaseDetail t){
        return PurchaseDetailService.selectOne(t);
    }

    @ApiOperation("增加进货详情")
    @ApiImplicitParams(value = {@ApiImplicitParam(name = "PurchaseDetail",dataTypeClass = PurchaseDetail.class , value ="")})
    @PostMapping("/v1/insert")
    public ResultModelImp<PurchaseDetail> insert(@RequestHeader("token") String token, @RequestBody PurchaseDetail t) {
        return PurchaseDetailService.insert(t);
    }

    @ApiOperation("删除进货详情")
    @ApiImplicitParams(value = {@ApiImplicitParam(name = "PurchaseDetail",dataTypeClass = PurchaseDetail.class , value ="")})
    @PostMapping("/v1/delete")
    public ResultModelImp<PurchaseDetail> delete(@RequestHeader("token") String token, @RequestBody PurchaseDetail t){
        return PurchaseDetailService.delete(t);
    }

    @ApiOperation("更新进货详情信息")
    @ApiImplicitParams(value = {@ApiImplicitParam(name = "PurchaseDetail",dataTypeClass = PurchaseDetail.class , value ="")})
    @PostMapping("/v1/update")
    public ResultModelImp<PurchaseDetail> update(@RequestHeader("token") String token, @RequestBody PurchaseDetail t){
        PurchaseDetailExample e = new PurchaseDetailExample();
        e.createCriteria().andIdEqualTo(t.getId());
        return PurchaseDetailService.update(t,e);
    }

}
