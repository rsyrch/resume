package www.rsyrch.com.resume.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PositionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PositionExample() {
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
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andFatheridIsNull() {
            addCriterion("fatherID is null");
            return (Criteria) this;
        }

        public Criteria andFatheridIsNotNull() {
            addCriterion("fatherID is not null");
            return (Criteria) this;
        }

        public Criteria andFatheridEqualTo(Integer value) {
            addCriterion("fatherID =", value, "fatherid");
            return (Criteria) this;
        }

        public Criteria andFatheridNotEqualTo(Integer value) {
            addCriterion("fatherID <>", value, "fatherid");
            return (Criteria) this;
        }

        public Criteria andFatheridGreaterThan(Integer value) {
            addCriterion("fatherID >", value, "fatherid");
            return (Criteria) this;
        }

        public Criteria andFatheridGreaterThanOrEqualTo(Integer value) {
            addCriterion("fatherID >=", value, "fatherid");
            return (Criteria) this;
        }

        public Criteria andFatheridLessThan(Integer value) {
            addCriterion("fatherID <", value, "fatherid");
            return (Criteria) this;
        }

        public Criteria andFatheridLessThanOrEqualTo(Integer value) {
            addCriterion("fatherID <=", value, "fatherid");
            return (Criteria) this;
        }

        public Criteria andFatheridIn(List<Integer> values) {
            addCriterion("fatherID in", values, "fatherid");
            return (Criteria) this;
        }

        public Criteria andFatheridNotIn(List<Integer> values) {
            addCriterion("fatherID not in", values, "fatherid");
            return (Criteria) this;
        }

        public Criteria andFatheridBetween(Integer value1, Integer value2) {
            addCriterion("fatherID between", value1, value2, "fatherid");
            return (Criteria) this;
        }

        public Criteria andFatheridNotBetween(Integer value1, Integer value2) {
            addCriterion("fatherID not between", value1, value2, "fatherid");
            return (Criteria) this;
        }

        public Criteria andSubordinateidIsNull() {
            addCriterion("subordinateID is null");
            return (Criteria) this;
        }

        public Criteria andSubordinateidIsNotNull() {
            addCriterion("subordinateID is not null");
            return (Criteria) this;
        }

        public Criteria andSubordinateidEqualTo(Integer value) {
            addCriterion("subordinateID =", value, "subordinateid");
            return (Criteria) this;
        }

        public Criteria andSubordinateidNotEqualTo(Integer value) {
            addCriterion("subordinateID <>", value, "subordinateid");
            return (Criteria) this;
        }

        public Criteria andSubordinateidGreaterThan(Integer value) {
            addCriterion("subordinateID >", value, "subordinateid");
            return (Criteria) this;
        }

        public Criteria andSubordinateidGreaterThanOrEqualTo(Integer value) {
            addCriterion("subordinateID >=", value, "subordinateid");
            return (Criteria) this;
        }

        public Criteria andSubordinateidLessThan(Integer value) {
            addCriterion("subordinateID <", value, "subordinateid");
            return (Criteria) this;
        }

        public Criteria andSubordinateidLessThanOrEqualTo(Integer value) {
            addCriterion("subordinateID <=", value, "subordinateid");
            return (Criteria) this;
        }

        public Criteria andSubordinateidIn(List<Integer> values) {
            addCriterion("subordinateID in", values, "subordinateid");
            return (Criteria) this;
        }

        public Criteria andSubordinateidNotIn(List<Integer> values) {
            addCriterion("subordinateID not in", values, "subordinateid");
            return (Criteria) this;
        }

        public Criteria andSubordinateidBetween(Integer value1, Integer value2) {
            addCriterion("subordinateID between", value1, value2, "subordinateid");
            return (Criteria) this;
        }

        public Criteria andSubordinateidNotBetween(Integer value1, Integer value2) {
            addCriterion("subordinateID not between", value1, value2, "subordinateid");
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

        public Criteria andCreatetimeIsNull() {
            addCriterion("createTime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createTime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createTime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createTime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createTime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createTime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createTime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createTime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createTime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createTime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createTime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("updateTime is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("updateTime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Date value) {
            addCriterion("updateTime =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Date value) {
            addCriterion("updateTime <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Date value) {
            addCriterion("updateTime >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("updateTime >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Date value) {
            addCriterion("updateTime <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("updateTime <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Date> values) {
            addCriterion("updateTime in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Date> values) {
            addCriterion("updateTime not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("updateTime between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("updateTime not between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andSparefield1IsNull() {
            addCriterion("spareField1 is null");
            return (Criteria) this;
        }

        public Criteria andSparefield1IsNotNull() {
            addCriterion("spareField1 is not null");
            return (Criteria) this;
        }

        public Criteria andSparefield1EqualTo(String value) {
            addCriterion("spareField1 =", value, "sparefield1");
            return (Criteria) this;
        }

        public Criteria andSparefield1NotEqualTo(String value) {
            addCriterion("spareField1 <>", value, "sparefield1");
            return (Criteria) this;
        }

        public Criteria andSparefield1GreaterThan(String value) {
            addCriterion("spareField1 >", value, "sparefield1");
            return (Criteria) this;
        }

        public Criteria andSparefield1GreaterThanOrEqualTo(String value) {
            addCriterion("spareField1 >=", value, "sparefield1");
            return (Criteria) this;
        }

        public Criteria andSparefield1LessThan(String value) {
            addCriterion("spareField1 <", value, "sparefield1");
            return (Criteria) this;
        }

        public Criteria andSparefield1LessThanOrEqualTo(String value) {
            addCriterion("spareField1 <=", value, "sparefield1");
            return (Criteria) this;
        }

        public Criteria andSparefield1Like(String value) {
            addCriterion("spareField1 like", value, "sparefield1");
            return (Criteria) this;
        }

        public Criteria andSparefield1NotLike(String value) {
            addCriterion("spareField1 not like", value, "sparefield1");
            return (Criteria) this;
        }

        public Criteria andSparefield1In(List<String> values) {
            addCriterion("spareField1 in", values, "sparefield1");
            return (Criteria) this;
        }

        public Criteria andSparefield1NotIn(List<String> values) {
            addCriterion("spareField1 not in", values, "sparefield1");
            return (Criteria) this;
        }

        public Criteria andSparefield1Between(String value1, String value2) {
            addCriterion("spareField1 between", value1, value2, "sparefield1");
            return (Criteria) this;
        }

        public Criteria andSparefield1NotBetween(String value1, String value2) {
            addCriterion("spareField1 not between", value1, value2, "sparefield1");
            return (Criteria) this;
        }

        public Criteria andSparefield2IsNull() {
            addCriterion("spareField2 is null");
            return (Criteria) this;
        }

        public Criteria andSparefield2IsNotNull() {
            addCriterion("spareField2 is not null");
            return (Criteria) this;
        }

        public Criteria andSparefield2EqualTo(String value) {
            addCriterion("spareField2 =", value, "sparefield2");
            return (Criteria) this;
        }

        public Criteria andSparefield2NotEqualTo(String value) {
            addCriterion("spareField2 <>", value, "sparefield2");
            return (Criteria) this;
        }

        public Criteria andSparefield2GreaterThan(String value) {
            addCriterion("spareField2 >", value, "sparefield2");
            return (Criteria) this;
        }

        public Criteria andSparefield2GreaterThanOrEqualTo(String value) {
            addCriterion("spareField2 >=", value, "sparefield2");
            return (Criteria) this;
        }

        public Criteria andSparefield2LessThan(String value) {
            addCriterion("spareField2 <", value, "sparefield2");
            return (Criteria) this;
        }

        public Criteria andSparefield2LessThanOrEqualTo(String value) {
            addCriterion("spareField2 <=", value, "sparefield2");
            return (Criteria) this;
        }

        public Criteria andSparefield2Like(String value) {
            addCriterion("spareField2 like", value, "sparefield2");
            return (Criteria) this;
        }

        public Criteria andSparefield2NotLike(String value) {
            addCriterion("spareField2 not like", value, "sparefield2");
            return (Criteria) this;
        }

        public Criteria andSparefield2In(List<String> values) {
            addCriterion("spareField2 in", values, "sparefield2");
            return (Criteria) this;
        }

        public Criteria andSparefield2NotIn(List<String> values) {
            addCriterion("spareField2 not in", values, "sparefield2");
            return (Criteria) this;
        }

        public Criteria andSparefield2Between(String value1, String value2) {
            addCriterion("spareField2 between", value1, value2, "sparefield2");
            return (Criteria) this;
        }

        public Criteria andSparefield2NotBetween(String value1, String value2) {
            addCriterion("spareField2 not between", value1, value2, "sparefield2");
            return (Criteria) this;
        }

        public Criteria andSparefield3IsNull() {
            addCriterion("spareField3 is null");
            return (Criteria) this;
        }

        public Criteria andSparefield3IsNotNull() {
            addCriterion("spareField3 is not null");
            return (Criteria) this;
        }

        public Criteria andSparefield3EqualTo(String value) {
            addCriterion("spareField3 =", value, "sparefield3");
            return (Criteria) this;
        }

        public Criteria andSparefield3NotEqualTo(String value) {
            addCriterion("spareField3 <>", value, "sparefield3");
            return (Criteria) this;
        }

        public Criteria andSparefield3GreaterThan(String value) {
            addCriterion("spareField3 >", value, "sparefield3");
            return (Criteria) this;
        }

        public Criteria andSparefield3GreaterThanOrEqualTo(String value) {
            addCriterion("spareField3 >=", value, "sparefield3");
            return (Criteria) this;
        }

        public Criteria andSparefield3LessThan(String value) {
            addCriterion("spareField3 <", value, "sparefield3");
            return (Criteria) this;
        }

        public Criteria andSparefield3LessThanOrEqualTo(String value) {
            addCriterion("spareField3 <=", value, "sparefield3");
            return (Criteria) this;
        }

        public Criteria andSparefield3Like(String value) {
            addCriterion("spareField3 like", value, "sparefield3");
            return (Criteria) this;
        }

        public Criteria andSparefield3NotLike(String value) {
            addCriterion("spareField3 not like", value, "sparefield3");
            return (Criteria) this;
        }

        public Criteria andSparefield3In(List<String> values) {
            addCriterion("spareField3 in", values, "sparefield3");
            return (Criteria) this;
        }

        public Criteria andSparefield3NotIn(List<String> values) {
            addCriterion("spareField3 not in", values, "sparefield3");
            return (Criteria) this;
        }

        public Criteria andSparefield3Between(String value1, String value2) {
            addCriterion("spareField3 between", value1, value2, "sparefield3");
            return (Criteria) this;
        }

        public Criteria andSparefield3NotBetween(String value1, String value2) {
            addCriterion("spareField3 not between", value1, value2, "sparefield3");
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