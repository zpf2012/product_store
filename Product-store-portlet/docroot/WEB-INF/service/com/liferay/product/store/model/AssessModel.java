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
 * The base model interface for the Assess service. Represents a row in the &quot;CUX_Assess&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.product.store.model.impl.AssessModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.product.store.model.impl.AssessImpl}.
 * </p>
 *
 * @author zhangpengfei
 * @see Assess
 * @see com.liferay.product.store.model.impl.AssessImpl
 * @see com.liferay.product.store.model.impl.AssessModelImpl
 * @generated
 */
public interface AssessModel extends BaseModel<Assess> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a assess model instance should use the {@link Assess} interface instead.
	 */

	/**
	 * Returns the primary key of this assess.
	 *
	 * @return the primary key of this assess
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this assess.
	 *
	 * @param primaryKey the primary key of this assess
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this assess.
	 *
	 * @return the uuid of this assess
	 */
	@AutoEscape
	public String getUuid();

	/**
	 * Sets the uuid of this assess.
	 *
	 * @param uuid the uuid of this assess
	 */
	public void setUuid(String uuid);

	/**
	 * Returns the assess ID of this assess.
	 *
	 * @return the assess ID of this assess
	 */
	public long getAssessId();

	/**
	 * Sets the assess ID of this assess.
	 *
	 * @param assessId the assess ID of this assess
	 */
	public void setAssessId(long assessId);

	/**
	 * Returns the group ID of this assess.
	 *
	 * @return the group ID of this assess
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this assess.
	 *
	 * @param groupId the group ID of this assess
	 */
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this assess.
	 *
	 * @return the company ID of this assess
	 */
	public long getCompanyId();

	/**
	 * Sets the company ID of this assess.
	 *
	 * @param companyId the company ID of this assess
	 */
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this assess.
	 *
	 * @return the user ID of this assess
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this assess.
	 *
	 * @param userId the user ID of this assess
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this assess.
	 *
	 * @return the user uuid of this assess
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this assess.
	 *
	 * @param userUuid the user uuid of this assess
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this assess.
	 *
	 * @return the user name of this assess
	 */
	@AutoEscape
	public String getUserName();

	/**
	 * Sets the user name of this assess.
	 *
	 * @param userName the user name of this assess
	 */
	public void setUserName(String userName);

	/**
	 * Returns the project name of this assess.
	 *
	 * @return the project name of this assess
	 */
	@AutoEscape
	public String getProjectName();

	/**
	 * Sets the project name of this assess.
	 *
	 * @param projectName the project name of this assess
	 */
	public void setProjectName(String projectName);

	/**
	 * Returns the create date of this assess.
	 *
	 * @return the create date of this assess
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this assess.
	 *
	 * @param createDate the create date of this assess
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Returns the multiple assess of this assess.
	 *
	 * @return the multiple assess of this assess
	 */
	public double getMultipleAssess();

	/**
	 * Sets the multiple assess of this assess.
	 *
	 * @param multipleAssess the multiple assess of this assess
	 */
	public void setMultipleAssess(double multipleAssess);

	/**
	 * Returns the multi percent of this assess.
	 *
	 * @return the multi percent of this assess
	 */
	public double getMultiPercent();

	/**
	 * Sets the multi percent of this assess.
	 *
	 * @param multiPercent the multi percent of this assess
	 */
	public void setMultiPercent(double multiPercent);

	/**
	 * Returns the configurable of this assess.
	 *
	 * @return the configurable of this assess
	 */
	public long getConfigurable();

	/**
	 * Sets the configurable of this assess.
	 *
	 * @param configurable the configurable of this assess
	 */
	public void setConfigurable(long configurable);

	/**
	 * Returns the stability of this assess.
	 *
	 * @return the stability of this assess
	 */
	public long getStability();

	/**
	 * Sets the stability of this assess.
	 *
	 * @param stability the stability of this assess
	 */
	public void setStability(long stability);

	/**
	 * Returns the integration grade of this assess.
	 *
	 * @return the integration grade of this assess
	 */
	public long getIntegrationGrade();

	/**
	 * Sets the integration grade of this assess.
	 *
	 * @param integrationGrade the integration grade of this assess
	 */
	public void setIntegrationGrade(long integrationGrade);

	/**
	 * Returns the apply ID of this assess.
	 *
	 * @return the apply ID of this assess
	 */
	public long getApplyId();

	/**
	 * Sets the apply ID of this assess.
	 *
	 * @param applyId the apply ID of this assess
	 */
	public void setApplyId(long applyId);

	/**
	 * Returns the product ID of this assess.
	 *
	 * @return the product ID of this assess
	 */
	public long getProductId();

	/**
	 * Sets the product ID of this assess.
	 *
	 * @param productId the product ID of this assess
	 */
	public void setProductId(long productId);

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
	public int compareTo(com.liferay.product.store.model.Assess assess);

	@Override
	public int hashCode();

	@Override
	public CacheModel<com.liferay.product.store.model.Assess> toCacheModel();

	@Override
	public com.liferay.product.store.model.Assess toEscapedModel();

	@Override
	public com.liferay.product.store.model.Assess toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}