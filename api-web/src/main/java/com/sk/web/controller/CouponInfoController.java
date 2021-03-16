package com.sk.web.controller;

import com.sk.model.ResultEnum;
import com.sk.model.ResultModel;
import com.sk.page.PageRequest;
import com.sk.page.PageResult;
import com.sk.web.constant.RequestCommonPathConstant;
import com.sk.web.model.CouponInfo;
import com.sk.web.model.CouponInfoExample;
import com.sk.web.service.CouponInfoService;
import com.sk.web.utils.UserHelper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@Api(tags = "优惠券")
@RestController
@RequestMapping(RequestCommonPathConstant.REQUEST_PROJECT_PATH+"/coupon_Info")
public class CouponInfoController {
    Logger log = LoggerFactory.getLogger(CouponInfoController.class);

    @Autowired
    CouponInfoService couponInfoService;

    @ApiOperation("查询所有优惠券")
    @GetMapping("/v1/selectAll")
    public ResultModel<CouponInfo> selectAll(@RequestHeader("token") String token,CouponInfo t){
        return couponInfoService.selectAll(t);
    }

    @ApiOperation("分页查询所有优惠券")
    @ApiImplicitParams(value = {@ApiImplicitParam(name = "PageRequest",dataTypeClass = PageRequest.class , value ="")})
    @GetMapping("/v1/selectPage")
    public PageResult selectPage(@RequestHeader("token") String token,PageRequest pageQuery,CouponInfo t){
        t.setOpenId(UserHelper.getOpenId(token));
        return couponInfoService.findPage(pageQuery,t);
    }

    @ApiOperation("查询单个优惠券")
    @ApiImplicitParams(value = {@ApiImplicitParam(name = "CouponInfo",dataTypeClass = CouponInfo.class , value ="")})
    @GetMapping("/v1/selectOne")
    public ResultModel<CouponInfo> selectOne(@RequestHeader("token") String token,CouponInfo t){
        return couponInfoService.selectOne(t);
    }

    @ApiOperation("增加优惠券(微信)")
    @ApiImplicitParams(value = {@ApiImplicitParam(name = "CouponInfo",dataTypeClass = CouponInfo.class , value ="")})
    @PostMapping("/v1/insert")
    public ResultModel<CouponInfo> insertForWx(@RequestHeader("token") String token,@RequestBody CouponInfo t) {
        return couponInfoService.insert(t.setOpenId(UserHelper.getOpenId(token)));
    }

    @ApiOperation("删除优惠券")
    @ApiImplicitParams(value = {@ApiImplicitParam(name = "CouponInfo",dataTypeClass = CouponInfo.class , value ="")})
    @PostMapping("/v1/delete")
    public ResultModel<CouponInfo> delete(@RequestHeader("token") String token,@RequestBody CouponInfo t){
        return couponInfoService.delete(t);
    }

    @ApiOperation("消券(微信)")
    @ApiImplicitParams(value = {@ApiImplicitParam(name = "CouponInfo",dataTypeClass = CouponInfo.class , value ="")})
    @PostMapping("/v1/update")
    public ResultModel<CouponInfo> updateWx(@RequestHeader("token") String token,@RequestBody CouponInfo t){
        if (null == t.getId() || "".equals(t.getId())) {
            return new ResultModel().setCode(ResultEnum.ERROR.getCode()).setMessage("请选中您要消除的优惠券（id不能为空）");
        }
        if (null == t.getStatus() || !"0".equals(t.getStatus())) {
            return new ResultModel().setCode(ResultEnum.ERROR.getCode()).setMessage("消券状态有误（status应为0）");
        }
        CouponInfoExample e = new CouponInfoExample();
        e.createCriteria().andIdEqualTo(t.getId());
        return couponInfoService.update(t,e,UserHelper.getOpenId(token));
    }

}
