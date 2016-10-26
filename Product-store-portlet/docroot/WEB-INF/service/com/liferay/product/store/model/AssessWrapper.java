/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.product.store.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Assess}.
 * </p>
 *
 * @author zhangpengfei
 * @see Assess
 * @generated
 */
public class AssessWrapper implements Assess, ModelWrapper<Assess> {
	public AssessWrapper(Assess assess) {
		_assess = assess;
	}

	@Override
	public Class<?> getModelClass() {
		return Assess.class;
	}

	@Override
	public String getModelClassName() {
		return Assess.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("assessId", getAssessId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("projectName", getProjectName());
		attributes.put("createDate", getCreateDate());
		attributes.put("multipleAssess", getMultipleAssess());
		attributes.put("multiPercent", getMultiPercent());
		attributes.put("configurable", getConfigurable());
		attributes.put("stability", getStability());
		attributes.put("integrationGrade", getIntegrationGrade());
		attributes.put("applyId", getApplyId());
		attributes.put("productId", getProductId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long assessId = (Long)attributes.get("assessId");

		if (assessId != null) {
			setAssessId(assessId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		String projectName = (String)attributes.get("projectName");

		if (projectName != null) {
			setProjectName(projectName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Double multipleAssess = (Double)attributes.get("multipleAssess");

		if (multipleAssess != null) {
			setMultipleAssess(multipleAssess);
		}

		Double multiPercent = (Double)attributes.get("multiPercent");

		if (multiPercent != null) {
			setMultiPercent(multiPercent);
		}

		Long configurable = (Long)attributes.get("configurable");

		if (configurable != null) {
			setConfigurable(configurable);
		}

		Long stability = (Long)attributes.get("stability");

		if (stability != null) {
			setStability(stability);
		}

		Long integrationGrade = (Long)attributes.get("integrationGrade");

		if (integrationGrade != null) {
			setIntegrationGrade(integrationGrade);
		}

		Long applyId = (Long)attributes.get("applyId");

		if (applyId != null) {
			setApplyId(applyId);
		}

		Long productId = (Long)attributes.get("productId");

		if (productId != null) {
			setProductId(productId);
		}
	}

	/**
	* Returns the primary key of this assess.
	*
	* @return the primary key of this assess
	*/
	@Override
	public long getPrimaryKey() {
		return _assess.getPrimaryKey();
	}

	/**
	* Sets the primary key of this assess.
	*
	* @param primaryKey the primary key of this assess
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_assess.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the uuid of this assess.
	*
	* @return the uuid of this assess
	*/
	@Override
	public java.lang.String getUuid() {
		return _assess.getUuid();
	}

	/**
	* Sets the uuid of this assess.
	*
	* @param uuid the uuid of this assess
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_assess.setUuid(uuid);
	}

	/**
	* Returns the assess ID of this assess.
	*
	* @return the assess ID of this assess
	*/
	@Override
	public long getAssessId() {
		return _assess.getAssessId();
	}

	/**
	* Sets the assess ID of this assess.
	*
	* @param assessId the assess ID of this assess
	*/
	@Override
	public void setAssessId(long assessId) {
		_assess.setAssessId(assessId);
	}

	/**
	* Returns the group ID of this assess.
	*
	* @return the group ID of this assess
	*/
	@Override
	public long getGroupId() {
		return _assess.getGroupId();
	}

	/**
	* Sets the group ID of this assess.
	*
	* @param groupId the group ID of this assess
	*/
	@Override
	public void setGroupId(long groupId) {
		_assess.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this assess.
	*
	* @return the company ID of this assess
	*/
	@Override
	public long getCompanyId() {
		return _assess.getCompanyId();
	}

	/**
	* Sets the company ID of this assess.
	*
	* @param companyId the company ID of this assess
	*/
	@Override
	public void setCompanyId(long companyId) {
		_assess.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this assess.
	*
	* @return the user ID of this assess
	*/
	@Override
	public long getUserId() {
		return _assess.getUserId();
	}

	/**
	* Sets the user ID of this assess.
	*
	* @param userId the user ID of this assess
	*/
	@Override
	public void setUserId(long userId) {
		_assess.setUserId(userId);
	}

	/**
	* Returns the user uuid of this assess.
	*
	* @return the user uuid of this assess
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _assess.getUserUuid();
	}

	/**
	* Sets the user uuid of this assess.
	*
	* @param userUuid the user uuid of this assess
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_assess.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this assess.
	*
	* @return the user name of this assess
	*/
	@Override
	public java.lang.String getUserName() {
		return _assess.getUserName();
	}

	/**
	* Sets the user name of this assess.
	*
	* @param userName the user name of this assess
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_assess.setUserName(userName);
	}

	/**
	* Returns the project name of this assess.
	*
	* @return the project name of this assess
	*/
	@Override
	public java.lang.String getProjectName() {
		return _assess.getProjectName();
	}

	/**
	* Sets the project name of this assess.
	*
	* @param projectName the project name of this assess
	*/
	@Override
	public void setProjectName(java.lang.String projectName) {
		_assess.setProjectName(projectName);
	}

	/**
	* Returns the create date of this assess.
	*
	* @return the create date of this assess
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _assess.getCreateDate();
	}

	/**
	* Sets the create date of this assess.
	*
	* @param createDate the create date of this assess
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_assess.setCreateDate(createDate);
	}

	/**
	* Returns the multiple assess of this assess.
	*
	* @return the multiple assess of this assess
	*/
	@Override
	public double getMultipleAssess() {
		return _assess.getMultipleAssess();
	}

	/**
	* Sets the multiple assess of this assess.
	*
	* @param multipleAssess the multiple assess of this assess
	*/
	@Override
	public void setMultipleAssess(double multipleAssess) {
		_assess.setMultipleAssess(multipleAssess);
	}

	/**
	* Returns the multi percent of this assess.
	*
	* @return the multi percent of this assess
	*/
	@Override
	public double getMultiPercent() {
		return _assess.getMultiPercent();
	}

	/**
	* Sets the multi percent of this assess.
	*
	* @param multiPercent the multi percent of this assess
	*/
	@Override
	public void setMultiPercent(double multiPercent) {
		_assess.setMultiPercent(multiPercent);
	}

	/**
	* Returns the configurable of this assess.
	*
	* @return the configurable of this assess
	*/
	@Override
	public long getConfigurable() {
		return _assess.getConfigurable();
	}

	/**
	* Sets the configurable of this assess.
	*
	* @param configurable the configurable of this assess
	*/
	@Override
	public void setConfigurable(long configurable) {
		_assess.setConfigurable(configurable);
	}

	/**
	* Returns the stability of this assess.
	*
	* @return the stability of this assess
	*/
	@Override
	public long getStability() {
		return _assess.getStability();
	}

	/**
	* Sets the stability of this assess.
	*
	* @param stability the stability of this assess
	*/
	@Override
	public void setStability(long stability) {
		_assess.setStability(stability);
	}

	/**
	* Returns the integration grade of this assess.
	*
	* @return the integration grade of this assess
	*/
	@Override
	public long getIntegrationGrade() {
		return _assess.getIntegrationGrade();
	}

	/**
	* Sets the integration grade of this assess.
	*
	* @param integrationGrade the integration grade of this assess
	*/
	@Override
	public void setIntegrationGrade(long integrationGrade) {
		_assess.setIntegrationGrade(integrationGrade);
	}

	/**
	* Returns the apply ID of this assess.
	*
	* @return the apply ID of this assess
	*/
	@Override
	public long getApplyId() {
		return _assess.getApplyId();
	}

	/**
	* Sets the apply ID of this assess.
	*
	* @param applyId the apply ID of this assess
	*/
	@Override
	public void setApplyId(long applyId) {
		_assess.setApplyId(applyId);
	}

	/**
	* Returns the product ID of this assess.
	*
	* @return the product ID of this assess
	*/
	@Override
	public long getProductId() {
		return _assess.getProductId();
	}

	/**
	* Sets the product ID of this assess.
	*
	* @param productId the product ID of this assess
	*/
	@Override
	public void setProductId(long productId) {
		_assess.setProductId(productId);
	}

	@Override
	public boolean isNew() {
		return _assess.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_assess.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _assess.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_assess.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _assess.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _assess.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_assess.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _assess.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_assess.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_assess.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_assess.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new AssessWrapper((Assess)_assess.clone());
	}

	@Override
	public int compareTo(com.liferay.product.store.model.Assess assess) {
		return _assess.compareTo(assess);
	}

	@Override
	public int hashCode() {
		return _assess.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.liferay.product.store.model.Assess> toCacheModel() {
		return _assess.toCacheModel();
	}

	@Override
	public com.liferay.product.store.model.Assess toEscapedModel() {
		return new AssessWrapper(_assess.toEscapedModel());
	}

	@Override
	public com.liferay.product.store.model.Assess toUnescapedModel() {
		return new AssessWrapper(_assess.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _assess.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _assess.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_assess.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof AssessWrapper)) {
			return false;
		}

		AssessWrapper assessWrapper = (AssessWrapper)obj;

		if (Validator.equals(_assess, assessWrapper._assess)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Assess getWrappedAssess() {
		return _assess;
	}

	@Override
	public Assess getWrappedModel() {
		return _assess;
	}

	@Override
	public void resetOriginalValues() {
		_assess.resetOriginalValues();
	}

	private Assess _assess;
}