package com.sk.web.service.imp;



import com.sk.model.ResultEnum;
import com.sk.model.ResultModel;
import com.sk.web.mapper.CouponInfoMapper;
import com.sk.web.model.*;
import com.sk.web.model.api.BaseModel;
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
    public synchronized ResultModel<CouponInfo> insert(CouponInfo t) {
        CouponPublish cp = new CouponPublish();
        ResultModel<CouponPublish> r = couponPublishService.selectOne(cp.setCouponCode(t.getCouponCode()));
        if (r.getCode() < 0 || r.getList() == null || r.getList().size() < 1) {
            return new ResultModel().setCode(ResultEnum.ERROR.getCode()).setMessage("未找到优惠券");
        }
        cp = r.getList().get(0);
        if (cp.getCount() < 1) {
            return new ResultModel().setCode(ResultEnum.ERROR.getCode()).setMessage("已无优惠券，领取失败");
        }

        //优惠券入用户库
        mapper.insert(t.setCreatetime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())));
        //扣减
        CouponPublishExample ce = new CouponPublishExample();
        ce.createCriteria().andIdEqualTo(cp.getId());
        couponPublishService.update(cp.setCount(cp.getCount() -1 ),ce);

        return new ResultModel().setCode(ResultEnum.SUCCESS.getCode()).setMessage("领取成功");
    }


    @Transactional
    @Override
    public ResultModel<CouponInfo> update(CouponInfo t, CouponInfoExample e,String openId) {
        //修改
        mapper.updateByExampleSelective(t,e);
        //留痕
        CouponLog log = new CouponLog();
        log.setCouponId(t.getId())
                .setCreatetime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()))
                .setOpenId(openId)
                .setStatus("0");

        couponLogService.insert(log);

        return new ResultModel().setCode(ResultEnum.SUCCESS.getCode()).setMessage("消券成功");
    }
}
