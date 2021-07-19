package com.sk.web.model;

import java.math.BigDecimal;

public class TcrmMembership {
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

    private String nickname;

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

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId == null ? null : openId.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level == null ? null : level.trim();
    }

    public Short getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Short orderNum) {
        this.orderNum = orderNum;
    }

    public Integer getExpNum() {
        return expNum;
    }

    public void setExpNum(Integer expNum) {
        this.expNum = expNum;
    }

    public Integer getIntergraNum() {
        return intergraNum;
    }

    public void setIntergraNum(Integer intergraNum) {
        this.intergraNum = intergraNum;
    }

    public Byte getIsStore() {
        return isStore;
    }

    public void setIsStore(Byte isStore) {
        this.isStore = isStore;
    }

    public String getLeveltime() {
        return leveltime;
    }

    public void setLeveltime(String leveltime) {
        this.leveltime = leveltime == null ? null : leveltime.trim();
    }

    public Short getIsVip() {
        return isVip;
    }

    public void setIsVip(Short isVip) {
        this.isVip = isVip;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl == null ? null : avatarUrl.trim();
    }

    public String getQrCode() {
        return qrCode;
    }

    public void setQrCode(String qrCode) {
        this.qrCode = qrCode == null ? null : qrCode.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getReferentid() {
        return referentid;
    }

    public void setReferentid(String referentid) {
        this.referentid = referentid == null ? null : referentid.trim();
    }

    public Short getReferentNum() {
        return referentNum;
    }

    public void setReferentNum(Short referentNum) {
        this.referentNum = referentNum;
    }

    public String getR() {
        return r;
    }

    public void setR(String r) {
        this.r = r == null ? null : r.trim();
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(String updatetime) {
        this.updatetime = updatetime == null ? null : updatetime.trim();
    }
}