package com.sk.web.controller;

import com.sk.model.ResultModel;
import com.sk.web.model.RechargeInfo;
import com.sk.web.model.RechargeInfoExample;
import com.sk.web.service.RechargeInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Api(tags = "充值信息")
@RestController
@RequestMapping("/recharge")
public class RechargeInfoController {
    @Autowired
    RechargeInfoService RechargeInfoService;

    @ApiOperation("查询所有充值")
    @ApiImplicitParam
    @GetMapping("/v1/selectAll")
    public Map<String, Object> selectAll(){
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("recharge",RechargeInfoService.selectAll());


        return map;
    }

    @ApiOperation("查询单个充值")
    @ApiImplicitParams(value = {@ApiImplicitParam(name = "RechargeInfo",dataTypeClass = RechargeInfo.class , value ="")})
    @GetMapping("/v1/selectOne")
    public ResultModel<RechargeInfo> selectOne(@RequestBody RechargeInfo t){
        return RechargeInfoService.selectOne(t);
    }

    @ApiOperation("增加充值")
    @ApiImplicitParams(value = {@ApiImplicitParam(name = "RechargeInfo",dataTypeClass = RechargeInfo.class , value ="")})
    @PostMapping("/v1/insert")
    public ResultModel<RechargeInfo> insert(@RequestBody RechargeInfo t) {
        return RechargeInfoService.insert(t);
    }

    @ApiOperation("删除充值")
    @ApiImplicitParams(value = {@ApiImplicitParam(name = "RechargeInfo",dataTypeClass = RechargeInfo.class , value ="")})
    @PostMapping("/v1/delete")
    public ResultModel<RechargeInfo> delete(@RequestBody RechargeInfo t){
        return RechargeInfoService.delete(t);
    }

    @ApiOperation("更新充值信息")
    @ApiImplicitParams(value = {@ApiImplicitParam(name = "RechargeInfo",dataTypeClass = RechargeInfo.class , value ="")})
    @PostMapping("/v1/update")
    public ResultModel<RechargeInfo> update(@RequestBody RechargeInfo t){
        RechargeInfoExample e = new RechargeInfoExample();
        e.createCriteria().andIdEqualTo(t.getId());
        return RechargeInfoService.update(t,e);
    }

}
