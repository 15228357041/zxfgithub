package com.test.erp.dao.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class UpmsUser implements Serializable {
    /**
     * 订票用户id
     *
     * @mbg.generated
     */
    private String id;

    /**
     * 登录名
     *
     * @mbg.generated
     */
    private String userUsername;

    /**
     * 密码
     *
     * @mbg.generated
     */
    private String userPassword;

    /**
     * 真实姓名
     *
     * @mbg.generated
     */
    private String userRealname;

    /**
     * 昵称
     *
     * @mbg.generated
     */
    private String userNickname;

    /**
     * 手机号
     *
     * @mbg.generated
     */
    private String userMobile;

    /**
     * 邮箱
     *
     * @mbg.generated
     */
    private String userEmail;

    /**
     * appid
     *
     * @mbg.generated
     */
    private String userAppid;

    /**
     * 类型  1-低频  2-高频;3-游客;
     *
     * @mbg.generated
     */
    private Byte userType;

    /**
     * 状态 -10-删除 0-禁用 3-审核不通过 5-待审核 10-正常
     *
     * @mbg.generated
     */
    private Integer userStatus;

    /**
     * 用户城市
     *
     * @mbg.generated
     */
    private String userCity;

    /**
     * 用户省份
     *
     * @mbg.generated
     */
    private String userProvince;

    /**
     * 头像路径
     *
     * @mbg.generated
     */
    private String userHead;

    /**
     * 用户标识（审核时记录意见）
     *
     * @mbg.generated
     */
    private String userRemark;

    /**
     * 用户余额
     *
     * @mbg.generated
     */
    private BigDecimal userWallet;

    /**
     * 用户虚拟财产支付密码
     *
     * @mbg.generated
     */
    private String userPayPassword;

    /**
     * 代理平台客户编号
     *
     * @mbg.generated
     */
    private String agCustomerId;

    /**
     * 来源:10-交易平台;20-代理平台;30-客服平台;40-车队ERP;
     *
     * @mbg.generated
     */
    private Integer userFrom;

    private Date createDate;

    private String createBy;

    private Date updateDate;

    private String updateBy;

    /**
     * 最后登陆时间
     *
     * @mbg.generated
     */
    private Date loginDate;

    /**
     * 登陆IP
     *
     * @mbg.generated
     */
    private String loginIp;

    /**
     * 性别:0-女;1-男;null-未知;
     *
     * @mbg.generated
     */
    private Byte gender;

    /**
     * 生日
     *
     * @mbg.generated
     */
    private Date birthday;

    /**
     * 是否认证
     *
     * @mbg.generated
     */
    private Byte isAuth;

    /**
     * ;user_form是40 车队ERP时的车队编号
     *
     * @mbg.generated
     */
    private String mtcId;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserUsername() {
        return userUsername;
    }

    public void setUserUsername(String userUsername) {
        this.userUsername = userUsername;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserRealname() {
        return userRealname;
    }

    public void setUserRealname(String userRealname) {
        this.userRealname = userRealname;
    }

    public String getUserNickname() {
        return userNickname;
    }

    public void setUserNickname(String userNickname) {
        this.userNickname = userNickname;
    }

    public String getUserMobile() {
        return userMobile;
    }

    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserAppid() {
        return userAppid;
    }

    public void setUserAppid(String userAppid) {
        this.userAppid = userAppid;
    }

    public Byte getUserType() {
        return userType;
    }

    public void setUserType(Byte userType) {
        this.userType = userType;
    }

    public Integer getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(Integer userStatus) {
        this.userStatus = userStatus;
    }

    public String getUserCity() {
        return userCity;
    }

    public void setUserCity(String userCity) {
        this.userCity = userCity;
    }

    public String getUserProvince() {
        return userProvince;
    }

    public void setUserProvince(String userProvince) {
        this.userProvince = userProvince;
    }

    public String getUserHead() {
        return userHead;
    }

    public void setUserHead(String userHead) {
        this.userHead = userHead;
    }

    public String getUserRemark() {
        return userRemark;
    }

    public void setUserRemark(String userRemark) {
        this.userRemark = userRemark;
    }

    public BigDecimal getUserWallet() {
        return userWallet;
    }

    public void setUserWallet(BigDecimal userWallet) {
        this.userWallet = userWallet;
    }

    public String getUserPayPassword() {
        return userPayPassword;
    }

    public void setUserPayPassword(String userPayPassword) {
        this.userPayPassword = userPayPassword;
    }

    public String getAgCustomerId() {
        return agCustomerId;
    }

    public void setAgCustomerId(String agCustomerId) {
        this.agCustomerId = agCustomerId;
    }

    public Integer getUserFrom() {
        return userFrom;
    }

    public void setUserFrom(Integer userFrom) {
        this.userFrom = userFrom;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public Date getLoginDate() {
        return loginDate;
    }

    public void setLoginDate(Date loginDate) {
        this.loginDate = loginDate;
    }

    public String getLoginIp() {
        return loginIp;
    }

    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp;
    }

    public Byte getGender() {
        return gender;
    }

    public void setGender(Byte gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Byte getIsAuth() {
        return isAuth;
    }

    public void setIsAuth(Byte isAuth) {
        this.isAuth = isAuth;
    }

    public String getMtcId() {
        return mtcId;
    }

    public void setMtcId(String mtcId) {
        this.mtcId = mtcId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userUsername=").append(userUsername);
        sb.append(", userPassword=").append(userPassword);
        sb.append(", userRealname=").append(userRealname);
        sb.append(", userNickname=").append(userNickname);
        sb.append(", userMobile=").append(userMobile);
        sb.append(", userEmail=").append(userEmail);
        sb.append(", userAppid=").append(userAppid);
        sb.append(", userType=").append(userType);
        sb.append(", userStatus=").append(userStatus);
        sb.append(", userCity=").append(userCity);
        sb.append(", userProvince=").append(userProvince);
        sb.append(", userHead=").append(userHead);
        sb.append(", userRemark=").append(userRemark);
        sb.append(", userWallet=").append(userWallet);
        sb.append(", userPayPassword=").append(userPayPassword);
        sb.append(", agCustomerId=").append(agCustomerId);
        sb.append(", userFrom=").append(userFrom);
        sb.append(", createDate=").append(createDate);
        sb.append(", createBy=").append(createBy);
        sb.append(", updateDate=").append(updateDate);
        sb.append(", updateBy=").append(updateBy);
        sb.append(", loginDate=").append(loginDate);
        sb.append(", loginIp=").append(loginIp);
        sb.append(", gender=").append(gender);
        sb.append(", birthday=").append(birthday);
        sb.append(", isAuth=").append(isAuth);
        sb.append(", mtcId=").append(mtcId);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        UpmsUser other = (UpmsUser) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserUsername() == null ? other.getUserUsername() == null : this.getUserUsername().equals(other.getUserUsername()))
            && (this.getUserPassword() == null ? other.getUserPassword() == null : this.getUserPassword().equals(other.getUserPassword()))
            && (this.getUserRealname() == null ? other.getUserRealname() == null : this.getUserRealname().equals(other.getUserRealname()))
            && (this.getUserNickname() == null ? other.getUserNickname() == null : this.getUserNickname().equals(other.getUserNickname()))
            && (this.getUserMobile() == null ? other.getUserMobile() == null : this.getUserMobile().equals(other.getUserMobile()))
            && (this.getUserEmail() == null ? other.getUserEmail() == null : this.getUserEmail().equals(other.getUserEmail()))
            && (this.getUserAppid() == null ? other.getUserAppid() == null : this.getUserAppid().equals(other.getUserAppid()))
            && (this.getUserType() == null ? other.getUserType() == null : this.getUserType().equals(other.getUserType()))
            && (this.getUserStatus() == null ? other.getUserStatus() == null : this.getUserStatus().equals(other.getUserStatus()))
            && (this.getUserCity() == null ? other.getUserCity() == null : this.getUserCity().equals(other.getUserCity()))
            && (this.getUserProvince() == null ? other.getUserProvince() == null : this.getUserProvince().equals(other.getUserProvince()))
            && (this.getUserHead() == null ? other.getUserHead() == null : this.getUserHead().equals(other.getUserHead()))
            && (this.getUserRemark() == null ? other.getUserRemark() == null : this.getUserRemark().equals(other.getUserRemark()))
            && (this.getUserWallet() == null ? other.getUserWallet() == null : this.getUserWallet().equals(other.getUserWallet()))
            && (this.getUserPayPassword() == null ? other.getUserPayPassword() == null : this.getUserPayPassword().equals(other.getUserPayPassword()))
            && (this.getAgCustomerId() == null ? other.getAgCustomerId() == null : this.getAgCustomerId().equals(other.getAgCustomerId()))
            && (this.getUserFrom() == null ? other.getUserFrom() == null : this.getUserFrom().equals(other.getUserFrom()))
            && (this.getCreateDate() == null ? other.getCreateDate() == null : this.getCreateDate().equals(other.getCreateDate()))
            && (this.getCreateBy() == null ? other.getCreateBy() == null : this.getCreateBy().equals(other.getCreateBy()))
            && (this.getUpdateDate() == null ? other.getUpdateDate() == null : this.getUpdateDate().equals(other.getUpdateDate()))
            && (this.getUpdateBy() == null ? other.getUpdateBy() == null : this.getUpdateBy().equals(other.getUpdateBy()))
            && (this.getLoginDate() == null ? other.getLoginDate() == null : this.getLoginDate().equals(other.getLoginDate()))
            && (this.getLoginIp() == null ? other.getLoginIp() == null : this.getLoginIp().equals(other.getLoginIp()))
            && (this.getGender() == null ? other.getGender() == null : this.getGender().equals(other.getGender()))
            && (this.getBirthday() == null ? other.getBirthday() == null : this.getBirthday().equals(other.getBirthday()))
            && (this.getIsAuth() == null ? other.getIsAuth() == null : this.getIsAuth().equals(other.getIsAuth()))
            && (this.getMtcId() == null ? other.getMtcId() == null : this.getMtcId().equals(other.getMtcId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserUsername() == null) ? 0 : getUserUsername().hashCode());
        result = prime * result + ((getUserPassword() == null) ? 0 : getUserPassword().hashCode());
        result = prime * result + ((getUserRealname() == null) ? 0 : getUserRealname().hashCode());
        result = prime * result + ((getUserNickname() == null) ? 0 : getUserNickname().hashCode());
        result = prime * result + ((getUserMobile() == null) ? 0 : getUserMobile().hashCode());
        result = prime * result + ((getUserEmail() == null) ? 0 : getUserEmail().hashCode());
        result = prime * result + ((getUserAppid() == null) ? 0 : getUserAppid().hashCode());
        result = prime * result + ((getUserType() == null) ? 0 : getUserType().hashCode());
        result = prime * result + ((getUserStatus() == null) ? 0 : getUserStatus().hashCode());
        result = prime * result + ((getUserCity() == null) ? 0 : getUserCity().hashCode());
        result = prime * result + ((getUserProvince() == null) ? 0 : getUserProvince().hashCode());
        result = prime * result + ((getUserHead() == null) ? 0 : getUserHead().hashCode());
        result = prime * result + ((getUserRemark() == null) ? 0 : getUserRemark().hashCode());
        result = prime * result + ((getUserWallet() == null) ? 0 : getUserWallet().hashCode());
        result = prime * result + ((getUserPayPassword() == null) ? 0 : getUserPayPassword().hashCode());
        result = prime * result + ((getAgCustomerId() == null) ? 0 : getAgCustomerId().hashCode());
        result = prime * result + ((getUserFrom() == null) ? 0 : getUserFrom().hashCode());
        result = prime * result + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        result = prime * result + ((getCreateBy() == null) ? 0 : getCreateBy().hashCode());
        result = prime * result + ((getUpdateDate() == null) ? 0 : getUpdateDate().hashCode());
        result = prime * result + ((getUpdateBy() == null) ? 0 : getUpdateBy().hashCode());
        result = prime * result + ((getLoginDate() == null) ? 0 : getLoginDate().hashCode());
        result = prime * result + ((getLoginIp() == null) ? 0 : getLoginIp().hashCode());
        result = prime * result + ((getGender() == null) ? 0 : getGender().hashCode());
        result = prime * result + ((getBirthday() == null) ? 0 : getBirthday().hashCode());
        result = prime * result + ((getIsAuth() == null) ? 0 : getIsAuth().hashCode());
        result = prime * result + ((getMtcId() == null) ? 0 : getMtcId().hashCode());
        return result;
    }
}