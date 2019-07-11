package www.rsyrch.com.resume.pojo;

import java.util.ArrayList;
import java.util.List;

public class ResumeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ResumeExample() {
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

        public Criteria andUseridIsNull() {
            addCriterion("userID is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userID is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("userID =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("userID <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("userID >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userID >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("userID <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("userID <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("userID in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("userID not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("userID between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("userID not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andEducationidIsNull() {
            addCriterion("educationID is null");
            return (Criteria) this;
        }

        public Criteria andEducationidIsNotNull() {
            addCriterion("educationID is not null");
            return (Criteria) this;
        }

        public Criteria andEducationidEqualTo(Integer value) {
            addCriterion("educationID =", value, "educationid");
            return (Criteria) this;
        }

        public Criteria andEducationidNotEqualTo(Integer value) {
            addCriterion("educationID <>", value, "educationid");
            return (Criteria) this;
        }

        public Criteria andEducationidGreaterThan(Integer value) {
            addCriterion("educationID >", value, "educationid");
            return (Criteria) this;
        }

        public Criteria andEducationidGreaterThanOrEqualTo(Integer value) {
            addCriterion("educationID >=", value, "educationid");
            return (Criteria) this;
        }

        public Criteria andEducationidLessThan(Integer value) {
            addCriterion("educationID <", value, "educationid");
            return (Criteria) this;
        }

        public Criteria andEducationidLessThanOrEqualTo(Integer value) {
            addCriterion("educationID <=", value, "educationid");
            return (Criteria) this;
        }

        public Criteria andEducationidIn(List<Integer> values) {
            addCriterion("educationID in", values, "educationid");
            return (Criteria) this;
        }

        public Criteria andEducationidNotIn(List<Integer> values) {
            addCriterion("educationID not in", values, "educationid");
            return (Criteria) this;
        }

        public Criteria andEducationidBetween(Integer value1, Integer value2) {
            addCriterion("educationID between", value1, value2, "educationid");
            return (Criteria) this;
        }

        public Criteria andEducationidNotBetween(Integer value1, Integer value2) {
            addCriterion("educationID not between", value1, value2, "educationid");
            return (Criteria) this;
        }

        public Criteria andTrainingidIsNull() {
            addCriterion("trainingID is null");
            return (Criteria) this;
        }

        public Criteria andTrainingidIsNotNull() {
            addCriterion("trainingID is not null");
            return (Criteria) this;
        }

        public Criteria andTrainingidEqualTo(Integer value) {
            addCriterion("trainingID =", value, "trainingid");
            return (Criteria) this;
        }

        public Criteria andTrainingidNotEqualTo(Integer value) {
            addCriterion("trainingID <>", value, "trainingid");
            return (Criteria) this;
        }

        public Criteria andTrainingidGreaterThan(Integer value) {
            addCriterion("trainingID >", value, "trainingid");
            return (Criteria) this;
        }

        public Criteria andTrainingidGreaterThanOrEqualTo(Integer value) {
            addCriterion("trainingID >=", value, "trainingid");
            return (Criteria) this;
        }

        public Criteria andTrainingidLessThan(Integer value) {
            addCriterion("trainingID <", value, "trainingid");
            return (Criteria) this;
        }

        public Criteria andTrainingidLessThanOrEqualTo(Integer value) {
            addCriterion("trainingID <=", value, "trainingid");
            return (Criteria) this;
        }

        public Criteria andTrainingidIn(List<Integer> values) {
            addCriterion("trainingID in", values, "trainingid");
            return (Criteria) this;
        }

        public Criteria andTrainingidNotIn(List<Integer> values) {
            addCriterion("trainingID not in", values, "trainingid");
            return (Criteria) this;
        }

        public Criteria andTrainingidBetween(Integer value1, Integer value2) {
            addCriterion("trainingID between", value1, value2, "trainingid");
            return (Criteria) this;
        }

        public Criteria andTrainingidNotBetween(Integer value1, Integer value2) {
            addCriterion("trainingID not between", value1, value2, "trainingid");
            return (Criteria) this;
        }

        public Criteria andPositionidIsNull() {
            addCriterion("positionID is null");
            return (Criteria) this;
        }

        public Criteria andPositionidIsNotNull() {
            addCriterion("positionID is not null");
            return (Criteria) this;
        }

        public Criteria andPositionidEqualTo(Integer value) {
            addCriterion("positionID =", value, "positionid");
            return (Criteria) this;
        }

        public Criteria andPositionidNotEqualTo(Integer value) {
            addCriterion("positionID <>", value, "positionid");
            return (Criteria) this;
        }

        public Criteria andPositionidGreaterThan(Integer value) {
            addCriterion("positionID >", value, "positionid");
            return (Criteria) this;
        }

        public Criteria andPositionidGreaterThanOrEqualTo(Integer value) {
            addCriterion("positionID >=", value, "positionid");
            return (Criteria) this;
        }

        public Criteria andPositionidLessThan(Integer value) {
            addCriterion("positionID <", value, "positionid");
            return (Criteria) this;
        }

        public Criteria andPositionidLessThanOrEqualTo(Integer value) {
            addCriterion("positionID <=", value, "positionid");
            return (Criteria) this;
        }

        public Criteria andPositionidIn(List<Integer> values) {
            addCriterion("positionID in", values, "positionid");
            return (Criteria) this;
        }

        public Criteria andPositionidNotIn(List<Integer> values) {
            addCriterion("positionID not in", values, "positionid");
            return (Criteria) this;
        }

        public Criteria andPositionidBetween(Integer value1, Integer value2) {
            addCriterion("positionID between", value1, value2, "positionid");
            return (Criteria) this;
        }

        public Criteria andPositionidNotBetween(Integer value1, Integer value2) {
            addCriterion("positionID not between", value1, value2, "positionid");
            return (Criteria) this;
        }

        public Criteria andWorkexperienceidIsNull() {
            addCriterion("workexperienceID is null");
            return (Criteria) this;
        }

        public Criteria andWorkexperienceidIsNotNull() {
            addCriterion("workexperienceID is not null");
            return (Criteria) this;
        }

        public Criteria andWorkexperienceidEqualTo(Integer value) {
            addCriterion("workexperienceID =", value, "workexperienceid");
            return (Criteria) this;
        }

        public Criteria andWorkexperienceidNotEqualTo(Integer value) {
            addCriterion("workexperienceID <>", value, "workexperienceid");
            return (Criteria) this;
        }

        public Criteria andWorkexperienceidGreaterThan(Integer value) {
            addCriterion("workexperienceID >", value, "workexperienceid");
            return (Criteria) this;
        }

        public Criteria andWorkexperienceidGreaterThanOrEqualTo(Integer value) {
            addCriterion("workexperienceID >=", value, "workexperienceid");
            return (Criteria) this;
        }

        public Criteria andWorkexperienceidLessThan(Integer value) {
            addCriterion("workexperienceID <", value, "workexperienceid");
            return (Criteria) this;
        }

        public Criteria andWorkexperienceidLessThanOrEqualTo(Integer value) {
            addCriterion("workexperienceID <=", value, "workexperienceid");
            return (Criteria) this;
        }

        public Criteria andWorkexperienceidIn(List<Integer> values) {
            addCriterion("workexperienceID in", values, "workexperienceid");
            return (Criteria) this;
        }

        public Criteria andWorkexperienceidNotIn(List<Integer> values) {
            addCriterion("workexperienceID not in", values, "workexperienceid");
            return (Criteria) this;
        }

        public Criteria andWorkexperienceidBetween(Integer value1, Integer value2) {
            addCriterion("workexperienceID between", value1, value2, "workexperienceid");
            return (Criteria) this;
        }

        public Criteria andWorkexperienceidNotBetween(Integer value1, Integer value2) {
            addCriterion("workexperienceID not between", value1, value2, "workexperienceid");
            return (Criteria) this;
        }

        public Criteria andApplypositionIsNull() {
            addCriterion("applyPosition is null");
            return (Criteria) this;
        }

        public Criteria andApplypositionIsNotNull() {
            addCriterion("applyPosition is not null");
            return (Criteria) this;
        }

        public Criteria andApplypositionEqualTo(String value) {
            addCriterion("applyPosition =", value, "applyposition");
            return (Criteria) this;
        }

        public Criteria andApplypositionNotEqualTo(String value) {
            addCriterion("applyPosition <>", value, "applyposition");
            return (Criteria) this;
        }

        public Criteria andApplypositionGreaterThan(String value) {
            addCriterion("applyPosition >", value, "applyposition");
            return (Criteria) this;
        }

        public Criteria andApplypositionGreaterThanOrEqualTo(String value) {
            addCriterion("applyPosition >=", value, "applyposition");
            return (Criteria) this;
        }

        public Criteria andApplypositionLessThan(String value) {
            addCriterion("applyPosition <", value, "applyposition");
            return (Criteria) this;
        }

        public Criteria andApplypositionLessThanOrEqualTo(String value) {
            addCriterion("applyPosition <=", value, "applyposition");
            return (Criteria) this;
        }

        public Criteria andApplypositionLike(String value) {
            addCriterion("applyPosition like", value, "applyposition");
            return (Criteria) this;
        }

        public Criteria andApplypositionNotLike(String value) {
            addCriterion("applyPosition not like", value, "applyposition");
            return (Criteria) this;
        }

        public Criteria andApplypositionIn(List<String> values) {
            addCriterion("applyPosition in", values, "applyposition");
            return (Criteria) this;
        }

        public Criteria andApplypositionNotIn(List<String> values) {
            addCriterion("applyPosition not in", values, "applyposition");
            return (Criteria) this;
        }

        public Criteria andApplypositionBetween(String value1, String value2) {
            addCriterion("applyPosition between", value1, value2, "applyposition");
            return (Criteria) this;
        }

        public Criteria andApplypositionNotBetween(String value1, String value2) {
            addCriterion("applyPosition not between", value1, value2, "applyposition");
            return (Criteria) this;
        }

        public Criteria andPersonaladvantageIsNull() {
            addCriterion("personalAdvantage is null");
            return (Criteria) this;
        }

        public Criteria andPersonaladvantageIsNotNull() {
            addCriterion("personalAdvantage is not null");
            return (Criteria) this;
        }

        public Criteria andPersonaladvantageEqualTo(String value) {
            addCriterion("personalAdvantage =", value, "personaladvantage");
            return (Criteria) this;
        }

        public Criteria andPersonaladvantageNotEqualTo(String value) {
            addCriterion("personalAdvantage <>", value, "personaladvantage");
            return (Criteria) this;
        }

        public Criteria andPersonaladvantageGreaterThan(String value) {
            addCriterion("personalAdvantage >", value, "personaladvantage");
            return (Criteria) this;
        }

        public Criteria andPersonaladvantageGreaterThanOrEqualTo(String value) {
            addCriterion("personalAdvantage >=", value, "personaladvantage");
            return (Criteria) this;
        }

        public Criteria andPersonaladvantageLessThan(String value) {
            addCriterion("personalAdvantage <", value, "personaladvantage");
            return (Criteria) this;
        }

        public Criteria andPersonaladvantageLessThanOrEqualTo(String value) {
            addCriterion("personalAdvantage <=", value, "personaladvantage");
            return (Criteria) this;
        }

        public Criteria andPersonaladvantageLike(String value) {
            addCriterion("personalAdvantage like", value, "personaladvantage");
            return (Criteria) this;
        }

        public Criteria andPersonaladvantageNotLike(String value) {
            addCriterion("personalAdvantage not like", value, "personaladvantage");
            return (Criteria) this;
        }

        public Criteria andPersonaladvantageIn(List<String> values) {
            addCriterion("personalAdvantage in", values, "personaladvantage");
            return (Criteria) this;
        }

        public Criteria andPersonaladvantageNotIn(List<String> values) {
            addCriterion("personalAdvantage not in", values, "personaladvantage");
            return (Criteria) this;
        }

        public Criteria andPersonaladvantageBetween(String value1, String value2) {
            addCriterion("personalAdvantage between", value1, value2, "personaladvantage");
            return (Criteria) this;
        }

        public Criteria andPersonaladvantageNotBetween(String value1, String value2) {
            addCriterion("personalAdvantage not between", value1, value2, "personaladvantage");
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