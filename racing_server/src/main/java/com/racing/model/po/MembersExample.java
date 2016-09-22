package com.racing.model.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class MembersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MembersExample() {
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andWechatClientIdIsNull() {
            addCriterion("wechat_client_id is null");
            return (Criteria) this;
        }

        public Criteria andWechatClientIdIsNotNull() {
            addCriterion("wechat_client_id is not null");
            return (Criteria) this;
        }

        public Criteria andWechatClientIdEqualTo(String value) {
            addCriterion("wechat_client_id =", value, "wechatClientId");
            return (Criteria) this;
        }

        public Criteria andWechatClientIdNotEqualTo(String value) {
            addCriterion("wechat_client_id <>", value, "wechatClientId");
            return (Criteria) this;
        }

        public Criteria andWechatClientIdGreaterThan(String value) {
            addCriterion("wechat_client_id >", value, "wechatClientId");
            return (Criteria) this;
        }

        public Criteria andWechatClientIdGreaterThanOrEqualTo(String value) {
            addCriterion("wechat_client_id >=", value, "wechatClientId");
            return (Criteria) this;
        }

        public Criteria andWechatClientIdLessThan(String value) {
            addCriterion("wechat_client_id <", value, "wechatClientId");
            return (Criteria) this;
        }

        public Criteria andWechatClientIdLessThanOrEqualTo(String value) {
            addCriterion("wechat_client_id <=", value, "wechatClientId");
            return (Criteria) this;
        }

        public Criteria andWechatClientIdLike(String value) {
            addCriterion("wechat_client_id like", value, "wechatClientId");
            return (Criteria) this;
        }

        public Criteria andWechatClientIdNotLike(String value) {
            addCriterion("wechat_client_id not like", value, "wechatClientId");
            return (Criteria) this;
        }

        public Criteria andWechatClientIdIn(List<String> values) {
            addCriterion("wechat_client_id in", values, "wechatClientId");
            return (Criteria) this;
        }

        public Criteria andWechatClientIdNotIn(List<String> values) {
            addCriterion("wechat_client_id not in", values, "wechatClientId");
            return (Criteria) this;
        }

        public Criteria andWechatClientIdBetween(String value1, String value2) {
            addCriterion("wechat_client_id between", value1, value2, "wechatClientId");
            return (Criteria) this;
        }

        public Criteria andWechatClientIdNotBetween(String value1, String value2) {
            addCriterion("wechat_client_id not between", value1, value2, "wechatClientId");
            return (Criteria) this;
        }

        public Criteria andGroupSnIsNull() {
            addCriterion("group_sn is null");
            return (Criteria) this;
        }

        public Criteria andGroupSnIsNotNull() {
            addCriterion("group_sn is not null");
            return (Criteria) this;
        }

        public Criteria andGroupSnEqualTo(String value) {
            addCriterion("group_sn =", value, "groupSn");
            return (Criteria) this;
        }

        public Criteria andGroupSnNotEqualTo(String value) {
            addCriterion("group_sn <>", value, "groupSn");
            return (Criteria) this;
        }

        public Criteria andGroupSnGreaterThan(String value) {
            addCriterion("group_sn >", value, "groupSn");
            return (Criteria) this;
        }

        public Criteria andGroupSnGreaterThanOrEqualTo(String value) {
            addCriterion("group_sn >=", value, "groupSn");
            return (Criteria) this;
        }

        public Criteria andGroupSnLessThan(String value) {
            addCriterion("group_sn <", value, "groupSn");
            return (Criteria) this;
        }

        public Criteria andGroupSnLessThanOrEqualTo(String value) {
            addCriterion("group_sn <=", value, "groupSn");
            return (Criteria) this;
        }

        public Criteria andGroupSnLike(String value) {
            addCriterion("group_sn like", value, "groupSn");
            return (Criteria) this;
        }

        public Criteria andGroupSnNotLike(String value) {
            addCriterion("group_sn not like", value, "groupSn");
            return (Criteria) this;
        }

        public Criteria andGroupSnIn(List<String> values) {
            addCriterion("group_sn in", values, "groupSn");
            return (Criteria) this;
        }

        public Criteria andGroupSnNotIn(List<String> values) {
            addCriterion("group_sn not in", values, "groupSn");
            return (Criteria) this;
        }

        public Criteria andGroupSnBetween(String value1, String value2) {
            addCriterion("group_sn between", value1, value2, "groupSn");
            return (Criteria) this;
        }

        public Criteria andGroupSnNotBetween(String value1, String value2) {
            addCriterion("group_sn not between", value1, value2, "groupSn");
            return (Criteria) this;
        }

        public Criteria andWechatSnIsNull() {
            addCriterion("wechat_sn is null");
            return (Criteria) this;
        }

        public Criteria andWechatSnIsNotNull() {
            addCriterion("wechat_sn is not null");
            return (Criteria) this;
        }

        public Criteria andWechatSnEqualTo(String value) {
            addCriterion("wechat_sn =", value, "wechatSn");
            return (Criteria) this;
        }

        public Criteria andWechatSnNotEqualTo(String value) {
            addCriterion("wechat_sn <>", value, "wechatSn");
            return (Criteria) this;
        }

        public Criteria andWechatSnGreaterThan(String value) {
            addCriterion("wechat_sn >", value, "wechatSn");
            return (Criteria) this;
        }

        public Criteria andWechatSnGreaterThanOrEqualTo(String value) {
            addCriterion("wechat_sn >=", value, "wechatSn");
            return (Criteria) this;
        }

        public Criteria andWechatSnLessThan(String value) {
            addCriterion("wechat_sn <", value, "wechatSn");
            return (Criteria) this;
        }

        public Criteria andWechatSnLessThanOrEqualTo(String value) {
            addCriterion("wechat_sn <=", value, "wechatSn");
            return (Criteria) this;
        }

        public Criteria andWechatSnLike(String value) {
            addCriterion("wechat_sn like", value, "wechatSn");
            return (Criteria) this;
        }

        public Criteria andWechatSnNotLike(String value) {
            addCriterion("wechat_sn not like", value, "wechatSn");
            return (Criteria) this;
        }

        public Criteria andWechatSnIn(List<String> values) {
            addCriterion("wechat_sn in", values, "wechatSn");
            return (Criteria) this;
        }

        public Criteria andWechatSnNotIn(List<String> values) {
            addCriterion("wechat_sn not in", values, "wechatSn");
            return (Criteria) this;
        }

        public Criteria andWechatSnBetween(String value1, String value2) {
            addCriterion("wechat_sn between", value1, value2, "wechatSn");
            return (Criteria) this;
        }

        public Criteria andWechatSnNotBetween(String value1, String value2) {
            addCriterion("wechat_sn not between", value1, value2, "wechatSn");
            return (Criteria) this;
        }

        public Criteria andPointsIsNull() {
            addCriterion("points is null");
            return (Criteria) this;
        }

        public Criteria andPointsIsNotNull() {
            addCriterion("points is not null");
            return (Criteria) this;
        }

        public Criteria andPointsEqualTo(BigDecimal value) {
            addCriterion("points =", value, "points");
            return (Criteria) this;
        }

        public Criteria andPointsNotEqualTo(BigDecimal value) {
            addCriterion("points <>", value, "points");
            return (Criteria) this;
        }

        public Criteria andPointsGreaterThan(BigDecimal value) {
            addCriterion("points >", value, "points");
            return (Criteria) this;
        }

        public Criteria andPointsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("points >=", value, "points");
            return (Criteria) this;
        }

        public Criteria andPointsLessThan(BigDecimal value) {
            addCriterion("points <", value, "points");
            return (Criteria) this;
        }

        public Criteria andPointsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("points <=", value, "points");
            return (Criteria) this;
        }

        public Criteria andPointsIn(List<BigDecimal> values) {
            addCriterion("points in", values, "points");
            return (Criteria) this;
        }

        public Criteria andPointsNotIn(List<BigDecimal> values) {
            addCriterion("points not in", values, "points");
            return (Criteria) this;
        }

        public Criteria andPointsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("points between", value1, value2, "points");
            return (Criteria) this;
        }

        public Criteria andPointsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("points not between", value1, value2, "points");
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