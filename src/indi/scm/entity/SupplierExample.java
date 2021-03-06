package indi.scm.entity;

import java.util.ArrayList;
import java.util.List;

public class SupplierExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SupplierExample() {
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

        public Criteria andSupIdIsNull() {
            addCriterion("sup_id is null");
            return (Criteria) this;
        }

        public Criteria andSupIdIsNotNull() {
            addCriterion("sup_id is not null");
            return (Criteria) this;
        }

        public Criteria andSupIdEqualTo(Integer value) {
            addCriterion("sup_id =", value, "supId");
            return (Criteria) this;
        }

        public Criteria andSupIdNotEqualTo(Integer value) {
            addCriterion("sup_id <>", value, "supId");
            return (Criteria) this;
        }

        public Criteria andSupIdGreaterThan(Integer value) {
            addCriterion("sup_id >", value, "supId");
            return (Criteria) this;
        }

        public Criteria andSupIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sup_id >=", value, "supId");
            return (Criteria) this;
        }

        public Criteria andSupIdLessThan(Integer value) {
            addCriterion("sup_id <", value, "supId");
            return (Criteria) this;
        }

        public Criteria andSupIdLessThanOrEqualTo(Integer value) {
            addCriterion("sup_id <=", value, "supId");
            return (Criteria) this;
        }

        public Criteria andSupIdIn(List<Integer> values) {
            addCriterion("sup_id in", values, "supId");
            return (Criteria) this;
        }

        public Criteria andSupIdNotIn(List<Integer> values) {
            addCriterion("sup_id not in", values, "supId");
            return (Criteria) this;
        }

        public Criteria andSupIdBetween(Integer value1, Integer value2) {
            addCriterion("sup_id between", value1, value2, "supId");
            return (Criteria) this;
        }

        public Criteria andSupIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sup_id not between", value1, value2, "supId");
            return (Criteria) this;
        }

        public Criteria andSupNameIsNull() {
            addCriterion("sup_name is null");
            return (Criteria) this;
        }

        public Criteria andSupNameIsNotNull() {
            addCriterion("sup_name is not null");
            return (Criteria) this;
        }

        public Criteria andSupNameEqualTo(String value) {
            addCriterion("sup_name =", value, "supName");
            return (Criteria) this;
        }

        public Criteria andSupNameNotEqualTo(String value) {
            addCriterion("sup_name <>", value, "supName");
            return (Criteria) this;
        }

        public Criteria andSupNameGreaterThan(String value) {
            addCriterion("sup_name >", value, "supName");
            return (Criteria) this;
        }

        public Criteria andSupNameGreaterThanOrEqualTo(String value) {
            addCriterion("sup_name >=", value, "supName");
            return (Criteria) this;
        }

        public Criteria andSupNameLessThan(String value) {
            addCriterion("sup_name <", value, "supName");
            return (Criteria) this;
        }

        public Criteria andSupNameLessThanOrEqualTo(String value) {
            addCriterion("sup_name <=", value, "supName");
            return (Criteria) this;
        }

        public Criteria andSupNameLike(String value) {
            addCriterion("sup_name like", value, "supName");
            return (Criteria) this;
        }

        public Criteria andSupNameNotLike(String value) {
            addCriterion("sup_name not like", value, "supName");
            return (Criteria) this;
        }

        public Criteria andSupNameIn(List<String> values) {
            addCriterion("sup_name in", values, "supName");
            return (Criteria) this;
        }

        public Criteria andSupNameNotIn(List<String> values) {
            addCriterion("sup_name not in", values, "supName");
            return (Criteria) this;
        }

        public Criteria andSupNameBetween(String value1, String value2) {
            addCriterion("sup_name between", value1, value2, "supName");
            return (Criteria) this;
        }

        public Criteria andSupNameNotBetween(String value1, String value2) {
            addCriterion("sup_name not between", value1, value2, "supName");
            return (Criteria) this;
        }

        public Criteria andSupLinkmanIsNull() {
            addCriterion("sup_linkman is null");
            return (Criteria) this;
        }

        public Criteria andSupLinkmanIsNotNull() {
            addCriterion("sup_linkman is not null");
            return (Criteria) this;
        }

        public Criteria andSupLinkmanEqualTo(String value) {
            addCriterion("sup_linkman =", value, "supLinkman");
            return (Criteria) this;
        }

        public Criteria andSupLinkmanNotEqualTo(String value) {
            addCriterion("sup_linkman <>", value, "supLinkman");
            return (Criteria) this;
        }

        public Criteria andSupLinkmanGreaterThan(String value) {
            addCriterion("sup_linkman >", value, "supLinkman");
            return (Criteria) this;
        }

        public Criteria andSupLinkmanGreaterThanOrEqualTo(String value) {
            addCriterion("sup_linkman >=", value, "supLinkman");
            return (Criteria) this;
        }

        public Criteria andSupLinkmanLessThan(String value) {
            addCriterion("sup_linkman <", value, "supLinkman");
            return (Criteria) this;
        }

        public Criteria andSupLinkmanLessThanOrEqualTo(String value) {
            addCriterion("sup_linkman <=", value, "supLinkman");
            return (Criteria) this;
        }

        public Criteria andSupLinkmanLike(String value) {
            addCriterion("sup_linkman like", value, "supLinkman");
            return (Criteria) this;
        }

        public Criteria andSupLinkmanNotLike(String value) {
            addCriterion("sup_linkman not like", value, "supLinkman");
            return (Criteria) this;
        }

        public Criteria andSupLinkmanIn(List<String> values) {
            addCriterion("sup_linkman in", values, "supLinkman");
            return (Criteria) this;
        }

        public Criteria andSupLinkmanNotIn(List<String> values) {
            addCriterion("sup_linkman not in", values, "supLinkman");
            return (Criteria) this;
        }

        public Criteria andSupLinkmanBetween(String value1, String value2) {
            addCriterion("sup_linkman between", value1, value2, "supLinkman");
            return (Criteria) this;
        }

        public Criteria andSupLinkmanNotBetween(String value1, String value2) {
            addCriterion("sup_linkman not between", value1, value2, "supLinkman");
            return (Criteria) this;
        }

        public Criteria andSupPhoneIsNull() {
            addCriterion("sup_phone is null");
            return (Criteria) this;
        }

        public Criteria andSupPhoneIsNotNull() {
            addCriterion("sup_phone is not null");
            return (Criteria) this;
        }

        public Criteria andSupPhoneEqualTo(String value) {
            addCriterion("sup_phone =", value, "supPhone");
            return (Criteria) this;
        }

        public Criteria andSupPhoneNotEqualTo(String value) {
            addCriterion("sup_phone <>", value, "supPhone");
            return (Criteria) this;
        }

        public Criteria andSupPhoneGreaterThan(String value) {
            addCriterion("sup_phone >", value, "supPhone");
            return (Criteria) this;
        }

        public Criteria andSupPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("sup_phone >=", value, "supPhone");
            return (Criteria) this;
        }

        public Criteria andSupPhoneLessThan(String value) {
            addCriterion("sup_phone <", value, "supPhone");
            return (Criteria) this;
        }

        public Criteria andSupPhoneLessThanOrEqualTo(String value) {
            addCriterion("sup_phone <=", value, "supPhone");
            return (Criteria) this;
        }

        public Criteria andSupPhoneLike(String value) {
            addCriterion("sup_phone like", value, "supPhone");
            return (Criteria) this;
        }

        public Criteria andSupPhoneNotLike(String value) {
            addCriterion("sup_phone not like", value, "supPhone");
            return (Criteria) this;
        }

        public Criteria andSupPhoneIn(List<String> values) {
            addCriterion("sup_phone in", values, "supPhone");
            return (Criteria) this;
        }

        public Criteria andSupPhoneNotIn(List<String> values) {
            addCriterion("sup_phone not in", values, "supPhone");
            return (Criteria) this;
        }

        public Criteria andSupPhoneBetween(String value1, String value2) {
            addCriterion("sup_phone between", value1, value2, "supPhone");
            return (Criteria) this;
        }

        public Criteria andSupPhoneNotBetween(String value1, String value2) {
            addCriterion("sup_phone not between", value1, value2, "supPhone");
            return (Criteria) this;
        }

        public Criteria andSupAddressIsNull() {
            addCriterion("sup_address is null");
            return (Criteria) this;
        }

        public Criteria andSupAddressIsNotNull() {
            addCriterion("sup_address is not null");
            return (Criteria) this;
        }

        public Criteria andSupAddressEqualTo(String value) {
            addCriterion("sup_address =", value, "supAddress");
            return (Criteria) this;
        }

        public Criteria andSupAddressNotEqualTo(String value) {
            addCriterion("sup_address <>", value, "supAddress");
            return (Criteria) this;
        }

        public Criteria andSupAddressGreaterThan(String value) {
            addCriterion("sup_address >", value, "supAddress");
            return (Criteria) this;
        }

        public Criteria andSupAddressGreaterThanOrEqualTo(String value) {
            addCriterion("sup_address >=", value, "supAddress");
            return (Criteria) this;
        }

        public Criteria andSupAddressLessThan(String value) {
            addCriterion("sup_address <", value, "supAddress");
            return (Criteria) this;
        }

        public Criteria andSupAddressLessThanOrEqualTo(String value) {
            addCriterion("sup_address <=", value, "supAddress");
            return (Criteria) this;
        }

        public Criteria andSupAddressLike(String value) {
            addCriterion("sup_address like", value, "supAddress");
            return (Criteria) this;
        }

        public Criteria andSupAddressNotLike(String value) {
            addCriterion("sup_address not like", value, "supAddress");
            return (Criteria) this;
        }

        public Criteria andSupAddressIn(List<String> values) {
            addCriterion("sup_address in", values, "supAddress");
            return (Criteria) this;
        }

        public Criteria andSupAddressNotIn(List<String> values) {
            addCriterion("sup_address not in", values, "supAddress");
            return (Criteria) this;
        }

        public Criteria andSupAddressBetween(String value1, String value2) {
            addCriterion("sup_address between", value1, value2, "supAddress");
            return (Criteria) this;
        }

        public Criteria andSupAddressNotBetween(String value1, String value2) {
            addCriterion("sup_address not between", value1, value2, "supAddress");
            return (Criteria) this;
        }

        public Criteria andSupRemarkIsNull() {
            addCriterion("sup_remark is null");
            return (Criteria) this;
        }

        public Criteria andSupRemarkIsNotNull() {
            addCriterion("sup_remark is not null");
            return (Criteria) this;
        }

        public Criteria andSupRemarkEqualTo(String value) {
            addCriterion("sup_remark =", value, "supRemark");
            return (Criteria) this;
        }

        public Criteria andSupRemarkNotEqualTo(String value) {
            addCriterion("sup_remark <>", value, "supRemark");
            return (Criteria) this;
        }

        public Criteria andSupRemarkGreaterThan(String value) {
            addCriterion("sup_remark >", value, "supRemark");
            return (Criteria) this;
        }

        public Criteria andSupRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("sup_remark >=", value, "supRemark");
            return (Criteria) this;
        }

        public Criteria andSupRemarkLessThan(String value) {
            addCriterion("sup_remark <", value, "supRemark");
            return (Criteria) this;
        }

        public Criteria andSupRemarkLessThanOrEqualTo(String value) {
            addCriterion("sup_remark <=", value, "supRemark");
            return (Criteria) this;
        }

        public Criteria andSupRemarkLike(String value) {
            addCriterion("sup_remark like", value, "supRemark");
            return (Criteria) this;
        }

        public Criteria andSupRemarkNotLike(String value) {
            addCriterion("sup_remark not like", value, "supRemark");
            return (Criteria) this;
        }

        public Criteria andSupRemarkIn(List<String> values) {
            addCriterion("sup_remark in", values, "supRemark");
            return (Criteria) this;
        }

        public Criteria andSupRemarkNotIn(List<String> values) {
            addCriterion("sup_remark not in", values, "supRemark");
            return (Criteria) this;
        }

        public Criteria andSupRemarkBetween(String value1, String value2) {
            addCriterion("sup_remark between", value1, value2, "supRemark");
            return (Criteria) this;
        }

        public Criteria andSupRemarkNotBetween(String value1, String value2) {
            addCriterion("sup_remark not between", value1, value2, "supRemark");
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