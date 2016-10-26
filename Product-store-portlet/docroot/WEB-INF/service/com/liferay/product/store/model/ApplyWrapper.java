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
 * This class is a wrapper for {@link Apply}.
 * </p>
 *
 * @author zhangpengfei
 * @see Apply
 * @generated
 */
public class ApplyWrapper implements Apply, ModelWrapper<Apply> {
	public ApplyWrapper(Apply apply) {
		_apply = apply;
	}

	@Override
	public Class<?> getModelClass() {
		return Apply.class;
	}

	@Override
	public String getModelClassName() {
		return Apply.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("applyId", getApplyId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("projectName", getProjectName());
		attributes.put("integrationObject", getIntegrationObject());
		attributes.put("useType", getUseType());
		attributes.put("approveFlag", getApproveFlag());
		attributes.put("approveDate", getApproveDate());
		attributes.put("creationDate", getCreationDate());
		attributes.put("createdBy", getCreatedBy());
		attributes.put("updateDate", getUpdateDate());
		attributes.put("updatedBy", getUpdatedBy());
		attributes.put("productId", getProductId());
		attributes.put("useDate", getUseDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long applyId = (Long)attributes.get("applyId");

		if (applyId != null) {
			setApplyId(applyId);
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

		String integrationObject = (String)attributes.get("integrationObject");

		if (integrationObject != null) {
			setIntegrationObject(integrationObject);
		}

		String useType = (String)attributes.get("useType");

		if (useType != null) {
			setUseType(useType);
		}

		String approveFlag = (String)attributes.get("approveFlag");

		if (approveFlag != null) {
			setApproveFlag(approveFlag);
		}

		Date approveDate = (Date)attributes.get("approveDate");

		if (approveDate != null) {
			setApproveDate(approveDate);
		}

		Date creationDate = (Date)attributes.get("creationDate");

		if (creationDate != null) {
			setCreationDate(creationDate);
		}

		Long createdBy = (Long)attributes.get("createdBy");

		if (createdBy != null) {
			setCreatedBy(createdBy);
		}

		Date updateDate = (Date)attributes.get("updateDate");

		if (updateDate != null) {
			setUpdateDate(updateDate);
		}

		Long updatedBy = (Long)attributes.get("updatedBy");

		if (updatedBy != null) {
			setUpdatedBy(updatedBy);
		}

		Long productId = (Long)attributes.get("productId");

		if (productId != null) {
			setProductId(productId);
		}

		Date useDate = (Date)attributes.get("useDate");

		if (useDate != null) {
			setUseDate(useDate);
		}
	}

	/**
	* Returns the primary key of this apply.
	*
	* @return the primary key of this apply
	*/
	@Override
	public long getPrimaryKey() {
		return _apply.getPrimaryKey();
	}

	/**
	* Sets the primary key of this apply.
	*
	* @param primaryKey the primary key of this apply
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_apply.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the uuid of this apply.
	*
	* @return the uuid of this apply
	*/
	@Override
	public java.lang.String getUuid() {
		return _apply.getUuid();
	}

	/**
	* Sets the uuid of this apply.
	*
	* @param uuid the uuid of this apply
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_apply.setUuid(uuid);
	}

	/**
	* Returns the apply ID of this apply.
	*
	* @return the apply ID of this apply
	*/
	@Override
	public long getApplyId() {
		return _apply.getApplyId();
	}

	/**
	* Sets the apply ID of this apply.
	*
	* @param applyId the apply ID of this apply
	*/
	@Override
	public void setApplyId(long applyId) {
		_apply.setApplyId(applyId);
	}

	/**
	* Returns the group ID of this apply.
	*
	* @return the group ID of this apply
	*/
	@Override
	public long getGroupId() {
		return _apply.getGroupId();
	}

	/**
	* Sets the group ID of this apply.
	*
	* @param groupId the group ID of this apply
	*/
	@Override
	public void setGroupId(long groupId) {
		_apply.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this apply.
	*
	* @return the company ID of this apply
	*/
	@Override
	public long getCompanyId() {
		return _apply.getCompanyId();
	}

	/**
	* Sets the company ID of this apply.
	*
	* @param companyId the company ID of this apply
	*/
	@Override
	public void setCompanyId(long companyId) {
		_apply.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this apply.
	*
	* @return the user ID of this apply
	*/
	@Override
	public long getUserId() {
		return _apply.getUserId();
	}

	/**
	* Sets the user ID of this apply.
	*
	* @param userId the user ID of this apply
	*/
	@Override
	public void setUserId(long userId) {
		_apply.setUserId(userId);
	}

	/**
	* Returns the user uuid of this apply.
	*
	* @return the user uuid of this apply
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _apply.getUserUuid();
	}

	/**
	* Sets the user uuid of this apply.
	*
	* @param userUuid the user uuid of this apply
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_apply.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this apply.
	*
	* @return the user name of this apply
	*/
	@Override
	public java.lang.String getUserName() {
		return _apply.getUserName();
	}

	/**
	* Sets the user name of this apply.
	*
	* @param userName the user name of this apply
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_apply.setUserName(userName);
	}

	/**
	* Returns the project name of this apply.
	*
	* @return the project name of this apply
	*/
	@Override
	public java.lang.String getProjectName() {
		return _apply.getProjectName();
	}

	/**
	* Sets the project name of this apply.
	*
	* @param projectName the project name of this apply
	*/
	@Override
	public void setProjectName(java.lang.String projectName) {
		_apply.setProjectName(projectName);
	}

	/**
	* Returns the integration object of this apply.
	*
	* @return the integration object of this apply
	*/
	@Override
	public java.lang.String getIntegrationObject() {
		return _apply.getIntegrationObject();
	}

	/**
	* Sets the integration object of this apply.
	*
	* @param integrationObject the integration object of this apply
	*/
	@Override
	public void setIntegrationObject(java.lang.String integrationObject) {
		_apply.setIntegrationObject(integrationObject);
	}

	/**
	* Returns the use type of this apply.
	*
	* @return the use type of this apply
	*/
	@Override
	public java.lang.String getUseType() {
		return _apply.getUseType();
	}

	/**
	* Sets the use type of this apply.
	*
	* @param useType the use type of this apply
	*/
	@Override
	public void setUseType(java.lang.String useType) {
		_apply.setUseType(useType);
	}

	/**
	* Returns the approve flag of this apply.
	*
	* @return the approve flag of this apply
	*/
	@Override
	public java.lang.String getApproveFlag() {
		return _apply.getApproveFlag();
	}

	/**
	* Sets the approve flag of this apply.
	*
	* @param approveFlag the approve flag of this apply
	*/
	@Override
	public void setApproveFlag(java.lang.String approveFlag) {
		_apply.setApproveFlag(approveFlag);
	}

	/**
	* Returns the approve date of this apply.
	*
	* @return the approve date of this apply
	*/
	@Override
	public java.util.Date getApproveDate() {
		return _apply.getApproveDate();
	}

	/**
	* Sets the approve date of this apply.
	*
	* @param approveDate the approve date of this apply
	*/
	@Override
	public void setApproveDate(java.util.Date approveDate) {
		_apply.setApproveDate(approveDate);
	}

	/**
	* Returns the creation date of this apply.
	*
	* @return the creation date of this apply
	*/
	@Override
	public java.util.Date getCreationDate() {
		return _apply.getCreationDate();
	}

	/**
	* Sets the creation date of this apply.
	*
	* @param creationDate the creation date of this apply
	*/
	@Override
	public void setCreationDate(java.util.Date creationDate) {
		_apply.setCreationDate(creationDate);
	}

	/**
	* Returns the created by of this apply.
	*
	* @return the created by of this apply
	*/
	@Override
	public long getCreatedBy() {
		return _apply.getCreatedBy();
	}

	/**
	* Sets the created by of this apply.
	*
	* @param createdBy the created by of this apply
	*/
	@Override
	public void setCreatedBy(long createdBy) {
		_apply.setCreatedBy(createdBy);
	}

	/**
	* Returns the update date of this apply.
	*
	* @return the update date of this apply
	*/
	@Override
	public java.util.Date getUpdateDate() {
		return _apply.getUpdateDate();
	}

	/**
	* Sets the update date of this apply.
	*
	* @param updateDate the update date of this apply
	*/
	@Override
	public void setUpdateDate(java.util.Date updateDate) {
		_apply.setUpdateDate(updateDate);
	}

	/**
	* Returns the updated by of this apply.
	*
	* @return the updated by of this apply
	*/
	@Override
	public long getUpdatedBy() {
		return _apply.getUpdatedBy();
	}

	/**
	* Sets the updated by of this apply.
	*
	* @param updatedBy the updated by of this apply
	*/
	@Override
	public void setUpdatedBy(long updatedBy) {
		_apply.setUpdatedBy(updatedBy);
	}

	/**
	* Returns the product ID of this apply.
	*
	* @return the product ID of this apply
	*/
	@Override
	public long getProductId() {
		return _apply.getProductId();
	}

	/**
	* Sets the product ID of this apply.
	*
	* @param productId the product ID of this apply
	*/
	@Override
	public void setProductId(long productId) {
		_apply.setProductId(productId);
	}

	/**
	* Returns the use date of this apply.
	*
	* @return the use date of this apply
	*/
	@Override
	public java.util.Date getUseDate() {
		return _apply.getUseDate();
	}

	/**
	* Sets the use date of this apply.
	*
	* @param useDate the use date of this apply
	*/
	@Override
	public void setUseDate(java.util.Date useDate) {
		_apply.setUseDate(useDate);
	}

	@Override
	public boolean isNew() {
		return _apply.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_apply.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _apply.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_apply.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _apply.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _apply.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_apply.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _apply.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_apply.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_apply.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_apply.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new ApplyWrapper((Apply)_apply.clone());
	}

	@Override
	public int compareTo(com.liferay.product.store.model.Apply apply) {
		return _apply.compareTo(apply);
	}

	@Override
	public int hashCode() {
		return _apply.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.liferay.product.store.model.Apply> toCacheModel() {
		return _apply.toCacheModel();
	}

	@Override
	public com.liferay.product.store.model.Apply toEscapedModel() {
		return new ApplyWrapper(_apply.toEscapedModel());
	}

	@Override
	public com.liferay.product.store.model.Apply toUnescapedModel() {
		return new ApplyWrapper(_apply.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _apply.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _apply.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_apply.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ApplyWrapper)) {
			return false;
		}

		ApplyWrapper applyWrapper = (ApplyWrapper)obj;

		if (Validator.equals(_apply, applyWrapper._apply)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Apply getWrappedApply() {
		return _apply;
	}

	@Override
	public Apply getWrappedModel() {
		return _apply;
	}

	@Override
	public void resetOriginalValues() {
		_apply.resetOriginalValues();
	}

	private Apply _apply;
}