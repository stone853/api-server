package com.sk.web.service.imp;



import com.sk.model.ResultEnum;
import com.sk.model.ResultModel;
import com.sk.web.mapper.CouponInfoMapper;
import com.sk.web.model.CouponInfo;
import com.sk.web.model.CouponInfoExample;
import com.sk.web.model.CouponPublish;
import com.sk.web.model.api.CouponInsertForWxModel;
import com.sk.web.service.CouponInfoService;
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

    @Transactional
    @Override
    public synchronized ResultModel<CouponInfo> insertWx(CouponInsertForWxModel t) {
        String openId = membershipService.getOpenId(t.getCode());
        if (null == openId || "".equals(openId)) {
            return new ResultModel().setCode(ResultEnum.ERROR.getCode()).setMessage("未获取到openid");
        }

        CouponPublish cp = new CouponPublish();
        ResultModel<CouponPublish> r = couponPublishService.selectOne(cp.setCouponCode(t.getCouponCode()));
        if (r.getCode() < 0 || r.getList() == null || r.getList().size() < 1) {
            return new ResultModel().setCode(ResultEnum.ERROR.getCode()).setMessage("未找到该优惠券");
        }
        cp = r.getList().get(0);
        if (cp.getCount() < 1) {
            return new ResultModel().setCode(ResultEnum.ERROR.getCode()).setMessage("已无优惠券，领取失败");
        }

        //优惠券入用户库
        mapper.insert(t.setOpenId(openId).setCreatetime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())));
        //扣减
        couponPublishService.selectOne(cp.setCount(cp.getCount() -1 ));

        return new ResultModel().setCode(ResultEnum.SUCCESS.getCode()).setMessage("已领取");
    }
}
