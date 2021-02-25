package com.sk.web.controller;

import com.sk.model.ResultModel;
import com.sk.web.constant.RequestCommonPathConstant;
import com.sk.web.model.Dict;
import com.sk.web.service.DictService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



@Api(tags = "字典")
@RestController
@RequestMapping(RequestCommonPathConstant.REQUEST_PROJECT_PATH+"/dict")
public class DictController {
    Logger log = LoggerFactory.getLogger(DictController.class);

    @Autowired
    DictService dictService;

    @ApiOperation("查询列表")
    @GetMapping("/v1/selectAll")
    public ResultModel<Dict> selectAll(Dict t){
        return dictService.selectAll(t);
    }

}
