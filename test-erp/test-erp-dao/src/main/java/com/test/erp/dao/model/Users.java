package com.test.erp.dao.model;

import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@TableName("users")
public class Users implements Serializable {
    private Integer id;

    private String userkey;

    private String username;

    private String password;

    private Integer usergroupid;

    private String email;

    private String address;

    private String telephone;

    private Date startdate;

    private Date createdate;

    private Integer createuserid;

    private Date modificationdate;

    private Integer modificationuserid;

    private String memo;

    private String picpath;

    private String barcode;

    /**
     * 1 在职 2 离职
     *
     * @mbg.generated
     */
    private Integer status;

    private Date enddate;

    private String mobilephone;

    private Integer humanid;

    private Integer orgid;

    /**
     * 1= 复用 2 =不复用
     *
     * @mbg.generated
     */
    private Integer ismulti;

    private Integer tombstone;

    private Integer logintype;

    private String extravarchar1;

    private String extravarchar2;

    private String extravarchar3;

    private String extravarchar4;

    private String extravarchar5;

    private String extravarchar6;

    private String extravarchar7;

    private String extravarchar8;

    private String extravarchar9;

    /**
     * 用户公司字段
     *
     * @mbg.generated
     */
    private String extravarchar10;

    private BigDecimal extradecimal1;

    private BigDecimal extradecimal2;

    private BigDecimal extradecimal3;

    private BigDecimal extradecimal4;

    private BigDecimal extradecimal5;

    private Integer extraint1;

    private Integer extraint2;

    private Integer extraint3;

    private Integer extraint4;

    private Integer extraint5;

    private Integer extraid1;

    private Integer extraid2;

    private Integer extraid3;

    private Integer extraid4;

    private Integer extraid5;

    private Date extradatetime1;

    private Date extradatetime2;

    private Date extradatetime3;

    private Date extradatetime4;

    private Date extradatetime5;

    private Integer customerid;

    private Integer wechatuserid;

    private Integer departmentid;

    private Integer ishuman;

    private Integer rootuserid;

    private Integer shareid;

    private Integer saleid;

    private String officalwechatkey;

    /**
     * 和职位关联id
     *
     * @mbg.generated
     */
    private Integer postid;

    /**
     * 出生日期
     *
     * @mbg.generated
     */
    private Date birthdatetime;

    /**
     * 身份证
     *
     * @mbg.generated
     */
    private String idcard;

    /**
     * 婚否
     *
     * @mbg.generated
     */
    private String ismarried;

    /**
     * 是否生育
     *
     * @mbg.generated
     */
    private String isbirthed;

    /**
     * 学历
     *
     * @mbg.generated
     */
    private String education;

    /**
     * 专业
     *
     * @mbg.generated
     */
    private String major;

    private Integer forgetstate;

    /**
     * 是否有管理员权限 1：有
     *
     * @mbg.generated
     */
    private Integer isadmin;

    /**
     * 申请状态
     *
     * @mbg.generated
     */
    private Integer registrationstatus;

    /**
     * 人员岗位
     *
     * @mbg.generated
     */
    private String workstation;

    /**
     * 人员部门名称
     *
     * @mbg.generated
     */
    private String departmentname;

    /**
     * 巡检人员id
     *
     * @mbg.generated
     */
    private Integer inspectionhumanid;

    /**
     * 所属基地（工厂）
     *
     * @mbg.generated
     */
    private String factorycode;

    /**
     * 是否已修改密码
     *
     * @mbg.generated
     */
    private Integer changepassword;

    /**
     * 巡检人员key
     *
     * @mbg.generated
     */
    private String inspectionhumankey;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserkey() {
        return userkey;
    }

