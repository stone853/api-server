package com.sk.web.controller;

import com.sk.model.ResultModel;
import com.sk.page.PageRequest;
import com.sk.page.PageResult;
import com.sk.web.constant.RequestCommonPathConstant;
import com.sk.web.model.SaleRecord;
import com.sk.web.model.SaleRecordExample;
import com.sk.web.service.SaleRecordService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@Api(tags = "销售记录")
@RestController
@RequestMapping(RequestCommonPathConstant.REQUEST_PROJECT_PATH+"/sale_record")
public class SaleRecordController {
    Logger log = LoggerFactory.getLogger(SaleRecordController.class);

    @Autowired
    SaleRecordService SaleRecordService;

    @ApiOperation("查询销售记录")
    @GetMapping("/v1/selectAll")
    public ResultModel<SaleRecord> selectAll(@RequestHeader("token") String token,SaleRecord t){
        return SaleRecordService.selectAll(t);
    }

    @ApiOperation("分页查询销售记录")
    @ApiImplicitParams(value = {@ApiImplicitParam(name = "PageRequest",dataTypeClass = PageRequest.class , value ="")})
    @GetMapping("/v1/selectPage")
    public PageResult selectPage(@RequestHeader("token") String token,PageRequest pageQuery,SaleRecord t){
        return SaleRecordService.findPage(pageQuery,t);
    }


    @ApiOperation("查询单个产品")
    @ApiImplicitParams(value = {@ApiImplicitParam(name = "SaleRecord",dataTypeClass = SaleRecord.class , value ="")})
    @GetMapping("/v1/selectOne")
    public ResultModel<SaleRecord> selectOne(@RequestHeader("token") String token,SaleRecord t){
        return SaleRecordService.selectOne(t);
    }

    @ApiOperation("增加产品")
    @ApiImplicitParams(value = {@ApiImplicitParam(name = "SaleRecord",dataTypeClass = SaleRecord.class , value ="")})
    @PostMapping("/v1/insert")
    public ResultModel<SaleRecord> insert(@RequestHeader("token") String token,@RequestBody SaleRecord t) {
        return SaleRecordService.insert(t);
    }

    @ApiOperation("删除产品")
    @ApiImplicitParams(value = {@ApiImplicitParam(name = "SaleRecord",dataTypeClass = SaleRecord.class , value ="")})
    @PostMapping("/v1/delete")
    public ResultModel<SaleRecord> delete(@RequestHeader("token") String token,@RequestBody SaleRecord t){
        return SaleRecordService.delete(t);
    }

    @ApiOperation("更新产品信息")
    @ApiImplicitParams(value = {@ApiImplicitParam(name = "SaleRecord",dataTypeClass = SaleRecord.class , value ="")})
    @PostMapping("/v1/update")
    public ResultModel<SaleRecord> update(@RequestHeader("token") String token,@RequestBody SaleRecord t){
        SaleRecordExample e = new SaleRecordExample();
        e.createCriteria().andIdEqualTo(t.getId());
        return SaleRecordService.update(t,e);
    }



}
