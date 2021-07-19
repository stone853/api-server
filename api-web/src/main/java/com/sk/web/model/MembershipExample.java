package com.sk.web.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class MembershipExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MembershipExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andOpenIdIsNull() {
            addCriterion("open_id is null");
            return (Criteria) this;
        }

        public Criteria andOpenIdIsNotNull() {
            addCriterion("open_id is not null");
            return (Criteria) this;
        }

        public Criteria andOpenIdEqualTo(String value) {
            addCriterion("open_id =", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotEqualTo(String value) {
            addCriterion("open_id <>", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdGreaterThan(String value) {
            addCriterion("open_id >", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdGreaterThanOrEqualTo(String value) {
            addCriterion("open_id >=", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdLessThan(String value) {
            addCriterion("open_id <", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdLessThanOrEqualTo(String value) {
            addCriterion("open_id <=", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdLike(String value) {
            addCriterion("open_id like", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotLike(String value) {
            addCriterion("open_id not like", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdIn(List<String> values) {
            addCriterion("open_id in", values, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotIn(List<String> values) {
            addCriterion("open_id not in", values, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdBetween(String value1, String value2) {
            addCriterion("open_id between", value1, value2, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotBetween(String value1, String value2) {
            addCriterion("open_id not between", value1, value2, "openId");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andLevelIsNull() {
            addCriterion("level is null");
            return (Criteria) this;
        }

        public Criteria andLevelIsNotNull() {
            addCriterion("level is not null");
            return (Criteria) this;
        }

        public Criteria andLevelEqualTo(String value) {
            addCriterion("level =", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotEqualTo(String value) {
            addCriterion("level <>", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThan(String value) {
            addCriterion("level >", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThanOrEqualTo(String value) {
            addCriterion("level >=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThan(String value) {
            addCriterion("level <", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThanOrEqualTo(String value) {
            addCriterion("level <=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLike(String value) {
            addCriterion("level like", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotLike(String value) {
            addCriterion("level not like", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelIn(List<String> values) {
            addCriterion("level in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotIn(List<String> values) {
            addCriterion("level not in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelBetween(String value1, String value2) {
            addCriterion("level between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotBetween(String value1, String value2) {
            addCriterion("level not between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andOrderNumIsNull() {
            addCriterion("order_num is null");
            return (Criteria) this;
        }

        public Criteria andOrderNumIsNotNull() {
            addCriterion("order_num is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNumEqualTo(Short value) {
            addCriterion("order_num =", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumNotEqualTo(Short value) {
            addCriterion("order_num <>", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumGreaterThan(Short value) {
            addCriterion("order_num >", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumGreaterThanOrEqualTo(Short value) {
            addCriterion("order_num >=", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumLessThan(Short value) {
            addCriterion("order_num <", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumLessThanOrEqualTo(Short value) {
            addCriterion("order_num <=", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumIn(List<Short> values) {
            addCriterion("order_num in", values, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumNotIn(List<Short> values) {
            addCriterion("order_num not in", values, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumBetween(Short value1, Short value2) {
            addCriterion("order_num between", value1, value2, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumNotBetween(Short value1, Short value2) {
            addCriterion("order_num not between", value1, value2, "orderNum");
            return (Criteria) this;
        }

        public Criteria andExpNumIsNull() {
            addCriterion("exp_num is null");
            return (Criteria) this;
        }

        public Criteria andExpNumIsNotNull() {
            addCriterion("exp_num is not null");
            return (Criteria) this;
        }

        public Criteria andExpNumEqualTo(Integer value) {
            addCriterion("exp_num =", value, "expNum");
            return (Criteria) this;
        }

        public Criteria andExpNumNotEqualTo(Integer value) {
            addCriterion("exp_num <>", value, "expNum");
            return (Criteria) this;
        }

        public Criteria andExpNumGreaterThan(Integer value) {
            addCriterion("exp_num >", value, "expNum");
            return (Criteria) this;
        }

        public Criteria andExpNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("exp_num >=", value, "expNum");
            return (Criteria) this;
        }

        public Criteria andExpNumLessThan(Integer value) {
            addCriterion("exp_num <", value, "expNum");
            return (Criteria) this;
        }

        public Criteria andExpNumLessThanOrEqualTo(Integer value) {
            addCriterion("exp_num <=", value, "expNum");
            return (Criteria) this;
        }

        public Criteria andExpNumIn(List<Integer> values) {
            addCriterion("exp_num in", values, "expNum");
            return (Criteria) this;
        }

        public Criteria andExpNumNotIn(List<Integer> values) {
            addCriterion("exp_num not in", values, "expNum");
            return (Criteria) this;
        }

        public Criteria andExpNumBetween(Integer value1, Integer value2) {
            addCriterion("exp_num between", value1, value2, "expNum");
            return (Criteria) this;
        }

        public Criteria andExpNumNotBetween(Integer value1, Integer value2) {
            addCriterion("exp_num not between", value1, value2, "expNum");
            return (Criteria) this;
        }

        public Criteria andIntergraNumIsNull() {
            addCriterion("intergra_num is null");
            return (Criteria) this;
        }

        public Criteria andIntergraNumIsNotNull() {
            addCriterion("intergra_num is not null");
            return (Criteria) this;
        }

        public Criteria andIntergraNumEqualTo(Integer value) {
            addCriterion("intergra_num =", value, "intergraNum");
            return (Criteria) this;
        }

        public Criteria andIntergraNumNotEqualTo(Integer value) {
            addCriterion("intergra_num <>", value, "intergraNum");
            return (Criteria) this;
        }

        public Criteria andIntergraNumGreaterThan(Integer value) {
            addCriterion("intergra_num >", value, "intergraNum");
            return (Criteria) this;
        }

        public Criteria andIntergraNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("intergra_num >=", value, "intergraNum");
            return (Criteria) this;
        }

        public Criteria andIntergraNumLessThan(Integer value) {
            addCriterion("intergra_num <", value, "intergraNum");
            return (Criteria) this;
        }

        public Criteria andIntergraNumLessThanOrEqualTo(Integer value) {
            addCriterion("intergra_num <=", value, "intergraNum");
            return (Criteria) this;
        }

        public Criteria andIntergraNumIn(List<Integer> values) {
            addCriterion("intergra_num in", values, "intergraNum");
            return (Criteria) this;
        }

        public Criteria andIntergraNumNotIn(List<Integer> values) {
            addCriterion("intergra_num not in", values, "intergraNum");
            return (Criteria) this;
        }

        public Criteria andIntergraNumBetween(Integer value1, Integer value2) {
            addCriterion("intergra_num between", value1, value2, "intergraNum");
            return (Criteria) this;
        }

        public Criteria andIntergraNumNotBetween(Integer value1, Integer value2) {
            addCriterion("intergra_num not between", value1, value2, "intergraNum");
            return (Criteria) this;
        }

        public Criteria andIsStoreIsNull() {
            addCriterion("is_store is null");
            return (Criteria) this;
        }

        public Criteria andIsStoreIsNotNull() {
            addCriterion("is_store is not null");
            return (Criteria) this;
        }

        public Criteria andIsStoreEqualTo(Byte value) {
            addCriterion("is_store =", value, "isStore");
            return (Criteria) this;
        }

        public Criteria andIsStoreNotEqualTo(Byte value) {
            addCriterion("is_store <>", value, "isStore");
            return (Criteria) this;
        }

        public Criteria andIsStoreGreaterThan(Byte value) {
            addCriterion("is_store >", value, "isStore");
            return (Criteria) this;
        }

        public Criteria andIsStoreGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_store >=", value, "isStore");
            return (Criteria) this;
        }

        public Criteria andIsStoreLessThan(Byte value) {
            addCriterion("is_store <", value, "isStore");
            return (Criteria) this;
        }

        public Criteria andIsStoreLessThanOrEqualTo(Byte value) {
            addCriterion("is_store <=", value, "isStore");
            return (Criteria) this;
        }

        public Criteria andIsStoreIn(List<Byte> values) {
            addCriterion("is_store in", values, "isStore");
            return (Criteria) this;
        }

        public Criteria andIsStoreNotIn(List<Byte> values) {
            addCriterion("is_store not in", values, "isStore");
            return (Criteria) this;
        }

        public Criteria andIsStoreBetween(Byte value1, Byte value2) {
            addCriterion("is_store between", value1, value2, "isStore");
            return (Criteria) this;
        }

        public Criteria andIsStoreNotBetween(Byte value1, Byte value2) {
            addCriterion("is_store not between", value1, value2, "isStore");
            return (Criteria) this;
        }

        public Criteria andLeveltimeIsNull() {
            addCriterion("leveltime is null");
            return (Criteria) this;
        }

        public Criteria andLeveltimeIsNotNull() {
            addCriterion("leveltime is not null");
            return (Criteria) this;
        }

        public Criteria andLeveltimeEqualTo(String value) {
            addCriterion("leveltime =", value, "leveltime");
            return (Criteria) this;
        }

        public Criteria andLeveltimeNotEqualTo(String value) {
            addCriterion("leveltime <>", value, "leveltime");
            return (Criteria) this;
        }

        public Criteria andLeveltimeGreaterThan(String value) {
            addCriterion("leveltime >", value, "leveltime");
            return (Criteria) this;
        }

        public Criteria andLeveltimeGreaterThanOrEqualTo(String value) {
            addCriterion("leveltime >=", value, "leveltime");
            return (Criteria) this;
        }

        public Criteria andLeveltimeLessThan(String value) {
            addCriterion("leveltime <", value, "leveltime");
            return (Criteria) this;
        }

        public Criteria andLeveltimeLessThanOrEqualTo(String value) {
            addCriterion("leveltime <=", value, "leveltime");
            return (Criteria) this;
        }

        public Criteria andLeveltimeLike(String value) {
            addCriterion("leveltime like", value, "leveltime");
            return (Criteria) this;
        }

        public Criteria andLeveltimeNotLike(String value) {
            addCriterion("leveltime not like", value, "leveltime");
            return (Criteria) this;
        }

        public Criteria andLeveltimeIn(List<String> values) {
            addCriterion("leveltime in", values, "leveltime");
            return (Criteria) this;
        }

        public Criteria andLeveltimeNotIn(List<String> values) {
            addCriterion("leveltime not in", values, "leveltime");
            return (Criteria) this;
        }

        public Criteria andLeveltimeBetween(String value1, String value2) {
            addCriterion("leveltime between", value1, value2, "leveltime");
            return (Criteria) this;
        }

        public Criteria andLeveltimeNotBetween(String value1, String value2) {
            addCriterion("leveltime not between", value1, value2, "leveltime");
            return (Criteria) this;
        }

        public Criteria andIsVipIsNull() {
            addCriterion("is_vip is null");
            return (Criteria) this;
        }

        public Criteria andIsVipIsNotNull() {
            addCriterion("is_vip is not null");
            return (Criteria) this;
        }

        public Criteria andIsVipEqualTo(Short value) {
            addCriterion("is_vip =", value, "isVip");
            return (Criteria) this;
        }

        public Criteria andIsVipNotEqualTo(Short value) {
            addCriterion("is_vip <>", value, "isVip");
            return (Criteria) this;
        }

        public Criteria andIsVipGreaterThan(Short value) {
            addCriterion("is_vip >", value, "isVip");
            return (Criteria) this;
        }

        public Criteria andIsVipGreaterThanOrEqualTo(Short value) {
            addCriterion("is_vip >=", value, "isVip");
            return (Criteria) this;
        }

        public Criteria andIsVipLessThan(Short value) {
            addCriterion("is_vip <", value, "isVip");
            return (Criteria) this;
        }

        public Criteria andIsVipLessThanOrEqualTo(Short value) {
            addCriterion("is_vip <=", value, "isVip");
            return (Criteria) this;
        }

        public Criteria andIsVipIn(List<Short> values) {
            addCriterion("is_vip in", values, "isVip");
            return (Criteria) this;
        }

        public Criteria andIsVipNotIn(List<Short> values) {
            addCriterion("is_vip not in", values, "isVip");
            return (Criteria) this;
        }

        public Criteria andIsVipBetween(Short value1, Short value2) {
            addCriterion("is_vip between", value1, value2, "isVip");
            return (Criteria) this;
        }

        public Criteria andIsVipNotBetween(Short value1, Short value2) {
            addCriterion("is_vip not between", value1, value2, "isVip");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNull() {
            addCriterion("nickname is null");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNotNull() {
            addCriterion("nickname is not null");
            return (Criteria) this;
        }

        public Criteria andNicknameEqualTo(String value) {
            addCriterion("nickname =", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotEqualTo(String value) {
            addCriterion("nickname <>", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThan(String value) {
            addCriterion("nickname >", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("nickname >=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThan(String value) {
            addCriterion("nickname <", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThanOrEqualTo(String value) {
            addCriterion("nickname <=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLike(String value) {
            addCriterion("nickname like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotLike(String value) {
            addCriterion("nickname not like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameIn(List<String> values) {
            addCriterion("nickname in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotIn(List<String> values) {
            addCriterion("nickname not in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameBetween(String value1, String value2) {
            addCriterion("nickname between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotBetween(String value1, String value2) {
            addCriterion("nickname not between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlIsNull() {
            addCriterion("avatar_url is null");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlIsNotNull() {
            addCriterion("avatar_url is not null");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlEqualTo(String value) {
            addCriterion("avatar_url =", value, "avatarUrl");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlNotEqualTo(String value) {
            addCriterion("avatar_url <>", value, "avatarUrl");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlGreaterThan(String value) {
            addCriterion("avatar_url >", value, "avatarUrl");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlGreaterThanOrEqualTo(String value) {
            addCriterion("avatar_url >=", value, "avatarUrl");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlLessThan(String value) {
            addCriterion("avatar_url <", value, "avatarUrl");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlLessThanOrEqualTo(String value) {
            addCriterion("avatar_url <=", value, "avatarUrl");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlLike(String value) {
            addCriterion("avatar_url like", value, "avatarUrl");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlNotLike(String value) {
            addCriterion("avatar_url not like", value, "avatarUrl");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlIn(List<String> values) {
            addCriterion("avatar_url in", values, "avatarUrl");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlNotIn(List<String> values) {
            addCriterion("avatar_url not in", values, "avatarUrl");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlBetween(String value1, String value2) {
            addCriterion("avatar_url between", value1, value2, "avatarUrl");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlNotBetween(String value1, String value2) {
            addCriterion("avatar_url not between", value1, value2, "avatarUrl");
            return (Criteria) this;
        }

        public Criteria andQrCodeIsNull() {
            addCriterion("qr_code is null");
            return (Criteria) this;
        }

        public Criteria andQrCodeIsNotNull() {
            addCriterion("qr_code is not null");
            return (Criteria) this;
        }

        public Criteria andQrCodeEqualTo(String value) {
            addCriterion("qr_code =", value, "qrCode");
            return (Criteria) this;
        }

        public Criteria andQrCodeNotEqualTo(String value) {
            addCriterion("qr_code <>", value, "qrCode");
            return (Criteria) this;
        }

        public Criteria andQrCodeGreaterThan(String value) {
            addCriterion("qr_code >", value, "qrCode");
            return (Criteria) this;
        }

        public Criteria andQrCodeGreaterThanOrEqualTo(String value) {
            addCriterion("qr_code >=", value, "qrCode");
            return (Criteria) this;
        }

        public Criteria andQrCodeLessThan(String value) {
            addCriterion("qr_code <", value, "qrCode");
            return (Criteria) this;
        }

        public Criteria andQrCodeLessThanOrEqualTo(String value) {
            addCriterion("qr_code <=", value, "qrCode");
            return (Criteria) this;
        }

        public Criteria andQrCodeLike(String value) {
            addCriterion("qr_code like", value, "qrCode");
            return (Criteria) this;
        }

        public Criteria andQrCodeNotLike(String value) {
            addCriterion("qr_code not like", value, "qrCode");
            return (Criteria) this;
        }

        public Criteria andQrCodeIn(List<String> values) {
            addCriterion("qr_code in", values, "qrCode");
            return (Criteria) this;
        }

        public Criteria andQrCodeNotIn(List<String> values) {
            addCriterion("qr_code not in", values, "qrCode");
            return (Criteria) this;
        }

        public Criteria andQrCodeBetween(String value1, String value2) {
            addCriterion("qr_code between", value1, value2, "qrCode");
            return (Criteria) this;
        }

        public Criteria andQrCodeNotBetween(String value1, String value2) {
            addCriterion("qr_code not between", value1, value2, "qrCode");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andReferentidIsNull() {
            addCriterion("referentid is null");
            return (Criteria) this;
        }

        public Criteria andReferentidIsNotNull() {
            addCriterion("referentid is not null");
            return (Criteria) this;
        }

        public Criteria andReferentidEqualTo(String value) {
            addCriterion("referentid =", value, "referentid");
            return (Criteria) this;
        }

        public Criteria andReferentidNotEqualTo(String value) {
            addCriterion("referentid <>", value, "referentid");
            return (Criteria) this;
        }

        public Criteria andReferentidGreaterThan(String value) {
            addCriterion("referentid >", value, "referentid");
            return (Criteria) this;
        }

        public Criteria andReferentidGreaterThanOrEqualTo(String value) {
            addCriterion("referentid >=", value, "referentid");
            return (Criteria) this;
        }

        public Criteria andReferentidLessThan(String value) {
            addCriterion("referentid <", value, "referentid");
            return (Criteria) this;
        }

        public Criteria andReferentidLessThanOrEqualTo(String value) {
            addCriterion("referentid <=", value, "referentid");
            return (Criteria) this;
        }

        public Criteria andReferentidLike(String value) {
            addCriterion("referentid like", value, "referentid");
            return (Criteria) this;
        }

        public Criteria andReferentidNotLike(String value) {
            addCriterion("referentid not like", value, "referentid");
            return (Criteria) this;
        }

        public Criteria andReferentidIn(List<String> values) {
            addCriterion("referentid in", values, "referentid");
            return (Criteria) this;
        }

        public Criteria andReferentidNotIn(List<String> values) {
            addCriterion("referentid not in", values, "referentid");
            return (Criteria) this;
        }

        public Criteria andReferentidBetween(String value1, String value2) {
            addCriterion("referentid between", value1, value2, "referentid");
            return (Criteria) this;
        }

        public Criteria andReferentidNotBetween(String value1, String value2) {
            addCriterion("referentid not between", value1, value2, "referentid");
            return (Criteria) this;
        }

        public Criteria andReferentNumIsNull() {
            addCriterion("referent_num is null");
            return (Criteria) this;
        }

        public Criteria andReferentNumIsNotNull() {
            addCriterion("referent_num is not null");
            return (Criteria) this;
        }

        public Criteria andReferentNumEqualTo(Short value) {
            addCriterion("referent_num =", value, "referentNum");
            return (Criteria) this;
        }

        public Criteria andReferentNumNotEqualTo(Short value) {
            addCriterion("referent_num <>", value, "referentNum");
            return (Criteria) this;
        }

        public Criteria andReferentNumGreaterThan(Short value) {
            addCriterion("referent_num >", value, "referentNum");
            return (Criteria) this;
        }

        public Criteria andReferentNumGreaterThanOrEqualTo(Short value) {
            addCriterion("referent_num >=", value, "referentNum");
            return (Criteria) this;
        }

        public Criteria andReferentNumLessThan(Short value) {
            addCriterion("referent_num <", value, "referentNum");
            return (Criteria) this;
        }

        public Criteria andReferentNumLessThanOrEqualTo(Short value) {
            addCriterion("referent_num <=", value, "referentNum");
            return (Criteria) this;
        }

        public Criteria andReferentNumIn(List<Short> values) {
            addCriterion("referent_num in", values, "referentNum");
            return (Criteria) this;
        }

        public Criteria andReferentNumNotIn(List<Short> values) {
            addCriterion("referent_num not in", values, "referentNum");
            return (Criteria) this;
        }

        public Criteria andReferentNumBetween(Short value1, Short value2) {
            addCriterion("referent_num between", value1, value2, "referentNum");
            return (Criteria) this;
        }

        public Criteria andReferentNumNotBetween(Short value1, Short value2) {
            addCriterion("referent_num not between", value1, value2, "referentNum");
            return (Criteria) this;
        }

        public Criteria andRIsNull() {
            addCriterion("r is null");
            return (Criteria) this;
        }

        public Criteria andRIsNotNull() {
            addCriterion("r is not null");
            return (Criteria) this;
        }

        public Criteria andREqualTo(String value) {
            addCriterion("r =", value, "r");
            return (Criteria) this;
        }

        public Criteria andRNotEqualTo(String value) {
            addCriterion("r <>", value, "r");
            return (Criteria) this;
        }

        public Criteria andRGreaterThan(String value) {
            addCriterion("r >", value, "r");
            return (Criteria) this;
        }

        public Criteria andRGreaterThanOrEqualTo(String value) {
            addCriterion("r >=", value, "r");
            return (Criteria) this;
        }

        public Criteria andRLessThan(String value) {
            addCriterion("r <", value, "r");
            return (Criteria) this;
        }

        public Criteria andRLessThanOrEqualTo(String value) {
            addCriterion("r <=", value, "r");
            return (Criteria) this;
        }

        public Criteria andRLike(String value) {
            addCriterion("r like", value, "r");
            return (Criteria) this;
        }

        public Criteria andRNotLike(String value) {
            addCriterion("r not like", value, "r");
            return (Criteria) this;
        }

        public Criteria andRIn(List<String> values) {
            addCriterion("r in", values, "r");
            return (Criteria) this;
        }

        public Criteria andRNotIn(List<String> values) {
            addCriterion("r not in", values, "r");
            return (Criteria) this;
        }

        public Criteria andRBetween(String value1, String value2) {
            addCriterion("r between", value1, value2, "r");
            return (Criteria) this;
        }

        public Criteria andRNotBetween(String value1, String value2) {
            addCriterion("r not between", value1, value2, "r");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(Integer value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(Integer value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(Integer value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(Integer value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(Integer value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(Integer value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<Integer> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<Integer> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(Integer value1, Integer value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(Integer value1, Integer value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andBalanceIsNull() {
            addCriterion("balance is null");
            return (Criteria) this;
        }

        public Criteria andBalanceIsNotNull() {
            addCriterion("balance is not null");
            return (Criteria) this;
        }

        public Criteria andBalanceEqualTo(BigDecimal value) {
            addCriterion("balance =", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotEqualTo(BigDecimal value) {
            addCriterion("balance <>", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceGreaterThan(BigDecimal value) {
            addCriterion("balance >", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("balance >=", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceLessThan(BigDecimal value) {
            addCriterion("balance <", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("balance <=", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceIn(List<BigDecimal> values) {
            addCriterion("balance in", values, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotIn(List<BigDecimal> values) {
            addCriterion("balance not in", values, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("balance between", value1, value2, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("balance not between", value1, value2, "balance");
            return (Criteria) this;
        }

        public Criteria andCountIsNull() {
            addCriterion("count is null");
            return (Criteria) this;
        }

        public Criteria andCountIsNotNull() {
            addCriterion("count is not null");
            return (Criteria) this;
        }

        public Criteria andCountEqualTo(Integer value) {
            addCriterion("count =", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotEqualTo(Integer value) {
            addCriterion("count <>", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountGreaterThan(Integer value) {
            addCriterion("count >", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("count >=", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountLessThan(Integer value) {
            addCriterion("count <", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountLessThanOrEqualTo(Integer value) {
            addCriterion("count <=", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountIn(List<Integer> values) {
            addCriterion("count in", values, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotIn(List<Integer> values) {
            addCriterion("count not in", values, "count");
            return (Criteria) this;
        }

        public Criteria andCountBetween(Integer value1, Integer value2) {
            addCriterion("count between", value1, value2, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotBetween(Integer value1, Integer value2) {
            addCriterion("count not between", value1, value2, "count");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("updatetime is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("updatetime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(String value) {
            addCriterion("updatetime =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(String value) {
            addCriterion("updatetime <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(String value) {
            addCriterion("updatetime >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("updatetime >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(String value) {
            addCriterion("updatetime <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(String value) {
            addCriterion("updatetime <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLike(String value) {
            addCriterion("updatetime like", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotLike(String value) {
            addCriterion("updatetime not like", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<String> values) {
            addCriterion("updatetime in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<String> values) {
            addCriterion("updatetime not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(String value1, String value2) {
            addCriterion("updatetime between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(String value1, String value2) {
            addCriterion("updatetime not between", value1, value2, "updatetime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}