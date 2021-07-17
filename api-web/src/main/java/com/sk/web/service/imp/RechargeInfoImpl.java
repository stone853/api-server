package com.sk.web.service.imp;

import com.sk.model.ResultJsonModel;
import com.sk.model.ResultListModel;
import com.sk.web.mapper.MembershipMapper;
import com.sk.web.mapper.RechargeInfoMapper;
import com.sk.web.model.Membership;
import com.sk.web.model.MembershipExample;
import com.sk.web.model.RechargeInfo;
import com.sk.web.model.RechargeInfoExample;
import com.sk.web.service.RechargeInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class RechargeInfoImpl extends BaseImpl<RechargeInfo, RechargeInfoExample> implements RechargeInfoService{

    @Autowired
    MembershipMapper<Membership> memberMapper;

    @Autowired
    public void setMapper(RechargeInfoMapper<RechargeInfo> mapper) {
        this.mapper = mapper;
    }

    @Transactional
    @Override
    public ResultJsonModel<RechargeInfo> insert(RechargeInfo record) {
        //修改会员余额和次数
        MembershipExample e = new MembershipExample();
        e.createCriteria().andIdEqualTo(record.getMemId());

        Membership m = memberMapper.selectOne(new Membership().setId(record.getMemId()));
        if (null == m) {

        }
        m.setBalance(m.getBalance().add(record.getMoney()));
        m.setCount(m.getCount()+record.getCount());
        memberMapper.updateByExample(m,e);

        //插入充值记录
        return super.insert(record);
    }
}
