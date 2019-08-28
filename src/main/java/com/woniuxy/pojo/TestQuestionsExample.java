package com.woniuxy.pojo;

import java.util.ArrayList;
import java.util.List;

public class TestQuestionsExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table test_questions
     *
     * @mbg.generated Tue Aug 27 16:03:12 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table test_questions
     *
     * @mbg.generated Tue Aug 27 16:03:12 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table test_questions
     *
     * @mbg.generated Tue Aug 27 16:03:12 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_questions
     *
     * @mbg.generated Tue Aug 27 16:03:12 CST 2019
     */
    public TestQuestionsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_questions
     *
     * @mbg.generated Tue Aug 27 16:03:12 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_questions
     *
     * @mbg.generated Tue Aug 27 16:03:12 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_questions
     *
     * @mbg.generated Tue Aug 27 16:03:12 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_questions
     *
     * @mbg.generated Tue Aug 27 16:03:12 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_questions
     *
     * @mbg.generated Tue Aug 27 16:03:12 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_questions
     *
     * @mbg.generated Tue Aug 27 16:03:12 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_questions
     *
     * @mbg.generated Tue Aug 27 16:03:12 CST 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_questions
     *
     * @mbg.generated Tue Aug 27 16:03:12 CST 2019
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_questions
     *
     * @mbg.generated Tue Aug 27 16:03:12 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_questions
     *
     * @mbg.generated Tue Aug 27 16:03:12 CST 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table test_questions
     *
     * @mbg.generated Tue Aug 27 16:03:12 CST 2019
     */
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

        public Criteria andTestQuestionIdIsNull() {
            addCriterion("test_question_id is null");
            return (Criteria) this;
        }

        public Criteria andTestQuestionIdIsNotNull() {
            addCriterion("test_question_id is not null");
            return (Criteria) this;
        }

        public Criteria andTestQuestionIdEqualTo(Integer value) {
            addCriterion("test_question_id =", value, "testQuestionId");
            return (Criteria) this;
        }

        public Criteria andTestQuestionIdNotEqualTo(Integer value) {
            addCriterion("test_question_id <>", value, "testQuestionId");
            return (Criteria) this;
        }

        public Criteria andTestQuestionIdGreaterThan(Integer value) {
            addCriterion("test_question_id >", value, "testQuestionId");
            return (Criteria) this;
        }

        public Criteria andTestQuestionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("test_question_id >=", value, "testQuestionId");
            return (Criteria) this;
        }

        public Criteria andTestQuestionIdLessThan(Integer value) {
            addCriterion("test_question_id <", value, "testQuestionId");
            return (Criteria) this;
        }

        public Criteria andTestQuestionIdLessThanOrEqualTo(Integer value) {
            addCriterion("test_question_id <=", value, "testQuestionId");
            return (Criteria) this;
        }

        public Criteria andTestQuestionIdIn(List<Integer> values) {
            addCriterion("test_question_id in", values, "testQuestionId");
            return (Criteria) this;
        }

        public Criteria andTestQuestionIdNotIn(List<Integer> values) {
            addCriterion("test_question_id not in", values, "testQuestionId");
            return (Criteria) this;
        }

        public Criteria andTestQuestionIdBetween(Integer value1, Integer value2) {
            addCriterion("test_question_id between", value1, value2, "testQuestionId");
            return (Criteria) this;
        }

        public Criteria andTestQuestionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("test_question_id not between", value1, value2, "testQuestionId");
            return (Criteria) this;
        }

        public Criteria andTestQuestionNameIsNull() {
            addCriterion("test_question_name is null");
            return (Criteria) this;
        }

        public Criteria andTestQuestionNameIsNotNull() {
            addCriterion("test_question_name is not null");
            return (Criteria) this;
        }

        public Criteria andTestQuestionNameEqualTo(String value) {
            addCriterion("test_question_name =", value, "testQuestionName");
            return (Criteria) this;
        }

        public Criteria andTestQuestionNameNotEqualTo(String value) {
            addCriterion("test_question_name <>", value, "testQuestionName");
            return (Criteria) this;
        }

        public Criteria andTestQuestionNameGreaterThan(String value) {
            addCriterion("test_question_name >", value, "testQuestionName");
            return (Criteria) this;
        }

        public Criteria andTestQuestionNameGreaterThanOrEqualTo(String value) {
            addCriterion("test_question_name >=", value, "testQuestionName");
            return (Criteria) this;
        }

        public Criteria andTestQuestionNameLessThan(String value) {
            addCriterion("test_question_name <", value, "testQuestionName");
            return (Criteria) this;
        }

        public Criteria andTestQuestionNameLessThanOrEqualTo(String value) {
            addCriterion("test_question_name <=", value, "testQuestionName");
            return (Criteria) this;
        }

        public Criteria andTestQuestionNameLike(String value) {
            addCriterion("test_question_name like", value, "testQuestionName");
            return (Criteria) this;
        }

        public Criteria andTestQuestionNameNotLike(String value) {
            addCriterion("test_question_name not like", value, "testQuestionName");
            return (Criteria) this;
        }

        public Criteria andTestQuestionNameIn(List<String> values) {
            addCriterion("test_question_name in", values, "testQuestionName");
            return (Criteria) this;
        }

        public Criteria andTestQuestionNameNotIn(List<String> values) {
            addCriterion("test_question_name not in", values, "testQuestionName");
            return (Criteria) this;
        }

        public Criteria andTestQuestionNameBetween(String value1, String value2) {
            addCriterion("test_question_name between", value1, value2, "testQuestionName");
            return (Criteria) this;
        }

        public Criteria andTestQuestionNameNotBetween(String value1, String value2) {
            addCriterion("test_question_name not between", value1, value2, "testQuestionName");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table test_questions
     *
     * @mbg.generated do_not_delete_during_merge Tue Aug 27 16:03:12 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table test_questions
     *
     * @mbg.generated Tue Aug 27 16:03:12 CST 2019
     */
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