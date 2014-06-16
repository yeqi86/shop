package com.mission.shop.product.dao.model;

import java.io.Serializable;
import java.util.Date;

public class Attribute implements Serializable {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column attribute.atrr_id
	 * @mbggenerated  Thu Jun 12 16:14:17 CST 2014
	 */
	private Long atrrId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column attribute.kind_id
	 * @mbggenerated  Thu Jun 12 16:14:17 CST 2014
	 */
	private Long kindId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column attribute.attr_name
	 * @mbggenerated  Thu Jun 12 16:14:17 CST 2014
	 */
	private String attrName;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column attribute.attr_values
	 * @mbggenerated  Thu Jun 12 16:14:17 CST 2014
	 */
	private String attrValues;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column attribute.attr_type
	 * @mbggenerated  Thu Jun 12 16:14:17 CST 2014
	 */
	private String attrType;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column attribute.create_time
	 * @mbggenerated  Thu Jun 12 16:14:17 CST 2014
	 */
	private Date createTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column attribute.last_update_time
	 * @mbggenerated  Thu Jun 12 16:14:17 CST 2014
	 */
	private Date lastUpdateTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table attribute
	 * @mbggenerated  Thu Jun 12 16:14:17 CST 2014
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column attribute.atrr_id
	 * @return  the value of attribute.atrr_id
	 * @mbggenerated  Thu Jun 12 16:14:17 CST 2014
	 */
	public Long getAtrrId() {
		return atrrId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column attribute.atrr_id
	 * @param atrrId  the value for attribute.atrr_id
	 * @mbggenerated  Thu Jun 12 16:14:17 CST 2014
	 */
	public void setAtrrId(Long atrrId) {
		this.atrrId = atrrId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column attribute.kind_id
	 * @return  the value of attribute.kind_id
	 * @mbggenerated  Thu Jun 12 16:14:17 CST 2014
	 */
	public Long getKindId() {
		return kindId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column attribute.kind_id
	 * @param kindId  the value for attribute.kind_id
	 * @mbggenerated  Thu Jun 12 16:14:17 CST 2014
	 */
	public void setKindId(Long kindId) {
		this.kindId = kindId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column attribute.attr_name
	 * @return  the value of attribute.attr_name
	 * @mbggenerated  Thu Jun 12 16:14:17 CST 2014
	 */
	public String getAttrName() {
		return attrName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column attribute.attr_name
	 * @param attrName  the value for attribute.attr_name
	 * @mbggenerated  Thu Jun 12 16:14:17 CST 2014
	 */
	public void setAttrName(String attrName) {
		this.attrName = attrName == null ? null : attrName.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column attribute.attr_values
	 * @return  the value of attribute.attr_values
	 * @mbggenerated  Thu Jun 12 16:14:17 CST 2014
	 */
	public String getAttrValues() {
		return attrValues;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column attribute.attr_values
	 * @param attrValues  the value for attribute.attr_values
	 * @mbggenerated  Thu Jun 12 16:14:17 CST 2014
	 */
	public void setAttrValues(String attrValues) {
		this.attrValues = attrValues == null ? null : attrValues.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column attribute.attr_type
	 * @return  the value of attribute.attr_type
	 * @mbggenerated  Thu Jun 12 16:14:17 CST 2014
	 */
	public String getAttrType() {
		return attrType;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column attribute.attr_type
	 * @param attrType  the value for attribute.attr_type
	 * @mbggenerated  Thu Jun 12 16:14:17 CST 2014
	 */
	public void setAttrType(String attrType) {
		this.attrType = attrType == null ? null : attrType.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column attribute.create_time
	 * @return  the value of attribute.create_time
	 * @mbggenerated  Thu Jun 12 16:14:17 CST 2014
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column attribute.create_time
	 * @param createTime  the value for attribute.create_time
	 * @mbggenerated  Thu Jun 12 16:14:17 CST 2014
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column attribute.last_update_time
	 * @return  the value of attribute.last_update_time
	 * @mbggenerated  Thu Jun 12 16:14:17 CST 2014
	 */
	public Date getLastUpdateTime() {
		return lastUpdateTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column attribute.last_update_time
	 * @param lastUpdateTime  the value for attribute.last_update_time
	 * @mbggenerated  Thu Jun 12 16:14:17 CST 2014
	 */
	public void setLastUpdateTime(Date lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}
}