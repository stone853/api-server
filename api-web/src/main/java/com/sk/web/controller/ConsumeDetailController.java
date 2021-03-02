package com.sk.web.controller;

import com.sk.model.ResultModel;
import com.sk.web.constant.RequestCommonPathConstant;
import com.sk.web.model.ConsumeDetail;
import com.sk.web.model.ConsumeDetailExample;
import com.sk.web.service.ConsumeDetailService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@Api(tags = "消费明细信息")
@RestController
@RequestMapping(RequestCommonPathConstant.REQUEST_PROJECT_PATH+"/consume_detail")
public class ConsumeDetailController {
    @Autowired
    ConsumeDetailService ConsumeDetailService;

    @ApiOperation("查询所有消费明细")
    @ApiImplicitParam
    @GetMapping("/v1/selectAll")
    public ResultModel<ConsumeDetail> selectAll(ConsumeDetail t){
        return ConsumeDetailService.selectAll(t);
    }

    @ApiOperation("查询单个消费明细")
    @ApiImplicitParams(value = {@ApiImplicitParam(name = "ConsumeDetail",dataTypeClass = ConsumeDetail.class , value ="")})
    @GetMapping("/v1/selectOne")
    public ResultModel<ConsumeDetail> selectOne(ConsumeDetail t){
        return ConsumeDetailService.selectOne(t);
    }

    @ApiOperation("增加消费明细")
    @ApiImplicitParams(value = {@ApiImplicitParam(name = "ConsumeDetail",dataTypeClass = ConsumeDetail.class , value ="")})
    @PostMapping("/v1/insert")
    public ResultModel<ConsumeDetail> insert(@RequestBody ConsumeDetail t) {
        return ConsumeDetailService.insert(t);
    }

    @ApiOperation("删除消费明细")
    @ApiImplicitParams(value = {@ApiImplicitParam(name = "ConsumeDetail",dataTypeClass = ConsumeDetail.class , value ="")})
    @PostMapping("/v1/delete")
    public ResultModel<ConsumeDetail> delete(@RequestBody ConsumeDetail t){
        return ConsumeDetailService.delete(t);
    }

    @ApiOperation("更新消费明细信息")
    @ApiImplicitParams(value = {@ApiImplicitParam(name = "ConsumeDetail",dataTypeClass = ConsumeDetail.class , value ="")})
    @PostMapping("/v1/update")
    public ResultModel<ConsumeDetail> update(@RequestBody ConsumeDetail t){
        ConsumeDetailExample e = new ConsumeDetailExample();
        e.createCriteria().andIdEqualTo(t.getId());
        return ConsumeDetailService.update(t,e);
    }

}
