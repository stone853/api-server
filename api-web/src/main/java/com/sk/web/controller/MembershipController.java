package com.sk.web.controller;

import com.sk.web.model.Membership;
import com.sk.web.model.MembershipExample;
import com.sk.web.service.MembershipService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Api(tags = "会员信息")
@RestController
@RequestMapping("/membership")
public class MembershipController {
    @Autowired
    MembershipService membershipService;

    @ApiOperation("查询所有会员")
    @ApiImplicitParam
    @GetMapping("/v1/selectAll")
    public Map<String, Object> selectAll(){
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("membership",membershipService.selectAll());


        return map;
    }

    @ApiOperation("查询单个会员")
    @ApiImplicitParams(value = {@ApiImplicitParam(name = "Membership",dataTypeClass = Membership.class , value ="")})
    @PostMapping("/v1/selectOne")
    public Membership selectOne(@RequestBody Membership t){
        return membershipService.selectOne(t);
    }

    @ApiOperation("增加会员")
    @ApiImplicitParams(value = {@ApiImplicitParam(name = "Membership",dataTypeClass = Membership.class , value ="")})
    @PostMapping("/v1/insert")
    public String insert(@RequestBody Membership t) {
        membershipService.insert(t);
        return "1";
    }

    @ApiOperation("删除会员")
    @ApiImplicitParams(value = {@ApiImplicitParam(name = "Membership",dataTypeClass = Membership.class , value ="")})
    @PostMapping("/v1/delete")
    public int delete(@RequestBody Membership t){
        return membershipService.delete(t);
    }

    @ApiOperation("更新会员信息")
    @ApiImplicitParams(value = {@ApiImplicitParam(name = "Membership",dataTypeClass = Membership.class , value ="")})
    @PostMapping("/v1/update")
    public int update(@RequestBody Membership t){
        MembershipExample e = new MembershipExample();
        e.createCriteria().andIdEqualTo(t.getId());
        return membershipService.update(t,e);
    }

}
