package com.sk.web.controller;

import com.sk.model.ResultModel;
import com.sk.web.model.Repository;
import com.sk.web.model.RepositoryExample;
import com.sk.web.service.RepositoryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Api(tags = "库存信息")
@RestController
@RequestMapping("/repository")
public class RepositoryController {
    @Autowired
    RepositoryService repositoryService;

    @ApiOperation("查询所有库存信息")
    @ApiImplicitParam
    @GetMapping("/v1/selectAll")
    public Map<String, Object> selectAll(){
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("repository",repositoryService.selectAll());
        return map;
    }

    @ApiOperation("查询单个库存")
    @ApiImplicitParams(value = {@ApiImplicitParam(name = "repository",dataTypeClass = Repository.class , value ="")})
    @PostMapping("/v1/selectOne")
    public ResultModel<Repository> selectOne(@RequestBody Repository t){
        return repositoryService.selectOne(t);
    }

    @ApiOperation("增加库存")
    @ApiImplicitParams(value = {@ApiImplicitParam(name = "repository",dataTypeClass = Repository.class , value ="")})
    @PostMapping("/v1/insert")
    public ResultModel<Repository> insert(@RequestBody Repository t){
        return repositoryService.insert(t);
    }

    @ApiOperation("删除库存")
    @ApiImplicitParams(value = {@ApiImplicitParam(name = "repository",dataTypeClass = Repository.class , value ="")})
    @PostMapping("/v1/delete")
    public ResultModel<Repository> delete(@RequestBody Repository t){
        return repositoryService.delete(t);
    }

    @ApiOperation("更新库存信息")
    @ApiImplicitParams(value = {@ApiImplicitParam(name = "repository",dataTypeClass = Repository.class , value ="")})
    @PostMapping("/v1/update")
    public ResultModel<Repository> update(@RequestBody Repository t){
        RepositoryExample e = new RepositoryExample();
        e.createCriteria().andIdEqualTo(t.getId());
        return repositoryService.update(t,e);
    }

}