    public void setUserkey(String userkey) {
        this.userkey = userkey;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getUsergroupid() {
        return usergroupid;
    }

    public void setUsergroupid(Integer usergroupid) {
        this.usergroupid = usergroupid;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Integer getCreateuserid() {
        return createuserid;
    }

    public void setCreateuserid(Integer createuserid) {
        this.createuserid = createuserid;
    }

    public Date getModificationdate() {
        return modificationdate;
    }

    public void setModificationdate(Date modificationdate) {
        this.modificationdate = modificationdate;
    }

    public Integer getModificationuserid() {
        return modificationuserid;
    }

    public void setModificationuserid(Integer modificationuserid) {
        this.modificationuserid = modificationuserid;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getPicpath() {
        return picpath;
    }

    public void setPicpath(String picpath) {
        this.picpath = picpath;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    public String getMobilephone() {
        return mobilephone;
    }

    public void setMobilephone(String mobilephone) {
        this.mobilephone = mobilephone;
    }

    public Integer getHumanid() {
        return humanid;
    }

    public void setHumanid(Integer humanid) {
        this.humanid = humanid;
    }

    public Integer getOrgid() {
        return orgid;
    }

    public void setOrgid(Integer orgid) {
        this.orgid = orgid;
    }

    public Integer getIsmulti() {
        return ismulti;
    }

    public void setIsmulti(Integer ismulti) {
        this.ismulti = ismulti;
    }

    public Integer getTombstone() {
        return tombstone;
    }

    public void setTombstone(Integer tombstone) {
        this.tombstone = tombstone;
    }

    public Integer getLogintype() {
        return logintype;
    }

    public void setLogintype(Integer logintype) {
        this.logintype = logintype;
    }

    public String getExtravarchar1() {
        return extravarchar1;
    }

    public void setExtravarchar1(String extravarchar1) {
        this.extravarchar1 = extravarchar1;
    }

    public String getExtravarchar2() {
        return extravarchar2;
    }

    public void setExtravarchar2(String extravarchar2) {
        this.extravarchar2 = extravarchar2;
    }

    public String getExtravarchar3() {
        return extravarchar3;
    }

    public void setExtravarchar3(String extravarchar3) {
        this.extravarchar3 = extravarchar3;
    }

    public String getExtravarchar4() {
        return extravarchar4;
    }

    public void setExtravarchar4(String extravarchar4) {
        this.extravarchar4 = extravarchar4;
    }

    public String getExtravarchar5() {
        return extravarchar5;
    }

    public void setExtravarchar5(String extravarchar5) {
        this.extravarchar5 = extravarchar5;
    }

    public String getExtravarchar6() {
        return extravarchar6;
    }

    public void setExtravarchar6(String extravarchar6) {
        this.extravarchar6 = extravarchar6;
    }

    public String getExtravarchar7() {
        return extravarchar7;
    }

    public void setExtravarchar7(String extravarchar7) {
        this.extravarchar7 = extravarchar7;
    }

    public String getExtravarchar8() {
        return extravarchar8;
    }

    public void setExtravarchar8(String extravarchar8) {
        this.extravarchar8 = extravarchar8;
    }

    public String getExtravarchar9() {
        return extravarchar9;
    }

    public void setExtravarchar9(String extravarchar9) {
        this.extravarchar9 = extravarchar9;
    }

    public String getExtravarchar10() {
        return extravarchar10;
    }

    public void setExtravarchar10(String extravarchar10) {
        this.extravarchar10 = extravarchar10;
    }

    public BigDecimal getExtradecimal1() {
        return extradecimal1;
    }

    public void setExtradecimal1(BigDecimal extradecimal1) {
        this.extradecimal1 = extradecimal1;
    }

    public BigDecimal getExtradecimal2() {
        return extradecimal2;
    }

    public void setExtradecimal2(BigDecimal extradecimal2) {
        this.extradecimal2 = extradecimal2;
    }

    public BigDecimal getExtradecimal3() {
        return extradecimal3;
    }

    public void setExtradecimal3(BigDecimal extradecimal3) {
        this.extradecimal3 = extradecimal3;
    }

    public BigDecimal getExtradecimal4() {
        return extradecimal4;
    }

    public void setExtradecimal4(BigDecimal extradecimal4) {
        this.extradecimal4 = extradecimal4;
    }

    public BigDecimal getExtradecimal5() {
        return extradecimal5;
    }

    public void setExtradecimal5(BigDecimal extradecimal5) {
        this.extradecimal5 = extradecimal5;
    }

    public Integer getExtraint1() {
        return extraint1;
    }

    public void setExtraint1(Integer extraint1) {
        this.extraint1 = extraint1;
    }

    public Integer getExtraint2() {
        return extraint2;
    }

    public void setExtraint2(Integer extraint2) {
        this.extraint2 = extraint2;
    }

    public Integer getExtraint3() {
        return extraint3;
    }

    public void setExtraint3(Integer extraint3) {
        this.extraint3 = extraint3;
    }

    public Integer getExtraint4() {
        return extraint4;
    }

    public void setExtraint4(Integer extraint4) {
        this.extraint4 = extraint4;
    }

    public Integer getExtraint5() {
        return extraint5;
    }

    public void setExtraint5(Integer extraint5) {
        this.extraint5 = extraint5;
    }

    public Integer getExtraid1() {
        return extraid1;
    }

    public void setExtraid1(Integer extraid1) {
        this.extraid1 = extraid1;
    }

    public Integer getExtraid2() {
        return extraid2;
    }

    public void setExtraid2(Integer extraid2) {
        this.extraid2 = extraid2;
    }

    public Integer getExtraid3() {
        return extraid3;
    }

    public void setExtraid3(Integer extraid3) {
        this.extraid3 = extraid3;
    }

    public Integer getExtraid4() {
        return extraid4;
    }

    public void setExtraid4(Integer extraid4) {
        this.extraid4 = extraid4;
    }

    public Integer getExtraid5() {
        return extraid5;
    }

    public void setExtraid5(Integer extraid5) {
        this.extraid5 = extraid5;
    }

    public Date getExtradatetime1() {
        return extradatetime1;
    }

    public void setExtradatetime1(Date extradatetime1) {
        this.extradatetime1 = extradatetime1;
    }

    public Date getExtradatetime2() {
        return extradatetime2;
    }

    public void setExtradatetime2(Date extradatetime2) {
        this.extradatetime2 = extradatetime2;
    }

    public Date getExtradatetime3() {
        return extradatetime3;
    }

    public void setExtradatetime3(Date extradatetime3) {
        this.extradatetime3 = extradatetime3;
    }

    public Date getExtradatetime4() {
        return extradatetime4;
    }

    public void setExtradatetime4(Date extradatetime4) {
        this.extradatetime4 = extradatetime4;
    }

    public Date getExtradatetime5() {
        return extradatetime5;
    }

    public void setExtradatetime5(Date extradatetime5) {
        this.extradatetime5 = extradatetime5;
    }

    public Integer getCustomerid() {
        return customerid;
    }

    public void setCustomerid(Integer customerid) {
        this.customerid = customerid;
    }

    public Integer getWechatuserid() {
        return wechatuserid;
    }

    public void setWechatuserid(Integer wechatuserid) {
        this.wechatuserid = wechatuserid;
    }

    public Integer getDepartmentid() {
        return departmentid;
    }

    public void setDepartmentid(Integer departmentid) {
        this.departmentid = departmentid;
    }

    public Integer getIshuman() {
        return ishuman;
    }

    public void setIshuman(Integer ishuman) {
        this.ishuman = ishuman;
    }

    public Integer getRootuserid() {
        return rootuserid;
    }

    public void setRootuserid(Integer rootuserid) {
        this.rootuserid = rootuserid;
    }

    public Integer getShareid() {
        return shareid;
    }

    public void setShareid(Integer shareid) {
        this.shareid = shareid;
    }

    public Integer getSaleid() {
        return saleid;
    }

    public void setSaleid(Integer saleid) {
        this.saleid = saleid;
    }

    public String getOfficalwechatkey() {
        return officalwechatkey;
    }

    public void setOfficalwechatkey(String officalwechatkey) {
        this.officalwechatkey = officalwechatkey;
    }

    public Integer getPostid() {
        return postid;
    }

    public void setPostid(Integer postid) {
        this.postid = postid;
    }

    public Date getBirthdatetime() {
        return birthdatetime;
    }

    public void setBirthdatetime(Date birthdatetime) {
        this.birthdatetime = birthdatetime;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    public String getIsmarried() {
        return ismarried;
    }

    public void setIsmarried(String ismarried) {
        this.ismarried = ismarried;
    }

    public String getIsbirthed() {
        return isbirthed;
    }

    public void setIsbirthed(String isbirthed) {
        this.isbirthed = isbirthed;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public Integer getForgetstate() {
        return forgetstate;
    }

    public void setForgetstate(Integer forgetstate) {
        this.forgetstate = forgetstate;
    }

    public Integer getIsadmin() {
        return isadmin;
    }

    public void setIsadmin(Integer isadmin) {
        this.isadmin = isadmin;
    }

    public Integer getRegistrationstatus() {
        return registrationstatus;
    }

    public void setRegistrationstatus(Integer registrationstatus) {
        this.registrationstatus = registrationstatus;
    }

    public String getWorkstation() {
        return workstation;
    }

    public void setWorkstation(String workstation) {
        this.workstation = workstation;
    }

    public String getDepartmentname() {
        return departmentname;
    }

    public void setDepartmentname(String departmentname) {
        this.departmentname = departmentname;
    }

    public Integer getInspectionhumanid() {
        return inspectionhumanid;
    }

    public void setInspectionhumanid(Integer inspectionhumanid) {
        this.inspectionhumanid = inspectionhumanid;
    }

    public String getFactorycode() {
        return factorycode;
    }

    public void setFactorycode(String factorycode) {
        this.factorycode = factorycode;
    }

    public Integer getChangepassword() {
        return changepassword;
    }

    public void setChangepassword(Integer changepassword) {
        this.changepassword = changepassword;
    }

    public String getInspectionhumankey() {
        return inspectionhumankey;
    }

    public void setInspectionhumankey(String inspectionhumankey) {
        this.inspectionhumankey = inspectionhumankey;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userkey=").append(userkey);
        sb.append(", username=").append(username);
        sb.append(", password=").append(password);
        sb.append(", usergroupid=").append(usergroupid);
        sb.append(", email=").append(email);
        sb.append(", address=").append(address);
        sb.append(", telephone=").append(telephone);
        sb.append(", startdate=").append(startdate);
        sb.append(", createdate=").append(createdate);
        sb.append(", createuserid=").append(createuserid);
        sb.append(", modificationdate=").append(modificationdate);
        sb.append(", modificationuserid=").append(modificationuserid);
        sb.append(", memo=").append(memo);
        sb.append(", picpath=").append(picpath);
        sb.append(", barcode=").append(barcode);
        sb.append(", status=").append(status);
        sb.append(", enddate=").append(enddate);
        sb.append(", mobilephone=").append(mobilephone);
        sb.append(", humanid=").append(humanid);
        sb.append(", orgid=").append(orgid);
        sb.append(", ismulti=").append(ismulti);
        sb.append(", tombstone=").append(tombstone);
        sb.append(", logintype=").append(logintype);
        sb.append(", extravarchar1=").append(extravarchar1);
        sb.append(", extravarchar2=").append(extravarchar2);
        sb.append(", extravarchar3=").append(extravarchar3);
        sb.append(", extravarchar4=").append(extravarchar4);
        sb.append(", extravarchar5=").append(extravarchar5);
        sb.append(", extravarchar6=").append(extravarchar6);
        sb.append(", extravarchar7=").append(extravarchar7);
        sb.append(", extravarchar8=").append(extravarchar8);
        sb.append(", extravarchar9=").append(extravarchar9);
        sb.append(", extravarchar10=").append(extravarchar10);
        sb.append(", extradecimal1=").append(extradecimal1);
        sb.append(", extradecimal2=").append(extradecimal2);
        sb.append(", extradecimal3=").append(extradecimal3);
        sb.append(", extradecimal4=").append(extradecimal4);
        sb.append(", extradecimal5=").append(extradecimal5);
        sb.append(", extraint1=").append(extraint1);
        sb.append(", extraint2=").append(extraint2);
        sb.append(", extraint3=").append(extraint3);
        sb.append(", extraint4=").append(extraint4);
        sb.append(", extraint5=").append(extraint5);
        sb.append(", extraid1=").append(extraid1);
        sb.append(", extraid2=").append(extraid2);
        sb.append(", extraid3=").append(extraid3);
        sb.append(", extraid4=").append(extraid4);
        sb.append(", extraid5=").append(extraid5);
        sb.append(", extradatetime1=").append(extradatetime1);
        sb.append(", extradatetime2=").append(extradatetime2);
        sb.append(", extradatetime3=").append(extradatetime3);
        sb.append(", extradatetime4=").append(extradatetime4);
        sb.append(", extradatetime5=").append(extradatetime5);
        sb.append(", customerid=").append(customerid);
        sb.append(", wechatuserid=").append(wechatuserid);
        sb.append(", departmentid=").append(departmentid);
        sb.append(", ishuman=").append(ishuman);
        sb.append(", rootuserid=").append(rootuserid);
        sb.append(", shareid=").append(shareid);
        sb.append(", saleid=").append(saleid);
        sb.append(", officalwechatkey=").append(officalwechatkey);
        sb.append(", postid=").append(postid);
        sb.append(", birthdatetime=").append(birthdatetime);
        sb.append(", idcard=").append(idcard);
        sb.append(", ismarried=").append(ismarried);
        sb.append(", isbirthed=").append(isbirthed);
        sb.append(", education=").append(education);
        sb.append(", major=").append(major);
        sb.append(", forgetstate=").append(forgetstate);
        sb.append(", isadmin=").append(isadmin);
        sb.append(", registrationstatus=").append(registrationstatus);
        sb.append(", workstation=").append(workstation);
        sb.append(", departmentname=").append(departmentname);
        sb.append(", inspectionhumanid=").append(inspectionhumanid);
        sb.append(", factorycode=").append(factorycode);
        sb.append(", changepassword=").append(changepassword);
        sb.append(", inspectionhumankey=").append(inspectionhumankey);
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
        Users other = (Users) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserkey() == null ? other.getUserkey() == null : this.getUserkey().equals(other.getUserkey()))
            && (this.getUsername() == null ? other.getUsername() == null : this.getUsername().equals(other.getUsername()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getUsergroupid() == null ? other.getUsergroupid() == null : this.getUsergroupid().equals(other.getUsergroupid()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getTelephone() == null ? other.getTelephone() == null : this.getTelephone().equals(other.getTelephone()))
            && (this.getStartdate() == null ? other.getStartdate() == null : this.getStartdate().equals(other.getStartdate()))
            && (this.getCreatedate() == null ? other.getCreatedate() == null : this.getCreatedate().equals(other.getCreatedate()))
            && (this.getCreateuserid() == null ? other.getCreateuserid() == null : this.getCreateuserid().equals(other.getCreateuserid()))
            && (this.getModificationdate() == null ? other.getModificationdate() == null : this.getModificationdate().equals(other.getModificationdate()))
            && (this.getModificationuserid() == null ? other.getModificationuserid() == null : this.getModificationuserid().equals(other.getModificationuserid()))
            && (this.getMemo() == null ? other.getMemo() == null : this.getMemo().equals(other.getMemo()))
            && (this.getPicpath() == null ? other.getPicpath() == null : this.getPicpath().equals(other.getPicpath()))
            && (this.getBarcode() == null ? other.getBarcode() == null : this.getBarcode().equals(other.getBarcode()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getEnddate() == null ? other.getEnddate() == null : this.getEnddate().equals(other.getEnddate()))
            && (this.getMobilephone() == null ? other.getMobilephone() == null : this.getMobilephone().equals(other.getMobilephone()))
            && (this.getHumanid() == null ? other.getHumanid() == null : this.getHumanid().equals(other.getHumanid()))
            && (this.getOrgid() == null ? other.getOrgid() == null : this.getOrgid().equals(other.getOrgid()))
            && (this.getIsmulti() == null ? other.getIsmulti() == null : this.getIsmulti().equals(other.getIsmulti()))
            && (this.getTombstone() == null ? other.getTombstone() == null : this.getTombstone().equals(other.getTombstone()))
            && (this.getLogintype() == null ? other.getLogintype() == null : this.getLogintype().equals(other.getLogintype()))
            && (this.getExtravarchar1() == null ? other.getExtravarchar1() == null : this.getExtravarchar1().equals(other.getExtravarchar1()))
            && (this.getExtravarchar2() == null ? other.getExtravarchar2() == null : this.getExtravarchar2().equals(other.getExtravarchar2()))
            && (this.getExtravarchar3() == null ? other.getExtravarchar3() == null : this.getExtravarchar3().equals(other.getExtravarchar3()))
            && (this.getExtravarchar4() == null ? other.getExtravarchar4() == null : this.getExtravarchar4().equals(other.getExtravarchar4()))
            && (this.getExtravarchar5() == null ? other.getExtravarchar5() == null : this.getExtravarchar5().equals(other.getExtravarchar5()))
            && (this.getExtravarchar6() == null ? other.getExtravarchar6() == null : this.getExtravarchar6().equals(other.getExtravarchar6()))
            && (this.getExtravarchar7() == null ? other.getExtravarchar7() == null : this.getExtravarchar7().equals(other.getExtravarchar7()))
            && (this.getExtravarchar8() == null ? other.getExtravarchar8() == null : this.getExtravarchar8().equals(other.getExtravarchar8()))
            && (this.getExtravarchar9() == null ? other.getExtravarchar9() == null : this.getExtravarchar9().equals(other.getExtravarchar9()))
            && (this.getExtravarchar10() == null ? other.getExtravarchar10() == null : this.getExtravarchar10().equals(other.getExtravarchar10()))
            && (this.getExtradecimal1() == null ? other.getExtradecimal1() == null : this.getExtradecimal1().equals(other.getExtradecimal1()))
            && (this.getExtradecimal2() == null ? other.getExtradecimal2() == null : this.getExtradecimal2().equals(other.getExtradecimal2()))
            && (this.getExtradecimal3() == null ? other.getExtradecimal3() == null : this.getExtradecimal3().equals(other.getExtradecimal3()))
            && (this.getExtradecimal4() == null ? other.getExtradecimal4() == null : this.getExtradecimal4().equals(other.getExtradecimal4()))
            && (this.getExtradecimal5() == null ? other.getExtradecimal5() == null : this.getExtradecimal5().equals(other.getExtradecimal5()))
            && (this.getExtraint1() == null ? other.getExtraint1() == null : this.getExtraint1().equals(other.getExtraint1()))
            && (this.getExtraint2() == null ? other.getExtraint2() == null : this.getExtraint2().equals(other.getExtraint2()))
            && (this.getExtraint3() == null ? other.getExtraint3() == null : this.getExtraint3().equals(other.getExtraint3()))
            && (this.getExtraint4() == null ? other.getExtraint4() == null : this.getExtraint4().equals(other.getExtraint4()))
            && (this.getExtraint5() == null ? other.getExtraint5() == null : this.getExtraint5().equals(other.getExtraint5()))
            && (this.getExtraid1() == null ? other.getExtraid1() == null : this.getExtraid1().equals(other.getExtraid1()))
            && (this.getExtraid2() == null ? other.getExtraid2() == null : this.getExtraid2().equals(other.getExtraid2()))
            && (this.getExtraid3() == null ? other.getExtraid3() == null : this.getExtraid3().equals(other.getExtraid3()))
            && (this.getExtraid4() == null ? other.getExtraid4() == null : this.getExtraid4().equals(other.getExtraid4()))
            && (this.getExtraid5() == null ? other.getExtraid5() == null : this.getExtraid5().equals(other.getExtraid5()))
            && (this.getExtradatetime1() == null ? other.getExtradatetime1() == null : this.getExtradatetime1().equals(other.getExtradatetime1()))
            && (this.getExtradatetime2() == null ? other.getExtradatetime2() == null : this.getExtradatetime2().equals(other.getExtradatetime2()))
            && (this.getExtradatetime3() == null ? other.getExtradatetime3() == null : this.getExtradatetime3().equals(other.getExtradatetime3()))
            && (this.getExtradatetime4() == null ? other.getExtradatetime4() == null : this.getExtradatetime4().equals(other.getExtradatetime4()))
            && (this.getExtradatetime5() == null ? other.getExtradatetime5() == null : this.getExtradatetime5().equals(other.getExtradatetime5()))
            && (this.getCustomerid() == null ? other.getCustomerid() == null : this.getCustomerid().equals(other.getCustomerid()))
            && (this.getWechatuserid() == null ? other.getWechatuserid() == null : this.getWechatuserid().equals(other.getWechatuserid()))
            && (this.getDepartmentid() == null ? other.getDepartmentid() == null : this.getDepartmentid().equals(other.getDepartmentid()))
            && (this.getIshuman() == null ? other.getIshuman() == null : this.getIshuman().equals(other.getIshuman()))
            && (this.getRootuserid() == null ? other.getRootuserid() == null : this.getRootuserid().equals(other.getRootuserid()))
            && (this.getShareid() == null ? other.getShareid() == null : this.getShareid().equals(other.getShareid()))
            && (this.getSaleid() == null ? other.getSaleid() == null : this.getSaleid().equals(other.getSaleid()))
            && (this.getOfficalwechatkey() == null ? other.getOfficalwechatkey() == null : this.getOfficalwechatkey().equals(other.getOfficalwechatkey()))
            && (this.getPostid() == null ? other.getPostid() == null : this.getPostid().equals(other.getPostid()))
            && (this.getBirthdatetime() == null ? other.getBirthdatetime() == null : this.getBirthdatetime().equals(other.getBirthdatetime()))
            && (this.getIdcard() == null ? other.getIdcard() == null : this.getIdcard().equals(other.getIdcard()))
            && (this.getIsmarried() == null ? other.getIsmarried() == null : this.getIsmarried().equals(other.getIsmarried()))
            && (this.getIsbirthed() == null ? other.getIsbirthed() == null : this.getIsbirthed().equals(other.getIsbirthed()))
            && (this.getEducation() == null ? other.getEducation() == null : this.getEducation().equals(other.getEducation()))
            && (this.getMajor() == null ? other.getMajor() == null : this.getMajor().equals(other.getMajor()))
            && (this.getForgetstate() == null ? other.getForgetstate() == null : this.getForgetstate().equals(other.getForgetstate()))
            && (this.getIsadmin() == null ? other.getIsadmin() == null : this.getIsadmin().equals(other.getIsadmin()))
            && (this.getRegistrationstatus() == null ? other.getRegistrationstatus() == null : this.getRegistrationstatus().equals(other.getRegistrationstatus()))
            && (this.getWorkstation() == null ? other.getWorkstation() == null : this.getWorkstation().equals(other.getWorkstation()))
            && (this.getDepartmentname() == null ? other.getDepartmentname() == null : this.getDepartmentname().equals(other.getDepartmentname()))
            && (this.getInspectionhumanid() == null ? other.getInspectionhumanid() == null : this.getInspectionhumanid().equals(other.getInspectionhumanid()))
            && (this.getFactorycode() == null ? other.getFactorycode() == null : this.getFactorycode().equals(other.getFactorycode()))
            && (this.getChangepassword() == null ? other.getChangepassword() == null : this.getChangepassword().equals(other.getChangepassword()))
            && (this.getInspectionhumankey() == null ? other.getInspectionhumankey() == null : this.getInspectionhumankey().equals(other.getInspectionhumankey()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserkey() == null) ? 0 : getUserkey().hashCode());
        result = prime * result + ((getUsername() == null) ? 0 : getUsername().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getUsergroupid() == null) ? 0 : getUsergroupid().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getTelephone() == null) ? 0 : getTelephone().hashCode());
        result = prime * result + ((getStartdate() == null) ? 0 : getStartdate().hashCode());
        result = prime * result + ((getCreatedate() == null) ? 0 : getCreatedate().hashCode());
        result = prime * result + ((getCreateuserid() == null) ? 0 : getCreateuserid().hashCode());
        result = prime * result + ((getModificationdate() == null) ? 0 : getModificationdate().hashCode());
        result = prime * result + ((getModificationuserid() == null) ? 0 : getModificationuserid().hashCode());
        result = prime * result + ((getMemo() == null) ? 0 : getMemo().hashCode());
        result = prime * result + ((getPicpath() == null) ? 0 : getPicpath().hashCode());
        result = prime * result + ((getBarcode() == null) ? 0 : getBarcode().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getEnddate() == null) ? 0 : getEnddate().hashCode());
        result = prime * result + ((getMobilephone() == null) ? 0 : getMobilephone().hashCode());
        result = prime * result + ((getHumanid() == null) ? 0 : getHumanid().hashCode());
        result = prime * result + ((getOrgid() == null) ? 0 : getOrgid().hashCode());
        result = prime * result + ((getIsmulti() == null) ? 0 : getIsmulti().hashCode());
        result = prime * result + ((getTombstone() == null) ? 0 : getTombstone().hashCode());
        result = prime * result + ((getLogintype() == null) ? 0 : getLogintype().hashCode());
        result = prime * result + ((getExtravarchar1() == null) ? 0 : getExtravarchar1().hashCode());
        result = prime * result + ((getExtravarchar2() == null) ? 0 : getExtravarchar2().hashCode());
        result = prime * result + ((getExtravarchar3() == null) ? 0 : getExtravarchar3().hashCode());
        result = prime * result + ((getExtravarchar4() == null) ? 0 : getExtravarchar4().hashCode());
        result = prime * result + ((getExtravarchar5() == null) ? 0 : getExtravarchar5().hashCode());
        result = prime * result + ((getExtravarchar6() == null) ? 0 : getExtravarchar6().hashCode());
        result = prime * result + ((getExtravarchar7() == null) ? 0 : getExtravarchar7().hashCode());
        result = prime * result + ((getExtravarchar8() == null) ? 0 : getExtravarchar8().hashCode());
        result = prime * result + ((getExtravarchar9() == null) ? 0 : getExtravarchar9().hashCode());
        result = prime * result + ((getExtravarchar10() == null) ? 0 : getExtravarchar10().hashCode());
        result = prime * result + ((getExtradecimal1() == null) ? 0 : getExtradecimal1().hashCode());
        result = prime * result + ((getExtradecimal2() == null) ? 0 : getExtradecimal2().hashCode());
        result = prime * result + ((getExtradecimal3() == null) ? 0 : getExtradecimal3().hashCode());
        result = prime * result + ((getExtradecimal4() == null) ? 0 : getExtradecimal4().hashCode());
        result = prime * result + ((getExtradecimal5() == null) ? 0 : getExtradecimal5().hashCode());
        result = prime * result + ((getExtraint1() == null) ? 0 : getExtraint1().hashCode());
        result = prime * result + ((getExtraint2() == null) ? 0 : getExtraint2().hashCode());
        result = prime * result + ((getExtraint3() == null) ? 0 : getExtraint3().hashCode());
        result = prime * result + ((getExtraint4() == null) ? 0 : getExtraint4().hashCode());
        result = prime * result + ((getExtraint5() == null) ? 0 : getExtraint5().hashCode());
        result = prime * result + ((getExtraid1() == null) ? 0 : getExtraid1().hashCode());
        result = prime * result + ((getExtraid2() == null) ? 0 : getExtraid2().hashCode());
        result = prime * result + ((getExtraid3() == null) ? 0 : getExtraid3().hashCode());
        result = prime * result + ((getExtraid4() == null) ? 0 : getExtraid4().hashCode());
        result = prime * result + ((getExtraid5() == null) ? 0 : getExtraid5().hashCode());
        result = prime * result + ((getExtradatetime1() == null) ? 0 : getExtradatetime1().hashCode());
        result = prime * result + ((getExtradatetime2() == null) ? 0 : getExtradatetime2().hashCode());
        result = prime * result + ((getExtradatetime3() == null) ? 0 : getExtradatetime3().hashCode());
        result = prime * result + ((getExtradatetime4() == null) ? 0 : getExtradatetime4().hashCode());
        result = prime * result + ((getExtradatetime5() == null) ? 0 : getExtradatetime5().hashCode());
        result = prime * result + ((getCustomerid() == null) ? 0 : getCustomerid().hashCode());
        result = prime * result + ((getWechatuserid() == null) ? 0 : getWechatuserid().hashCode());
        result = prime * result + ((getDepartmentid() == null) ? 0 : getDepartmentid().hashCode());
        result = prime * result + ((getIshuman() == null) ? 0 : getIshuman().hashCode());
        result = prime * result + ((getRootuserid() == null) ? 0 : getRootuserid().hashCode());
        result = prime * result + ((getShareid() == null) ? 0 : getShareid().hashCode());
        result = prime * result + ((getSaleid() == null) ? 0 : getSaleid().hashCode());
        result = prime * result + ((getOfficalwechatkey() == null) ? 0 : getOfficalwechatkey().hashCode());
        result = prime * result + ((getPostid() == null) ? 0 : getPostid().hashCode());
        result = prime * result + ((getBirthdatetime() == null) ? 0 : getBirthdatetime().hashCode());
        result = prime * result + ((getIdcard() == null) ? 0 : getIdcard().hashCode());
        result = prime * result + ((getIsmarried() == null) ? 0 : getIsmarried().hashCode());
        result = prime * result + ((getIsbirthed() == null) ? 0 : getIsbirthed().hashCode());
        result = prime * result + ((getEducation() == null) ? 0 : getEducation().hashCode());
        result = prime * result + ((getMajor() == null) ? 0 : getMajor().hashCode());
        result = prime * result + ((getForgetstate() == null) ? 0 : getForgetstate().hashCode());
        result = prime * result + ((getIsadmin() == null) ? 0 : getIsadmin().hashCode());
        result = prime * result + ((getRegistrationstatus() == null) ? 0 : getRegistrationstatus().hashCode());
        result = prime * result + ((getWorkstation() == null) ? 0 : getWorkstation().hashCode());
        result = prime * result + ((getDepartmentname() == null) ? 0 : getDepartmentname().hashCode());
        result = prime * result + ((getInspectionhumanid() == null) ? 0 : getInspectionhumanid().hashCode());
        result = prime * result + ((getFactorycode() == null) ? 0 : getFactorycode().hashCode());
        result = prime * result + ((getChangepassword() == null) ? 0 : getChangepassword().hashCode());
        result = prime * result + ((getInspectionhumankey() == null) ? 0 : getInspectionhumankey().hashCode());
        return result;
    }
}