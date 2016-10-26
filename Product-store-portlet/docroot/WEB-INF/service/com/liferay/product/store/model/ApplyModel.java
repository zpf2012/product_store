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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the Apply service. Represents a row in the &quot;CUX_Apply&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.product.store.model.impl.ApplyModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.product.store.model.impl.ApplyImpl}.
 * </p>
 *
 * @author zhangpengfei
 * @see Apply
 * @see com.liferay.product.store.model.impl.ApplyImpl
 * @see com.liferay.product.store.model.impl.ApplyModelImpl
 * @generated
 */
public interface ApplyModel extends BaseModel<Apply> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a apply model instance should use the {@link Apply} interface instead.
	 */

	/**
	 * Returns the primary key of this apply.
	 *
	 * @return the primary key of this apply
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this apply.
	 *
	 * @param primaryKey the primary key of this apply
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this apply.
	 *
	 * @return the uuid of this apply
	 */
	@AutoEscape
	public String getUuid();

	/**
	 * Sets the uuid of this apply.
	 *
	 * @param uuid the uuid of this apply
	 */
	public void setUuid(String uuid);

	/**
	 * Returns the apply ID of this apply.
	 *
	 * @return the apply ID of this apply
	 */
	public long getApplyId();

	/**
	 * Sets the apply ID of this apply.
	 *
	 * @param applyId the apply ID of this apply
	 */
	public void setApplyId(long applyId);

	/**
	 * Returns the group ID of this apply.
	 *
	 * @return the group ID of this apply
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this apply.
	 *
	 * @param groupId the group ID of this apply
	 */
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this apply.
	 *
	 * @return the company ID of this apply
	 */
	public long getCompanyId();

	/**
	 * Sets the company ID of this apply.
	 *
	 * @param companyId the company ID of this apply
	 */
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this apply.
	 *
	 * @return the user ID of this apply
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this apply.
	 *
	 * @param userId the user ID of this apply
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this apply.
	 *
	 * @return the user uuid of this apply
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this apply.
	 *
	 * @param userUuid the user uuid of this apply
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this apply.
	 *
	 * @return the user name of this apply
	 */
	@AutoEscape
	public String getUserName();

	/**
	 * Sets the user name of this apply.
	 *
	 * @param userName the user name of this apply
	 */
	public void setUserName(String userName);

	/**
	 * Returns the project name of this apply.
	 *
	 * @return the project name of this apply
	 */
	@AutoEscape
	public String getProjectName();

	/**
	 * Sets the project name of this apply.
	 *
	 * @param projectName the project name of this apply
	 */
	public void setProjectName(String projectName);

	/**
	 * Returns the integration object of this apply.
	 *
	 * @return the integration object of this apply
	 */
	@AutoEscape
	public String getIntegrationObject();

	/**
	 * Sets the integration object of this apply.
	 *
	 * @param integrationObject the integration object of this apply
	 */
	public void setIntegrationObject(String integrationObject);

	/**
	 * Returns the use type of this apply.
	 *
	 * @return the use type of this apply
	 */
	@AutoEscape
	public String getUseType();

	/**
	 * Sets the use type of this apply.
	 *
	 * @param useType the use type of this apply
	 */
	public void setUseType(String useType);

	/**
	 * Returns the approve flag of this apply.
	 *
	 * @return the approve flag of this apply
	 */
	@AutoEscape
	public String getApproveFlag();

	/**
	 * Sets the approve flag of this apply.
	 *
	 * @param approveFlag the approve flag of this apply
	 */
	public void setApproveFlag(String approveFlag);

	/**
	 * Returns the approve date of this apply.
	 *
	 * @return the approve date of this apply
	 */
	public Date getApproveDate();

	/**
	 * Sets the approve date of this apply.
	 *
	 * @param approveDate the approve date of this apply
	 */
	public void setApproveDate(Date approveDate);

	/**
	 * Returns the creation date of this apply.
	 *
	 * @return the creation date of this apply
	 */
	public Date getCreationDate();

	/**
	 * Sets the creation date of this apply.
	 *
	 * @param creationDate the creation date of this apply
	 */
	public void setCreationDate(Date creationDate);

	/**
	 * Returns the created by of this apply.
	 *
	 * @return the created by of this apply
	 */
	public long getCreatedBy();

	/**
	 * Sets the created by of this apply.
	 *
	 * @param createdBy the created by of this apply
	 */
	public void setCreatedBy(long createdBy);

	/**
	 * Returns the update date of this apply.
	 *
	 * @return the update date of this apply
	 */
	public Date getUpdateDate();

	/**
	 * Sets the update date of this apply.
	 *
	 * @param updateDate the update date of this apply
	 */
	public void setUpdateDate(Date updateDate);

	/**
	 * Returns the updated by of this apply.
	 *
	 * @return the updated by of this apply
	 */
	public long getUpdatedBy();

	/**
	 * Sets the updated by of this apply.
	 *
	 * @param updatedBy the updated by of this apply
	 */
	public void setUpdatedBy(long updatedBy);

	/**
	 * Returns the product ID of this apply.
	 *
	 * @return the product ID of this apply
	 */
	public long getProductId();

	/**
	 * Sets the product ID of this apply.
	 *
	 * @param productId the product ID of this apply
	 */
	public void setProductId(long productId);

	/**
	 * Returns the use date of this apply.
	 *
	 * @return the use date of this apply
	 */
	public Date getUseDate();

	/**
	 * Sets the use date of this apply.
	 *
	 * @param useDate the use date of this apply
	 */
	public void setUseDate(Date useDate);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(com.liferay.product.store.model.Apply apply);

	@Override
	public int hashCode();

	@Override
	public CacheModel<com.liferay.product.store.model.Apply> toCacheModel();

	@Override
	public com.liferay.product.store.model.Apply toEscapedModel();

	@Override
	public com.liferay.product.store.model.Apply toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}