package com.sk.web.controller;

import com.sk.model.ResultModel;
import com.sk.web.model.RefundInfo;
import com.sk.web.model.RefundInfoExample;
import com.sk.web.service.RefundInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Api(tags = "退款信息")
@RestController
@RequestMapping("/refund")
public class RefundInfoController {
    @Autowired
    RefundInfoService RefundInfoService;

    @ApiOperation("查询所有退款")
    @ApiImplicitParam
    @GetMapping("/v1/selectAll")
    public Map<String, Object> selectAll(){
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("refund",RefundInfoService.selectAll());


        return map;
    }

    @ApiOperation("查询单个退款")
    @ApiImplicitParams(value = {@ApiImplicitParam(name = "RefundInfo",dataTypeClass = RefundInfo.class , value ="")})
    @GetMapping("/v1/selectOne")
    public ResultModel<RefundInfo> selectOne(@RequestBody RefundInfo t){
        return RefundInfoService.selectOne(t);
    }

    @ApiOperation("增加退款")
    @ApiImplicitParams(value = {@ApiImplicitParam(name = "RefundInfo",dataTypeClass = RefundInfo.class , value ="")})
    @PostMapping("/v1/insert")
    public ResultModel<RefundInfo> insert(@RequestBody RefundInfo t) {
        return RefundInfoService.insert(t);
    }

    @ApiOperation("删除退款")
    @ApiImplicitParams(value = {@ApiImplicitParam(name = "RefundInfo",dataTypeClass = RefundInfo.class , value ="")})
    @PostMapping("/v1/delete")
    public ResultModel<RefundInfo> delete(@RequestBody RefundInfo t){
        return RefundInfoService.delete(t);
    }

    @ApiOperation("更新退款信息")
    @ApiImplicitParams(value = {@ApiImplicitParam(name = "RefundInfo",dataTypeClass = RefundInfo.class , value ="")})
    @PostMapping("/v1/update")
    public ResultModel<RefundInfo> update(@RequestBody RefundInfo t){
        RefundInfoExample e = new RefundInfoExample();
        e.createCriteria().andIdEqualTo(t.getId());
        return RefundInfoService.update(t,e);
    }

}
