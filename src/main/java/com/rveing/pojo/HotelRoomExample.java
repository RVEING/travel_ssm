package com.rveing.pojo;

import java.util.ArrayList;
import java.util.List;

public class HotelRoomExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HotelRoomExample() {
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

        public Criteria andRnameIsNull() {
            addCriterion("rname is null");
            return (Criteria) this;
        }

        public Criteria andRnameIsNotNull() {
            addCriterion("rname is not null");
            return (Criteria) this;
        }

        public Criteria andRnameEqualTo(String value) {
            addCriterion("rname =", value, "rname");
            return (Criteria) this;
        }

        public Criteria andRnameNotEqualTo(String value) {
            addCriterion("rname <>", value, "rname");
            return (Criteria) this;
        }

        public Criteria andRnameGreaterThan(String value) {
            addCriterion("rname >", value, "rname");
            return (Criteria) this;
        }

        public Criteria andRnameGreaterThanOrEqualTo(String value) {
            addCriterion("rname >=", value, "rname");
            return (Criteria) this;
        }

        public Criteria andRnameLessThan(String value) {
            addCriterion("rname <", value, "rname");
            return (Criteria) this;
        }

        public Criteria andRnameLessThanOrEqualTo(String value) {
            addCriterion("rname <=", value, "rname");
            return (Criteria) this;
        }

        public Criteria andRnameLike(String value) {
            addCriterion("rname like", value, "rname");
            return (Criteria) this;
        }

        public Criteria andRnameNotLike(String value) {
            addCriterion("rname not like", value, "rname");
            return (Criteria) this;
        }

        public Criteria andRnameIn(List<String> values) {
            addCriterion("rname in", values, "rname");
            return (Criteria) this;
        }

        public Criteria andRnameNotIn(List<String> values) {
            addCriterion("rname not in", values, "rname");
            return (Criteria) this;
        }

        public Criteria andRnameBetween(String value1, String value2) {
            addCriterion("rname between", value1, value2, "rname");
            return (Criteria) this;
        }

        public Criteria andRnameNotBetween(String value1, String value2) {
            addCriterion("rname not between", value1, value2, "rname");
            return (Criteria) this;
        }

