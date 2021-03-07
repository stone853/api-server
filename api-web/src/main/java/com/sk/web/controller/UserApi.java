package com.sk.web.controller;

import com.sk.model.ResultEnum;
import com.sk.model.ResultModel;
import com.sk.web.config.CrmConfig;
import com.sk.web.model.Membership;
import com.sk.web.service.MembershipService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@Api(tags = "用户接口")
@RestController
@RequestMapping("/user")
public class UserApi {
    @Autowired
    MembershipService membershipService;

    @Autowired
    CrmConfig crmConfig;

    @ApiOperation("登陆")
    @ApiImplicitParams(value = {@ApiImplicitParam(name = "code",dataTypeClass = String.class , value ="",required = true)})
    @GetMapping("/v1/login")
    public ResultModel<Membership> login(@RequestParam("code") String code){
        String openId = membershipService.getOpenId(crmConfig.getTokenType(),code);
        if (null == openId || "".equals(openId)) {
            return new ResultModel().setCode(ResultEnum.ERROR.getCode()).setMessage("未获取到openid");
        }
        ResultModel<Membership> resultModel= membershipService.selectOne(new Membership().setOpenId(openId));
        if(resultModel.getCode() < 0 || resultModel.getList() == null ||
                resultModel.getList().size() == 0 || resultModel.getList().get(0) == null){
            return new ResultModel<Membership>().setCode(ResultEnum.ERROR.getCode()).setMessage("通过openid获取用户信息失败");
        }
        return new ResultModel<Membership>().setCode(ResultEnum.SUCCESS.getCode()).setMessage(membershipService.getToken(resultModel.getList().get(0)));
    }

    @GetMapping("/getMessage")
    public String getMessage(){
        return "你已通过验证";
    }
}