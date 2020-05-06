package com.ehu.bean.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;


/**
 * 实体类对应的数据表为：service_community
 *
 * @author Rxh
 * @date Tue Mar 31 20:40:57 CST 2020
 */
public class ServiceCommunity implements Serializable {
    /**
     * ID
     */
    private Integer communityId;

    /**
     * 小区名称
     */
    private String communityName;

    /**
     * 小区公告
     */
    private String communityNotice;

    /**
     * 城市id
     */
    private Integer cityId;

    /**
     * 小区id
     */
    private Integer cellId;

    /**
     * 团长姓名
     */
    private String headName;

    /**
     * 地址
     */
    private String headAddress;

    /**
     * 团长头像
     */
    private String headAvatar;

    /**
     * 联系电话
     */
    private String headPhone;

    /**
     * 账户类型 关联account_type：type_id
     */
    private Integer accountType;

    /**
     * 提现账户:根据账户类型对应支付宝账户/微信openid/银行账户等
     */
    private String account;

    /**
     * 账户姓名
     */
    private String accountName;

    /**
     * 经度
     */
    private Double longitude;

    /**
     * 纬度
     */
    private Double latitude;

    /**
     * 状态(-1 待审核 ,0:禁用， 1:正常 ,2:审核驳回)
     */
    private Integer status;

    /**
     * 服务抽成
     */
    private BigDecimal serviceCharge;

    /**
     * bd邀请人
     */
    private String bdUser;

    /**
     * 小铺小程序二维码
     */
    private String miniCodeUrl;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 创建人
     */
    private String createBy;

    /**
     * 
     */
    private Date updateTime;

    /**
     * 修改人
     */
    private String updateBy;

    public Integer getCommunityId() {
        return communityId;
    }

    public void setCommunityId(Integer communityId) {
        this.communityId = communityId;
    }

    public String getCommunityName() {
        return communityName;
    }

    public void setCommunityName(String communityName) {
        this.communityName = communityName;
    }

    public String getCommunityNotice() {
        return communityNotice;
    }

    public void setCommunityNotice(String communityNotice) {
        this.communityNotice = communityNotice;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public Integer getCellId() {
        return cellId;
    }

    public void setCellId(Integer cellId) {
        this.cellId = cellId;
    }

    public String getHeadName() {
        return headName;
    }

    public void setHeadName(String headName) {
        this.headName = headName;
    }

    public String getHeadAddress() {
        return headAddress;
    }

    public void setHeadAddress(String headAddress) {
        this.headAddress = headAddress;
    }

    public String getHeadAvatar() {
        return headAvatar;
    }

    public void setHeadAvatar(String headAvatar) {
        this.headAvatar = headAvatar;
    }

    public String getHeadPhone() {
        return headPhone;
    }

    public void setHeadPhone(String headPhone) {
        this.headPhone = headPhone;
    }

    public Integer getAccountType() {
        return accountType;
    }

    public void setAccountType(Integer accountType) {
        this.accountType = accountType;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public BigDecimal getServiceCharge() {
        return serviceCharge;
    }

    public void setServiceCharge(BigDecimal serviceCharge) {
        this.serviceCharge = serviceCharge;
    }

    public String getBdUser() {
        return bdUser;
    }

    public void setBdUser(String bdUser) {
        this.bdUser = bdUser;
    }

    public String getMiniCodeUrl() {
        return miniCodeUrl;
    }

    public void setMiniCodeUrl(String miniCodeUrl) {
        this.miniCodeUrl = miniCodeUrl;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }
}