package com.test.erp.dao.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class BossPopedomExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public BossPopedomExample() {
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andPopedomNameIsNull() {
            addCriterion("popedom_name is null");
            return (Criteria) this;
        }

        public Criteria andPopedomNameIsNotNull() {
            addCriterion("popedom_name is not null");
            return (Criteria) this;
        }

        public Criteria andPopedomNameEqualTo(String value) {
            addCriterion("popedom_name =", value, "popedomName");
            return (Criteria) this;
        }

        public Criteria andPopedomNameNotEqualTo(String value) {
            addCriterion("popedom_name <>", value, "popedomName");
            return (Criteria) this;
        }

        public Criteria andPopedomNameGreaterThan(String value) {
            addCriterion("popedom_name >", value, "popedomName");
            return (Criteria) this;
        }

        public Criteria andPopedomNameGreaterThanOrEqualTo(String value) {
            addCriterion("popedom_name >=", value, "popedomName");
            return (Criteria) this;
        }

        public Criteria andPopedomNameLessThan(String value) {
            addCriterion("popedom_name <", value, "popedomName");
            return (Criteria) this;
        }

        public Criteria andPopedomNameLessThanOrEqualTo(String value) {
            addCriterion("popedom_name <=", value, "popedomName");
            return (Criteria) this;
        }

        public Criteria andPopedomNameLike(String value) {
            addCriterion("popedom_name like", value, "popedomName");
            return (Criteria) this;
        }

        public Criteria andPopedomNameNotLike(String value) {
            addCriterion("popedom_name not like", value, "popedomName");
            return (Criteria) this;
        }

        public Criteria andPopedomNameIn(List<String> values) {
            addCriterion("popedom_name in", values, "popedomName");
            return (Criteria) this;
        }

        public Criteria andPopedomNameNotIn(List<String> values) {
            addCriterion("popedom_name not in", values, "popedomName");
            return (Criteria) this;
        }

        public Criteria andPopedomNameBetween(String value1, String value2) {
            addCriterion("popedom_name between", value1, value2, "popedomName");
            return (Criteria) this;
        }

        public Criteria andPopedomNameNotBetween(String value1, String value2) {
            addCriterion("popedom_name not between", value1, value2, "popedomName");
            return (Criteria) this;
        }

        public Criteria andPopedomTypeIsNull() {
            addCriterion("popedom_type is null");
            return (Criteria) this;
        }

        public Criteria andPopedomTypeIsNotNull() {
            addCriterion("popedom_type is not null");
            return (Criteria) this;
        }

        public Criteria andPopedomTypeEqualTo(String value) {
            addCriterion("popedom_type =", value, "popedomType");
            return (Criteria) this;
        }

        public Criteria andPopedomTypeNotEqualTo(String value) {
            addCriterion("popedom_type <>", value, "popedomType");
            return (Criteria) this;
        }

        public Criteria andPopedomTypeGreaterThan(String value) {
            addCriterion("popedom_type >", value, "popedomType");
            return (Criteria) this;
        }

        public Criteria andPopedomTypeGreaterThanOrEqualTo(String value) {
            addCriterion("popedom_type >=", value, "popedomType");
            return (Criteria) this;
        }

        public Criteria andPopedomTypeLessThan(String value) {
            addCriterion("popedom_type <", value, "popedomType");
            return (Criteria) this;
        }

        public Criteria andPopedomTypeLessThanOrEqualTo(String value) {
            addCriterion("popedom_type <=", value, "popedomType");
            return (Criteria) this;
        }

        public Criteria andPopedomTypeLike(String value) {
            addCriterion("popedom_type like", value, "popedomType");
            return (Criteria) this;
        }

        public Criteria andPopedomTypeNotLike(String value) {
            addCriterion("popedom_type not like", value, "popedomType");
            return (Criteria) this;
        }

        public Criteria andPopedomTypeIn(List<String> values) {
            addCriterion("popedom_type in", values, "popedomType");
            return (Criteria) this;
        }

        public Criteria andPopedomTypeNotIn(List<String> values) {
            addCriterion("popedom_type not in", values, "popedomType");
            return (Criteria) this;
        }

        public Criteria andPopedomTypeBetween(String value1, String value2) {
            addCriterion("popedom_type between", value1, value2, "popedomType");
            return (Criteria) this;
        }

        public Criteria andPopedomTypeNotBetween(String value1, String value2) {
            addCriterion("popedom_type not between", value1, value2, "popedomType");
            return (Criteria) this;
        }

        public Criteria andUrlIsNull() {
            addCriterion("url is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("url is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("url =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("url <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("url >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("url >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("url <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("url <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("url like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("url not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("url in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("url not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("url between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("url not between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andLvIsNull() {
            addCriterion("lv is null");
            return (Criteria) this;
        }

        public Criteria andLvIsNotNull() {
            addCriterion("lv is not null");
            return (Criteria) this;
        }

        public Criteria andLvEqualTo(Byte value) {
            addCriterion("lv =", value, "lv");
            return (Criteria) this;
        }

        public Criteria andLvNotEqualTo(Byte value) {
            addCriterion("lv <>", value, "lv");
            return (Criteria) this;
        }

        public Criteria andLvGreaterThan(Byte value) {
            addCriterion("lv >", value, "lv");
            return (Criteria) this;
        }

        public Criteria andLvGreaterThanOrEqualTo(Byte value) {
            addCriterion("lv >=", value, "lv");
            return (Criteria) this;
        }

        public Criteria andLvLessThan(Byte value) {
            addCriterion("lv <", value, "lv");
            return (Criteria) this;
        }

        public Criteria andLvLessThanOrEqualTo(Byte value) {
            addCriterion("lv <=", value, "lv");
            return (Criteria) this;
        }

        public Criteria andLvIn(List<Byte> values) {
            addCriterion("lv in", values, "lv");
            return (Criteria) this;
        }

        public Criteria andLvNotIn(List<Byte> values) {
            addCriterion("lv not in", values, "lv");
            return (Criteria) this;
        }

        public Criteria andLvBetween(Byte value1, Byte value2) {
            addCriterion("lv between", value1, value2, "lv");
            return (Criteria) this;
        }

        public Criteria andLvNotBetween(Byte value1, Byte value2) {
            addCriterion("lv not between", value1, value2, "lv");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNull() {
            addCriterion("parent_id is null");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNotNull() {
            addCriterion("parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andParentIdEqualTo(String value) {
            addCriterion("parent_id =", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotEqualTo(String value) {
            addCriterion("parent_id <>", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThan(String value) {
            addCriterion("parent_id >", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThanOrEqualTo(String value) {
            addCriterion("parent_id >=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThan(String value) {
            addCriterion("parent_id <", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThanOrEqualTo(String value) {
            addCriterion("parent_id <=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLike(String value) {
            addCriterion("parent_id like", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotLike(String value) {
            addCriterion("parent_id not like", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdIn(List<String> values) {
            addCriterion("parent_id in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotIn(List<String> values) {
            addCriterion("parent_id not in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdBetween(String value1, String value2) {
            addCriterion("parent_id between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotBetween(String value1, String value2) {
            addCriterion("parent_id not between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andCodeIsNull() {
            addCriterion("code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("code like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("code not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("code not between", value1, value2, "code");
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