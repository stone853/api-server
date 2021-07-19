package com.sk.web.controller;

import com.sk.model.ResultModelImp;
import com.sk.page.PageRequest;
import com.sk.page.PageResult;
import com.sk.web.constant.RequestCommonPathConstant;
import com.sk.web.model.UserAddress;
import com.sk.web.model.UserAddressExample;
import com.sk.web.service.UserAddressService;
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
import java.util.stream.Collectors;

@Api(tags = "用户地址信息")
@RestController
@RequestMapping(RequestCommonPathConstant.REQUEST_PROJECT_PATH+"/user_address")
public class UserAddressController {
    Logger log = LoggerFactory.getLogger(UserAddressController.class);

    @Autowired
    UserAddressService userAddressService;

    @ApiOperation("查询所有用户地址")
    @GetMapping("/v1/selectAll")
    public ResultModelImp<UserAddress> selectAll(@RequestHeader("token") String token, UserAddress t){
        return userAddressService.selectAll(t);
    }

    @ApiOperation("分页查询所有用户地址")
    @ApiImplicitParams(value = {@ApiImplicitParam(name = "PageRequest",dataTypeClass = PageRequest.class , value ="")})
    @GetMapping("/v1/selectPage")
    public PageResult selectPage(@RequestHeader("token") String token,PageRequest pageQuery,UserAddress t){
        return userAddressService.findPage(pageQuery,t);
    }

    @ApiOperation("查询单个用户地址")
    @ApiImplicitParams(value = {@ApiImplicitParam(name = "UserAddress",dataTypeClass = UserAddress.class , value ="")})
    @GetMapping("/v1/selectOne")
    public ResultModelImp<UserAddress> selectOne(@RequestHeader("token") String token, UserAddress t){
        return userAddressService.selectOne(t.setOpenid(UserHelper.getOpenId(token)));
    }

    @ApiOperation("增加用户地址")
    @ApiImplicitParams(value = {@ApiImplicitParam(name = "UserAddress",dataTypeClass = UserAddress.class , value ="")})
    @PostMapping("/v1/insert")
    public ResultModelImp<UserAddress> insert(@RequestHeader("token") String token, @RequestBody UserAddress t) {
        return userAddressService.insert(t.setOpenid(UserHelper.getOpenId(token)));
    }

    @ApiOperation("删除用户地址")
    @ApiImplicitParams(value = {@ApiImplicitParam(name = "UserAddress",dataTypeClass = UserAddress.class , value ="")})
    @PostMapping("/v1/delete")
    public ResultModelImp<UserAddress> delete(@RequestHeader("token") String token, @RequestBody UserAddress t){
        return userAddressService.delete(t);
    }

    @ApiOperation("更新用户地址信息")
    @ApiImplicitParams(value = {@ApiImplicitParam(name = "UserAddress",dataTypeClass = UserAddress.class , value ="")})
    @PostMapping("/v1/update")
    public ResultModelImp<UserAddress> update(@RequestHeader("token") String token, @RequestBody UserAddress t){
        UserAddressExample e = new UserAddressExample();
        e.createCriteria().andIdEqualTo(t.getId());
        return userAddressService.update(t,e);
    }









}
