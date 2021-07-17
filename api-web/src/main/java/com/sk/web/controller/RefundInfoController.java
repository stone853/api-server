package com.sk.web.controller;

import com.sk.model.ResultModelImp;
import com.sk.web.constant.RequestCommonPathConstant;
import com.sk.web.model.RefundInfo;
import com.sk.web.model.RefundInfoExample;
import com.sk.web.service.RefundInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Api(tags = "退款信息")
@RestController
@RequestMapping(RequestCommonPathConstant.REQUEST_PROJECT_PATH+"/refund")
public class RefundInfoController {
    @Autowired
    RefundInfoService RefundInfoService;

    @ApiOperation("查询所有退款")
    @ApiImplicitParam
    @GetMapping("/v1/selectAll")
    public ResultModelImp<RefundInfo> selectAll(@RequestHeader("token") String token, RefundInfo t){
        return RefundInfoService.selectAll(t);
    }

    @ApiOperation("查询单个退款")
    @ApiImplicitParams(value = {@ApiImplicitParam(name = "RefundInfo",dataTypeClass = RefundInfo.class , value ="")})
    @GetMapping("/v1/selectOne")
    public ResultModelImp<RefundInfo> selectOne(@RequestHeader("token") String token, RefundInfo t){
        return RefundInfoService.selectOne(t);
    }

    @ApiOperation("增加退款")
    @ApiImplicitParams(value = {@ApiImplicitParam(name = "RefundInfo",dataTypeClass = RefundInfo.class , value ="")})
    @PostMapping("/v1/insert")
    public ResultModelImp<RefundInfo> insert(@RequestHeader("token") String token, @RequestBody RefundInfo t) {
        return RefundInfoService.insert(t);
    }

    @ApiOperation("删除退款")
    @ApiImplicitParams(value = {@ApiImplicitParam(name = "RefundInfo",dataTypeClass = RefundInfo.class , value ="")})
    @PostMapping("/v1/delete")
    public ResultModelImp<RefundInfo> delete(@RequestHeader("token") String token, @RequestBody RefundInfo t){
        return RefundInfoService.delete(t);
    }

    @ApiOperation("更新退款信息")
    @ApiImplicitParams(value = {@ApiImplicitParam(name = "RefundInfo",dataTypeClass = RefundInfo.class , value ="")})
    @PostMapping("/v1/update")
    public ResultModelImp<RefundInfo> update(@RequestHeader("token") String token, @RequestBody RefundInfo t){
        RefundInfoExample e = new RefundInfoExample();
        e.createCriteria().andIdEqualTo(t.getId());
        return RefundInfoService.update(t,e);
    }

}
