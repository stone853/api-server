package com.sk.web.model;

import javax.persistence.Table;
import java.math.BigDecimal;

@Table(name = "tcrm_membership")
public class Membership {
    private Integer id;

    private String openId;

    private String phone;

    private String level;

    private Short orderNum;

    private Integer expNum;

    private Integer intergraNum;

    private Byte isStore;

    private String leveltime;

    private Short isVip;

    private String nickName;

    private String avatarUrl;

    private String qrCode;

    private String password;

    private String referentid;

    private Short referentNum;

    private String r;

    private Integer sex;

    private BigDecimal balance;

    private Integer count;

    private String updatetime;

    public Integer getId() {
        return id;
    }

    public Membership setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getOpenId() {
        return openId;
    }

    public Membership setOpenId(String openId) {
        this.openId = openId == null ? null : openId.trim();
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public Membership setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
        return this;
    }

    public String getLevel() {
        return level;
    }

    public Membership setLevel(String level) {
        this.level = level == null ? null : level.trim();
        return this;
    }

    public Short getOrderNum() {
        return orderNum;
    }

    public Membership setOrderNum(Short orderNum) {
        this.orderNum = orderNum;
        return this;
    }

    public Integer getExpNum() {
        return expNum;
    }

    public Membership setExpNum(Integer expNum) {
        this.expNum = expNum;
        return this;
    }

    public Integer getIntergraNum() {
        return intergraNum;
    }

    public Membership setIntergraNum(Integer intergraNum) {
        this.intergraNum = intergraNum;
        return this;
    }

    public Byte getIsStore() {
        return isStore;
    }

    public Membership setIsStore(Byte isStore) {
        this.isStore = isStore;
        return this;
    }

    public String getLeveltime() {
        return leveltime;
    }

    public Membership setLeveltime(String leveltime) {
        this.leveltime = leveltime == null ? null : leveltime.trim();
        return this;
    }

    public Short getIsVip() {
        return isVip;
    }

    public Membership setIsVip(Short isVip) {
        this.isVip = isVip;
        return this;
    }

    public String getNickName() {
        return nickName;
    }

    public Membership setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
        return this;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public Membership setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl == null ? null : avatarUrl.trim();
        return this;
    }

    public String getQrCode() {
        return qrCode;
    }

    public Membership setQrCode(String qrCode) {
        this.qrCode = qrCode == null ? null : qrCode.trim();
        return this;
    }

    public String getPassword() {
        return password;
    }

    public Membership setPassword(String password) {
        this.password = password == null ? null : password.trim();
        return this;
    }

    public String getReferentid() {
        return referentid;
    }

    public Membership setReferentid(String referentid) {
        this.referentid = referentid == null ? null : referentid.trim();
        return this;
    }

    public Short getReferentNum() {
        return referentNum;
    }

    public Membership setReferentNum(Short referentNum) {
        this.referentNum = referentNum;
        return this;
    }

    public String getR() {
        return r;
    }

    public Membership setR(String r) {
        this.r = r == null ? null : r.trim();
        return this;
    }

    public Integer getSex() {
        return sex;
    }

    public Membership setSex(Integer sex) {
        this.sex = sex;
        return this;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public Membership setBalance(BigDecimal balance) {
        this.balance = balance;
        return this;
    }

    public Integer getCount() {
        return count;
    }

    public Membership setCount(Integer count) {
        this.count = count;
        return this;
    }

    public String getUpdatetime() {
        return updatetime;
    }

    public Membership setUpdatetime(String updatetime) {
        this.updatetime = updatetime == null ? null : updatetime.trim();
        return this;
    }
}