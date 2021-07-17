package com.sk.web.service.imp;



import com.sk.model.ResultEnum;
import com.sk.model.ResultJsonModel;
import com.sk.model.ResultListModel;
import com.sk.web.mapper.CouponInfoMapper;
import com.sk.web.model.*;
import com.sk.web.service.CouponInfoService;
import com.sk.web.service.CouponLogService;
import com.sk.web.service.CouponPublishService;
import com.sk.web.service.MembershipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class CouponInfoImpl extends BaseImpl<CouponInfo, CouponInfoExample> implements CouponInfoService {

    @Autowired
    public void setMapper(CouponInfoMapper<CouponPublish> mapper) {
        this.mapper = mapper;
    }

    @Autowired
    CouponPublishService couponPublishService;

    @Autowired
    MembershipService membershipService;

    @Autowired
    CouponLogService couponLogService;

    @Transactional
    @Override
    public synchronized ResultJsonModel<CouponInfo> insert(CouponInfo t) {
        //首先查询发布表中是否存在该优惠券信息
        CouponPublish cp = new CouponPublish();
        ResultJsonModel<CouponPublish> r = couponPublishService.selectOne(cp.setCouponCode(t.getCouponCode()));
        if (r.getCode() < 0 || r.getData() == null ) {
            return new ResultJsonModel().setCode(ResultEnum.ERROR.getCode()).setMessage("未找到优惠券");
        }
        //查询优惠券剩余数量
        cp = r.getData();
        if (cp.getCount() < 1) {
            return new ResultJsonModel().setCode(ResultEnum.ERROR.getCode()).setMessage("已无优惠券，领取失败");
        }
        //查询该用户是否已经领取过
        CouponInfo old = mapper.selectOne(new CouponInfo().setCouponCode(t.getCouponCode()).setOpenId(t.getOpenId()));
        if (old !=null && old.getStatus().equals("1")) {
            return new ResultJsonModel().setCode(ResultEnum.ERROR.getCode()).setMessage("您已领取过，请不要重复领取");
        }

        //优惠券入用户库
        mapper.insert(t.setCreatetime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())));
        //扣减
        CouponPublishExample ce = new CouponPublishExample();
        ce.createCriteria().andIdEqualTo(cp.getId());
        couponPublishService.update(cp.setCount(cp.getCount() -1 ),ce);

        return new ResultJsonModel().setCode(ResultEnum.SUCCESS.getCode()).setMessage("领取成功");
    }


    @Transactional
    @Override
    public ResultListModel<CouponInfo> update(CouponInfo t, CouponInfoExample e, String openId) {
        //判断优惠券是否已经消除过
        CouponInfo old = mapper.selectOne(new CouponInfo().setId(t.getId()));
        if (old != null && old.getStatus().equals("0")) {
            return new ResultListModel().setCode(ResultEnum.ERROR.getCode()).setMessage("该优惠券已消除");
        }
        //修改
        mapper.updateByExampleSelective(t,e);
        //留痕
        CouponLog log = new CouponLog();
        log.setCouponId(t.getId())
                .setCreatetime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()))
                .setOpenId(openId)
                .setStatus("0");

        couponLogService.insert(log);

        return new ResultListModel().setCode(ResultEnum.SUCCESS.getCode()).setMessage("消券成功");
    }
}
