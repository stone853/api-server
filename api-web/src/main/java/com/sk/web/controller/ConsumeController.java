package com.sk.web.controller;


import com.sk.exception.BizException;
import com.sk.model.ResultModel;
import com.sk.web.constant.RequestCommonPathConstant;
import com.sk.web.model.Consume;
import com.sk.web.model.ConsumeExample;
import com.sk.web.service.ConsumeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Api(tags = "消费信息")
@RestController
@RequestMapping(RequestCommonPathConstant.REQUEST_PROJECT_PATH+"/consume")
public class ConsumeController {
    @Autowired
    ConsumeService consumeService;

    @ApiOperation("查询所有消费")
    @ApiImplicitParam
    @GetMapping("/v1/selectAll")
    public ResultModel<Consume> selectAll(@RequestHeader("token") String token,Consume t){
        return consumeService.selectAll(t);
    }

    @ApiOperation("查询单个消费")
    @ApiImplicitParams(value = {@ApiImplicitParam(name = "Consume",dataTypeClass = Consume.class , value ="")})
    @GetMapping("/v1/selectOne")
    public ResultModel<Consume> selectOne(@RequestHeader("token") String token, @RequestBody Consume t){
        return consumeService.selectOne(t);
        //return null;
    }

    @ApiOperation("增加消费")
    @ApiImplicitParams(value = {@ApiImplicitParam(name = "Consume",dataTypeClass = Consume.class , value ="")})
    @PostMapping("/v1/insert")
    public ResultModel<Consume> insert(@RequestHeader("token") String token,@RequestBody Consume t) {
        return consumeService.insert(t);
    }

    @ApiOperation("删除消费")
    @ApiImplicitParams(value = {@ApiImplicitParam(name = "Consume",dataTypeClass = Consume.class , value ="")})
    @PostMapping("/v1/delete")
    public ResultModel<Consume> delete(@RequestHeader("token") String token,@RequestBody Consume t){
        return consumeService.delete(t);
    }

    @ApiOperation("更新消费信息")
    @ApiImplicitParams(value = {@ApiImplicitParam(name = "Consume",dataTypeClass = Consume.class , value ="")})
    @PostMapping("/v1/update")
    public ResultModel<Consume> update(@RequestHeader("token") String token,@RequestBody Consume t){
        ConsumeExample e = new ConsumeExample();
        e.createCriteria().andIdEqualTo(t.getId());
        return consumeService.update(t,e);
    }

}
