package com.sk.web.controller;

import com.alibaba.fastjson.JSONObject;
import com.sk.web.model.Consume;
import com.sk.web.model.Membership;
import com.sk.web.model.User;
import com.sk.web.service.MembershipService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;


@Api(tags = "用户接口")
@RestController
@RequestMapping("/user")
public class UserApi {
    @Autowired
    MembershipService membershipService;

    @ApiOperation("登陆")
    @ApiImplicitParams(value = {@ApiImplicitParam(name = "User",dataTypeClass = User.class , value ="")})
    @PostMapping("/v1/login")
    public Object login(@RequestBody User user){
        JSONObject jsonObject=new JSONObject();
        Membership userForBase=membershipService.selectOne(new Membership().setName(user.getName()).setpassword(user.getPassword()));
        if(userForBase==null){
            jsonObject.put("message","用户名或密码错误");
            return jsonObject;
        }
        String token = membershipService.getToken(userForBase);
        jsonObject.put("token", token);
        jsonObject.put("user", userForBase);
        return jsonObject;
    }

    @GetMapping("/getMessage")
    public String getMessage(){
        return "你已通过验证";
    }
}