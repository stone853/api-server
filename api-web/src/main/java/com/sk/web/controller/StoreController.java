package com.sk.web.controller;

import com.sk.model.ResultModelImp;
import com.sk.page.PageRequest;
import com.sk.page.PageResult;
import com.sk.web.constant.RequestCommonPathConstant;
import com.sk.web.model.Store;
import com.sk.web.model.StoreExample;
import com.sk.web.service.StoreService;
import com.sk.web.utils.UserHelper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.*;

@Api(tags = "店铺信息")
@RestController
@RequestMapping(RequestCommonPathConstant.REQUEST_PROJECT_PATH+"/store")
public class StoreController {
    Logger log = LoggerFactory.getLogger(StoreController.class);

    @Autowired
    StoreService storeService;

    @ApiOperation("查询所有店铺信息")
    @GetMapping("/v1/selectAll")
    public ResultModelImp<Store> selectAll(@RequestHeader("token") String token, Store t){
        return storeService.selectAll(t);
    }

    @ApiOperation("分页查询所有店铺信息")
    @ApiImplicitParams(value = {@ApiImplicitParam(name = "PageRequest",dataTypeClass = PageRequest.class , value ="")})
    @GetMapping("/v1/selectPage")
    public PageResult selectPage(@RequestHeader("token") String token,PageRequest pageQuery,Store t){
        return storeService.findPage(pageQuery,t);
    }

    @ApiOperation("查询单个店铺信息")
    @ApiImplicitParams(value = {@ApiImplicitParam(name = "Store",dataTypeClass = Store.class , value ="")})
    @GetMapping("/v1/selectOne")
    public ResultModelImp<Store> selectOne(@RequestHeader("token") String token, Store t){
        t.setOpenid(UserHelper.getOpenId(token));
        return storeService.selectOne(t);
    }

    @ApiOperation("增加店铺信息")
    @ApiImplicitParams(value = {@ApiImplicitParam(name = "Store",dataTypeClass = Store.class , value ="")})
    @PostMapping("/v1/insert")
    public ResultModelImp<Store> insert(@RequestHeader("token") String token, @RequestBody Store t) {
        t.setCreatetime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
        return storeService.insert(t);
    }

    @ApiOperation("删除店铺信息")
    @ApiImplicitParams(value = {@ApiImplicitParam(name = "Store",dataTypeClass = Store.class , value ="")})
    @PostMapping("/v1/delete")
    public ResultModelImp<Store> delete(@RequestHeader("token") String token, @RequestBody Store t){
        return storeService.delete(t);
    }

    @ApiOperation("更新店铺信息")
    @ApiImplicitParams(value = {@ApiImplicitParam(name = "Store",dataTypeClass = Store.class , value ="")})
    @PostMapping("/v1/update")
    public ResultModelImp<Store> update(@RequestHeader("token") String token, @RequestBody Store t){
        StoreExample e = new StoreExample();
        e.createCriteria().andIdEqualTo(t.getId());
        t.setOpenid(UserHelper.getOpenId(token));
        return storeService.update(t,e);
    }

}