        public Criteria andAreaIsNull() {
            addCriterion("area is null");
            return (Criteria) this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("area is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEqualTo(Integer value) {
            addCriterion("area =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(Integer value) {
            addCriterion("area <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(Integer value) {
            addCriterion("area >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(Integer value) {
            addCriterion("area >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(Integer value) {
            addCriterion("area <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(Integer value) {
            addCriterion("area <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<Integer> values) {
            addCriterion("area in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<Integer> values) {
            addCriterion("area not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(Integer value1, Integer value2) {
            addCriterion("area between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(Integer value1, Integer value2) {
            addCriterion("area not between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andPeopleNumIsNull() {
            addCriterion("peopleNum is null");
            return (Criteria) this;
        }

        public Criteria andPeopleNumIsNotNull() {
            addCriterion("peopleNum is not null");
            return (Criteria) this;
        }

        public Criteria andPeopleNumEqualTo(Integer value) {
            addCriterion("peopleNum =", value, "peopleNum");
            return (Criteria) this;
        }

        public Criteria andPeopleNumNotEqualTo(Integer value) {
            addCriterion("peopleNum <>", value, "peopleNum");
            return (Criteria) this;
        }

        public Criteria andPeopleNumGreaterThan(Integer value) {
            addCriterion("peopleNum >", value, "peopleNum");
            return (Criteria) this;
        }

        public Criteria andPeopleNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("peopleNum >=", value, "peopleNum");
            return (Criteria) this;
        }

        public Criteria andPeopleNumLessThan(Integer value) {
            addCriterion("peopleNum <", value, "peopleNum");
            return (Criteria) this;
        }

        public Criteria andPeopleNumLessThanOrEqualTo(Integer value) {
            addCriterion("peopleNum <=", value, "peopleNum");
            return (Criteria) this;
        }

        public Criteria andPeopleNumIn(List<Integer> values) {
            addCriterion("peopleNum in", values, "peopleNum");
            return (Criteria) this;
        }

        public Criteria andPeopleNumNotIn(List<Integer> values) {
            addCriterion("peopleNum not in", values, "peopleNum");
            return (Criteria) this;
        }

        public Criteria andPeopleNumBetween(Integer value1, Integer value2) {
            addCriterion("peopleNum between", value1, value2, "peopleNum");
            return (Criteria) this;
        }

        public Criteria andPeopleNumNotBetween(Integer value1, Integer value2) {
            addCriterion("peopleNum not between", value1, value2, "peopleNum");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Float value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Float value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Float value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Float value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Float value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Float value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Float> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Float> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Float value1, Float value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Float value1, Float value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andBedTypeIsNull() {
            addCriterion("bedType is null");
            return (Criteria) this;
        }

        public Criteria andBedTypeIsNotNull() {
            addCriterion("bedType is not null");
            return (Criteria) this;
        }

        public Criteria andBedTypeEqualTo(String value) {
            addCriterion("bedType =", value, "bedType");
            return (Criteria) this;
        }

        public Criteria andBedTypeNotEqualTo(String value) {
            addCriterion("bedType <>", value, "bedType");
            return (Criteria) this;
        }

        public Criteria andBedTypeGreaterThan(String value) {
            addCriterion("bedType >", value, "bedType");
            return (Criteria) this;
        }

        public Criteria andBedTypeGreaterThanOrEqualTo(String value) {
            addCriterion("bedType >=", value, "bedType");
            return (Criteria) this;
        }

        public Criteria andBedTypeLessThan(String value) {
            addCriterion("bedType <", value, "bedType");
            return (Criteria) this;
        }

        public Criteria andBedTypeLessThanOrEqualTo(String value) {
            addCriterion("bedType <=", value, "bedType");
            return (Criteria) this;
        }

        public Criteria andBedTypeLike(String value) {
            addCriterion("bedType like", value, "bedType");
            return (Criteria) this;
        }

        public Criteria andBedTypeNotLike(String value) {
            addCriterion("bedType not like", value, "bedType");
            return (Criteria) this;
        }

        public Criteria andBedTypeIn(List<String> values) {
            addCriterion("bedType in", values, "bedType");
            return (Criteria) this;
        }

        public Criteria andBedTypeNotIn(List<String> values) {
            addCriterion("bedType not in", values, "bedType");
            return (Criteria) this;
        }

        public Criteria andBedTypeBetween(String value1, String value2) {
            addCriterion("bedType between", value1, value2, "bedType");
            return (Criteria) this;
        }

        public Criteria andBedTypeNotBetween(String value1, String value2) {
            addCriterion("bedType not between", value1, value2, "bedType");
            return (Criteria) this;
        }

        public Criteria andBreakfastIsNull() {
            addCriterion("breakfast is null");
            return (Criteria) this;
        }

        public Criteria andBreakfastIsNotNull() {
            addCriterion("breakfast is not null");
            return (Criteria) this;
        }

        public Criteria andBreakfastEqualTo(String value) {
            addCriterion("breakfast =", value, "breakfast");
            return (Criteria) this;
        }

        public Criteria andBreakfastNotEqualTo(String value) {
            addCriterion("breakfast <>", value, "breakfast");
            return (Criteria) this;
        }

        public Criteria andBreakfastGreaterThan(String value) {
            addCriterion("breakfast >", value, "breakfast");
            return (Criteria) this;
        }

        public Criteria andBreakfastGreaterThanOrEqualTo(String value) {
            addCriterion("breakfast >=", value, "breakfast");
            return (Criteria) this;
        }

        public Criteria andBreakfastLessThan(String value) {
            addCriterion("breakfast <", value, "breakfast");
            return (Criteria) this;
        }

        public Criteria andBreakfastLessThanOrEqualTo(String value) {
            addCriterion("breakfast <=", value, "breakfast");
            return (Criteria) this;
        }

        public Criteria andBreakfastLike(String value) {
            addCriterion("breakfast like", value, "breakfast");
            return (Criteria) this;
        }

        public Criteria andBreakfastNotLike(String value) {
            addCriterion("breakfast not like", value, "breakfast");
            return (Criteria) this;
        }

        public Criteria andBreakfastIn(List<String> values) {
            addCriterion("breakfast in", values, "breakfast");
            return (Criteria) this;
        }

        public Criteria andBreakfastNotIn(List<String> values) {
            addCriterion("breakfast not in", values, "breakfast");
            return (Criteria) this;
        }

        public Criteria andBreakfastBetween(String value1, String value2) {
            addCriterion("breakfast between", value1, value2, "breakfast");
            return (Criteria) this;
        }

        public Criteria andBreakfastNotBetween(String value1, String value2) {
            addCriterion("breakfast not between", value1, value2, "breakfast");
            return (Criteria) this;
        }

        public Criteria andWindowIsNull() {
            addCriterion("window is null");
            return (Criteria) this;
        }

        public Criteria andWindowIsNotNull() {
            addCriterion("window is not null");
            return (Criteria) this;
        }

        public Criteria andWindowEqualTo(String value) {
            addCriterion("window =", value, "window");
            return (Criteria) this;
        }

        public Criteria andWindowNotEqualTo(String value) {
            addCriterion("window <>", value, "window");
            return (Criteria) this;
        }

        public Criteria andWindowGreaterThan(String value) {
            addCriterion("window >", value, "window");
            return (Criteria) this;
        }

        public Criteria andWindowGreaterThanOrEqualTo(String value) {
            addCriterion("window >=", value, "window");
            return (Criteria) this;
        }

        public Criteria andWindowLessThan(String value) {
            addCriterion("window <", value, "window");
            return (Criteria) this;
        }

        public Criteria andWindowLessThanOrEqualTo(String value) {
            addCriterion("window <=", value, "window");
            return (Criteria) this;
        }

        public Criteria andWindowLike(String value) {
            addCriterion("window like", value, "window");
            return (Criteria) this;
        }

        public Criteria andWindowNotLike(String value) {
            addCriterion("window not like", value, "window");
            return (Criteria) this;
        }

        public Criteria andWindowIn(List<String> values) {
            addCriterion("window in", values, "window");
            return (Criteria) this;
        }

        public Criteria andWindowNotIn(List<String> values) {
            addCriterion("window not in", values, "window");
            return (Criteria) this;
        }

        public Criteria andWindowBetween(String value1, String value2) {
            addCriterion("window between", value1, value2, "window");
            return (Criteria) this;
        }

        public Criteria andWindowNotBetween(String value1, String value2) {
            addCriterion("window not between", value1, value2, "window");
            return (Criteria) this;
        }

        public Criteria andBroadbandIsNull() {
            addCriterion("broadband is null");
            return (Criteria) this;
        }

        public Criteria andBroadbandIsNotNull() {
            addCriterion("broadband is not null");
            return (Criteria) this;
        }

        public Criteria andBroadbandEqualTo(String value) {
            addCriterion("broadband =", value, "broadband");
            return (Criteria) this;
        }

        public Criteria andBroadbandNotEqualTo(String value) {
            addCriterion("broadband <>", value, "broadband");
            return (Criteria) this;
        }

        public Criteria andBroadbandGreaterThan(String value) {
            addCriterion("broadband >", value, "broadband");
            return (Criteria) this;
        }

        public Criteria andBroadbandGreaterThanOrEqualTo(String value) {
            addCriterion("broadband >=", value, "broadband");
            return (Criteria) this;
        }

        public Criteria andBroadbandLessThan(String value) {
            addCriterion("broadband <", value, "broadband");
            return (Criteria) this;
        }

        public Criteria andBroadbandLessThanOrEqualTo(String value) {
            addCriterion("broadband <=", value, "broadband");
            return (Criteria) this;
        }

        public Criteria andBroadbandLike(String value) {
            addCriterion("broadband like", value, "broadband");
            return (Criteria) this;
        }

        public Criteria andBroadbandNotLike(String value) {
            addCriterion("broadband not like", value, "broadband");
            return (Criteria) this;
        }

        public Criteria andBroadbandIn(List<String> values) {
            addCriterion("broadband in", values, "broadband");
            return (Criteria) this;
        }

        public Criteria andBroadbandNotIn(List<String> values) {
            addCriterion("broadband not in", values, "broadband");
            return (Criteria) this;
        }

        public Criteria andBroadbandBetween(String value1, String value2) {
            addCriterion("broadband between", value1, value2, "broadband");
            return (Criteria) this;
        }

        public Criteria andBroadbandNotBetween(String value1, String value2) {
            addCriterion("broadband not between", value1, value2, "broadband");
            return (Criteria) this;
        }

        public Criteria andPolicyIsNull() {
            addCriterion("policy is null");
            return (Criteria) this;
        }

        public Criteria andPolicyIsNotNull() {
            addCriterion("policy is not null");
            return (Criteria) this;
        }

        public Criteria andPolicyEqualTo(String value) {
            addCriterion("policy =", value, "policy");
            return (Criteria) this;
        }

        public Criteria andPolicyNotEqualTo(String value) {
            addCriterion("policy <>", value, "policy");
            return (Criteria) this;
        }

        public Criteria andPolicyGreaterThan(String value) {
            addCriterion("policy >", value, "policy");
            return (Criteria) this;
        }

        public Criteria andPolicyGreaterThanOrEqualTo(String value) {
            addCriterion("policy >=", value, "policy");
            return (Criteria) this;
        }

        public Criteria andPolicyLessThan(String value) {
            addCriterion("policy <", value, "policy");
            return (Criteria) this;
        }

        public Criteria andPolicyLessThanOrEqualTo(String value) {
            addCriterion("policy <=", value, "policy");
            return (Criteria) this;
        }

        public Criteria andPolicyLike(String value) {
            addCriterion("policy like", value, "policy");
            return (Criteria) this;
        }

        public Criteria andPolicyNotLike(String value) {
            addCriterion("policy not like", value, "policy");
            return (Criteria) this;
        }

        public Criteria andPolicyIn(List<String> values) {
            addCriterion("policy in", values, "policy");
            return (Criteria) this;
        }

        public Criteria andPolicyNotIn(List<String> values) {
            addCriterion("policy not in", values, "policy");
            return (Criteria) this;
        }

        public Criteria andPolicyBetween(String value1, String value2) {
            addCriterion("policy between", value1, value2, "policy");
            return (Criteria) this;
        }

        public Criteria andPolicyNotBetween(String value1, String value2) {
            addCriterion("policy not between", value1, value2, "policy");
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