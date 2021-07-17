package com.sk.web.controller;

import com.sk.model.ResultListModel;
import com.sk.model.ResultModelImp;
import com.sk.web.constant.RequestCommonPathConstant;
import com.sk.web.model.ConsumeHis;
import com.sk.web.model.ConsumeHisExample;
import com.sk.web.service.ConsumeHisService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@Api(tags = "消费历史信息")
@RestController
@RequestMapping(RequestCommonPathConstant.REQUEST_PROJECT_PATH+"/consume_his")
public class ConsumeHisController {
    @Autowired
    ConsumeHisService ConsumeHisService;

    @ApiOperation("查询所有消费历史")
    @ApiImplicitParam
    @GetMapping("/v1/selectAll")
    public ResultModelImp<ConsumeHis> selectAll(ConsumeHis t){
        return ConsumeHisService.selectAll(t);
    }

    @ApiOperation("查询单个消费历史")
    @ApiImplicitParams(value = {@ApiImplicitParam(name = "ConsumeHis",dataTypeClass = ConsumeHis.class , value ="")})
    @GetMapping("/v1/selectOne")
    public ResultModelImp<ConsumeHis> selectOne(ConsumeHis t){
        return ConsumeHisService.selectOne(t);
    }

    @ApiOperation("增加消费历史")
    @ApiImplicitParams(value = {@ApiImplicitParam(name = "ConsumeHis",dataTypeClass = ConsumeHis.class , value ="")})
    @PostMapping("/v1/insert")
    public ResultModelImp<ConsumeHis> insert(@RequestBody ConsumeHis t) {
        return ConsumeHisService.insert(t);

    }

    @ApiOperation("删除消费历史")
    @ApiImplicitParams(value = {@ApiImplicitParam(name = "ConsumeHis",dataTypeClass = ConsumeHis.class , value ="")})
    @PostMapping("/v1/delete")
    public ResultModelImp<ConsumeHis> delete(@RequestBody ConsumeHis t){
        return ConsumeHisService.delete(t);
    }

    @ApiOperation("更新消费历史信息")
    @ApiImplicitParams(value = {@ApiImplicitParam(name = "ConsumeHis",dataTypeClass = ConsumeHis.class , value ="")})
    @PostMapping("/v1/update")
    public ResultModelImp<ConsumeHis> update(@RequestBody ConsumeHis t){
        ConsumeHisExample e = new ConsumeHisExample();
        e.createCriteria().andIdEqualTo(t.getId());
        return ConsumeHisService.update(t,e);
    }

}
