package com.test.erp.dao.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UsersExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public UsersExample() {
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

    protected abstract static class GeneratedCriteria implements Serializable {
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

        public Criteria andUserkeyIsNull() {
            addCriterion("userkey is null");
            return (Criteria) this;
        }

        public Criteria andUserkeyIsNotNull() {
            addCriterion("userkey is not null");
            return (Criteria) this;
        }

        public Criteria andUserkeyEqualTo(String value) {
            addCriterion("userkey =", value, "userkey");
            return (Criteria) this;
        }

        public Criteria andUserkeyNotEqualTo(String value) {
            addCriterion("userkey <>", value, "userkey");
            return (Criteria) this;
        }

        public Criteria andUserkeyGreaterThan(String value) {
            addCriterion("userkey >", value, "userkey");
            return (Criteria) this;
        }

        public Criteria andUserkeyGreaterThanOrEqualTo(String value) {
            addCriterion("userkey >=", value, "userkey");
            return (Criteria) this;
        }

        public Criteria andUserkeyLessThan(String value) {
            addCriterion("userkey <", value, "userkey");
            return (Criteria) this;
        }

        public Criteria andUserkeyLessThanOrEqualTo(String value) {
            addCriterion("userkey <=", value, "userkey");
            return (Criteria) this;
        }

        public Criteria andUserkeyLike(String value) {
            addCriterion("userkey like", value, "userkey");
            return (Criteria) this;
        }

        public Criteria andUserkeyNotLike(String value) {
            addCriterion("userkey not like", value, "userkey");
            return (Criteria) this;
        }

        public Criteria andUserkeyIn(List<String> values) {
            addCriterion("userkey in", values, "userkey");
            return (Criteria) this;
        }

        public Criteria andUserkeyNotIn(List<String> values) {
            addCriterion("userkey not in", values, "userkey");
            return (Criteria) this;
        }

        public Criteria andUserkeyBetween(String value1, String value2) {
            addCriterion("userkey between", value1, value2, "userkey");
            return (Criteria) this;
        }

        public Criteria andUserkeyNotBetween(String value1, String value2) {
            addCriterion("userkey not between", value1, value2, "userkey");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
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

        public Criteria andUsergroupidIsNull() {
            addCriterion("usergroupid is null");
            return (Criteria) this;
        }

        public Criteria andUsergroupidIsNotNull() {
            addCriterion("usergroupid is not null");
            return (Criteria) this;
        }

        public Criteria andUsergroupidEqualTo(Integer value) {
            addCriterion("usergroupid =", value, "usergroupid");
            return (Criteria) this;
        }

        public Criteria andUsergroupidNotEqualTo(Integer value) {
            addCriterion("usergroupid <>", value, "usergroupid");
            return (Criteria) this;
        }

        public Criteria andUsergroupidGreaterThan(Integer value) {
            addCriterion("usergroupid >", value, "usergroupid");
            return (Criteria) this;
        }

        public Criteria andUsergroupidGreaterThanOrEqualTo(Integer value) {
            addCriterion("usergroupid >=", value, "usergroupid");
            return (Criteria) this;
        }

        public Criteria andUsergroupidLessThan(Integer value) {
            addCriterion("usergroupid <", value, "usergroupid");
            return (Criteria) this;
        }

        public Criteria andUsergroupidLessThanOrEqualTo(Integer value) {
            addCriterion("usergroupid <=", value, "usergroupid");
            return (Criteria) this;
        }

        public Criteria andUsergroupidIn(List<Integer> values) {
            addCriterion("usergroupid in", values, "usergroupid");
            return (Criteria) this;
        }

        public Criteria andUsergroupidNotIn(List<Integer> values) {
            addCriterion("usergroupid not in", values, "usergroupid");
            return (Criteria) this;
        }

        public Criteria andUsergroupidBetween(Integer value1, Integer value2) {
            addCriterion("usergroupid between", value1, value2, "usergroupid");
            return (Criteria) this;
        }

        public Criteria andUsergroupidNotBetween(Integer value1, Integer value2) {
            addCriterion("usergroupid not between", value1, value2, "usergroupid");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNull() {
            addCriterion("telephone is null");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNotNull() {
            addCriterion("telephone is not null");
            return (Criteria) this;
        }

        public Criteria andTelephoneEqualTo(String value) {
            addCriterion("telephone =", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotEqualTo(String value) {
            addCriterion("telephone <>", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThan(String value) {
            addCriterion("telephone >", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("telephone >=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThan(String value) {
            addCriterion("telephone <", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThanOrEqualTo(String value) {
            addCriterion("telephone <=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLike(String value) {
            addCriterion("telephone like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotLike(String value) {
            addCriterion("telephone not like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneIn(List<String> values) {
            addCriterion("telephone in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotIn(List<String> values) {
            addCriterion("telephone not in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneBetween(String value1, String value2) {
            addCriterion("telephone between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotBetween(String value1, String value2) {
            addCriterion("telephone not between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andStartdateIsNull() {
            addCriterion("startdate is null");
            return (Criteria) this;
        }

        public Criteria andStartdateIsNotNull() {
            addCriterion("startdate is not null");
            return (Criteria) this;
        }

        public Criteria andStartdateEqualTo(Date value) {
            addCriterion("startdate =", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotEqualTo(Date value) {
            addCriterion("startdate <>", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateGreaterThan(Date value) {
            addCriterion("startdate >", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateGreaterThanOrEqualTo(Date value) {
            addCriterion("startdate >=", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateLessThan(Date value) {
            addCriterion("startdate <", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateLessThanOrEqualTo(Date value) {
            addCriterion("startdate <=", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateIn(List<Date> values) {
            addCriterion("startdate in", values, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotIn(List<Date> values) {
            addCriterion("startdate not in", values, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateBetween(Date value1, Date value2) {
            addCriterion("startdate between", value1, value2, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotBetween(Date value1, Date value2) {
            addCriterion("startdate not between", value1, value2, "startdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNull() {
            addCriterion("createdate is null");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNotNull() {
            addCriterion("createdate is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedateEqualTo(Date value) {
            addCriterion("createdate =", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotEqualTo(Date value) {
            addCriterion("createdate <>", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThan(Date value) {
            addCriterion("createdate >", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThanOrEqualTo(Date value) {
            addCriterion("createdate >=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThan(Date value) {
            addCriterion("createdate <", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThanOrEqualTo(Date value) {
            addCriterion("createdate <=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateIn(List<Date> values) {
            addCriterion("createdate in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotIn(List<Date> values) {
            addCriterion("createdate not in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateBetween(Date value1, Date value2) {
            addCriterion("createdate between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotBetween(Date value1, Date value2) {
            addCriterion("createdate not between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreateuseridIsNull() {
            addCriterion("createuserid is null");
            return (Criteria) this;
        }

        public Criteria andCreateuseridIsNotNull() {
            addCriterion("createuserid is not null");
            return (Criteria) this;
        }

        public Criteria andCreateuseridEqualTo(Integer value) {
            addCriterion("createuserid =", value, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridNotEqualTo(Integer value) {
            addCriterion("createuserid <>", value, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridGreaterThan(Integer value) {
            addCriterion("createuserid >", value, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("createuserid >=", value, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridLessThan(Integer value) {
            addCriterion("createuserid <", value, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridLessThanOrEqualTo(Integer value) {
            addCriterion("createuserid <=", value, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridIn(List<Integer> values) {
            addCriterion("createuserid in", values, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridNotIn(List<Integer> values) {
            addCriterion("createuserid not in", values, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridBetween(Integer value1, Integer value2) {
            addCriterion("createuserid between", value1, value2, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridNotBetween(Integer value1, Integer value2) {
            addCriterion("createuserid not between", value1, value2, "createuserid");
            return (Criteria) this;
        }

        public Criteria andModificationdateIsNull() {
            addCriterion("modificationdate is null");
            return (Criteria) this;
        }

        public Criteria andModificationdateIsNotNull() {
            addCriterion("modificationdate is not null");
            return (Criteria) this;
        }

        public Criteria andModificationdateEqualTo(Date value) {
            addCriterion("modificationdate =", value, "modificationdate");
            return (Criteria) this;
        }

        public Criteria andModificationdateNotEqualTo(Date value) {
            addCriterion("modificationdate <>", value, "modificationdate");
            return (Criteria) this;
        }

        public Criteria andModificationdateGreaterThan(Date value) {
            addCriterion("modificationdate >", value, "modificationdate");
            return (Criteria) this;
        }

        public Criteria andModificationdateGreaterThanOrEqualTo(Date value) {
            addCriterion("modificationdate >=", value, "modificationdate");
            return (Criteria) this;
        }

        public Criteria andModificationdateLessThan(Date value) {
            addCriterion("modificationdate <", value, "modificationdate");
            return (Criteria) this;
        }

        public Criteria andModificationdateLessThanOrEqualTo(Date value) {
            addCriterion("modificationdate <=", value, "modificationdate");
            return (Criteria) this;
        }

        public Criteria andModificationdateIn(List<Date> values) {
            addCriterion("modificationdate in", values, "modificationdate");
            return (Criteria) this;
        }

        public Criteria andModificationdateNotIn(List<Date> values) {
            addCriterion("modificationdate not in", values, "modificationdate");
            return (Criteria) this;
        }

        public Criteria andModificationdateBetween(Date value1, Date value2) {
            addCriterion("modificationdate between", value1, value2, "modificationdate");
            return (Criteria) this;
        }

        public Criteria andModificationdateNotBetween(Date value1, Date value2) {
            addCriterion("modificationdate not between", value1, value2, "modificationdate");
            return (Criteria) this;
        }

        public Criteria andModificationuseridIsNull() {
            addCriterion("modificationuserid is null");
            return (Criteria) this;
        }

        public Criteria andModificationuseridIsNotNull() {
            addCriterion("modificationuserid is not null");
            return (Criteria) this;
        }

        public Criteria andModificationuseridEqualTo(Integer value) {
            addCriterion("modificationuserid =", value, "modificationuserid");
            return (Criteria) this;
        }

        public Criteria andModificationuseridNotEqualTo(Integer value) {
            addCriterion("modificationuserid <>", value, "modificationuserid");
            return (Criteria) this;
        }

        public Criteria andModificationuseridGreaterThan(Integer value) {
            addCriterion("modificationuserid >", value, "modificationuserid");
            return (Criteria) this;
        }

        public Criteria andModificationuseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("modificationuserid >=", value, "modificationuserid");
            return (Criteria) this;
        }

        public Criteria andModificationuseridLessThan(Integer value) {
            addCriterion("modificationuserid <", value, "modificationuserid");
            return (Criteria) this;
        }

        public Criteria andModificationuseridLessThanOrEqualTo(Integer value) {
            addCriterion("modificationuserid <=", value, "modificationuserid");
            return (Criteria) this;
        }

        public Criteria andModificationuseridIn(List<Integer> values) {
            addCriterion("modificationuserid in", values, "modificationuserid");
            return (Criteria) this;
        }

        public Criteria andModificationuseridNotIn(List<Integer> values) {
            addCriterion("modificationuserid not in", values, "modificationuserid");
            return (Criteria) this;
        }

        public Criteria andModificationuseridBetween(Integer value1, Integer value2) {
            addCriterion("modificationuserid between", value1, value2, "modificationuserid");
            return (Criteria) this;
        }

        public Criteria andModificationuseridNotBetween(Integer value1, Integer value2) {
            addCriterion("modificationuserid not between", value1, value2, "modificationuserid");
            return (Criteria) this;
        }

        public Criteria andMemoIsNull() {
            addCriterion("memo is null");
            return (Criteria) this;
        }

        public Criteria andMemoIsNotNull() {
            addCriterion("memo is not null");
            return (Criteria) this;
        }

        public Criteria andMemoEqualTo(String value) {
            addCriterion("memo =", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotEqualTo(String value) {
            addCriterion("memo <>", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThan(String value) {
            addCriterion("memo >", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThanOrEqualTo(String value) {
            addCriterion("memo >=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThan(String value) {
            addCriterion("memo <", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThanOrEqualTo(String value) {
            addCriterion("memo <=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLike(String value) {
            addCriterion("memo like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotLike(String value) {
            addCriterion("memo not like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoIn(List<String> values) {
            addCriterion("memo in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotIn(List<String> values) {
            addCriterion("memo not in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoBetween(String value1, String value2) {
            addCriterion("memo between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotBetween(String value1, String value2) {
            addCriterion("memo not between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andPicpathIsNull() {
            addCriterion("picpath is null");
            return (Criteria) this;
        }

        public Criteria andPicpathIsNotNull() {
            addCriterion("picpath is not null");
            return (Criteria) this;
        }

        public Criteria andPicpathEqualTo(String value) {
            addCriterion("picpath =", value, "picpath");
            return (Criteria) this;
        }

        public Criteria andPicpathNotEqualTo(String value) {
            addCriterion("picpath <>", value, "picpath");
            return (Criteria) this;
        }

        public Criteria andPicpathGreaterThan(String value) {
            addCriterion("picpath >", value, "picpath");
            return (Criteria) this;
        }

        public Criteria andPicpathGreaterThanOrEqualTo(String value) {
            addCriterion("picpath >=", value, "picpath");
            return (Criteria) this;
        }

        public Criteria andPicpathLessThan(String value) {
            addCriterion("picpath <", value, "picpath");
            return (Criteria) this;
        }

        public Criteria andPicpathLessThanOrEqualTo(String value) {
            addCriterion("picpath <=", value, "picpath");
            return (Criteria) this;
        }

        public Criteria andPicpathLike(String value) {
            addCriterion("picpath like", value, "picpath");
            return (Criteria) this;
        }

        public Criteria andPicpathNotLike(String value) {
            addCriterion("picpath not like", value, "picpath");
            return (Criteria) this;
        }

        public Criteria andPicpathIn(List<String> values) {
            addCriterion("picpath in", values, "picpath");
            return (Criteria) this;
        }

        public Criteria andPicpathNotIn(List<String> values) {
            addCriterion("picpath not in", values, "picpath");
            return (Criteria) this;
        }

        public Criteria andPicpathBetween(String value1, String value2) {
            addCriterion("picpath between", value1, value2, "picpath");
            return (Criteria) this;
        }

        public Criteria andPicpathNotBetween(String value1, String value2) {
            addCriterion("picpath not between", value1, value2, "picpath");
            return (Criteria) this;
        }

        public Criteria andBarcodeIsNull() {
            addCriterion("barcode is null");
            return (Criteria) this;
        }

        public Criteria andBarcodeIsNotNull() {
            addCriterion("barcode is not null");
            return (Criteria) this;
        }

        public Criteria andBarcodeEqualTo(String value) {
            addCriterion("barcode =", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeNotEqualTo(String value) {
            addCriterion("barcode <>", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeGreaterThan(String value) {
            addCriterion("barcode >", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeGreaterThanOrEqualTo(String value) {
            addCriterion("barcode >=", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeLessThan(String value) {
            addCriterion("barcode <", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeLessThanOrEqualTo(String value) {
            addCriterion("barcode <=", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeLike(String value) {
            addCriterion("barcode like", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeNotLike(String value) {
            addCriterion("barcode not like", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeIn(List<String> values) {
            addCriterion("barcode in", values, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeNotIn(List<String> values) {
            addCriterion("barcode not in", values, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeBetween(String value1, String value2) {
            addCriterion("barcode between", value1, value2, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeNotBetween(String value1, String value2) {
            addCriterion("barcode not between", value1, value2, "barcode");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andEnddateIsNull() {
            addCriterion("enddate is null");
            return (Criteria) this;
        }

        public Criteria andEnddateIsNotNull() {
            addCriterion("enddate is not null");
            return (Criteria) this;
        }

        public Criteria andEnddateEqualTo(Date value) {
            addCriterion("enddate =", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotEqualTo(Date value) {
            addCriterion("enddate <>", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateGreaterThan(Date value) {
            addCriterion("enddate >", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateGreaterThanOrEqualTo(Date value) {
            addCriterion("enddate >=", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLessThan(Date value) {
            addCriterion("enddate <", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLessThanOrEqualTo(Date value) {
            addCriterion("enddate <=", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateIn(List<Date> values) {
            addCriterion("enddate in", values, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotIn(List<Date> values) {
            addCriterion("enddate not in", values, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateBetween(Date value1, Date value2) {
            addCriterion("enddate between", value1, value2, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotBetween(Date value1, Date value2) {
            addCriterion("enddate not between", value1, value2, "enddate");
            return (Criteria) this;
        }

        public Criteria andMobilephoneIsNull() {
            addCriterion("mobilephone is null");
            return (Criteria) this;
        }

        public Criteria andMobilephoneIsNotNull() {
            addCriterion("mobilephone is not null");
            return (Criteria) this;
        }

        public Criteria andMobilephoneEqualTo(String value) {
            addCriterion("mobilephone =", value, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneNotEqualTo(String value) {
            addCriterion("mobilephone <>", value, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneGreaterThan(String value) {
            addCriterion("mobilephone >", value, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneGreaterThanOrEqualTo(String value) {
            addCriterion("mobilephone >=", value, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneLessThan(String value) {
            addCriterion("mobilephone <", value, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneLessThanOrEqualTo(String value) {
            addCriterion("mobilephone <=", value, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneLike(String value) {
            addCriterion("mobilephone like", value, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneNotLike(String value) {
            addCriterion("mobilephone not like", value, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneIn(List<String> values) {
            addCriterion("mobilephone in", values, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneNotIn(List<String> values) {
            addCriterion("mobilephone not in", values, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneBetween(String value1, String value2) {
            addCriterion("mobilephone between", value1, value2, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneNotBetween(String value1, String value2) {
            addCriterion("mobilephone not between", value1, value2, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andHumanidIsNull() {
            addCriterion("humanid is null");
            return (Criteria) this;
        }

        public Criteria andHumanidIsNotNull() {
            addCriterion("humanid is not null");
            return (Criteria) this;
        }

        public Criteria andHumanidEqualTo(Integer value) {
            addCriterion("humanid =", value, "humanid");
            return (Criteria) this;
        }

        public Criteria andHumanidNotEqualTo(Integer value) {
            addCriterion("humanid <>", value, "humanid");
            return (Criteria) this;
        }

        public Criteria andHumanidGreaterThan(Integer value) {
            addCriterion("humanid >", value, "humanid");
            return (Criteria) this;
        }

        public Criteria andHumanidGreaterThanOrEqualTo(Integer value) {
            addCriterion("humanid >=", value, "humanid");
            return (Criteria) this;
        }

        public Criteria andHumanidLessThan(Integer value) {
            addCriterion("humanid <", value, "humanid");
            return (Criteria) this;
        }

        public Criteria andHumanidLessThanOrEqualTo(Integer value) {
            addCriterion("humanid <=", value, "humanid");
            return (Criteria) this;
        }

        public Criteria andHumanidIn(List<Integer> values) {
            addCriterion("humanid in", values, "humanid");
            return (Criteria) this;
        }

        public Criteria andHumanidNotIn(List<Integer> values) {
            addCriterion("humanid not in", values, "humanid");
            return (Criteria) this;
        }

        public Criteria andHumanidBetween(Integer value1, Integer value2) {
            addCriterion("humanid between", value1, value2, "humanid");
            return (Criteria) this;
        }

        public Criteria andHumanidNotBetween(Integer value1, Integer value2) {
            addCriterion("humanid not between", value1, value2, "humanid");
            return (Criteria) this;
        }

        public Criteria andOrgidIsNull() {
            addCriterion("orgid is null");
            return (Criteria) this;
        }

        public Criteria andOrgidIsNotNull() {
            addCriterion("orgid is not null");
            return (Criteria) this;
        }

        public Criteria andOrgidEqualTo(Integer value) {
            addCriterion("orgid =", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidNotEqualTo(Integer value) {
            addCriterion("orgid <>", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidGreaterThan(Integer value) {
            addCriterion("orgid >", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidGreaterThanOrEqualTo(Integer value) {
            addCriterion("orgid >=", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidLessThan(Integer value) {
            addCriterion("orgid <", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidLessThanOrEqualTo(Integer value) {
            addCriterion("orgid <=", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidIn(List<Integer> values) {
            addCriterion("orgid in", values, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidNotIn(List<Integer> values) {
            addCriterion("orgid not in", values, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidBetween(Integer value1, Integer value2) {
            addCriterion("orgid between", value1, value2, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidNotBetween(Integer value1, Integer value2) {
            addCriterion("orgid not between", value1, value2, "orgid");
            return (Criteria) this;
        }

        public Criteria andIsmultiIsNull() {
            addCriterion("ismulti is null");
            return (Criteria) this;
        }

        public Criteria andIsmultiIsNotNull() {
            addCriterion("ismulti is not null");
            return (Criteria) this;
        }

        public Criteria andIsmultiEqualTo(Integer value) {
            addCriterion("ismulti =", value, "ismulti");
            return (Criteria) this;
        }

        public Criteria andIsmultiNotEqualTo(Integer value) {
            addCriterion("ismulti <>", value, "ismulti");
            return (Criteria) this;
        }

        public Criteria andIsmultiGreaterThan(Integer value) {
            addCriterion("ismulti >", value, "ismulti");
            return (Criteria) this;
        }

        public Criteria andIsmultiGreaterThanOrEqualTo(Integer value) {
            addCriterion("ismulti >=", value, "ismulti");
            return (Criteria) this;
        }

        public Criteria andIsmultiLessThan(Integer value) {
            addCriterion("ismulti <", value, "ismulti");
            return (Criteria) this;
        }

        public Criteria andIsmultiLessThanOrEqualTo(Integer value) {
            addCriterion("ismulti <=", value, "ismulti");
            return (Criteria) this;
        }

        public Criteria andIsmultiIn(List<Integer> values) {
            addCriterion("ismulti in", values, "ismulti");
            return (Criteria) this;
        }

        public Criteria andIsmultiNotIn(List<Integer> values) {
            addCriterion("ismulti not in", values, "ismulti");
            return (Criteria) this;
        }

        public Criteria andIsmultiBetween(Integer value1, Integer value2) {
            addCriterion("ismulti between", value1, value2, "ismulti");
            return (Criteria) this;
        }

        public Criteria andIsmultiNotBetween(Integer value1, Integer value2) {
            addCriterion("ismulti not between", value1, value2, "ismulti");
            return (Criteria) this;
        }

        public Criteria andTombstoneIsNull() {
            addCriterion("tombstone is null");
            return (Criteria) this;
        }

        public Criteria andTombstoneIsNotNull() {
            addCriterion("tombstone is not null");
            return (Criteria) this;
        }

        public Criteria andTombstoneEqualTo(Integer value) {
            addCriterion("tombstone =", value, "tombstone");
            return (Criteria) this;
        }

        public Criteria andTombstoneNotEqualTo(Integer value) {
            addCriterion("tombstone <>", value, "tombstone");
            return (Criteria) this;
        }

        public Criteria andTombstoneGreaterThan(Integer value) {
            addCriterion("tombstone >", value, "tombstone");
            return (Criteria) this;
        }

        public Criteria andTombstoneGreaterThanOrEqualTo(Integer value) {
            addCriterion("tombstone >=", value, "tombstone");
            return (Criteria) this;
        }

        public Criteria andTombstoneLessThan(Integer value) {
            addCriterion("tombstone <", value, "tombstone");
            return (Criteria) this;
        }

        public Criteria andTombstoneLessThanOrEqualTo(Integer value) {
            addCriterion("tombstone <=", value, "tombstone");
            return (Criteria) this;
        }

        public Criteria andTombstoneIn(List<Integer> values) {
            addCriterion("tombstone in", values, "tombstone");
            return (Criteria) this;
        }

        public Criteria andTombstoneNotIn(List<Integer> values) {
            addCriterion("tombstone not in", values, "tombstone");
            return (Criteria) this;
        }

        public Criteria andTombstoneBetween(Integer value1, Integer value2) {
            addCriterion("tombstone between", value1, value2, "tombstone");
            return (Criteria) this;
        }

        public Criteria andTombstoneNotBetween(Integer value1, Integer value2) {
            addCriterion("tombstone not between", value1, value2, "tombstone");
            return (Criteria) this;
        }

        public Criteria andLogintypeIsNull() {
            addCriterion("logintype is null");
            return (Criteria) this;
        }

        public Criteria andLogintypeIsNotNull() {
            addCriterion("logintype is not null");
            return (Criteria) this;
        }

        public Criteria andLogintypeEqualTo(Integer value) {
            addCriterion("logintype =", value, "logintype");
            return (Criteria) this;
        }

        public Criteria andLogintypeNotEqualTo(Integer value) {
            addCriterion("logintype <>", value, "logintype");
            return (Criteria) this;
        }

        public Criteria andLogintypeGreaterThan(Integer value) {
            addCriterion("logintype >", value, "logintype");
            return (Criteria) this;
        }

        public Criteria andLogintypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("logintype >=", value, "logintype");
            return (Criteria) this;
        }

        public Criteria andLogintypeLessThan(Integer value) {
            addCriterion("logintype <", value, "logintype");
            return (Criteria) this;
        }

        public Criteria andLogintypeLessThanOrEqualTo(Integer value) {
            addCriterion("logintype <=", value, "logintype");
            return (Criteria) this;
        }

        public Criteria andLogintypeIn(List<Integer> values) {
            addCriterion("logintype in", values, "logintype");
            return (Criteria) this;
        }

        public Criteria andLogintypeNotIn(List<Integer> values) {
            addCriterion("logintype not in", values, "logintype");
            return (Criteria) this;
        }

        public Criteria andLogintypeBetween(Integer value1, Integer value2) {
            addCriterion("logintype between", value1, value2, "logintype");
            return (Criteria) this;
        }

        public Criteria andLogintypeNotBetween(Integer value1, Integer value2) {
            addCriterion("logintype not between", value1, value2, "logintype");
            return (Criteria) this;
        }

        public Criteria andExtravarchar1IsNull() {
            addCriterion("extravarchar1 is null");
            return (Criteria) this;
        }

        public Criteria andExtravarchar1IsNotNull() {
            addCriterion("extravarchar1 is not null");
            return (Criteria) this;
        }

        public Criteria andExtravarchar1EqualTo(String value) {
            addCriterion("extravarchar1 =", value, "extravarchar1");
            return (Criteria) this;
        }

        public Criteria andExtravarchar1NotEqualTo(String value) {
            addCriterion("extravarchar1 <>", value, "extravarchar1");
            return (Criteria) this;
        }

        public Criteria andExtravarchar1GreaterThan(String value) {
            addCriterion("extravarchar1 >", value, "extravarchar1");
            return (Criteria) this;
        }

        public Criteria andExtravarchar1GreaterThanOrEqualTo(String value) {
            addCriterion("extravarchar1 >=", value, "extravarchar1");
            return (Criteria) this;
        }

        public Criteria andExtravarchar1LessThan(String value) {
            addCriterion("extravarchar1 <", value, "extravarchar1");
            return (Criteria) this;
        }

        public Criteria andExtravarchar1LessThanOrEqualTo(String value) {
            addCriterion("extravarchar1 <=", value, "extravarchar1");
            return (Criteria) this;
        }

        public Criteria andExtravarchar1Like(String value) {
            addCriterion("extravarchar1 like", value, "extravarchar1");
            return (Criteria) this;
        }

        public Criteria andExtravarchar1NotLike(String value) {
            addCriterion("extravarchar1 not like", value, "extravarchar1");
            return (Criteria) this;
        }

        public Criteria andExtravarchar1In(List<String> values) {
            addCriterion("extravarchar1 in", values, "extravarchar1");
            return (Criteria) this;
        }

        public Criteria andExtravarchar1NotIn(List<String> values) {
            addCriterion("extravarchar1 not in", values, "extravarchar1");
            return (Criteria) this;
        }

        public Criteria andExtravarchar1Between(String value1, String value2) {
            addCriterion("extravarchar1 between", value1, value2, "extravarchar1");
            return (Criteria) this;
        }

        public Criteria andExtravarchar1NotBetween(String value1, String value2) {
            addCriterion("extravarchar1 not between", value1, value2, "extravarchar1");
            return (Criteria) this;
        }

        public Criteria andExtravarchar2IsNull() {
            addCriterion("extravarchar2 is null");
            return (Criteria) this;
        }

        public Criteria andExtravarchar2IsNotNull() {
            addCriterion("extravarchar2 is not null");
            return (Criteria) this;
        }

        public Criteria andExtravarchar2EqualTo(String value) {
            addCriterion("extravarchar2 =", value, "extravarchar2");
            return (Criteria) this;
        }

        public Criteria andExtravarchar2NotEqualTo(String value) {
            addCriterion("extravarchar2 <>", value, "extravarchar2");
            return (Criteria) this;
        }

        public Criteria andExtravarchar2GreaterThan(String value) {
            addCriterion("extravarchar2 >", value, "extravarchar2");
            return (Criteria) this;
        }

        public Criteria andExtravarchar2GreaterThanOrEqualTo(String value) {
            addCriterion("extravarchar2 >=", value, "extravarchar2");
            return (Criteria) this;
        }

        public Criteria andExtravarchar2LessThan(String value) {
            addCriterion("extravarchar2 <", value, "extravarchar2");
            return (Criteria) this;
        }

        public Criteria andExtravarchar2LessThanOrEqualTo(String value) {
            addCriterion("extravarchar2 <=", value, "extravarchar2");
            return (Criteria) this;
        }

        public Criteria andExtravarchar2Like(String value) {
            addCriterion("extravarchar2 like", value, "extravarchar2");
            return (Criteria) this;
        }

        public Criteria andExtravarchar2NotLike(String value) {
            addCriterion("extravarchar2 not like", value, "extravarchar2");
            return (Criteria) this;
        }

        public Criteria andExtravarchar2In(List<String> values) {
            addCriterion("extravarchar2 in", values, "extravarchar2");
            return (Criteria) this;
        }

        public Criteria andExtravarchar2NotIn(List<String> values) {
            addCriterion("extravarchar2 not in", values, "extravarchar2");
            return (Criteria) this;
        }

        public Criteria andExtravarchar2Between(String value1, String value2) {
            addCriterion("extravarchar2 between", value1, value2, "extravarchar2");
            return (Criteria) this;
        }

        public Criteria andExtravarchar2NotBetween(String value1, String value2) {
            addCriterion("extravarchar2 not between", value1, value2, "extravarchar2");
            return (Criteria) this;
        }

        public Criteria andExtravarchar3IsNull() {
            addCriterion("extravarchar3 is null");
            return (Criteria) this;
        }

        public Criteria andExtravarchar3IsNotNull() {
            addCriterion("extravarchar3 is not null");
            return (Criteria) this;
        }

        public Criteria andExtravarchar3EqualTo(String value) {
            addCriterion("extravarchar3 =", value, "extravarchar3");
            return (Criteria) this;
        }

        public Criteria andExtravarchar3NotEqualTo(String value) {
            addCriterion("extravarchar3 <>", value, "extravarchar3");
            return (Criteria) this;
        }

        public Criteria andExtravarchar3GreaterThan(String value) {
            addCriterion("extravarchar3 >", value, "extravarchar3");
            return (Criteria) this;
        }

        public Criteria andExtravarchar3GreaterThanOrEqualTo(String value) {
            addCriterion("extravarchar3 >=", value, "extravarchar3");
            return (Criteria) this;
        }

        public Criteria andExtravarchar3LessThan(String value) {
            addCriterion("extravarchar3 <", value, "extravarchar3");
            return (Criteria) this;
        }

        public Criteria andExtravarchar3LessThanOrEqualTo(String value) {
            addCriterion("extravarchar3 <=", value, "extravarchar3");
            return (Criteria) this;
        }

        public Criteria andExtravarchar3Like(String value) {
            addCriterion("extravarchar3 like", value, "extravarchar3");
            return (Criteria) this;
        }

        public Criteria andExtravarchar3NotLike(String value) {
            addCriterion("extravarchar3 not like", value, "extravarchar3");
            return (Criteria) this;
        }

        public Criteria andExtravarchar3In(List<String> values) {
            addCriterion("extravarchar3 in", values, "extravarchar3");
            return (Criteria) this;
        }

        public Criteria andExtravarchar3NotIn(List<String> values) {
            addCriterion("extravarchar3 not in", values, "extravarchar3");
            return (Criteria) this;
        }

        public Criteria andExtravarchar3Between(String value1, String value2) {
            addCriterion("extravarchar3 between", value1, value2, "extravarchar3");
            return (Criteria) this;
        }

        public Criteria andExtravarchar3NotBetween(String value1, String value2) {
            addCriterion("extravarchar3 not between", value1, value2, "extravarchar3");
            return (Criteria) this;
        }

        public Criteria andExtravarchar4IsNull() {
            addCriterion("extravarchar4 is null");
            return (Criteria) this;
        }

        public Criteria andExtravarchar4IsNotNull() {
            addCriterion("extravarchar4 is not null");
            return (Criteria) this;
        }

        public Criteria andExtravarchar4EqualTo(String value) {
            addCriterion("extravarchar4 =", value, "extravarchar4");
            return (Criteria) this;
        }

        public Criteria andExtravarchar4NotEqualTo(String value) {
            addCriterion("extravarchar4 <>", value, "extravarchar4");
            return (Criteria) this;
        }

        public Criteria andExtravarchar4GreaterThan(String value) {
            addCriterion("extravarchar4 >", value, "extravarchar4");
            return (Criteria) this;
        }

        public Criteria andExtravarchar4GreaterThanOrEqualTo(String value) {
            addCriterion("extravarchar4 >=", value, "extravarchar4");
            return (Criteria) this;
        }

        public Criteria andExtravarchar4LessThan(String value) {
            addCriterion("extravarchar4 <", value, "extravarchar4");
            return (Criteria) this;
        }

        public Criteria andExtravarchar4LessThanOrEqualTo(String value) {
            addCriterion("extravarchar4 <=", value, "extravarchar4");
            return (Criteria) this;
        }

        public Criteria andExtravarchar4Like(String value) {
            addCriterion("extravarchar4 like", value, "extravarchar4");
            return (Criteria) this;
        }

        public Criteria andExtravarchar4NotLike(String value) {
            addCriterion("extravarchar4 not like", value, "extravarchar4");
            return (Criteria) this;
        }

        public Criteria andExtravarchar4In(List<String> values) {
            addCriterion("extravarchar4 in", values, "extravarchar4");
            return (Criteria) this;
        }

        public Criteria andExtravarchar4NotIn(List<String> values) {
            addCriterion("extravarchar4 not in", values, "extravarchar4");
            return (Criteria) this;
        }

        public Criteria andExtravarchar4Between(String value1, String value2) {
            addCriterion("extravarchar4 between", value1, value2, "extravarchar4");
            return (Criteria) this;
        }

        public Criteria andExtravarchar4NotBetween(String value1, String value2) {
            addCriterion("extravarchar4 not between", value1, value2, "extravarchar4");
            return (Criteria) this;
        }

        public Criteria andExtravarchar5IsNull() {
            addCriterion("extravarchar5 is null");
            return (Criteria) this;
        }

        public Criteria andExtravarchar5IsNotNull() {
            addCriterion("extravarchar5 is not null");
            return (Criteria) this;
        }

        public Criteria andExtravarchar5EqualTo(String value) {
            addCriterion("extravarchar5 =", value, "extravarchar5");
            return (Criteria) this;
        }

        public Criteria andExtravarchar5NotEqualTo(String value) {
            addCriterion("extravarchar5 <>", value, "extravarchar5");
            return (Criteria) this;
        }

        public Criteria andExtravarchar5GreaterThan(String value) {
            addCriterion("extravarchar5 >", value, "extravarchar5");
            return (Criteria) this;
        }

        public Criteria andExtravarchar5GreaterThanOrEqualTo(String value) {
            addCriterion("extravarchar5 >=", value, "extravarchar5");
            return (Criteria) this;
        }

        public Criteria andExtravarchar5LessThan(String value) {
            addCriterion("extravarchar5 <", value, "extravarchar5");
            return (Criteria) this;
        }

        public Criteria andExtravarchar5LessThanOrEqualTo(String value) {
            addCriterion("extravarchar5 <=", value, "extravarchar5");
            return (Criteria) this;
        }

        public Criteria andExtravarchar5Like(String value) {
            addCriterion("extravarchar5 like", value, "extravarchar5");
            return (Criteria) this;
        }

        public Criteria andExtravarchar5NotLike(String value) {
            addCriterion("extravarchar5 not like", value, "extravarchar5");
            return (Criteria) this;
        }

        public Criteria andExtravarchar5In(List<String> values) {
            addCriterion("extravarchar5 in", values, "extravarchar5");
            return (Criteria) this;
        }

        public Criteria andExtravarchar5NotIn(List<String> values) {
            addCriterion("extravarchar5 not in", values, "extravarchar5");
            return (Criteria) this;
        }

        public Criteria andExtravarchar5Between(String value1, String value2) {
            addCriterion("extravarchar5 between", value1, value2, "extravarchar5");
            return (Criteria) this;
        }

        public Criteria andExtravarchar5NotBetween(String value1, String value2) {
            addCriterion("extravarchar5 not between", value1, value2, "extravarchar5");
            return (Criteria) this;
        }

        public Criteria andExtravarchar6IsNull() {
            addCriterion("extravarchar6 is null");
            return (Criteria) this;
        }

        public Criteria andExtravarchar6IsNotNull() {
            addCriterion("extravarchar6 is not null");
            return (Criteria) this;
        }

        public Criteria andExtravarchar6EqualTo(String value) {
            addCriterion("extravarchar6 =", value, "extravarchar6");
            return (Criteria) this;
        }

        public Criteria andExtravarchar6NotEqualTo(String value) {
            addCriterion("extravarchar6 <>", value, "extravarchar6");
            return (Criteria) this;
        }

        public Criteria andExtravarchar6GreaterThan(String value) {
            addCriterion("extravarchar6 >", value, "extravarchar6");
            return (Criteria) this;
        }

        public Criteria andExtravarchar6GreaterThanOrEqualTo(String value) {
            addCriterion("extravarchar6 >=", value, "extravarchar6");
            return (Criteria) this;
        }

        public Criteria andExtravarchar6LessThan(String value) {
            addCriterion("extravarchar6 <", value, "extravarchar6");
            return (Criteria) this;
        }

        public Criteria andExtravarchar6LessThanOrEqualTo(String value) {
            addCriterion("extravarchar6 <=", value, "extravarchar6");
            return (Criteria) this;
        }

        public Criteria andExtravarchar6Like(String value) {
            addCriterion("extravarchar6 like", value, "extravarchar6");
            return (Criteria) this;
        }

        public Criteria andExtravarchar6NotLike(String value) {
            addCriterion("extravarchar6 not like", value, "extravarchar6");
            return (Criteria) this;
        }

        public Criteria andExtravarchar6In(List<String> values) {
            addCriterion("extravarchar6 in", values, "extravarchar6");
            return (Criteria) this;
        }

        public Criteria andExtravarchar6NotIn(List<String> values) {
            addCriterion("extravarchar6 not in", values, "extravarchar6");
            return (Criteria) this;
        }

        public Criteria andExtravarchar6Between(String value1, String value2) {
            addCriterion("extravarchar6 between", value1, value2, "extravarchar6");
            return (Criteria) this;
        }

        public Criteria andExtravarchar6NotBetween(String value1, String value2) {
            addCriterion("extravarchar6 not between", value1, value2, "extravarchar6");
            return (Criteria) this;
        }

        public Criteria andExtravarchar7IsNull() {
            addCriterion("extravarchar7 is null");
            return (Criteria) this;
        }

        public Criteria andExtravarchar7IsNotNull() {
            addCriterion("extravarchar7 is not null");
            return (Criteria) this;
        }

        public Criteria andExtravarchar7EqualTo(String value) {
            addCriterion("extravarchar7 =", value, "extravarchar7");
            return (Criteria) this;
        }

        public Criteria andExtravarchar7NotEqualTo(String value) {
            addCriterion("extravarchar7 <>", value, "extravarchar7");
            return (Criteria) this;
        }

        public Criteria andExtravarchar7GreaterThan(String value) {
            addCriterion("extravarchar7 >", value, "extravarchar7");
            return (Criteria) this;
        }

        public Criteria andExtravarchar7GreaterThanOrEqualTo(String value) {
            addCriterion("extravarchar7 >=", value, "extravarchar7");
            return (Criteria) this;
        }

        public Criteria andExtravarchar7LessThan(String value) {
            addCriterion("extravarchar7 <", value, "extravarchar7");
            return (Criteria) this;
        }

        public Criteria andExtravarchar7LessThanOrEqualTo(String value) {
            addCriterion("extravarchar7 <=", value, "extravarchar7");
            return (Criteria) this;
        }

        public Criteria andExtravarchar7Like(String value) {
            addCriterion("extravarchar7 like", value, "extravarchar7");
            return (Criteria) this;
        }

        public Criteria andExtravarchar7NotLike(String value) {
            addCriterion("extravarchar7 not like", value, "extravarchar7");
            return (Criteria) this;
        }

        public Criteria andExtravarchar7In(List<String> values) {
            addCriterion("extravarchar7 in", values, "extravarchar7");
            return (Criteria) this;
        }

        public Criteria andExtravarchar7NotIn(List<String> values) {
            addCriterion("extravarchar7 not in", values, "extravarchar7");
            return (Criteria) this;
        }

        public Criteria andExtravarchar7Between(String value1, String value2) {
            addCriterion("extravarchar7 between", value1, value2, "extravarchar7");
            return (Criteria) this;
        }

        public Criteria andExtravarchar7NotBetween(String value1, String value2) {
            addCriterion("extravarchar7 not between", value1, value2, "extravarchar7");
            return (Criteria) this;
        }

        public Criteria andExtravarchar8IsNull() {
            addCriterion("extravarchar8 is null");
            return (Criteria) this;
        }

        public Criteria andExtravarchar8IsNotNull() {
            addCriterion("extravarchar8 is not null");
            return (Criteria) this;
        }

        public Criteria andExtravarchar8EqualTo(String value) {
            addCriterion("extravarchar8 =", value, "extravarchar8");
            return (Criteria) this;
        }

        public Criteria andExtravarchar8NotEqualTo(String value) {
            addCriterion("extravarchar8 <>", value, "extravarchar8");
            return (Criteria) this;
        }

        public Criteria andExtravarchar8GreaterThan(String value) {
            addCriterion("extravarchar8 >", value, "extravarchar8");
            return (Criteria) this;
        }

        public Criteria andExtravarchar8GreaterThanOrEqualTo(String value) {
            addCriterion("extravarchar8 >=", value, "extravarchar8");
            return (Criteria) this;
        }

        public Criteria andExtravarchar8LessThan(String value) {
            addCriterion("extravarchar8 <", value, "extravarchar8");
            return (Criteria) this;
        }

        public Criteria andExtravarchar8LessThanOrEqualTo(String value) {
            addCriterion("extravarchar8 <=", value, "extravarchar8");
            return (Criteria) this;
        }

        public Criteria andExtravarchar8Like(String value) {
            addCriterion("extravarchar8 like", value, "extravarchar8");
            return (Criteria) this;
        }

        public Criteria andExtravarchar8NotLike(String value) {
            addCriterion("extravarchar8 not like", value, "extravarchar8");
            return (Criteria) this;
        }

        public Criteria andExtravarchar8In(List<String> values) {
            addCriterion("extravarchar8 in", values, "extravarchar8");
            return (Criteria) this;
        }

        public Criteria andExtravarchar8NotIn(List<String> values) {
            addCriterion("extravarchar8 not in", values, "extravarchar8");
            return (Criteria) this;
        }

        public Criteria andExtravarchar8Between(String value1, String value2) {
            addCriterion("extravarchar8 between", value1, value2, "extravarchar8");
            return (Criteria) this;
        }

        public Criteria andExtravarchar8NotBetween(String value1, String value2) {
            addCriterion("extravarchar8 not between", value1, value2, "extravarchar8");
            return (Criteria) this;
        }

        public Criteria andExtravarchar9IsNull() {
            addCriterion("extravarchar9 is null");
            return (Criteria) this;
        }

        public Criteria andExtravarchar9IsNotNull() {
            addCriterion("extravarchar9 is not null");
            return (Criteria) this;
        }

        public Criteria andExtravarchar9EqualTo(String value) {
            addCriterion("extravarchar9 =", value, "extravarchar9");
            return (Criteria) this;
        }

        public Criteria andExtravarchar9NotEqualTo(String value) {
            addCriterion("extravarchar9 <>", value, "extravarchar9");
            return (Criteria) this;
        }

        public Criteria andExtravarchar9GreaterThan(String value) {
            addCriterion("extravarchar9 >", value, "extravarchar9");
            return (Criteria) this;
        }

        public Criteria andExtravarchar9GreaterThanOrEqualTo(String value) {
            addCriterion("extravarchar9 >=", value, "extravarchar9");
            return (Criteria) this;
        }

        public Criteria andExtravarchar9LessThan(String value) {
            addCriterion("extravarchar9 <", value, "extravarchar9");
            return (Criteria) this;
        }

        public Criteria andExtravarchar9LessThanOrEqualTo(String value) {
            addCriterion("extravarchar9 <=", value, "extravarchar9");
            return (Criteria) this;
        }

        public Criteria andExtravarchar9Like(String value) {
            addCriterion("extravarchar9 like", value, "extravarchar9");
            return (Criteria) this;
        }

        public Criteria andExtravarchar9NotLike(String value) {
            addCriterion("extravarchar9 not like", value, "extravarchar9");
            return (Criteria) this;
        }

        public Criteria andExtravarchar9In(List<String> values) {
            addCriterion("extravarchar9 in", values, "extravarchar9");
            return (Criteria) this;
        }

        public Criteria andExtravarchar9NotIn(List<String> values) {
            addCriterion("extravarchar9 not in", values, "extravarchar9");
            return (Criteria) this;
        }

        public Criteria andExtravarchar9Between(String value1, String value2) {
            addCriterion("extravarchar9 between", value1, value2, "extravarchar9");
            return (Criteria) this;
        }

        public Criteria andExtravarchar9NotBetween(String value1, String value2) {
            addCriterion("extravarchar9 not between", value1, value2, "extravarchar9");
            return (Criteria) this;
        }

        public Criteria andExtravarchar10IsNull() {
            addCriterion("extravarchar10 is null");
            return (Criteria) this;
        }

        public Criteria andExtravarchar10IsNotNull() {
            addCriterion("extravarchar10 is not null");
            return (Criteria) this;
        }

        public Criteria andExtravarchar10EqualTo(String value) {
            addCriterion("extravarchar10 =", value, "extravarchar10");
            return (Criteria) this;
        }

        public Criteria andExtravarchar10NotEqualTo(String value) {
            addCriterion("extravarchar10 <>", value, "extravarchar10");
            return (Criteria) this;
        }

        public Criteria andExtravarchar10GreaterThan(String value) {
            addCriterion("extravarchar10 >", value, "extravarchar10");
            return (Criteria) this;
        }

        public Criteria andExtravarchar10GreaterThanOrEqualTo(String value) {
            addCriterion("extravarchar10 >=", value, "extravarchar10");
            return (Criteria) this;
        }

        public Criteria andExtravarchar10LessThan(String value) {
            addCriterion("extravarchar10 <", value, "extravarchar10");
            return (Criteria) this;
        }

        public Criteria andExtravarchar10LessThanOrEqualTo(String value) {
            addCriterion("extravarchar10 <=", value, "extravarchar10");
            return (Criteria) this;
        }

        public Criteria andExtravarchar10Like(String value) {
            addCriterion("extravarchar10 like", value, "extravarchar10");
            return (Criteria) this;
        }

        public Criteria andExtravarchar10NotLike(String value) {
            addCriterion("extravarchar10 not like", value, "extravarchar10");
            return (Criteria) this;
        }

        public Criteria andExtravarchar10In(List<String> values) {
            addCriterion("extravarchar10 in", values, "extravarchar10");
            return (Criteria) this;
        }

        public Criteria andExtravarchar10NotIn(List<String> values) {
            addCriterion("extravarchar10 not in", values, "extravarchar10");
            return (Criteria) this;
        }

        public Criteria andExtravarchar10Between(String value1, String value2) {
            addCriterion("extravarchar10 between", value1, value2, "extravarchar10");
            return (Criteria) this;
        }

        public Criteria andExtravarchar10NotBetween(String value1, String value2) {
            addCriterion("extravarchar10 not between", value1, value2, "extravarchar10");
            return (Criteria) this;
        }

        public Criteria andExtradecimal1IsNull() {
            addCriterion("extradecimal1 is null");
            return (Criteria) this;
        }

        public Criteria andExtradecimal1IsNotNull() {
            addCriterion("extradecimal1 is not null");
            return (Criteria) this;
        }

        public Criteria andExtradecimal1EqualTo(BigDecimal value) {
            addCriterion("extradecimal1 =", value, "extradecimal1");
            return (Criteria) this;
        }

        public Criteria andExtradecimal1NotEqualTo(BigDecimal value) {
            addCriterion("extradecimal1 <>", value, "extradecimal1");
            return (Criteria) this;
        }

        public Criteria andExtradecimal1GreaterThan(BigDecimal value) {
            addCriterion("extradecimal1 >", value, "extradecimal1");
            return (Criteria) this;
        }

        public Criteria andExtradecimal1GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("extradecimal1 >=", value, "extradecimal1");
            return (Criteria) this;
        }

        public Criteria andExtradecimal1LessThan(BigDecimal value) {
            addCriterion("extradecimal1 <", value, "extradecimal1");
            return (Criteria) this;
        }

        public Criteria andExtradecimal1LessThanOrEqualTo(BigDecimal value) {
            addCriterion("extradecimal1 <=", value, "extradecimal1");
            return (Criteria) this;
        }

        public Criteria andExtradecimal1In(List<BigDecimal> values) {
            addCriterion("extradecimal1 in", values, "extradecimal1");
            return (Criteria) this;
        }

        public Criteria andExtradecimal1NotIn(List<BigDecimal> values) {
            addCriterion("extradecimal1 not in", values, "extradecimal1");
            return (Criteria) this;
        }

        public Criteria andExtradecimal1Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("extradecimal1 between", value1, value2, "extradecimal1");
            return (Criteria) this;
        }

        public Criteria andExtradecimal1NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("extradecimal1 not between", value1, value2, "extradecimal1");
            return (Criteria) this;
        }

        public Criteria andExtradecimal2IsNull() {
            addCriterion("extradecimal2 is null");
            return (Criteria) this;
        }

        public Criteria andExtradecimal2IsNotNull() {
            addCriterion("extradecimal2 is not null");
            return (Criteria) this;
        }

        public Criteria andExtradecimal2EqualTo(BigDecimal value) {
            addCriterion("extradecimal2 =", value, "extradecimal2");
            return (Criteria) this;
        }

        public Criteria andExtradecimal2NotEqualTo(BigDecimal value) {
            addCriterion("extradecimal2 <>", value, "extradecimal2");
            return (Criteria) this;
        }

        public Criteria andExtradecimal2GreaterThan(BigDecimal value) {
            addCriterion("extradecimal2 >", value, "extradecimal2");
            return (Criteria) this;
        }

        public Criteria andExtradecimal2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("extradecimal2 >=", value, "extradecimal2");
            return (Criteria) this;
        }

        public Criteria andExtradecimal2LessThan(BigDecimal value) {
            addCriterion("extradecimal2 <", value, "extradecimal2");
            return (Criteria) this;
        }

        public Criteria andExtradecimal2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("extradecimal2 <=", value, "extradecimal2");
            return (Criteria) this;
        }

        public Criteria andExtradecimal2In(List<BigDecimal> values) {
            addCriterion("extradecimal2 in", values, "extradecimal2");
            return (Criteria) this;
        }

        public Criteria andExtradecimal2NotIn(List<BigDecimal> values) {
            addCriterion("extradecimal2 not in", values, "extradecimal2");
            return (Criteria) this;
        }

        public Criteria andExtradecimal2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("extradecimal2 between", value1, value2, "extradecimal2");
            return (Criteria) this;
        }

        public Criteria andExtradecimal2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("extradecimal2 not between", value1, value2, "extradecimal2");
            return (Criteria) this;
        }

        public Criteria andExtradecimal3IsNull() {
            addCriterion("extradecimal3 is null");
            return (Criteria) this;
        }

        public Criteria andExtradecimal3IsNotNull() {
            addCriterion("extradecimal3 is not null");
            return (Criteria) this;
        }

        public Criteria andExtradecimal3EqualTo(BigDecimal value) {
            addCriterion("extradecimal3 =", value, "extradecimal3");
            return (Criteria) this;
        }

        public Criteria andExtradecimal3NotEqualTo(BigDecimal value) {
            addCriterion("extradecimal3 <>", value, "extradecimal3");
            return (Criteria) this;
        }

        public Criteria andExtradecimal3GreaterThan(BigDecimal value) {
            addCriterion("extradecimal3 >", value, "extradecimal3");
            return (Criteria) this;
        }

        public Criteria andExtradecimal3GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("extradecimal3 >=", value, "extradecimal3");
            return (Criteria) this;
        }

        public Criteria andExtradecimal3LessThan(BigDecimal value) {
            addCriterion("extradecimal3 <", value, "extradecimal3");
            return (Criteria) this;
        }

        public Criteria andExtradecimal3LessThanOrEqualTo(BigDecimal value) {
            addCriterion("extradecimal3 <=", value, "extradecimal3");
            return (Criteria) this;
        }

        public Criteria andExtradecimal3In(List<BigDecimal> values) {
            addCriterion("extradecimal3 in", values, "extradecimal3");
            return (Criteria) this;
        }

        public Criteria andExtradecimal3NotIn(List<BigDecimal> values) {
            addCriterion("extradecimal3 not in", values, "extradecimal3");
            return (Criteria) this;
        }

        public Criteria andExtradecimal3Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("extradecimal3 between", value1, value2, "extradecimal3");
            return (Criteria) this;
        }

        public Criteria andExtradecimal3NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("extradecimal3 not between", value1, value2, "extradecimal3");
            return (Criteria) this;
        }

        public Criteria andExtradecimal4IsNull() {
            addCriterion("extradecimal4 is null");
            return (Criteria) this;
        }

        public Criteria andExtradecimal4IsNotNull() {
            addCriterion("extradecimal4 is not null");
            return (Criteria) this;
        }

        public Criteria andExtradecimal4EqualTo(BigDecimal value) {
            addCriterion("extradecimal4 =", value, "extradecimal4");
            return (Criteria) this;
        }

        public Criteria andExtradecimal4NotEqualTo(BigDecimal value) {
            addCriterion("extradecimal4 <>", value, "extradecimal4");
            return (Criteria) this;
        }

        public Criteria andExtradecimal4GreaterThan(BigDecimal value) {
            addCriterion("extradecimal4 >", value, "extradecimal4");
            return (Criteria) this;
        }

        public Criteria andExtradecimal4GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("extradecimal4 >=", value, "extradecimal4");
            return (Criteria) this;
        }

        public Criteria andExtradecimal4LessThan(BigDecimal value) {
            addCriterion("extradecimal4 <", value, "extradecimal4");
            return (Criteria) this;
        }

        public Criteria andExtradecimal4LessThanOrEqualTo(BigDecimal value) {
            addCriterion("extradecimal4 <=", value, "extradecimal4");
            return (Criteria) this;
        }

        public Criteria andExtradecimal4In(List<BigDecimal> values) {
            addCriterion("extradecimal4 in", values, "extradecimal4");
            return (Criteria) this;
        }

        public Criteria andExtradecimal4NotIn(List<BigDecimal> values) {
            addCriterion("extradecimal4 not in", values, "extradecimal4");
            return (Criteria) this;
        }

        public Criteria andExtradecimal4Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("extradecimal4 between", value1, value2, "extradecimal4");
            return (Criteria) this;
        }

        public Criteria andExtradecimal4NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("extradecimal4 not between", value1, value2, "extradecimal4");
            return (Criteria) this;
        }

        public Criteria andExtradecimal5IsNull() {
            addCriterion("extradecimal5 is null");
            return (Criteria) this;
        }

        public Criteria andExtradecimal5IsNotNull() {
            addCriterion("extradecimal5 is not null");
            return (Criteria) this;
        }

        public Criteria andExtradecimal5EqualTo(BigDecimal value) {
            addCriterion("extradecimal5 =", value, "extradecimal5");
            return (Criteria) this;
        }

        public Criteria andExtradecimal5NotEqualTo(BigDecimal value) {
            addCriterion("extradecimal5 <>", value, "extradecimal5");
            return (Criteria) this;
        }

        public Criteria andExtradecimal5GreaterThan(BigDecimal value) {
            addCriterion("extradecimal5 >", value, "extradecimal5");
            return (Criteria) this;
        }

        public Criteria andExtradecimal5GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("extradecimal5 >=", value, "extradecimal5");
            return (Criteria) this;
        }

        public Criteria andExtradecimal5LessThan(BigDecimal value) {
            addCriterion("extradecimal5 <", value, "extradecimal5");
            return (Criteria) this;
        }

        public Criteria andExtradecimal5LessThanOrEqualTo(BigDecimal value) {
            addCriterion("extradecimal5 <=", value, "extradecimal5");
            return (Criteria) this;
        }

        public Criteria andExtradecimal5In(List<BigDecimal> values) {
            addCriterion("extradecimal5 in", values, "extradecimal5");
            return (Criteria) this;
        }

        public Criteria andExtradecimal5NotIn(List<BigDecimal> values) {
            addCriterion("extradecimal5 not in", values, "extradecimal5");
            return (Criteria) this;
        }

        public Criteria andExtradecimal5Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("extradecimal5 between", value1, value2, "extradecimal5");
            return (Criteria) this;
        }

        public Criteria andExtradecimal5NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("extradecimal5 not between", value1, value2, "extradecimal5");
            return (Criteria) this;
        }

        public Criteria andExtraint1IsNull() {
            addCriterion("extraint1 is null");
            return (Criteria) this;
        }

        public Criteria andExtraint1IsNotNull() {
            addCriterion("extraint1 is not null");
            return (Criteria) this;
        }

        public Criteria andExtraint1EqualTo(Integer value) {
            addCriterion("extraint1 =", value, "extraint1");
            return (Criteria) this;
        }

        public Criteria andExtraint1NotEqualTo(Integer value) {
            addCriterion("extraint1 <>", value, "extraint1");
            return (Criteria) this;
        }

        public Criteria andExtraint1GreaterThan(Integer value) {
            addCriterion("extraint1 >", value, "extraint1");
            return (Criteria) this;
        }

        public Criteria andExtraint1GreaterThanOrEqualTo(Integer value) {
            addCriterion("extraint1 >=", value, "extraint1");
            return (Criteria) this;
        }

        public Criteria andExtraint1LessThan(Integer value) {
            addCriterion("extraint1 <", value, "extraint1");
            return (Criteria) this;
        }

        public Criteria andExtraint1LessThanOrEqualTo(Integer value) {
            addCriterion("extraint1 <=", value, "extraint1");
            return (Criteria) this;
        }

        public Criteria andExtraint1In(List<Integer> values) {
            addCriterion("extraint1 in", values, "extraint1");
            return (Criteria) this;
        }

        public Criteria andExtraint1NotIn(List<Integer> values) {
            addCriterion("extraint1 not in", values, "extraint1");
            return (Criteria) this;
        }

        public Criteria andExtraint1Between(Integer value1, Integer value2) {
            addCriterion("extraint1 between", value1, value2, "extraint1");
            return (Criteria) this;
        }

        public Criteria andExtraint1NotBetween(Integer value1, Integer value2) {
            addCriterion("extraint1 not between", value1, value2, "extraint1");
            return (Criteria) this;
        }

        public Criteria andExtraint2IsNull() {
            addCriterion("extraint2 is null");
            return (Criteria) this;
        }

        public Criteria andExtraint2IsNotNull() {
            addCriterion("extraint2 is not null");
            return (Criteria) this;
        }

        public Criteria andExtraint2EqualTo(Integer value) {
            addCriterion("extraint2 =", value, "extraint2");
            return (Criteria) this;
        }

        public Criteria andExtraint2NotEqualTo(Integer value) {
            addCriterion("extraint2 <>", value, "extraint2");
            return (Criteria) this;
        }

        public Criteria andExtraint2GreaterThan(Integer value) {
            addCriterion("extraint2 >", value, "extraint2");
            return (Criteria) this;
        }

        public Criteria andExtraint2GreaterThanOrEqualTo(Integer value) {
            addCriterion("extraint2 >=", value, "extraint2");
            return (Criteria) this;
        }

        public Criteria andExtraint2LessThan(Integer value) {
            addCriterion("extraint2 <", value, "extraint2");
            return (Criteria) this;
        }

        public Criteria andExtraint2LessThanOrEqualTo(Integer value) {
            addCriterion("extraint2 <=", value, "extraint2");
            return (Criteria) this;
        }

        public Criteria andExtraint2In(List<Integer> values) {
            addCriterion("extraint2 in", values, "extraint2");
            return (Criteria) this;
        }

        public Criteria andExtraint2NotIn(List<Integer> values) {
            addCriterion("extraint2 not in", values, "extraint2");
            return (Criteria) this;
        }

        public Criteria andExtraint2Between(Integer value1, Integer value2) {
            addCriterion("extraint2 between", value1, value2, "extraint2");
            return (Criteria) this;
        }

        public Criteria andExtraint2NotBetween(Integer value1, Integer value2) {
            addCriterion("extraint2 not between", value1, value2, "extraint2");
            return (Criteria) this;
        }

        public Criteria andExtraint3IsNull() {
            addCriterion("extraint3 is null");
            return (Criteria) this;
        }

        public Criteria andExtraint3IsNotNull() {
            addCriterion("extraint3 is not null");
            return (Criteria) this;
        }

        public Criteria andExtraint3EqualTo(Integer value) {
            addCriterion("extraint3 =", value, "extraint3");
            return (Criteria) this;
        }

        public Criteria andExtraint3NotEqualTo(Integer value) {
            addCriterion("extraint3 <>", value, "extraint3");
            return (Criteria) this;
        }

        public Criteria andExtraint3GreaterThan(Integer value) {
            addCriterion("extraint3 >", value, "extraint3");
            return (Criteria) this;
        }

        public Criteria andExtraint3GreaterThanOrEqualTo(Integer value) {
            addCriterion("extraint3 >=", value, "extraint3");
            return (Criteria) this;
        }

        public Criteria andExtraint3LessThan(Integer value) {
            addCriterion("extraint3 <", value, "extraint3");
            return (Criteria) this;
        }

        public Criteria andExtraint3LessThanOrEqualTo(Integer value) {
            addCriterion("extraint3 <=", value, "extraint3");
            return (Criteria) this;
        }

        public Criteria andExtraint3In(List<Integer> values) {
            addCriterion("extraint3 in", values, "extraint3");
            return (Criteria) this;
        }

        public Criteria andExtraint3NotIn(List<Integer> values) {
            addCriterion("extraint3 not in", values, "extraint3");
            return (Criteria) this;
        }

        public Criteria andExtraint3Between(Integer value1, Integer value2) {
            addCriterion("extraint3 between", value1, value2, "extraint3");
            return (Criteria) this;
        }

        public Criteria andExtraint3NotBetween(Integer value1, Integer value2) {
            addCriterion("extraint3 not between", value1, value2, "extraint3");
            return (Criteria) this;
        }

        public Criteria andExtraint4IsNull() {
            addCriterion("extraint4 is null");
            return (Criteria) this;
        }

        public Criteria andExtraint4IsNotNull() {
            addCriterion("extraint4 is not null");
            return (Criteria) this;
        }

        public Criteria andExtraint4EqualTo(Integer value) {
            addCriterion("extraint4 =", value, "extraint4");
            return (Criteria) this;
        }

        public Criteria andExtraint4NotEqualTo(Integer value) {
            addCriterion("extraint4 <>", value, "extraint4");
            return (Criteria) this;
        }

        public Criteria andExtraint4GreaterThan(Integer value) {
            addCriterion("extraint4 >", value, "extraint4");
            return (Criteria) this;
        }

        public Criteria andExtraint4GreaterThanOrEqualTo(Integer value) {
            addCriterion("extraint4 >=", value, "extraint4");
            return (Criteria) this;
        }

        public Criteria andExtraint4LessThan(Integer value) {
            addCriterion("extraint4 <", value, "extraint4");
            return (Criteria) this;
        }

        public Criteria andExtraint4LessThanOrEqualTo(Integer value) {
            addCriterion("extraint4 <=", value, "extraint4");
            return (Criteria) this;
        }

        public Criteria andExtraint4In(List<Integer> values) {
            addCriterion("extraint4 in", values, "extraint4");
            return (Criteria) this;
        }

        public Criteria andExtraint4NotIn(List<Integer> values) {
            addCriterion("extraint4 not in", values, "extraint4");
            return (Criteria) this;
        }

        public Criteria andExtraint4Between(Integer value1, Integer value2) {
            addCriterion("extraint4 between", value1, value2, "extraint4");
            return (Criteria) this;
        }

        public Criteria andExtraint4NotBetween(Integer value1, Integer value2) {
            addCriterion("extraint4 not between", value1, value2, "extraint4");
            return (Criteria) this;
        }

        public Criteria andExtraint5IsNull() {
            addCriterion("extraint5 is null");
            return (Criteria) this;
        }

        public Criteria andExtraint5IsNotNull() {
            addCriterion("extraint5 is not null");
            return (Criteria) this;
        }

        public Criteria andExtraint5EqualTo(Integer value) {
            addCriterion("extraint5 =", value, "extraint5");
            return (Criteria) this;
        }

        public Criteria andExtraint5NotEqualTo(Integer value) {
            addCriterion("extraint5 <>", value, "extraint5");
            return (Criteria) this;
        }

        public Criteria andExtraint5GreaterThan(Integer value) {
            addCriterion("extraint5 >", value, "extraint5");
            return (Criteria) this;
        }

        public Criteria andExtraint5GreaterThanOrEqualTo(Integer value) {
            addCriterion("extraint5 >=", value, "extraint5");
            return (Criteria) this;
        }

        public Criteria andExtraint5LessThan(Integer value) {
            addCriterion("extraint5 <", value, "extraint5");
            return (Criteria) this;
        }

        public Criteria andExtraint5LessThanOrEqualTo(Integer value) {
            addCriterion("extraint5 <=", value, "extraint5");
            return (Criteria) this;
        }

        public Criteria andExtraint5In(List<Integer> values) {
            addCriterion("extraint5 in", values, "extraint5");
            return (Criteria) this;
        }

        public Criteria andExtraint5NotIn(List<Integer> values) {
            addCriterion("extraint5 not in", values, "extraint5");
            return (Criteria) this;
        }

        public Criteria andExtraint5Between(Integer value1, Integer value2) {
            addCriterion("extraint5 between", value1, value2, "extraint5");
            return (Criteria) this;
        }

        public Criteria andExtraint5NotBetween(Integer value1, Integer value2) {
            addCriterion("extraint5 not between", value1, value2, "extraint5");
            return (Criteria) this;
        }

        public Criteria andExtraid1IsNull() {
            addCriterion("extraid1 is null");
            return (Criteria) this;
        }

        public Criteria andExtraid1IsNotNull() {
            addCriterion("extraid1 is not null");
            return (Criteria) this;
        }

        public Criteria andExtraid1EqualTo(Integer value) {
            addCriterion("extraid1 =", value, "extraid1");
            return (Criteria) this;
        }

        public Criteria andExtraid1NotEqualTo(Integer value) {
            addCriterion("extraid1 <>", value, "extraid1");
            return (Criteria) this;
        }

        public Criteria andExtraid1GreaterThan(Integer value) {
            addCriterion("extraid1 >", value, "extraid1");
            return (Criteria) this;
        }

        public Criteria andExtraid1GreaterThanOrEqualTo(Integer value) {
            addCriterion("extraid1 >=", value, "extraid1");
            return (Criteria) this;
        }

        public Criteria andExtraid1LessThan(Integer value) {
            addCriterion("extraid1 <", value, "extraid1");
            return (Criteria) this;
        }

        public Criteria andExtraid1LessThanOrEqualTo(Integer value) {
            addCriterion("extraid1 <=", value, "extraid1");
            return (Criteria) this;
        }

        public Criteria andExtraid1In(List<Integer> values) {
            addCriterion("extraid1 in", values, "extraid1");
            return (Criteria) this;
        }

        public Criteria andExtraid1NotIn(List<Integer> values) {
            addCriterion("extraid1 not in", values, "extraid1");
            return (Criteria) this;
        }

        public Criteria andExtraid1Between(Integer value1, Integer value2) {
            addCriterion("extraid1 between", value1, value2, "extraid1");
            return (Criteria) this;
        }

        public Criteria andExtraid1NotBetween(Integer value1, Integer value2) {
            addCriterion("extraid1 not between", value1, value2, "extraid1");
            return (Criteria) this;
        }

        public Criteria andExtraid2IsNull() {
            addCriterion("extraid2 is null");
            return (Criteria) this;
        }

        public Criteria andExtraid2IsNotNull() {
            addCriterion("extraid2 is not null");
            return (Criteria) this;
        }

        public Criteria andExtraid2EqualTo(Integer value) {
            addCriterion("extraid2 =", value, "extraid2");
            return (Criteria) this;
        }

        public Criteria andExtraid2NotEqualTo(Integer value) {
            addCriterion("extraid2 <>", value, "extraid2");
            return (Criteria) this;
        }

        public Criteria andExtraid2GreaterThan(Integer value) {
            addCriterion("extraid2 >", value, "extraid2");
            return (Criteria) this;
        }

        public Criteria andExtraid2GreaterThanOrEqualTo(Integer value) {
            addCriterion("extraid2 >=", value, "extraid2");
            return (Criteria) this;
        }

        public Criteria andExtraid2LessThan(Integer value) {
            addCriterion("extraid2 <", value, "extraid2");
            return (Criteria) this;
        }

        public Criteria andExtraid2LessThanOrEqualTo(Integer value) {
            addCriterion("extraid2 <=", value, "extraid2");
            return (Criteria) this;
        }

        public Criteria andExtraid2In(List<Integer> values) {
            addCriterion("extraid2 in", values, "extraid2");
            return (Criteria) this;
        }

        public Criteria andExtraid2NotIn(List<Integer> values) {
            addCriterion("extraid2 not in", values, "extraid2");
            return (Criteria) this;
        }

        public Criteria andExtraid2Between(Integer value1, Integer value2) {
            addCriterion("extraid2 between", value1, value2, "extraid2");
            return (Criteria) this;
        }

        public Criteria andExtraid2NotBetween(Integer value1, Integer value2) {
            addCriterion("extraid2 not between", value1, value2, "extraid2");
            return (Criteria) this;
        }

        public Criteria andExtraid3IsNull() {
            addCriterion("extraid3 is null");
            return (Criteria) this;
        }

        public Criteria andExtraid3IsNotNull() {
            addCriterion("extraid3 is not null");
            return (Criteria) this;
        }

        public Criteria andExtraid3EqualTo(Integer value) {
            addCriterion("extraid3 =", value, "extraid3");
            return (Criteria) this;
        }

        public Criteria andExtraid3NotEqualTo(Integer value) {
            addCriterion("extraid3 <>", value, "extraid3");
            return (Criteria) this;
        }

        public Criteria andExtraid3GreaterThan(Integer value) {
            addCriterion("extraid3 >", value, "extraid3");
            return (Criteria) this;
        }

        public Criteria andExtraid3GreaterThanOrEqualTo(Integer value) {
            addCriterion("extraid3 >=", value, "extraid3");
            return (Criteria) this;
        }

        public Criteria andExtraid3LessThan(Integer value) {
            addCriterion("extraid3 <", value, "extraid3");
            return (Criteria) this;
        }

        public Criteria andExtraid3LessThanOrEqualTo(Integer value) {
            addCriterion("extraid3 <=", value, "extraid3");
            return (Criteria) this;
        }

        public Criteria andExtraid3In(List<Integer> values) {
            addCriterion("extraid3 in", values, "extraid3");
            return (Criteria) this;
        }

        public Criteria andExtraid3NotIn(List<Integer> values) {
            addCriterion("extraid3 not in", values, "extraid3");
            return (Criteria) this;
        }

        public Criteria andExtraid3Between(Integer value1, Integer value2) {
            addCriterion("extraid3 between", value1, value2, "extraid3");
            return (Criteria) this;
        }

        public Criteria andExtraid3NotBetween(Integer value1, Integer value2) {
            addCriterion("extraid3 not between", value1, value2, "extraid3");
            return (Criteria) this;
        }

        public Criteria andExtraid4IsNull() {
            addCriterion("extraid4 is null");
            return (Criteria) this;
        }

        public Criteria andExtraid4IsNotNull() {
            addCriterion("extraid4 is not null");
            return (Criteria) this;
        }

        public Criteria andExtraid4EqualTo(Integer value) {
            addCriterion("extraid4 =", value, "extraid4");
            return (Criteria) this;
        }

        public Criteria andExtraid4NotEqualTo(Integer value) {
            addCriterion("extraid4 <>", value, "extraid4");
            return (Criteria) this;
        }

        public Criteria andExtraid4GreaterThan(Integer value) {
            addCriterion("extraid4 >", value, "extraid4");
            return (Criteria) this;
        }

        public Criteria andExtraid4GreaterThanOrEqualTo(Integer value) {
            addCriterion("extraid4 >=", value, "extraid4");
            return (Criteria) this;
        }

        public Criteria andExtraid4LessThan(Integer value) {
            addCriterion("extraid4 <", value, "extraid4");
            return (Criteria) this;
        }

        public Criteria andExtraid4LessThanOrEqualTo(Integer value) {
            addCriterion("extraid4 <=", value, "extraid4");
            return (Criteria) this;
        }

        public Criteria andExtraid4In(List<Integer> values) {
            addCriterion("extraid4 in", values, "extraid4");
            return (Criteria) this;
        }

        public Criteria andExtraid4NotIn(List<Integer> values) {
            addCriterion("extraid4 not in", values, "extraid4");
            return (Criteria) this;
        }

        public Criteria andExtraid4Between(Integer value1, Integer value2) {
            addCriterion("extraid4 between", value1, value2, "extraid4");
            return (Criteria) this;
        }

        public Criteria andExtraid4NotBetween(Integer value1, Integer value2) {
            addCriterion("extraid4 not between", value1, value2, "extraid4");
            return (Criteria) this;
        }

        public Criteria andExtraid5IsNull() {
            addCriterion("extraid5 is null");
            return (Criteria) this;
        }

        public Criteria andExtraid5IsNotNull() {
            addCriterion("extraid5 is not null");
            return (Criteria) this;
        }

        public Criteria andExtraid5EqualTo(Integer value) {
            addCriterion("extraid5 =", value, "extraid5");
            return (Criteria) this;
        }

        public Criteria andExtraid5NotEqualTo(Integer value) {
            addCriterion("extraid5 <>", value, "extraid5");
            return (Criteria) this;
        }

        public Criteria andExtraid5GreaterThan(Integer value) {
            addCriterion("extraid5 >", value, "extraid5");
            return (Criteria) this;
        }

        public Criteria andExtraid5GreaterThanOrEqualTo(Integer value) {
            addCriterion("extraid5 >=", value, "extraid5");
            return (Criteria) this;
        }

        public Criteria andExtraid5LessThan(Integer value) {
            addCriterion("extraid5 <", value, "extraid5");
            return (Criteria) this;
        }

        public Criteria andExtraid5LessThanOrEqualTo(Integer value) {
            addCriterion("extraid5 <=", value, "extraid5");
            return (Criteria) this;
        }

        public Criteria andExtraid5In(List<Integer> values) {
            addCriterion("extraid5 in", values, "extraid5");
            return (Criteria) this;
        }

        public Criteria andExtraid5NotIn(List<Integer> values) {
            addCriterion("extraid5 not in", values, "extraid5");
            return (Criteria) this;
        }

        public Criteria andExtraid5Between(Integer value1, Integer value2) {
            addCriterion("extraid5 between", value1, value2, "extraid5");
            return (Criteria) this;
        }

        public Criteria andExtraid5NotBetween(Integer value1, Integer value2) {
            addCriterion("extraid5 not between", value1, value2, "extraid5");
            return (Criteria) this;
        }

        public Criteria andExtradatetime1IsNull() {
            addCriterion("extradatetime1 is null");
            return (Criteria) this;
        }

        public Criteria andExtradatetime1IsNotNull() {
            addCriterion("extradatetime1 is not null");
            return (Criteria) this;
        }

        public Criteria andExtradatetime1EqualTo(Date value) {
            addCriterion("extradatetime1 =", value, "extradatetime1");
            return (Criteria) this;
        }

        public Criteria andExtradatetime1NotEqualTo(Date value) {
            addCriterion("extradatetime1 <>", value, "extradatetime1");
            return (Criteria) this;
        }

        public Criteria andExtradatetime1GreaterThan(Date value) {
            addCriterion("extradatetime1 >", value, "extradatetime1");
            return (Criteria) this;
        }

        public Criteria andExtradatetime1GreaterThanOrEqualTo(Date value) {
            addCriterion("extradatetime1 >=", value, "extradatetime1");
            return (Criteria) this;
        }

        public Criteria andExtradatetime1LessThan(Date value) {
            addCriterion("extradatetime1 <", value, "extradatetime1");
            return (Criteria) this;
        }

        public Criteria andExtradatetime1LessThanOrEqualTo(Date value) {
            addCriterion("extradatetime1 <=", value, "extradatetime1");
            return (Criteria) this;
        }

        public Criteria andExtradatetime1In(List<Date> values) {
            addCriterion("extradatetime1 in", values, "extradatetime1");
            return (Criteria) this;
        }

        public Criteria andExtradatetime1NotIn(List<Date> values) {
            addCriterion("extradatetime1 not in", values, "extradatetime1");
            return (Criteria) this;
        }

        public Criteria andExtradatetime1Between(Date value1, Date value2) {
            addCriterion("extradatetime1 between", value1, value2, "extradatetime1");
            return (Criteria) this;
        }

        public Criteria andExtradatetime1NotBetween(Date value1, Date value2) {
            addCriterion("extradatetime1 not between", value1, value2, "extradatetime1");
            return (Criteria) this;
        }

        public Criteria andExtradatetime2IsNull() {
            addCriterion("extradatetime2 is null");
            return (Criteria) this;
        }

        public Criteria andExtradatetime2IsNotNull() {
            addCriterion("extradatetime2 is not null");
            return (Criteria) this;
        }

        public Criteria andExtradatetime2EqualTo(Date value) {
            addCriterion("extradatetime2 =", value, "extradatetime2");
            return (Criteria) this;
        }

        public Criteria andExtradatetime2NotEqualTo(Date value) {
            addCriterion("extradatetime2 <>", value, "extradatetime2");
            return (Criteria) this;
        }

        public Criteria andExtradatetime2GreaterThan(Date value) {
            addCriterion("extradatetime2 >", value, "extradatetime2");
            return (Criteria) this;
        }

        public Criteria andExtradatetime2GreaterThanOrEqualTo(Date value) {
            addCriterion("extradatetime2 >=", value, "extradatetime2");
            return (Criteria) this;
        }

        public Criteria andExtradatetime2LessThan(Date value) {
            addCriterion("extradatetime2 <", value, "extradatetime2");
            return (Criteria) this;
        }

        public Criteria andExtradatetime2LessThanOrEqualTo(Date value) {
            addCriterion("extradatetime2 <=", value, "extradatetime2");
            return (Criteria) this;
        }

        public Criteria andExtradatetime2In(List<Date> values) {
            addCriterion("extradatetime2 in", values, "extradatetime2");
            return (Criteria) this;
        }

        public Criteria andExtradatetime2NotIn(List<Date> values) {
            addCriterion("extradatetime2 not in", values, "extradatetime2");
            return (Criteria) this;
        }

        public Criteria andExtradatetime2Between(Date value1, Date value2) {
            addCriterion("extradatetime2 between", value1, value2, "extradatetime2");
            return (Criteria) this;
        }

        public Criteria andExtradatetime2NotBetween(Date value1, Date value2) {
            addCriterion("extradatetime2 not between", value1, value2, "extradatetime2");
            return (Criteria) this;
        }

        public Criteria andExtradatetime3IsNull() {
            addCriterion("extradatetime3 is null");
            return (Criteria) this;
        }

        public Criteria andExtradatetime3IsNotNull() {
            addCriterion("extradatetime3 is not null");
            return (Criteria) this;
        }

        public Criteria andExtradatetime3EqualTo(Date value) {
            addCriterion("extradatetime3 =", value, "extradatetime3");
            return (Criteria) this;
        }

        public Criteria andExtradatetime3NotEqualTo(Date value) {
            addCriterion("extradatetime3 <>", value, "extradatetime3");
            return (Criteria) this;
        }

        public Criteria andExtradatetime3GreaterThan(Date value) {
            addCriterion("extradatetime3 >", value, "extradatetime3");
            return (Criteria) this;
        }

        public Criteria andExtradatetime3GreaterThanOrEqualTo(Date value) {
            addCriterion("extradatetime3 >=", value, "extradatetime3");
            return (Criteria) this;
        }

        public Criteria andExtradatetime3LessThan(Date value) {
            addCriterion("extradatetime3 <", value, "extradatetime3");
            return (Criteria) this;
        }

        public Criteria andExtradatetime3LessThanOrEqualTo(Date value) {
            addCriterion("extradatetime3 <=", value, "extradatetime3");
            return (Criteria) this;
        }

        public Criteria andExtradatetime3In(List<Date> values) {
            addCriterion("extradatetime3 in", values, "extradatetime3");
            return (Criteria) this;
        }

        public Criteria andExtradatetime3NotIn(List<Date> values) {
            addCriterion("extradatetime3 not in", values, "extradatetime3");
            return (Criteria) this;
        }

        public Criteria andExtradatetime3Between(Date value1, Date value2) {
            addCriterion("extradatetime3 between", value1, value2, "extradatetime3");
            return (Criteria) this;
        }

        public Criteria andExtradatetime3NotBetween(Date value1, Date value2) {
            addCriterion("extradatetime3 not between", value1, value2, "extradatetime3");
            return (Criteria) this;
        }

        public Criteria andExtradatetime4IsNull() {
            addCriterion("extradatetime4 is null");
            return (Criteria) this;
        }

        public Criteria andExtradatetime4IsNotNull() {
            addCriterion("extradatetime4 is not null");
            return (Criteria) this;
        }

        public Criteria andExtradatetime4EqualTo(Date value) {
            addCriterion("extradatetime4 =", value, "extradatetime4");
            return (Criteria) this;
        }

        public Criteria andExtradatetime4NotEqualTo(Date value) {
            addCriterion("extradatetime4 <>", value, "extradatetime4");
            return (Criteria) this;
        }

        public Criteria andExtradatetime4GreaterThan(Date value) {
            addCriterion("extradatetime4 >", value, "extradatetime4");
            return (Criteria) this;
        }

        public Criteria andExtradatetime4GreaterThanOrEqualTo(Date value) {
            addCriterion("extradatetime4 >=", value, "extradatetime4");
            return (Criteria) this;
        }

        public Criteria andExtradatetime4LessThan(Date value) {
            addCriterion("extradatetime4 <", value, "extradatetime4");
            return (Criteria) this;
        }

        public Criteria andExtradatetime4LessThanOrEqualTo(Date value) {
            addCriterion("extradatetime4 <=", value, "extradatetime4");
            return (Criteria) this;
        }

        public Criteria andExtradatetime4In(List<Date> values) {
            addCriterion("extradatetime4 in", values, "extradatetime4");
            return (Criteria) this;
        }

        public Criteria andExtradatetime4NotIn(List<Date> values) {
            addCriterion("extradatetime4 not in", values, "extradatetime4");
            return (Criteria) this;
        }

        public Criteria andExtradatetime4Between(Date value1, Date value2) {
            addCriterion("extradatetime4 between", value1, value2, "extradatetime4");
            return (Criteria) this;
        }

        public Criteria andExtradatetime4NotBetween(Date value1, Date value2) {
            addCriterion("extradatetime4 not between", value1, value2, "extradatetime4");
            return (Criteria) this;
        }

        public Criteria andExtradatetime5IsNull() {
            addCriterion("extradatetime5 is null");
            return (Criteria) this;
        }

        public Criteria andExtradatetime5IsNotNull() {
            addCriterion("extradatetime5 is not null");
            return (Criteria) this;
        }

        public Criteria andExtradatetime5EqualTo(Date value) {
            addCriterion("extradatetime5 =", value, "extradatetime5");
            return (Criteria) this;
        }

        public Criteria andExtradatetime5NotEqualTo(Date value) {
            addCriterion("extradatetime5 <>", value, "extradatetime5");
            return (Criteria) this;
        }

        public Criteria andExtradatetime5GreaterThan(Date value) {
            addCriterion("extradatetime5 >", value, "extradatetime5");
            return (Criteria) this;
        }

        public Criteria andExtradatetime5GreaterThanOrEqualTo(Date value) {
            addCriterion("extradatetime5 >=", value, "extradatetime5");
            return (Criteria) this;
        }

        public Criteria andExtradatetime5LessThan(Date value) {
            addCriterion("extradatetime5 <", value, "extradatetime5");
            return (Criteria) this;
        }

        public Criteria andExtradatetime5LessThanOrEqualTo(Date value) {
            addCriterion("extradatetime5 <=", value, "extradatetime5");
            return (Criteria) this;
        }

        public Criteria andExtradatetime5In(List<Date> values) {
            addCriterion("extradatetime5 in", values, "extradatetime5");
            return (Criteria) this;
        }

        public Criteria andExtradatetime5NotIn(List<Date> values) {
            addCriterion("extradatetime5 not in", values, "extradatetime5");
            return (Criteria) this;
        }

        public Criteria andExtradatetime5Between(Date value1, Date value2) {
            addCriterion("extradatetime5 between", value1, value2, "extradatetime5");
            return (Criteria) this;
        }

        public Criteria andExtradatetime5NotBetween(Date value1, Date value2) {
            addCriterion("extradatetime5 not between", value1, value2, "extradatetime5");
            return (Criteria) this;
        }

        public Criteria andCustomeridIsNull() {
            addCriterion("customerid is null");
            return (Criteria) this;
        }

        public Criteria andCustomeridIsNotNull() {
            addCriterion("customerid is not null");
            return (Criteria) this;
        }

        public Criteria andCustomeridEqualTo(Integer value) {
            addCriterion("customerid =", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotEqualTo(Integer value) {
            addCriterion("customerid <>", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridGreaterThan(Integer value) {
            addCriterion("customerid >", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridGreaterThanOrEqualTo(Integer value) {
            addCriterion("customerid >=", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridLessThan(Integer value) {
            addCriterion("customerid <", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridLessThanOrEqualTo(Integer value) {
            addCriterion("customerid <=", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridIn(List<Integer> values) {
            addCriterion("customerid in", values, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotIn(List<Integer> values) {
            addCriterion("customerid not in", values, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridBetween(Integer value1, Integer value2) {
            addCriterion("customerid between", value1, value2, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotBetween(Integer value1, Integer value2) {
            addCriterion("customerid not between", value1, value2, "customerid");
            return (Criteria) this;
        }

        public Criteria andWechatuseridIsNull() {
            addCriterion("wechatuserid is null");
            return (Criteria) this;
        }

        public Criteria andWechatuseridIsNotNull() {
            addCriterion("wechatuserid is not null");
            return (Criteria) this;
        }

        public Criteria andWechatuseridEqualTo(Integer value) {
            addCriterion("wechatuserid =", value, "wechatuserid");
            return (Criteria) this;
        }

        public Criteria andWechatuseridNotEqualTo(Integer value) {
            addCriterion("wechatuserid <>", value, "wechatuserid");
            return (Criteria) this;
        }

        public Criteria andWechatuseridGreaterThan(Integer value) {
            addCriterion("wechatuserid >", value, "wechatuserid");
            return (Criteria) this;
        }

        public Criteria andWechatuseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("wechatuserid >=", value, "wechatuserid");
            return (Criteria) this;
        }

        public Criteria andWechatuseridLessThan(Integer value) {
            addCriterion("wechatuserid <", value, "wechatuserid");
            return (Criteria) this;
        }

        public Criteria andWechatuseridLessThanOrEqualTo(Integer value) {
            addCriterion("wechatuserid <=", value, "wechatuserid");
            return (Criteria) this;
        }

        public Criteria andWechatuseridIn(List<Integer> values) {
            addCriterion("wechatuserid in", values, "wechatuserid");
            return (Criteria) this;
        }

        public Criteria andWechatuseridNotIn(List<Integer> values) {
            addCriterion("wechatuserid not in", values, "wechatuserid");
            return (Criteria) this;
        }

        public Criteria andWechatuseridBetween(Integer value1, Integer value2) {
            addCriterion("wechatuserid between", value1, value2, "wechatuserid");
            return (Criteria) this;
        }

        public Criteria andWechatuseridNotBetween(Integer value1, Integer value2) {
            addCriterion("wechatuserid not between", value1, value2, "wechatuserid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidIsNull() {
            addCriterion("departmentid is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentidIsNotNull() {
            addCriterion("departmentid is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentidEqualTo(Integer value) {
            addCriterion("departmentid =", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidNotEqualTo(Integer value) {
            addCriterion("departmentid <>", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidGreaterThan(Integer value) {
            addCriterion("departmentid >", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("departmentid >=", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidLessThan(Integer value) {
            addCriterion("departmentid <", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidLessThanOrEqualTo(Integer value) {
            addCriterion("departmentid <=", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidIn(List<Integer> values) {
            addCriterion("departmentid in", values, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidNotIn(List<Integer> values) {
            addCriterion("departmentid not in", values, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidBetween(Integer value1, Integer value2) {
            addCriterion("departmentid between", value1, value2, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidNotBetween(Integer value1, Integer value2) {
            addCriterion("departmentid not between", value1, value2, "departmentid");
            return (Criteria) this;
        }

        public Criteria andIshumanIsNull() {
            addCriterion("ishuman is null");
            return (Criteria) this;
        }

        public Criteria andIshumanIsNotNull() {
            addCriterion("ishuman is not null");
            return (Criteria) this;
        }

        public Criteria andIshumanEqualTo(Integer value) {
            addCriterion("ishuman =", value, "ishuman");
            return (Criteria) this;
        }

        public Criteria andIshumanNotEqualTo(Integer value) {
            addCriterion("ishuman <>", value, "ishuman");
            return (Criteria) this;
        }

        public Criteria andIshumanGreaterThan(Integer value) {
            addCriterion("ishuman >", value, "ishuman");
            return (Criteria) this;
        }

        public Criteria andIshumanGreaterThanOrEqualTo(Integer value) {
            addCriterion("ishuman >=", value, "ishuman");
            return (Criteria) this;
        }

        public Criteria andIshumanLessThan(Integer value) {
            addCriterion("ishuman <", value, "ishuman");
            return (Criteria) this;
        }

        public Criteria andIshumanLessThanOrEqualTo(Integer value) {
            addCriterion("ishuman <=", value, "ishuman");
            return (Criteria) this;
        }

        public Criteria andIshumanIn(List<Integer> values) {
            addCriterion("ishuman in", values, "ishuman");
            return (Criteria) this;
        }

        public Criteria andIshumanNotIn(List<Integer> values) {
            addCriterion("ishuman not in", values, "ishuman");
            return (Criteria) this;
        }

        public Criteria andIshumanBetween(Integer value1, Integer value2) {
            addCriterion("ishuman between", value1, value2, "ishuman");
            return (Criteria) this;
        }

        public Criteria andIshumanNotBetween(Integer value1, Integer value2) {
            addCriterion("ishuman not between", value1, value2, "ishuman");
            return (Criteria) this;
        }

        public Criteria andRootuseridIsNull() {
            addCriterion("rootuserid is null");
            return (Criteria) this;
        }

        public Criteria andRootuseridIsNotNull() {
            addCriterion("rootuserid is not null");
            return (Criteria) this;
        }

        public Criteria andRootuseridEqualTo(Integer value) {
            addCriterion("rootuserid =", value, "rootuserid");
            return (Criteria) this;
        }

        public Criteria andRootuseridNotEqualTo(Integer value) {
            addCriterion("rootuserid <>", value, "rootuserid");
            return (Criteria) this;
        }

        public Criteria andRootuseridGreaterThan(Integer value) {
            addCriterion("rootuserid >", value, "rootuserid");
            return (Criteria) this;
        }

        public Criteria andRootuseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("rootuserid >=", value, "rootuserid");
            return (Criteria) this;
        }

        public Criteria andRootuseridLessThan(Integer value) {
            addCriterion("rootuserid <", value, "rootuserid");
            return (Criteria) this;
        }

        public Criteria andRootuseridLessThanOrEqualTo(Integer value) {
            addCriterion("rootuserid <=", value, "rootuserid");
            return (Criteria) this;
        }

        public Criteria andRootuseridIn(List<Integer> values) {
            addCriterion("rootuserid in", values, "rootuserid");
            return (Criteria) this;
        }

        public Criteria andRootuseridNotIn(List<Integer> values) {
            addCriterion("rootuserid not in", values, "rootuserid");
            return (Criteria) this;
        }

        public Criteria andRootuseridBetween(Integer value1, Integer value2) {
            addCriterion("rootuserid between", value1, value2, "rootuserid");
            return (Criteria) this;
        }

        public Criteria andRootuseridNotBetween(Integer value1, Integer value2) {
            addCriterion("rootuserid not between", value1, value2, "rootuserid");
            return (Criteria) this;
        }

        public Criteria andShareidIsNull() {
            addCriterion("shareid is null");
            return (Criteria) this;
        }

        public Criteria andShareidIsNotNull() {
            addCriterion("shareid is not null");
            return (Criteria) this;
        }

        public Criteria andShareidEqualTo(Integer value) {
            addCriterion("shareid =", value, "shareid");
            return (Criteria) this;
        }

        public Criteria andShareidNotEqualTo(Integer value) {
            addCriterion("shareid <>", value, "shareid");
            return (Criteria) this;
        }

        public Criteria andShareidGreaterThan(Integer value) {
            addCriterion("shareid >", value, "shareid");
            return (Criteria) this;
        }

        public Criteria andShareidGreaterThanOrEqualTo(Integer value) {
            addCriterion("shareid >=", value, "shareid");
            return (Criteria) this;
        }

        public Criteria andShareidLessThan(Integer value) {
            addCriterion("shareid <", value, "shareid");
            return (Criteria) this;
        }

        public Criteria andShareidLessThanOrEqualTo(Integer value) {
            addCriterion("shareid <=", value, "shareid");
            return (Criteria) this;
        }

        public Criteria andShareidIn(List<Integer> values) {
            addCriterion("shareid in", values, "shareid");
            return (Criteria) this;
        }

        public Criteria andShareidNotIn(List<Integer> values) {
            addCriterion("shareid not in", values, "shareid");
            return (Criteria) this;
        }

        public Criteria andShareidBetween(Integer value1, Integer value2) {
            addCriterion("shareid between", value1, value2, "shareid");
            return (Criteria) this;
        }

        public Criteria andShareidNotBetween(Integer value1, Integer value2) {
            addCriterion("shareid not between", value1, value2, "shareid");
            return (Criteria) this;
        }

        public Criteria andSaleidIsNull() {
            addCriterion("saleid is null");
            return (Criteria) this;
        }

        public Criteria andSaleidIsNotNull() {
            addCriterion("saleid is not null");
            return (Criteria) this;
        }

        public Criteria andSaleidEqualTo(Integer value) {
            addCriterion("saleid =", value, "saleid");
            return (Criteria) this;
        }

        public Criteria andSaleidNotEqualTo(Integer value) {
            addCriterion("saleid <>", value, "saleid");
            return (Criteria) this;
        }

        public Criteria andSaleidGreaterThan(Integer value) {
            addCriterion("saleid >", value, "saleid");
            return (Criteria) this;
        }

        public Criteria andSaleidGreaterThanOrEqualTo(Integer value) {
            addCriterion("saleid >=", value, "saleid");
            return (Criteria) this;
        }

        public Criteria andSaleidLessThan(Integer value) {
            addCriterion("saleid <", value, "saleid");
            return (Criteria) this;
        }

        public Criteria andSaleidLessThanOrEqualTo(Integer value) {
            addCriterion("saleid <=", value, "saleid");
            return (Criteria) this;
        }

        public Criteria andSaleidIn(List<Integer> values) {
            addCriterion("saleid in", values, "saleid");
            return (Criteria) this;
        }

        public Criteria andSaleidNotIn(List<Integer> values) {
            addCriterion("saleid not in", values, "saleid");
            return (Criteria) this;
        }

        public Criteria andSaleidBetween(Integer value1, Integer value2) {
            addCriterion("saleid between", value1, value2, "saleid");
            return (Criteria) this;
        }

        public Criteria andSaleidNotBetween(Integer value1, Integer value2) {
            addCriterion("saleid not between", value1, value2, "saleid");
            return (Criteria) this;
        }

        public Criteria andOfficalwechatkeyIsNull() {
            addCriterion("officalwechatkey is null");
            return (Criteria) this;
        }

        public Criteria andOfficalwechatkeyIsNotNull() {
            addCriterion("officalwechatkey is not null");
            return (Criteria) this;
        }

        public Criteria andOfficalwechatkeyEqualTo(String value) {
            addCriterion("officalwechatkey =", value, "officalwechatkey");
            return (Criteria) this;
        }

        public Criteria andOfficalwechatkeyNotEqualTo(String value) {
            addCriterion("officalwechatkey <>", value, "officalwechatkey");
            return (Criteria) this;
        }

        public Criteria andOfficalwechatkeyGreaterThan(String value) {
            addCriterion("officalwechatkey >", value, "officalwechatkey");
            return (Criteria) this;
        }

        public Criteria andOfficalwechatkeyGreaterThanOrEqualTo(String value) {
            addCriterion("officalwechatkey >=", value, "officalwechatkey");
            return (Criteria) this;
        }

        public Criteria andOfficalwechatkeyLessThan(String value) {
            addCriterion("officalwechatkey <", value, "officalwechatkey");
            return (Criteria) this;
        }

        public Criteria andOfficalwechatkeyLessThanOrEqualTo(String value) {
            addCriterion("officalwechatkey <=", value, "officalwechatkey");
            return (Criteria) this;
        }

        public Criteria andOfficalwechatkeyLike(String value) {
            addCriterion("officalwechatkey like", value, "officalwechatkey");
            return (Criteria) this;
        }

        public Criteria andOfficalwechatkeyNotLike(String value) {
            addCriterion("officalwechatkey not like", value, "officalwechatkey");
            return (Criteria) this;
        }

        public Criteria andOfficalwechatkeyIn(List<String> values) {
            addCriterion("officalwechatkey in", values, "officalwechatkey");
            return (Criteria) this;
        }

        public Criteria andOfficalwechatkeyNotIn(List<String> values) {
            addCriterion("officalwechatkey not in", values, "officalwechatkey");
            return (Criteria) this;
        }

        public Criteria andOfficalwechatkeyBetween(String value1, String value2) {
            addCriterion("officalwechatkey between", value1, value2, "officalwechatkey");
            return (Criteria) this;
        }

        public Criteria andOfficalwechatkeyNotBetween(String value1, String value2) {
            addCriterion("officalwechatkey not between", value1, value2, "officalwechatkey");
            return (Criteria) this;
        }

        public Criteria andPostidIsNull() {
            addCriterion("postid is null");
            return (Criteria) this;
        }

        public Criteria andPostidIsNotNull() {
            addCriterion("postid is not null");
            return (Criteria) this;
        }

        public Criteria andPostidEqualTo(Integer value) {
            addCriterion("postid =", value, "postid");
            return (Criteria) this;
        }

        public Criteria andPostidNotEqualTo(Integer value) {
            addCriterion("postid <>", value, "postid");
            return (Criteria) this;
        }

        public Criteria andPostidGreaterThan(Integer value) {
            addCriterion("postid >", value, "postid");
            return (Criteria) this;
        }

        public Criteria andPostidGreaterThanOrEqualTo(Integer value) {
            addCriterion("postid >=", value, "postid");
            return (Criteria) this;
        }

        public Criteria andPostidLessThan(Integer value) {
            addCriterion("postid <", value, "postid");
            return (Criteria) this;
        }

        public Criteria andPostidLessThanOrEqualTo(Integer value) {
            addCriterion("postid <=", value, "postid");
            return (Criteria) this;
        }

        public Criteria andPostidIn(List<Integer> values) {
            addCriterion("postid in", values, "postid");
            return (Criteria) this;
        }

        public Criteria andPostidNotIn(List<Integer> values) {
            addCriterion("postid not in", values, "postid");
            return (Criteria) this;
        }

        public Criteria andPostidBetween(Integer value1, Integer value2) {
            addCriterion("postid between", value1, value2, "postid");
            return (Criteria) this;
        }

        public Criteria andPostidNotBetween(Integer value1, Integer value2) {
            addCriterion("postid not between", value1, value2, "postid");
            return (Criteria) this;
        }

        public Criteria andBirthdatetimeIsNull() {
            addCriterion("birthdatetime is null");
            return (Criteria) this;
        }

        public Criteria andBirthdatetimeIsNotNull() {
            addCriterion("birthdatetime is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdatetimeEqualTo(Date value) {
            addCriterion("birthdatetime =", value, "birthdatetime");
            return (Criteria) this;
        }

        public Criteria andBirthdatetimeNotEqualTo(Date value) {
            addCriterion("birthdatetime <>", value, "birthdatetime");
            return (Criteria) this;
        }

        public Criteria andBirthdatetimeGreaterThan(Date value) {
            addCriterion("birthdatetime >", value, "birthdatetime");
            return (Criteria) this;
        }

        public Criteria andBirthdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("birthdatetime >=", value, "birthdatetime");
            return (Criteria) this;
        }

        public Criteria andBirthdatetimeLessThan(Date value) {
            addCriterion("birthdatetime <", value, "birthdatetime");
            return (Criteria) this;
        }

        public Criteria andBirthdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("birthdatetime <=", value, "birthdatetime");
            return (Criteria) this;
        }

        public Criteria andBirthdatetimeIn(List<Date> values) {
            addCriterion("birthdatetime in", values, "birthdatetime");
            return (Criteria) this;
        }

        public Criteria andBirthdatetimeNotIn(List<Date> values) {
            addCriterion("birthdatetime not in", values, "birthdatetime");
            return (Criteria) this;
        }

        public Criteria andBirthdatetimeBetween(Date value1, Date value2) {
            addCriterion("birthdatetime between", value1, value2, "birthdatetime");
            return (Criteria) this;
        }

        public Criteria andBirthdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("birthdatetime not between", value1, value2, "birthdatetime");
            return (Criteria) this;
        }

        public Criteria andIdcardIsNull() {
            addCriterion("idcard is null");
            return (Criteria) this;
        }

        public Criteria andIdcardIsNotNull() {
            addCriterion("idcard is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardEqualTo(String value) {
            addCriterion("idcard =", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotEqualTo(String value) {
            addCriterion("idcard <>", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardGreaterThan(String value) {
            addCriterion("idcard >", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardGreaterThanOrEqualTo(String value) {
            addCriterion("idcard >=", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLessThan(String value) {
            addCriterion("idcard <", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLessThanOrEqualTo(String value) {
            addCriterion("idcard <=", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLike(String value) {
            addCriterion("idcard like", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotLike(String value) {
            addCriterion("idcard not like", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardIn(List<String> values) {
            addCriterion("idcard in", values, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotIn(List<String> values) {
            addCriterion("idcard not in", values, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardBetween(String value1, String value2) {
            addCriterion("idcard between", value1, value2, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotBetween(String value1, String value2) {
            addCriterion("idcard not between", value1, value2, "idcard");
            return (Criteria) this;
        }

        public Criteria andIsmarriedIsNull() {
            addCriterion("ismarried is null");
            return (Criteria) this;
        }

        public Criteria andIsmarriedIsNotNull() {
            addCriterion("ismarried is not null");
            return (Criteria) this;
        }

        public Criteria andIsmarriedEqualTo(String value) {
            addCriterion("ismarried =", value, "ismarried");
            return (Criteria) this;
        }

        public Criteria andIsmarriedNotEqualTo(String value) {
            addCriterion("ismarried <>", value, "ismarried");
            return (Criteria) this;
        }

        public Criteria andIsmarriedGreaterThan(String value) {
            addCriterion("ismarried >", value, "ismarried");
            return (Criteria) this;
        }

        public Criteria andIsmarriedGreaterThanOrEqualTo(String value) {
            addCriterion("ismarried >=", value, "ismarried");
            return (Criteria) this;
        }

        public Criteria andIsmarriedLessThan(String value) {
            addCriterion("ismarried <", value, "ismarried");
            return (Criteria) this;
        }

        public Criteria andIsmarriedLessThanOrEqualTo(String value) {
            addCriterion("ismarried <=", value, "ismarried");
            return (Criteria) this;
        }

        public Criteria andIsmarriedLike(String value) {
            addCriterion("ismarried like", value, "ismarried");
            return (Criteria) this;
        }

        public Criteria andIsmarriedNotLike(String value) {
            addCriterion("ismarried not like", value, "ismarried");
            return (Criteria) this;
        }

        public Criteria andIsmarriedIn(List<String> values) {
            addCriterion("ismarried in", values, "ismarried");
            return (Criteria) this;
        }

        public Criteria andIsmarriedNotIn(List<String> values) {
            addCriterion("ismarried not in", values, "ismarried");
            return (Criteria) this;
        }

        public Criteria andIsmarriedBetween(String value1, String value2) {
            addCriterion("ismarried between", value1, value2, "ismarried");
            return (Criteria) this;
        }

        public Criteria andIsmarriedNotBetween(String value1, String value2) {
            addCriterion("ismarried not between", value1, value2, "ismarried");
            return (Criteria) this;
        }

        public Criteria andIsbirthedIsNull() {
            addCriterion("isbirthed is null");
            return (Criteria) this;
        }

        public Criteria andIsbirthedIsNotNull() {
            addCriterion("isbirthed is not null");
            return (Criteria) this;
        }

        public Criteria andIsbirthedEqualTo(String value) {
            addCriterion("isbirthed =", value, "isbirthed");
            return (Criteria) this;
        }

        public Criteria andIsbirthedNotEqualTo(String value) {
            addCriterion("isbirthed <>", value, "isbirthed");
            return (Criteria) this;
        }

        public Criteria andIsbirthedGreaterThan(String value) {
            addCriterion("isbirthed >", value, "isbirthed");
            return (Criteria) this;
        }

        public Criteria andIsbirthedGreaterThanOrEqualTo(String value) {
            addCriterion("isbirthed >=", value, "isbirthed");
            return (Criteria) this;
        }

        public Criteria andIsbirthedLessThan(String value) {
            addCriterion("isbirthed <", value, "isbirthed");
            return (Criteria) this;
        }

        public Criteria andIsbirthedLessThanOrEqualTo(String value) {
            addCriterion("isbirthed <=", value, "isbirthed");
            return (Criteria) this;
        }

        public Criteria andIsbirthedLike(String value) {
            addCriterion("isbirthed like", value, "isbirthed");
            return (Criteria) this;
        }

        public Criteria andIsbirthedNotLike(String value) {
            addCriterion("isbirthed not like", value, "isbirthed");
            return (Criteria) this;
        }

        public Criteria andIsbirthedIn(List<String> values) {
            addCriterion("isbirthed in", values, "isbirthed");
            return (Criteria) this;
        }

        public Criteria andIsbirthedNotIn(List<String> values) {
            addCriterion("isbirthed not in", values, "isbirthed");
            return (Criteria) this;
        }

        public Criteria andIsbirthedBetween(String value1, String value2) {
            addCriterion("isbirthed between", value1, value2, "isbirthed");
            return (Criteria) this;
        }

        public Criteria andIsbirthedNotBetween(String value1, String value2) {
            addCriterion("isbirthed not between", value1, value2, "isbirthed");
            return (Criteria) this;
        }

        public Criteria andEducationIsNull() {
            addCriterion("education is null");
            return (Criteria) this;
        }

        public Criteria andEducationIsNotNull() {
            addCriterion("education is not null");
            return (Criteria) this;
        }

        public Criteria andEducationEqualTo(String value) {
            addCriterion("education =", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotEqualTo(String value) {
            addCriterion("education <>", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThan(String value) {
            addCriterion("education >", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThanOrEqualTo(String value) {
            addCriterion("education >=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThan(String value) {
            addCriterion("education <", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThanOrEqualTo(String value) {
            addCriterion("education <=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLike(String value) {
            addCriterion("education like", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotLike(String value) {
            addCriterion("education not like", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationIn(List<String> values) {
            addCriterion("education in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotIn(List<String> values) {
            addCriterion("education not in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationBetween(String value1, String value2) {
            addCriterion("education between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotBetween(String value1, String value2) {
            addCriterion("education not between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andMajorIsNull() {
            addCriterion("major is null");
            return (Criteria) this;
        }

        public Criteria andMajorIsNotNull() {
            addCriterion("major is not null");
            return (Criteria) this;
        }

        public Criteria andMajorEqualTo(String value) {
            addCriterion("major =", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotEqualTo(String value) {
            addCriterion("major <>", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorGreaterThan(String value) {
            addCriterion("major >", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorGreaterThanOrEqualTo(String value) {
            addCriterion("major >=", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLessThan(String value) {
            addCriterion("major <", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLessThanOrEqualTo(String value) {
            addCriterion("major <=", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLike(String value) {
            addCriterion("major like", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotLike(String value) {
            addCriterion("major not like", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorIn(List<String> values) {
            addCriterion("major in", values, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotIn(List<String> values) {
            addCriterion("major not in", values, "major");
            return (Criteria) this;
        }

        public Criteria andMajorBetween(String value1, String value2) {
            addCriterion("major between", value1, value2, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotBetween(String value1, String value2) {
            addCriterion("major not between", value1, value2, "major");
            return (Criteria) this;
        }

        public Criteria andForgetstateIsNull() {
            addCriterion("forgetstate is null");
            return (Criteria) this;
        }

        public Criteria andForgetstateIsNotNull() {
            addCriterion("forgetstate is not null");
            return (Criteria) this;
        }

        public Criteria andForgetstateEqualTo(Integer value) {
            addCriterion("forgetstate =", value, "forgetstate");
            return (Criteria) this;
        }

        public Criteria andForgetstateNotEqualTo(Integer value) {
            addCriterion("forgetstate <>", value, "forgetstate");
            return (Criteria) this;
        }

        public Criteria andForgetstateGreaterThan(Integer value) {
            addCriterion("forgetstate >", value, "forgetstate");
            return (Criteria) this;
        }

        public Criteria andForgetstateGreaterThanOrEqualTo(Integer value) {
            addCriterion("forgetstate >=", value, "forgetstate");
            return (Criteria) this;
        }

        public Criteria andForgetstateLessThan(Integer value) {
            addCriterion("forgetstate <", value, "forgetstate");
            return (Criteria) this;
        }

        public Criteria andForgetstateLessThanOrEqualTo(Integer value) {
            addCriterion("forgetstate <=", value, "forgetstate");
            return (Criteria) this;
        }

        public Criteria andForgetstateIn(List<Integer> values) {
            addCriterion("forgetstate in", values, "forgetstate");
            return (Criteria) this;
        }

        public Criteria andForgetstateNotIn(List<Integer> values) {
            addCriterion("forgetstate not in", values, "forgetstate");
            return (Criteria) this;
        }

        public Criteria andForgetstateBetween(Integer value1, Integer value2) {
            addCriterion("forgetstate between", value1, value2, "forgetstate");
            return (Criteria) this;
        }

        public Criteria andForgetstateNotBetween(Integer value1, Integer value2) {
            addCriterion("forgetstate not between", value1, value2, "forgetstate");
            return (Criteria) this;
        }

        public Criteria andIsadminIsNull() {
            addCriterion("isadmin is null");
            return (Criteria) this;
        }

        public Criteria andIsadminIsNotNull() {
            addCriterion("isadmin is not null");
            return (Criteria) this;
        }

        public Criteria andIsadminEqualTo(Integer value) {
            addCriterion("isadmin =", value, "isadmin");
            return (Criteria) this;
        }

        public Criteria andIsadminNotEqualTo(Integer value) {
            addCriterion("isadmin <>", value, "isadmin");
            return (Criteria) this;
        }

        public Criteria andIsadminGreaterThan(Integer value) {
            addCriterion("isadmin >", value, "isadmin");
            return (Criteria) this;
        }

        public Criteria andIsadminGreaterThanOrEqualTo(Integer value) {
            addCriterion("isadmin >=", value, "isadmin");
            return (Criteria) this;
        }

        public Criteria andIsadminLessThan(Integer value) {
            addCriterion("isadmin <", value, "isadmin");
            return (Criteria) this;
        }

        public Criteria andIsadminLessThanOrEqualTo(Integer value) {
            addCriterion("isadmin <=", value, "isadmin");
            return (Criteria) this;
        }

        public Criteria andIsadminIn(List<Integer> values) {
            addCriterion("isadmin in", values, "isadmin");
            return (Criteria) this;
        }

        public Criteria andIsadminNotIn(List<Integer> values) {
            addCriterion("isadmin not in", values, "isadmin");
            return (Criteria) this;
        }

        public Criteria andIsadminBetween(Integer value1, Integer value2) {
            addCriterion("isadmin between", value1, value2, "isadmin");
            return (Criteria) this;
        }

        public Criteria andIsadminNotBetween(Integer value1, Integer value2) {
            addCriterion("isadmin not between", value1, value2, "isadmin");
            return (Criteria) this;
        }

        public Criteria andRegistrationstatusIsNull() {
            addCriterion("registrationstatus is null");
            return (Criteria) this;
        }

        public Criteria andRegistrationstatusIsNotNull() {
            addCriterion("registrationstatus is not null");
            return (Criteria) this;
        }

        public Criteria andRegistrationstatusEqualTo(Integer value) {
            addCriterion("registrationstatus =", value, "registrationstatus");
            return (Criteria) this;
        }

        public Criteria andRegistrationstatusNotEqualTo(Integer value) {
            addCriterion("registrationstatus <>", value, "registrationstatus");
            return (Criteria) this;
        }

        public Criteria andRegistrationstatusGreaterThan(Integer value) {
            addCriterion("registrationstatus >", value, "registrationstatus");
            return (Criteria) this;
        }

        public Criteria andRegistrationstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("registrationstatus >=", value, "registrationstatus");
            return (Criteria) this;
        }

        public Criteria andRegistrationstatusLessThan(Integer value) {
            addCriterion("registrationstatus <", value, "registrationstatus");
            return (Criteria) this;
        }

        public Criteria andRegistrationstatusLessThanOrEqualTo(Integer value) {
            addCriterion("registrationstatus <=", value, "registrationstatus");
            return (Criteria) this;
        }

        public Criteria andRegistrationstatusIn(List<Integer> values) {
            addCriterion("registrationstatus in", values, "registrationstatus");
            return (Criteria) this;
        }

        public Criteria andRegistrationstatusNotIn(List<Integer> values) {
            addCriterion("registrationstatus not in", values, "registrationstatus");
            return (Criteria) this;
        }

        public Criteria andRegistrationstatusBetween(Integer value1, Integer value2) {
            addCriterion("registrationstatus between", value1, value2, "registrationstatus");
            return (Criteria) this;
        }

        public Criteria andRegistrationstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("registrationstatus not between", value1, value2, "registrationstatus");
            return (Criteria) this;
        }

        public Criteria andWorkstationIsNull() {
            addCriterion("workstation is null");
            return (Criteria) this;
        }

        public Criteria andWorkstationIsNotNull() {
            addCriterion("workstation is not null");
            return (Criteria) this;
        }

        public Criteria andWorkstationEqualTo(String value) {
            addCriterion("workstation =", value, "workstation");
            return (Criteria) this;
        }

        public Criteria andWorkstationNotEqualTo(String value) {
            addCriterion("workstation <>", value, "workstation");
            return (Criteria) this;
        }

        public Criteria andWorkstationGreaterThan(String value) {
            addCriterion("workstation >", value, "workstation");
            return (Criteria) this;
        }

        public Criteria andWorkstationGreaterThanOrEqualTo(String value) {
            addCriterion("workstation >=", value, "workstation");
            return (Criteria) this;
        }

        public Criteria andWorkstationLessThan(String value) {
            addCriterion("workstation <", value, "workstation");
            return (Criteria) this;
        }

        public Criteria andWorkstationLessThanOrEqualTo(String value) {
            addCriterion("workstation <=", value, "workstation");
            return (Criteria) this;
        }

        public Criteria andWorkstationLike(String value) {
            addCriterion("workstation like", value, "workstation");
            return (Criteria) this;
        }

        public Criteria andWorkstationNotLike(String value) {
            addCriterion("workstation not like", value, "workstation");
            return (Criteria) this;
        }

        public Criteria andWorkstationIn(List<String> values) {
            addCriterion("workstation in", values, "workstation");
            return (Criteria) this;
        }

        public Criteria andWorkstationNotIn(List<String> values) {
            addCriterion("workstation not in", values, "workstation");
            return (Criteria) this;
        }

        public Criteria andWorkstationBetween(String value1, String value2) {
            addCriterion("workstation between", value1, value2, "workstation");
            return (Criteria) this;
        }

        public Criteria andWorkstationNotBetween(String value1, String value2) {
            addCriterion("workstation not between", value1, value2, "workstation");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameIsNull() {
            addCriterion("departmentname is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameIsNotNull() {
            addCriterion("departmentname is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameEqualTo(String value) {
            addCriterion("departmentname =", value, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameNotEqualTo(String value) {
            addCriterion("departmentname <>", value, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameGreaterThan(String value) {
            addCriterion("departmentname >", value, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameGreaterThanOrEqualTo(String value) {
            addCriterion("departmentname >=", value, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameLessThan(String value) {
            addCriterion("departmentname <", value, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameLessThanOrEqualTo(String value) {
            addCriterion("departmentname <=", value, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameLike(String value) {
            addCriterion("departmentname like", value, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameNotLike(String value) {
            addCriterion("departmentname not like", value, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameIn(List<String> values) {
            addCriterion("departmentname in", values, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameNotIn(List<String> values) {
            addCriterion("departmentname not in", values, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameBetween(String value1, String value2) {
            addCriterion("departmentname between", value1, value2, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameNotBetween(String value1, String value2) {
            addCriterion("departmentname not between", value1, value2, "departmentname");
            return (Criteria) this;
        }

        public Criteria andInspectionhumanidIsNull() {
            addCriterion("inspectionhumanid is null");
            return (Criteria) this;
        }

        public Criteria andInspectionhumanidIsNotNull() {
            addCriterion("inspectionhumanid is not null");
            return (Criteria) this;
        }

        public Criteria andInspectionhumanidEqualTo(Integer value) {
            addCriterion("inspectionhumanid =", value, "inspectionhumanid");
            return (Criteria) this;
        }

        public Criteria andInspectionhumanidNotEqualTo(Integer value) {
            addCriterion("inspectionhumanid <>", value, "inspectionhumanid");
            return (Criteria) this;
        }

        public Criteria andInspectionhumanidGreaterThan(Integer value) {
            addCriterion("inspectionhumanid >", value, "inspectionhumanid");
            return (Criteria) this;
        }

        public Criteria andInspectionhumanidGreaterThanOrEqualTo(Integer value) {
            addCriterion("inspectionhumanid >=", value, "inspectionhumanid");
            return (Criteria) this;
        }

        public Criteria andInspectionhumanidLessThan(Integer value) {
            addCriterion("inspectionhumanid <", value, "inspectionhumanid");
            return (Criteria) this;
        }

        public Criteria andInspectionhumanidLessThanOrEqualTo(Integer value) {
            addCriterion("inspectionhumanid <=", value, "inspectionhumanid");
            return (Criteria) this;
        }

        public Criteria andInspectionhumanidIn(List<Integer> values) {
            addCriterion("inspectionhumanid in", values, "inspectionhumanid");
            return (Criteria) this;
        }

        public Criteria andInspectionhumanidNotIn(List<Integer> values) {
            addCriterion("inspectionhumanid not in", values, "inspectionhumanid");
            return (Criteria) this;
        }

        public Criteria andInspectionhumanidBetween(Integer value1, Integer value2) {
            addCriterion("inspectionhumanid between", value1, value2, "inspectionhumanid");
            return (Criteria) this;
        }

        public Criteria andInspectionhumanidNotBetween(Integer value1, Integer value2) {
            addCriterion("inspectionhumanid not between", value1, value2, "inspectionhumanid");
            return (Criteria) this;
        }

        public Criteria andFactorycodeIsNull() {
            addCriterion("factorycode is null");
            return (Criteria) this;
        }

        public Criteria andFactorycodeIsNotNull() {
            addCriterion("factorycode is not null");
            return (Criteria) this;
        }

        public Criteria andFactorycodeEqualTo(String value) {
            addCriterion("factorycode =", value, "factorycode");
            return (Criteria) this;
        }

        public Criteria andFactorycodeNotEqualTo(String value) {
            addCriterion("factorycode <>", value, "factorycode");
            return (Criteria) this;
        }

        public Criteria andFactorycodeGreaterThan(String value) {
            addCriterion("factorycode >", value, "factorycode");
            return (Criteria) this;
        }

        public Criteria andFactorycodeGreaterThanOrEqualTo(String value) {
            addCriterion("factorycode >=", value, "factorycode");
            return (Criteria) this;
        }

        public Criteria andFactorycodeLessThan(String value) {
            addCriterion("factorycode <", value, "factorycode");
            return (Criteria) this;
        }

        public Criteria andFactorycodeLessThanOrEqualTo(String value) {
            addCriterion("factorycode <=", value, "factorycode");
            return (Criteria) this;
        }

        public Criteria andFactorycodeLike(String value) {
            addCriterion("factorycode like", value, "factorycode");
            return (Criteria) this;
        }

        public Criteria andFactorycodeNotLike(String value) {
            addCriterion("factorycode not like", value, "factorycode");
            return (Criteria) this;
        }

        public Criteria andFactorycodeIn(List<String> values) {
            addCriterion("factorycode in", values, "factorycode");
            return (Criteria) this;
        }

        public Criteria andFactorycodeNotIn(List<String> values) {
            addCriterion("factorycode not in", values, "factorycode");
            return (Criteria) this;
        }

        public Criteria andFactorycodeBetween(String value1, String value2) {
            addCriterion("factorycode between", value1, value2, "factorycode");
            return (Criteria) this;
        }

        public Criteria andFactorycodeNotBetween(String value1, String value2) {
            addCriterion("factorycode not between", value1, value2, "factorycode");
            return (Criteria) this;
        }

        public Criteria andChangepasswordIsNull() {
            addCriterion("changepassword is null");
            return (Criteria) this;
        }

        public Criteria andChangepasswordIsNotNull() {
            addCriterion("changepassword is not null");
            return (Criteria) this;
        }

        public Criteria andChangepasswordEqualTo(Integer value) {
            addCriterion("changepassword =", value, "changepassword");
            return (Criteria) this;
        }

        public Criteria andChangepasswordNotEqualTo(Integer value) {
            addCriterion("changepassword <>", value, "changepassword");
            return (Criteria) this;
        }

        public Criteria andChangepasswordGreaterThan(Integer value) {
            addCriterion("changepassword >", value, "changepassword");
            return (Criteria) this;
        }

        public Criteria andChangepasswordGreaterThanOrEqualTo(Integer value) {
            addCriterion("changepassword >=", value, "changepassword");
            return (Criteria) this;
        }

        public Criteria andChangepasswordLessThan(Integer value) {
            addCriterion("changepassword <", value, "changepassword");
            return (Criteria) this;
        }

        public Criteria andChangepasswordLessThanOrEqualTo(Integer value) {
            addCriterion("changepassword <=", value, "changepassword");
            return (Criteria) this;
        }

        public Criteria andChangepasswordIn(List<Integer> values) {
            addCriterion("changepassword in", values, "changepassword");
            return (Criteria) this;
        }

        public Criteria andChangepasswordNotIn(List<Integer> values) {
            addCriterion("changepassword not in", values, "changepassword");
            return (Criteria) this;
        }

        public Criteria andChangepasswordBetween(Integer value1, Integer value2) {
            addCriterion("changepassword between", value1, value2, "changepassword");
            return (Criteria) this;
        }

        public Criteria andChangepasswordNotBetween(Integer value1, Integer value2) {
            addCriterion("changepassword not between", value1, value2, "changepassword");
            return (Criteria) this;
        }

        public Criteria andInspectionhumankeyIsNull() {
            addCriterion("inspectionhumankey is null");
            return (Criteria) this;
        }

        public Criteria andInspectionhumankeyIsNotNull() {
            addCriterion("inspectionhumankey is not null");
            return (Criteria) this;
        }

        public Criteria andInspectionhumankeyEqualTo(String value) {
            addCriterion("inspectionhumankey =", value, "inspectionhumankey");
            return (Criteria) this;
        }

        public Criteria andInspectionhumankeyNotEqualTo(String value) {
            addCriterion("inspectionhumankey <>", value, "inspectionhumankey");
            return (Criteria) this;
        }

        public Criteria andInspectionhumankeyGreaterThan(String value) {
            addCriterion("inspectionhumankey >", value, "inspectionhumankey");
            return (Criteria) this;
        }

        public Criteria andInspectionhumankeyGreaterThanOrEqualTo(String value) {
            addCriterion("inspectionhumankey >=", value, "inspectionhumankey");
            return (Criteria) this;
        }

        public Criteria andInspectionhumankeyLessThan(String value) {
            addCriterion("inspectionhumankey <", value, "inspectionhumankey");
            return (Criteria) this;
        }

        public Criteria andInspectionhumankeyLessThanOrEqualTo(String value) {
            addCriterion("inspectionhumankey <=", value, "inspectionhumankey");
            return (Criteria) this;
        }

        public Criteria andInspectionhumankeyLike(String value) {
            addCriterion("inspectionhumankey like", value, "inspectionhumankey");
            return (Criteria) this;
        }

        public Criteria andInspectionhumankeyNotLike(String value) {
            addCriterion("inspectionhumankey not like", value, "inspectionhumankey");
            return (Criteria) this;
        }

        public Criteria andInspectionhumankeyIn(List<String> values) {
            addCriterion("inspectionhumankey in", values, "inspectionhumankey");
            return (Criteria) this;
        }

        public Criteria andInspectionhumankeyNotIn(List<String> values) {
            addCriterion("inspectionhumankey not in", values, "inspectionhumankey");
            return (Criteria) this;
        }

        public Criteria andInspectionhumankeyBetween(String value1, String value2) {
            addCriterion("inspectionhumankey between", value1, value2, "inspectionhumankey");
            return (Criteria) this;
        }

        public Criteria andInspectionhumankeyNotBetween(String value1, String value2) {
            addCriterion("inspectionhumankey not between", value1, value2, "inspectionhumankey");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria implements Serializable {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion implements Serializable {
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