package com.poobo.sysmanage.tvshow.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TblTvShowExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table tbl_tv_show
	 * @mbg.generated  Thu Dec 07 22:01:33 GMT+08:00 2017
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table tbl_tv_show
	 * @mbg.generated  Thu Dec 07 22:01:33 GMT+08:00 2017
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table tbl_tv_show
	 * @mbg.generated  Thu Dec 07 22:01:33 GMT+08:00 2017
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tbl_tv_show
	 * @mbg.generated  Thu Dec 07 22:01:33 GMT+08:00 2017
	 */
	public TblTvShowExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tbl_tv_show
	 * @mbg.generated  Thu Dec 07 22:01:33 GMT+08:00 2017
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tbl_tv_show
	 * @mbg.generated  Thu Dec 07 22:01:33 GMT+08:00 2017
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tbl_tv_show
	 * @mbg.generated  Thu Dec 07 22:01:33 GMT+08:00 2017
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tbl_tv_show
	 * @mbg.generated  Thu Dec 07 22:01:33 GMT+08:00 2017
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tbl_tv_show
	 * @mbg.generated  Thu Dec 07 22:01:33 GMT+08:00 2017
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tbl_tv_show
	 * @mbg.generated  Thu Dec 07 22:01:33 GMT+08:00 2017
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tbl_tv_show
	 * @mbg.generated  Thu Dec 07 22:01:33 GMT+08:00 2017
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tbl_tv_show
	 * @mbg.generated  Thu Dec 07 22:01:33 GMT+08:00 2017
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tbl_tv_show
	 * @mbg.generated  Thu Dec 07 22:01:33 GMT+08:00 2017
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tbl_tv_show
	 * @mbg.generated  Thu Dec 07 22:01:33 GMT+08:00 2017
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table tbl_tv_show
	 * @mbg.generated  Thu Dec 07 22:01:33 GMT+08:00 2017
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

		public Criteria andPkGlobalIdIsNull() {
			addCriterion("pk_global_id is null");
			return (Criteria) this;
		}

		public Criteria andPkGlobalIdIsNotNull() {
			addCriterion("pk_global_id is not null");
			return (Criteria) this;
		}

		public Criteria andPkGlobalIdEqualTo(String value) {
			addCriterion("pk_global_id =", value, "pkGlobalId");
			return (Criteria) this;
		}

		public Criteria andPkGlobalIdNotEqualTo(String value) {
			addCriterion("pk_global_id <>", value, "pkGlobalId");
			return (Criteria) this;
		}

		public Criteria andPkGlobalIdGreaterThan(String value) {
			addCriterion("pk_global_id >", value, "pkGlobalId");
			return (Criteria) this;
		}

		public Criteria andPkGlobalIdGreaterThanOrEqualTo(String value) {
			addCriterion("pk_global_id >=", value, "pkGlobalId");
			return (Criteria) this;
		}

		public Criteria andPkGlobalIdLessThan(String value) {
			addCriterion("pk_global_id <", value, "pkGlobalId");
			return (Criteria) this;
		}

		public Criteria andPkGlobalIdLessThanOrEqualTo(String value) {
			addCriterion("pk_global_id <=", value, "pkGlobalId");
			return (Criteria) this;
		}

		public Criteria andPkGlobalIdLike(String value) {
			addCriterion("pk_global_id like", value, "pkGlobalId");
			return (Criteria) this;
		}

		public Criteria andPkGlobalIdNotLike(String value) {
			addCriterion("pk_global_id not like", value, "pkGlobalId");
			return (Criteria) this;
		}

		public Criteria andPkGlobalIdIn(List<String> values) {
			addCriterion("pk_global_id in", values, "pkGlobalId");
			return (Criteria) this;
		}

		public Criteria andPkGlobalIdNotIn(List<String> values) {
			addCriterion("pk_global_id not in", values, "pkGlobalId");
			return (Criteria) this;
		}

		public Criteria andPkGlobalIdBetween(String value1, String value2) {
			addCriterion("pk_global_id between", value1, value2, "pkGlobalId");
			return (Criteria) this;
		}

		public Criteria andPkGlobalIdNotBetween(String value1, String value2) {
			addCriterion("pk_global_id not between", value1, value2, "pkGlobalId");
			return (Criteria) this;
		}

		public Criteria andMDateIsNull() {
			addCriterion("m_date is null");
			return (Criteria) this;
		}

		public Criteria andMDateIsNotNull() {
			addCriterion("m_date is not null");
			return (Criteria) this;
		}

		public Criteria andMDateEqualTo(Date value) {
			addCriterion("m_date =", value, "mDate");
			return (Criteria) this;
		}

		public Criteria andMDateNotEqualTo(Date value) {
			addCriterion("m_date <>", value, "mDate");
			return (Criteria) this;
		}

		public Criteria andMDateGreaterThan(Date value) {
			addCriterion("m_date >", value, "mDate");
			return (Criteria) this;
		}

		public Criteria andMDateGreaterThanOrEqualTo(Date value) {
			addCriterion("m_date >=", value, "mDate");
			return (Criteria) this;
		}

		public Criteria andMDateLessThan(Date value) {
			addCriterion("m_date <", value, "mDate");
			return (Criteria) this;
		}

		public Criteria andMDateLessThanOrEqualTo(Date value) {
			addCriterion("m_date <=", value, "mDate");
			return (Criteria) this;
		}

		public Criteria andMDateIn(List<Date> values) {
			addCriterion("m_date in", values, "mDate");
			return (Criteria) this;
		}

		public Criteria andMDateNotIn(List<Date> values) {
			addCriterion("m_date not in", values, "mDate");
			return (Criteria) this;
		}

		public Criteria andMDateBetween(Date value1, Date value2) {
			addCriterion("m_date between", value1, value2, "mDate");
			return (Criteria) this;
		}

		public Criteria andMDateNotBetween(Date value1, Date value2) {
			addCriterion("m_date not between", value1, value2, "mDate");
			return (Criteria) this;
		}

		public Criteria andAudioIsNull() {
			addCriterion("audio is null");
			return (Criteria) this;
		}

		public Criteria andAudioIsNotNull() {
			addCriterion("audio is not null");
			return (Criteria) this;
		}

		public Criteria andAudioEqualTo(String value) {
			addCriterion("audio =", value, "audio");
			return (Criteria) this;
		}

		public Criteria andAudioNotEqualTo(String value) {
			addCriterion("audio <>", value, "audio");
			return (Criteria) this;
		}

		public Criteria andAudioGreaterThan(String value) {
			addCriterion("audio >", value, "audio");
			return (Criteria) this;
		}

		public Criteria andAudioGreaterThanOrEqualTo(String value) {
			addCriterion("audio >=", value, "audio");
			return (Criteria) this;
		}

		public Criteria andAudioLessThan(String value) {
			addCriterion("audio <", value, "audio");
			return (Criteria) this;
		}

		public Criteria andAudioLessThanOrEqualTo(String value) {
			addCriterion("audio <=", value, "audio");
			return (Criteria) this;
		}

		public Criteria andAudioLike(String value) {
			addCriterion("audio like", value, "audio");
			return (Criteria) this;
		}

		public Criteria andAudioNotLike(String value) {
			addCriterion("audio not like", value, "audio");
			return (Criteria) this;
		}

		public Criteria andAudioIn(List<String> values) {
			addCriterion("audio in", values, "audio");
			return (Criteria) this;
		}

		public Criteria andAudioNotIn(List<String> values) {
			addCriterion("audio not in", values, "audio");
			return (Criteria) this;
		}

		public Criteria andAudioBetween(String value1, String value2) {
			addCriterion("audio between", value1, value2, "audio");
			return (Criteria) this;
		}

		public Criteria andAudioNotBetween(String value1, String value2) {
			addCriterion("audio not between", value1, value2, "audio");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table tbl_tv_show
	 * @mbg.generated  Thu Dec 07 22:01:33 GMT+08:00 2017
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

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tbl_tv_show
     *
     * @mbg.generated do_not_delete_during_merge Thu Dec 07 22:01:16 GMT+08:00 2017
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}