package com.sk.web.controller;

import com.sk.model.ResultEnum;
import com.sk.model.ResultModel;
import com.sk.page.PageRequest;
import com.sk.page.PageResult;
import com.sk.web.constant.RequestCommonPathConstant;
import com.sk.web.model.Membership;
import com.sk.web.model.MembershipExample;
import com.sk.web.model.api.InsertForWxModel;
import com.sk.web.service.MembershipService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@Api(tags = "会员信息")
@RestController
@RequestMapping(RequestCommonPathConstant.REQUEST_PROJECT_PATH+"/membership")
public class MembershipController {
    @Autowired
    MembershipService membershipService;

//    @ApiOperation("查询所有会员")
//    @ApiImplicitParam
//    @GetMapping("/v1/selectAll")
//    public ResultModel<Membership> selectAll(@RequestHeader("token") String token,Membership t){
//        return membershipService.selectAll(t);
//    }

    @ApiOperation("分页查询所有会员")
    @ApiImplicitParams(value = {@ApiImplicitParam(name = "PageRequest",dataTypeClass = PageRequest.class , value ="")})
    @GetMapping("/v1/selectPage")
    public PageResult selectPage(@RequestHeader("token") String token, PageRequest pageQuery, Membership t){
        return membershipService.findPage(pageQuery,t);
    }

    @ApiOperation("查询单个会员")
    @ApiImplicitParams(value = {@ApiImplicitParam(name = "Membership",dataTypeClass = Membership.class , value ="")})
    @GetMapping("/v1/selectOne")
    public ResultModel<Membership> selectOne(@RequestHeader("token") String token,Membership t){
        if (t == null || null == t.getId() || "".equals(t.getId())) {
            return new ResultModel().setCode(ResultEnum.ERROR.getCode()).setMessage("id不能为空");
        }
        return membershipService.selectOne(t);
    }


    @ApiOperation("查询单个会员(微信)")
    @ApiImplicitParams(value = {@ApiImplicitParam(name = "code",dataTypeClass = String.class , value ="")})
    @PostMapping("/v1/selectOneForWx")
    public ResultModel<Membership> selectOneForWx(@RequestHeader("token") String token,@RequestParam("code") String code) {
        String openId = membershipService.getOpenId(2,code);
        if (null == openId || "".equals(openId)) {
            return new ResultModel().setCode(ResultEnum.ERROR.getCode()).setMessage("未获取到openid");
        }
        Membership membership = new Membership();
        membership.setOpenId(openId);
        return membershipService.selectOne(membership);
    }

    @ApiOperation("增加会员(微信)")
    @ApiImplicitParams(value = {@ApiImplicitParam(name = "InsertForWxModel",dataTypeClass = InsertForWxModel.class , value ="")})
    @PostMapping("/v1/insertForWx")
    public ResultModel<Membership> insertForWx(@RequestHeader("token") String token,@RequestBody InsertForWxModel json) {
        String code = json.getCode();
        String openId = membershipService.getOpenId(2,code);
        if (null == openId || "".equals(openId)) {
            return new ResultModel().setCode(ResultEnum.ERROR.getCode()).setMessage("未获取到openid");
        }
        return membershipService.insert(new Membership().setSex(json.getSex()).setOpenId(openId).setName(json.getName()).setPassword("666666"));
    }

    @ApiOperation("增加会员")
    @ApiImplicitParams(value = {@ApiImplicitParam(name = "Membership",dataTypeClass = Membership.class , value ="")})
    @PostMapping("/v1/insert")
    public ResultModel<Membership> insert(@RequestHeader("token") String token,@RequestBody Membership t) {
        return membershipService.insert(t);
    }

    @ApiOperation("删除会员")
    @ApiImplicitParams(value = {@ApiImplicitParam(name = "Membership",dataTypeClass = Membership.class , value ="")})
    @PostMapping("/v1/delete")
    public ResultModel<Membership> delete(@RequestHeader("token") String token,@RequestBody Membership t){
        return membershipService.delete(t);
    }

    @ApiOperation("更新会员信息")
    @ApiImplicitParams(value = {@ApiImplicitParam(name = "Membership",dataTypeClass = Membership.class , value ="")})
    @PostMapping("/v1/update")
    public ResultModel<Membership> update(@RequestHeader("token") String token,@RequestBody Membership t){
        MembershipExample e = new MembershipExample();
        e.createCriteria().andIdEqualTo(t.getId());
        return membershipService.update(t,e);
    }

}
