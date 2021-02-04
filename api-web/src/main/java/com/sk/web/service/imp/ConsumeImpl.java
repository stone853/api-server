package com.sk.web.service.imp;

import com.sk.model.ResultModel;
import com.sk.web.mapper.ConsumeMapper;
import com.sk.web.mapper.MembershipMapper;
import com.sk.web.model.Consume;
import com.sk.web.model.ConsumeExample;
import com.sk.web.model.Membership;
import com.sk.web.model.MembershipExample;
import com.sk.web.service.ConsumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class ConsumeImpl extends BaseImpl<Consume, ConsumeExample> implements ConsumeService{

    @Autowired
    MembershipMapper<Membership> memberMapper;

    @Autowired
    public void setMapper(ConsumeMapper<Consume> mapper) {
        this.mapper = mapper;
    }

    @Transactional
    @Override
    public ResultModel<Consume> insert(Consume record) {
        //修改会员余额和次数
        MembershipExample e = new MembershipExample();
        e.createCriteria().andIdEqualTo(record.getMemId());

        Membership m = memberMapper.selectOne(new Membership().setId(record.getMemId()));
        if (null == m) {

        }
        m.setBalance(m.getBalance().subtract(record.getPrice()));
        m.setCount(m.getCount()-record.getCount());
        memberMapper.updateByExample(m,e);
        //插入消费记录
        return super.insert(record);
    }
}
