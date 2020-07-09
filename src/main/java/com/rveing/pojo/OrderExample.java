package com.rveing.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderExample() {
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

        public Criteria andOrderCodeIsNull() {
            addCriterion("orderCode is null");
            return (Criteria) this;
        }

        public Criteria andOrderCodeIsNotNull() {
            addCriterion("orderCode is not null");
            return (Criteria) this;
        }

        public Criteria andOrderCodeEqualTo(String value) {
            addCriterion("orderCode =", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeNotEqualTo(String value) {
            addCriterion("orderCode <>", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeGreaterThan(String value) {
            addCriterion("orderCode >", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeGreaterThanOrEqualTo(String value) {
            addCriterion("orderCode >=", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeLessThan(String value) {
            addCriterion("orderCode <", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeLessThanOrEqualTo(String value) {
            addCriterion("orderCode <=", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeLike(String value) {
            addCriterion("orderCode like", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeNotLike(String value) {
            addCriterion("orderCode not like", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeIn(List<String> values) {
            addCriterion("orderCode in", values, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeNotIn(List<String> values) {
            addCriterion("orderCode not in", values, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeBetween(String value1, String value2) {
            addCriterion("orderCode between", value1, value2, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeNotBetween(String value1, String value2) {
            addCriterion("orderCode not between", value1, value2, "orderCode");
            return (Criteria) this;
        }

        public Criteria andReceiverIsNull() {
            addCriterion("receiver is null");
            return (Criteria) this;
        }

        public Criteria andReceiverIsNotNull() {
            addCriterion("receiver is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverEqualTo(String value) {
            addCriterion("receiver =", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverNotEqualTo(String value) {
            addCriterion("receiver <>", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverGreaterThan(String value) {
            addCriterion("receiver >", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverGreaterThanOrEqualTo(String value) {
            addCriterion("receiver >=", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverLessThan(String value) {
            addCriterion("receiver <", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverLessThanOrEqualTo(String value) {
            addCriterion("receiver <=", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverLike(String value) {
            addCriterion("receiver like", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverNotLike(String value) {
            addCriterion("receiver not like", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverIn(List<String> values) {
            addCriterion("receiver in", values, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverNotIn(List<String> values) {
            addCriterion("receiver not in", values, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverBetween(String value1, String value2) {
            addCriterion("receiver between", value1, value2, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverNotBetween(String value1, String value2) {
            addCriterion("receiver not between", value1, value2, "receiver");
            return (Criteria) this;
        }

        public Criteria andId_numberIsNull() {
            addCriterion("id_number is null");
            return (Criteria) this;
        }

        public Criteria andId_numberIsNotNull() {
            addCriterion("id_number is not null");
            return (Criteria) this;
        }

        public Criteria andId_numberEqualTo(Integer value) {
            addCriterion("id_number =", value, "id_number");
            return (Criteria) this;
        }

        public Criteria andId_numberNotEqualTo(Integer value) {
            addCriterion("id_number <>", value, "id_number");
            return (Criteria) this;
        }

        public Criteria andId_numberGreaterThan(Integer value) {
            addCriterion("id_number >", value, "id_number");
            return (Criteria) this;
        }

        public Criteria andId_numberGreaterThanOrEqualTo(Integer value) {
            addCriterion("id_number >=", value, "id_number");
            return (Criteria) this;
        }

        public Criteria andId_numberLessThan(Integer value) {
            addCriterion("id_number <", value, "id_number");
            return (Criteria) this;
        }

        public Criteria andId_numberLessThanOrEqualTo(Integer value) {
            addCriterion("id_number <=", value, "id_number");
            return (Criteria) this;
        }

        public Criteria andId_numberIn(List<Integer> values) {
            addCriterion("id_number in", values, "id_number");
            return (Criteria) this;
        }

        public Criteria andId_numberNotIn(List<Integer> values) {
            addCriterion("id_number not in", values, "id_number");
            return (Criteria) this;
        }

        public Criteria andId_numberBetween(Integer value1, Integer value2) {
            addCriterion("id_number between", value1, value2, "id_number");
            return (Criteria) this;
        }

        public Criteria andId_numberNotBetween(Integer value1, Integer value2) {
            addCriterion("id_number not between", value1, value2, "id_number");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(Integer value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(Integer value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(Integer value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(Integer value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(Integer value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<Integer> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<Integer> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(Integer value1, Integer value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(Integer value1, Integer value2) {
            addCriterion("uid not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andSidIsNull() {
            addCriterion("sid is null");
            return (Criteria) this;
        }

        public Criteria andSidIsNotNull() {
            addCriterion("sid is not null");
            return (Criteria) this;
        }

        public Criteria andSidEqualTo(Integer value) {
            addCriterion("sid =", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotEqualTo(Integer value) {
            addCriterion("sid <>", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThan(Integer value) {
            addCriterion("sid >", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sid >=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThan(Integer value) {
            addCriterion("sid <", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThanOrEqualTo(Integer value) {
            addCriterion("sid <=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidIn(List<Integer> values) {
            addCriterion("sid in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotIn(List<Integer> values) {
            addCriterion("sid not in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidBetween(Integer value1, Integer value2) {
            addCriterion("sid between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotBetween(Integer value1, Integer value2) {
            addCriterion("sid not between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andLidIsNull() {
            addCriterion("lid is null");
            return (Criteria) this;
        }

        public Criteria andLidIsNotNull() {
            addCriterion("lid is not null");
            return (Criteria) this;
        }

        public Criteria andLidEqualTo(Integer value) {
            addCriterion("lid =", value, "lid");
            return (Criteria) this;
        }

        public Criteria andLidNotEqualTo(Integer value) {
            addCriterion("lid <>", value, "lid");
            return (Criteria) this;
        }

        public Criteria andLidGreaterThan(Integer value) {
            addCriterion("lid >", value, "lid");
            return (Criteria) this;
        }

        public Criteria andLidGreaterThanOrEqualTo(Integer value) {
            addCriterion("lid >=", value, "lid");
            return (Criteria) this;
        }

        public Criteria andLidLessThan(Integer value) {
            addCriterion("lid <", value, "lid");
            return (Criteria) this;
        }

        public Criteria andLidLessThanOrEqualTo(Integer value) {
            addCriterion("lid <=", value, "lid");
            return (Criteria) this;
        }

        public Criteria andLidIn(List<Integer> values) {
            addCriterion("lid in", values, "lid");
            return (Criteria) this;
        }

        public Criteria andLidNotIn(List<Integer> values) {
            addCriterion("lid not in", values, "lid");
            return (Criteria) this;
        }

        public Criteria andLidBetween(Integer value1, Integer value2) {
            addCriterion("lid between", value1, value2, "lid");
            return (Criteria) this;
        }

        public Criteria andLidNotBetween(Integer value1, Integer value2) {
            addCriterion("lid not between", value1, value2, "lid");
            return (Criteria) this;
        }

        public Criteria andHidIsNull() {
            addCriterion("hid is null");
            return (Criteria) this;
        }

        public Criteria andHidIsNotNull() {
            addCriterion("hid is not null");
            return (Criteria) this;
        }

        public Criteria andHidEqualTo(Integer value) {
            addCriterion("hid =", value, "hid");
            return (Criteria) this;
        }

        public Criteria andHidNotEqualTo(Integer value) {
            addCriterion("hid <>", value, "hid");
            return (Criteria) this;
        }

        public Criteria andHidGreaterThan(Integer value) {
            addCriterion("hid >", value, "hid");
            return (Criteria) this;
        }

        public Criteria andHidGreaterThanOrEqualTo(Integer value) {
            addCriterion("hid >=", value, "hid");
            return (Criteria) this;
        }

        public Criteria andHidLessThan(Integer value) {
            addCriterion("hid <", value, "hid");
            return (Criteria) this;
        }

        public Criteria andHidLessThanOrEqualTo(Integer value) {
            addCriterion("hid <=", value, "hid");
            return (Criteria) this;
        }

        public Criteria andHidIn(List<Integer> values) {
            addCriterion("hid in", values, "hid");
            return (Criteria) this;
        }

        public Criteria andHidNotIn(List<Integer> values) {
            addCriterion("hid not in", values, "hid");
            return (Criteria) this;
        }

        public Criteria andHidBetween(Integer value1, Integer value2) {
            addCriterion("hid between", value1, value2, "hid");
            return (Criteria) this;
        }

        public Criteria andHidNotBetween(Integer value1, Integer value2) {
            addCriterion("hid not between", value1, value2, "hid");
            return (Criteria) this;
        }

        public Criteria andNumberIsNull() {
            addCriterion("number is null");
            return (Criteria) this;
        }

        public Criteria andNumberIsNotNull() {
            addCriterion("number is not null");
            return (Criteria) this;
        }

        public Criteria andNumberEqualTo(Integer value) {
            addCriterion("number =", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotEqualTo(Integer value) {
            addCriterion("number <>", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThan(Integer value) {
            addCriterion("number >", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("number >=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThan(Integer value) {
            addCriterion("number <", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThanOrEqualTo(Integer value) {
            addCriterion("number <=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberIn(List<Integer> values) {
            addCriterion("number in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotIn(List<Integer> values) {
            addCriterion("number not in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberBetween(Integer value1, Integer value2) {
            addCriterion("number between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("number not between", value1, value2, "number");
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

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andTotalIsNull() {
            addCriterion("total is null");
            return (Criteria) this;
        }

        public Criteria andTotalIsNotNull() {
            addCriterion("total is not null");
            return (Criteria) this;
        }

        public Criteria andTotalEqualTo(Float value) {
            addCriterion("total =", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotEqualTo(Float value) {
            addCriterion("total <>", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThan(Float value) {
            addCriterion("total >", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThanOrEqualTo(Float value) {
            addCriterion("total >=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThan(Float value) {
            addCriterion("total <", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThanOrEqualTo(Float value) {
            addCriterion("total <=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalIn(List<Float> values) {
            addCriterion("total in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotIn(List<Float> values) {
            addCriterion("total not in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalBetween(Float value1, Float value2) {
            addCriterion("total between", value1, value2, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotBetween(Float value1, Float value2) {
            addCriterion("total not between", value1, value2, "total");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("createDate is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("createDate is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("createDate =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("createDate <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("createDate >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("createDate >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("createDate <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("createDate <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("createDate in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("createDate not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("createDate between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("createDate not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andPayDateIsNull() {
            addCriterion("payDate is null");
            return (Criteria) this;
        }

        public Criteria andPayDateIsNotNull() {
            addCriterion("payDate is not null");
            return (Criteria) this;
        }

        public Criteria andPayDateEqualTo(Date value) {
            addCriterion("payDate =", value, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateNotEqualTo(Date value) {
            addCriterion("payDate <>", value, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateGreaterThan(Date value) {
            addCriterion("payDate >", value, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateGreaterThanOrEqualTo(Date value) {
            addCriterion("payDate >=", value, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateLessThan(Date value) {
            addCriterion("payDate <", value, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateLessThanOrEqualTo(Date value) {
            addCriterion("payDate <=", value, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateIn(List<Date> values) {
            addCriterion("payDate in", values, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateNotIn(List<Date> values) {
            addCriterion("payDate not in", values, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateBetween(Date value1, Date value2) {
            addCriterion("payDate between", value1, value2, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateNotBetween(Date value1, Date value2) {
            addCriterion("payDate not between", value1, value2, "payDate");
            return (Criteria) this;
        }

        public Criteria andInDateIsNull() {
            addCriterion("inDate is null");
            return (Criteria) this;
        }

        public Criteria andInDateIsNotNull() {
            addCriterion("inDate is not null");
            return (Criteria) this;
        }

        public Criteria andInDateEqualTo(Date value) {
            addCriterion("inDate =", value, "inDate");
            return (Criteria) this;
        }

        public Criteria andInDateNotEqualTo(Date value) {
            addCriterion("inDate <>", value, "inDate");
            return (Criteria) this;
        }

        public Criteria andInDateGreaterThan(Date value) {
            addCriterion("inDate >", value, "inDate");
            return (Criteria) this;
        }

        public Criteria andInDateGreaterThanOrEqualTo(Date value) {
            addCriterion("inDate >=", value, "inDate");
            return (Criteria) this;
        }

        public Criteria andInDateLessThan(Date value) {
            addCriterion("inDate <", value, "inDate");
            return (Criteria) this;
        }

        public Criteria andInDateLessThanOrEqualTo(Date value) {
            addCriterion("inDate <=", value, "inDate");
            return (Criteria) this;
        }

        public Criteria andInDateIn(List<Date> values) {
            addCriterion("inDate in", values, "inDate");
            return (Criteria) this;
        }

        public Criteria andInDateNotIn(List<Date> values) {
            addCriterion("inDate not in", values, "inDate");
            return (Criteria) this;
        }

        public Criteria andInDateBetween(Date value1, Date value2) {
            addCriterion("inDate between", value1, value2, "inDate");
            return (Criteria) this;
        }

        public Criteria andInDateNotBetween(Date value1, Date value2) {
            addCriterion("inDate not between", value1, value2, "inDate");
            return (Criteria) this;
        }

        public Criteria andOutDateIsNull() {
            addCriterion("outDate is null");
            return (Criteria) this;
        }

        public Criteria andOutDateIsNotNull() {
            addCriterion("outDate is not null");
            return (Criteria) this;
        }

        public Criteria andOutDateEqualTo(Date value) {
            addCriterion("outDate =", value, "outDate");
            return (Criteria) this;
        }

        public Criteria andOutDateNotEqualTo(Date value) {
            addCriterion("outDate <>", value, "outDate");
            return (Criteria) this;
        }

        public Criteria andOutDateGreaterThan(Date value) {
            addCriterion("outDate >", value, "outDate");
            return (Criteria) this;
        }

        public Criteria andOutDateGreaterThanOrEqualTo(Date value) {
            addCriterion("outDate >=", value, "outDate");
            return (Criteria) this;
        }

        public Criteria andOutDateLessThan(Date value) {
            addCriterion("outDate <", value, "outDate");
            return (Criteria) this;
        }

        public Criteria andOutDateLessThanOrEqualTo(Date value) {
            addCriterion("outDate <=", value, "outDate");
            return (Criteria) this;
        }

        public Criteria andOutDateIn(List<Date> values) {
            addCriterion("outDate in", values, "outDate");
            return (Criteria) this;
        }

        public Criteria andOutDateNotIn(List<Date> values) {
            addCriterion("outDate not in", values, "outDate");
            return (Criteria) this;
        }

        public Criteria andOutDateBetween(Date value1, Date value2) {
            addCriterion("outDate between", value1, value2, "outDate");
            return (Criteria) this;
        }

        public Criteria andOutDateNotBetween(Date value1, Date value2) {
            addCriterion("outDate not between", value1, value2, "outDate");
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