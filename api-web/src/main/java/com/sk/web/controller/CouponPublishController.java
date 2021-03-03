package com.sk.web.controller;

import com.sk.model.ResultModel;
import com.sk.page.PageRequest;
import com.sk.page.PageResult;
import com.sk.web.constant.RequestCommonPathConstant;
import com.sk.web.model.CouponPublish;
import com.sk.web.model.CouponPublishExample;
import com.sk.web.service.CouponPublishService;
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
import java.util.Date;
import java.util.UUID;

@Api(tags = "优惠券发布")
@RestController
@RequestMapping(RequestCommonPathConstant.REQUEST_PROJECT_PATH+"/coupon_publish")
public class CouponPublishController {
    Logger log = LoggerFactory.getLogger(CouponPublishController.class);

    @Autowired
    CouponPublishService couponPublishService;

    @ApiOperation("查询所有优惠券")
    @GetMapping("/v1/selectAll")
    public ResultModel<CouponPublish> selectAll(@RequestHeader("token") String token,CouponPublish t){
        return couponPublishService.selectAll(t);
    }

    @ApiOperation("分页查询所有优惠券")
    @ApiImplicitParams(value = {@ApiImplicitParam(name = "PageRequest",dataTypeClass = PageRequest.class , value ="")})
    @GetMapping("/v1/selectPage")
    public PageResult selectPage(@RequestHeader("token") String token,PageRequest pageQuery,CouponPublish t){
        return couponPublishService.findPage(pageQuery,t);
    }


    @ApiOperation("查询单个优惠券")
    @ApiImplicitParams(value = {@ApiImplicitParam(name = "CouponPublish",dataTypeClass = CouponPublish.class , value ="")})
    @GetMapping("/v1/selectOne")
    public ResultModel<CouponPublish> selectOne(@RequestHeader("token") String token,CouponPublish t){
        return couponPublishService.selectOne(t);
    }

    @ApiOperation("增加优惠券")
    @ApiImplicitParams(value = {@ApiImplicitParam(name = "CouponPublish",dataTypeClass = CouponPublish.class , value ="")})
    @PostMapping("/v1/insert")
    public ResultModel<CouponPublish> insert(@RequestHeader("token") String token,@RequestBody CouponPublish t) {
        t.setPublishTime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()))
            .setCouponCode(UUID.randomUUID().toString());
        return couponPublishService.insert(t);
    }

    @ApiOperation("删除优惠券")
    @ApiImplicitParams(value = {@ApiImplicitParam(name = "CouponPublish",dataTypeClass = CouponPublish.class , value ="")})
    @PostMapping("/v1/delete")
    public ResultModel<CouponPublish> delete(@RequestHeader("token") String token,@RequestBody CouponPublish t){
        return couponPublishService.delete(t);
    }

    @ApiOperation("更新优惠券信息")
    @ApiImplicitParams(value = {@ApiImplicitParam(name = "CouponPublish",dataTypeClass = CouponPublish.class , value ="")})
    @PostMapping("/v1/update")
    public ResultModel<CouponPublish> update(@RequestHeader("token") String token,@RequestBody CouponPublish t){
        CouponPublishExample e = new CouponPublishExample();
        e.createCriteria().andIdEqualTo(t.getId());
        return couponPublishService.update(t,e);
    }

}
