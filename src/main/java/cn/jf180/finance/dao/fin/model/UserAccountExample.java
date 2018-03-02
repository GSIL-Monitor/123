package cn.jf180.finance.dao.fin.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserAccountExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserAccountExample() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andOpCreditScoringIsNull() {
            addCriterion("op_credit_scoring is null");
            return (Criteria) this;
        }

        public Criteria andOpCreditScoringIsNotNull() {
            addCriterion("op_credit_scoring is not null");
            return (Criteria) this;
        }

        public Criteria andOpCreditScoringEqualTo(Integer value) {
            addCriterion("op_credit_scoring =", value, "opCreditScoring");
            return (Criteria) this;
        }

        public Criteria andOpCreditScoringNotEqualTo(Integer value) {
            addCriterion("op_credit_scoring <>", value, "opCreditScoring");
            return (Criteria) this;
        }

        public Criteria andOpCreditScoringGreaterThan(Integer value) {
            addCriterion("op_credit_scoring >", value, "opCreditScoring");
            return (Criteria) this;
        }

        public Criteria andOpCreditScoringGreaterThanOrEqualTo(Integer value) {
            addCriterion("op_credit_scoring >=", value, "opCreditScoring");
            return (Criteria) this;
        }

        public Criteria andOpCreditScoringLessThan(Integer value) {
            addCriterion("op_credit_scoring <", value, "opCreditScoring");
            return (Criteria) this;
        }

        public Criteria andOpCreditScoringLessThanOrEqualTo(Integer value) {
            addCriterion("op_credit_scoring <=", value, "opCreditScoring");
            return (Criteria) this;
        }

        public Criteria andOpCreditScoringIn(List<Integer> values) {
            addCriterion("op_credit_scoring in", values, "opCreditScoring");
            return (Criteria) this;
        }

        public Criteria andOpCreditScoringNotIn(List<Integer> values) {
            addCriterion("op_credit_scoring not in", values, "opCreditScoring");
            return (Criteria) this;
        }

        public Criteria andOpCreditScoringBetween(Integer value1, Integer value2) {
            addCriterion("op_credit_scoring between", value1, value2, "opCreditScoring");
            return (Criteria) this;
        }

        public Criteria andOpCreditScoringNotBetween(Integer value1, Integer value2) {
            addCriterion("op_credit_scoring not between", value1, value2, "opCreditScoring");
            return (Criteria) this;
        }

        public Criteria andTmallUserNameIsNull() {
            addCriterion("tmall_user_name is null");
            return (Criteria) this;
        }

        public Criteria andTmallUserNameIsNotNull() {
            addCriterion("tmall_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andTmallUserNameEqualTo(String value) {
            addCriterion("tmall_user_name =", value, "tmallUserName");
            return (Criteria) this;
        }

        public Criteria andTmallUserNameNotEqualTo(String value) {
            addCriterion("tmall_user_name <>", value, "tmallUserName");
            return (Criteria) this;
        }

        public Criteria andTmallUserNameGreaterThan(String value) {
            addCriterion("tmall_user_name >", value, "tmallUserName");
            return (Criteria) this;
        }

        public Criteria andTmallUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("tmall_user_name >=", value, "tmallUserName");
            return (Criteria) this;
        }

        public Criteria andTmallUserNameLessThan(String value) {
            addCriterion("tmall_user_name <", value, "tmallUserName");
            return (Criteria) this;
        }

        public Criteria andTmallUserNameLessThanOrEqualTo(String value) {
            addCriterion("tmall_user_name <=", value, "tmallUserName");
            return (Criteria) this;
        }

        public Criteria andTmallUserNameLike(String value) {
            addCriterion("tmall_user_name like", value, "tmallUserName");
            return (Criteria) this;
        }

        public Criteria andTmallUserNameNotLike(String value) {
            addCriterion("tmall_user_name not like", value, "tmallUserName");
            return (Criteria) this;
        }

        public Criteria andTmallUserNameIn(List<String> values) {
            addCriterion("tmall_user_name in", values, "tmallUserName");
            return (Criteria) this;
        }

        public Criteria andTmallUserNameNotIn(List<String> values) {
            addCriterion("tmall_user_name not in", values, "tmallUserName");
            return (Criteria) this;
        }

        public Criteria andTmallUserNameBetween(String value1, String value2) {
            addCriterion("tmall_user_name between", value1, value2, "tmallUserName");
            return (Criteria) this;
        }

        public Criteria andTmallUserNameNotBetween(String value1, String value2) {
            addCriterion("tmall_user_name not between", value1, value2, "tmallUserName");
            return (Criteria) this;
        }

        public Criteria andFinIdIsNull() {
            addCriterion("fin_id is null");
            return (Criteria) this;
        }

        public Criteria andFinIdIsNotNull() {
            addCriterion("fin_id is not null");
            return (Criteria) this;
        }

        public Criteria andFinIdEqualTo(Integer value) {
            addCriterion("fin_id =", value, "finId");
            return (Criteria) this;
        }

        public Criteria andFinIdNotEqualTo(Integer value) {
            addCriterion("fin_id <>", value, "finId");
            return (Criteria) this;
        }

        public Criteria andFinIdGreaterThan(Integer value) {
            addCriterion("fin_id >", value, "finId");
            return (Criteria) this;
        }

        public Criteria andFinIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("fin_id >=", value, "finId");
            return (Criteria) this;
        }

        public Criteria andFinIdLessThan(Integer value) {
            addCriterion("fin_id <", value, "finId");
            return (Criteria) this;
        }

        public Criteria andFinIdLessThanOrEqualTo(Integer value) {
            addCriterion("fin_id <=", value, "finId");
            return (Criteria) this;
        }

        public Criteria andFinIdIn(List<Integer> values) {
            addCriterion("fin_id in", values, "finId");
            return (Criteria) this;
        }

        public Criteria andFinIdNotIn(List<Integer> values) {
            addCriterion("fin_id not in", values, "finId");
            return (Criteria) this;
        }

        public Criteria andFinIdBetween(Integer value1, Integer value2) {
            addCriterion("fin_id between", value1, value2, "finId");
            return (Criteria) this;
        }

        public Criteria andFinIdNotBetween(Integer value1, Integer value2) {
            addCriterion("fin_id not between", value1, value2, "finId");
            return (Criteria) this;
        }

        public Criteria andFinNameIsNull() {
            addCriterion("fin_name is null");
            return (Criteria) this;
        }

        public Criteria andFinNameIsNotNull() {
            addCriterion("fin_name is not null");
            return (Criteria) this;
        }

        public Criteria andFinNameEqualTo(String value) {
            addCriterion("fin_name =", value, "finName");
            return (Criteria) this;
        }

        public Criteria andFinNameNotEqualTo(String value) {
            addCriterion("fin_name <>", value, "finName");
            return (Criteria) this;
        }

        public Criteria andFinNameGreaterThan(String value) {
            addCriterion("fin_name >", value, "finName");
            return (Criteria) this;
        }

        public Criteria andFinNameGreaterThanOrEqualTo(String value) {
            addCriterion("fin_name >=", value, "finName");
            return (Criteria) this;
        }

        public Criteria andFinNameLessThan(String value) {
            addCriterion("fin_name <", value, "finName");
            return (Criteria) this;
        }

        public Criteria andFinNameLessThanOrEqualTo(String value) {
            addCriterion("fin_name <=", value, "finName");
            return (Criteria) this;
        }

        public Criteria andFinNameLike(String value) {
            addCriterion("fin_name like", value, "finName");
            return (Criteria) this;
        }

        public Criteria andFinNameNotLike(String value) {
            addCriterion("fin_name not like", value, "finName");
            return (Criteria) this;
        }

        public Criteria andFinNameIn(List<String> values) {
            addCriterion("fin_name in", values, "finName");
            return (Criteria) this;
        }

        public Criteria andFinNameNotIn(List<String> values) {
            addCriterion("fin_name not in", values, "finName");
            return (Criteria) this;
        }

        public Criteria andFinNameBetween(String value1, String value2) {
            addCriterion("fin_name between", value1, value2, "finName");
            return (Criteria) this;
        }

        public Criteria andFinNameNotBetween(String value1, String value2) {
            addCriterion("fin_name not between", value1, value2, "finName");
            return (Criteria) this;
        }

        public Criteria andFinCreditIdIsNull() {
            addCriterion("fin_credit_id is null");
            return (Criteria) this;
        }

        public Criteria andFinCreditIdIsNotNull() {
            addCriterion("fin_credit_id is not null");
            return (Criteria) this;
        }

        public Criteria andFinCreditIdEqualTo(String value) {
            addCriterion("fin_credit_id =", value, "finCreditId");
            return (Criteria) this;
        }

        public Criteria andFinCreditIdNotEqualTo(String value) {
            addCriterion("fin_credit_id <>", value, "finCreditId");
            return (Criteria) this;
        }

        public Criteria andFinCreditIdGreaterThan(String value) {
            addCriterion("fin_credit_id >", value, "finCreditId");
            return (Criteria) this;
        }

        public Criteria andFinCreditIdGreaterThanOrEqualTo(String value) {
            addCriterion("fin_credit_id >=", value, "finCreditId");
            return (Criteria) this;
        }

        public Criteria andFinCreditIdLessThan(String value) {
            addCriterion("fin_credit_id <", value, "finCreditId");
            return (Criteria) this;
        }

        public Criteria andFinCreditIdLessThanOrEqualTo(String value) {
            addCriterion("fin_credit_id <=", value, "finCreditId");
            return (Criteria) this;
        }

        public Criteria andFinCreditIdLike(String value) {
            addCriterion("fin_credit_id like", value, "finCreditId");
            return (Criteria) this;
        }

        public Criteria andFinCreditIdNotLike(String value) {
            addCriterion("fin_credit_id not like", value, "finCreditId");
            return (Criteria) this;
        }

        public Criteria andFinCreditIdIn(List<String> values) {
            addCriterion("fin_credit_id in", values, "finCreditId");
            return (Criteria) this;
        }

        public Criteria andFinCreditIdNotIn(List<String> values) {
            addCriterion("fin_credit_id not in", values, "finCreditId");
            return (Criteria) this;
        }

        public Criteria andFinCreditIdBetween(String value1, String value2) {
            addCriterion("fin_credit_id between", value1, value2, "finCreditId");
            return (Criteria) this;
        }

        public Criteria andFinCreditIdNotBetween(String value1, String value2) {
            addCriterion("fin_credit_id not between", value1, value2, "finCreditId");
            return (Criteria) this;
        }

        public Criteria andFinCreditLineIsNull() {
            addCriterion("fin_credit_line is null");
            return (Criteria) this;
        }

        public Criteria andFinCreditLineIsNotNull() {
            addCriterion("fin_credit_line is not null");
            return (Criteria) this;
        }

        public Criteria andFinCreditLineEqualTo(Integer value) {
            addCriterion("fin_credit_line =", value, "finCreditLine");
            return (Criteria) this;
        }

        public Criteria andFinCreditLineNotEqualTo(Integer value) {
            addCriterion("fin_credit_line <>", value, "finCreditLine");
            return (Criteria) this;
        }

        public Criteria andFinCreditLineGreaterThan(Integer value) {
            addCriterion("fin_credit_line >", value, "finCreditLine");
            return (Criteria) this;
        }

        public Criteria andFinCreditLineGreaterThanOrEqualTo(Integer value) {
            addCriterion("fin_credit_line >=", value, "finCreditLine");
            return (Criteria) this;
        }

        public Criteria andFinCreditLineLessThan(Integer value) {
            addCriterion("fin_credit_line <", value, "finCreditLine");
            return (Criteria) this;
        }

        public Criteria andFinCreditLineLessThanOrEqualTo(Integer value) {
            addCriterion("fin_credit_line <=", value, "finCreditLine");
            return (Criteria) this;
        }

        public Criteria andFinCreditLineIn(List<Integer> values) {
            addCriterion("fin_credit_line in", values, "finCreditLine");
            return (Criteria) this;
        }

        public Criteria andFinCreditLineNotIn(List<Integer> values) {
            addCriterion("fin_credit_line not in", values, "finCreditLine");
            return (Criteria) this;
        }

        public Criteria andFinCreditLineBetween(Integer value1, Integer value2) {
            addCriterion("fin_credit_line between", value1, value2, "finCreditLine");
            return (Criteria) this;
        }

        public Criteria andFinCreditLineNotBetween(Integer value1, Integer value2) {
            addCriterion("fin_credit_line not between", value1, value2, "finCreditLine");
            return (Criteria) this;
        }

        public Criteria andJftCreditLineIsNull() {
            addCriterion("jft_credit_line is null");
            return (Criteria) this;
        }

        public Criteria andJftCreditLineIsNotNull() {
            addCriterion("jft_credit_line is not null");
            return (Criteria) this;
        }

        public Criteria andJftCreditLineEqualTo(Integer value) {
            addCriterion("jft_credit_line =", value, "jftCreditLine");
            return (Criteria) this;
        }

        public Criteria andJftCreditLineNotEqualTo(Integer value) {
            addCriterion("jft_credit_line <>", value, "jftCreditLine");
            return (Criteria) this;
        }

        public Criteria andJftCreditLineGreaterThan(Integer value) {
            addCriterion("jft_credit_line >", value, "jftCreditLine");
            return (Criteria) this;
        }

        public Criteria andJftCreditLineGreaterThanOrEqualTo(Integer value) {
            addCriterion("jft_credit_line >=", value, "jftCreditLine");
            return (Criteria) this;
        }

        public Criteria andJftCreditLineLessThan(Integer value) {
            addCriterion("jft_credit_line <", value, "jftCreditLine");
            return (Criteria) this;
        }

        public Criteria andJftCreditLineLessThanOrEqualTo(Integer value) {
            addCriterion("jft_credit_line <=", value, "jftCreditLine");
            return (Criteria) this;
        }

        public Criteria andJftCreditLineIn(List<Integer> values) {
            addCriterion("jft_credit_line in", values, "jftCreditLine");
            return (Criteria) this;
        }

        public Criteria andJftCreditLineNotIn(List<Integer> values) {
            addCriterion("jft_credit_line not in", values, "jftCreditLine");
            return (Criteria) this;
        }

        public Criteria andJftCreditLineBetween(Integer value1, Integer value2) {
            addCriterion("jft_credit_line between", value1, value2, "jftCreditLine");
            return (Criteria) this;
        }

        public Criteria andJftCreditLineNotBetween(Integer value1, Integer value2) {
            addCriterion("jft_credit_line not between", value1, value2, "jftCreditLine");
            return (Criteria) this;
        }

        public Criteria andCurCreditLineIsNull() {
            addCriterion("cur_credit_line is null");
            return (Criteria) this;
        }

        public Criteria andCurCreditLineIsNotNull() {
            addCriterion("cur_credit_line is not null");
            return (Criteria) this;
        }

        public Criteria andCurCreditLineEqualTo(Integer value) {
            addCriterion("cur_credit_line =", value, "curCreditLine");
            return (Criteria) this;
        }

        public Criteria andCurCreditLineNotEqualTo(Integer value) {
            addCriterion("cur_credit_line <>", value, "curCreditLine");
            return (Criteria) this;
        }

        public Criteria andCurCreditLineGreaterThan(Integer value) {
            addCriterion("cur_credit_line >", value, "curCreditLine");
            return (Criteria) this;
        }

        public Criteria andCurCreditLineGreaterThanOrEqualTo(Integer value) {
            addCriterion("cur_credit_line >=", value, "curCreditLine");
            return (Criteria) this;
        }

        public Criteria andCurCreditLineLessThan(Integer value) {
            addCriterion("cur_credit_line <", value, "curCreditLine");
            return (Criteria) this;
        }

        public Criteria andCurCreditLineLessThanOrEqualTo(Integer value) {
            addCriterion("cur_credit_line <=", value, "curCreditLine");
            return (Criteria) this;
        }

        public Criteria andCurCreditLineIn(List<Integer> values) {
            addCriterion("cur_credit_line in", values, "curCreditLine");
            return (Criteria) this;
        }

        public Criteria andCurCreditLineNotIn(List<Integer> values) {
            addCriterion("cur_credit_line not in", values, "curCreditLine");
            return (Criteria) this;
        }

        public Criteria andCurCreditLineBetween(Integer value1, Integer value2) {
            addCriterion("cur_credit_line between", value1, value2, "curCreditLine");
            return (Criteria) this;
        }

        public Criteria andCurCreditLineNotBetween(Integer value1, Integer value2) {
            addCriterion("cur_credit_line not between", value1, value2, "curCreditLine");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNull() {
            addCriterion("modify_time is null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNotNull() {
            addCriterion("modify_time is not null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeEqualTo(Date value) {
            addCriterion("modify_time =", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotEqualTo(Date value) {
            addCriterion("modify_time <>", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThan(Date value) {
            addCriterion("modify_time >", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("modify_time >=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThan(Date value) {
            addCriterion("modify_time <", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("modify_time <=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIn(List<Date> values) {
            addCriterion("modify_time in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotIn(List<Date> values) {
            addCriterion("modify_time not in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeBetween(Date value1, Date value2) {
            addCriterion("modify_time between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("modify_time not between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
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