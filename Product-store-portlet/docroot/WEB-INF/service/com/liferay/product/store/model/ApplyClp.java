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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import com.liferay.product.store.service.ApplyLocalServiceUtil;
import com.liferay.product.store.service.ClpSerializer;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author zhangpengfei
 */
public class ApplyClp extends BaseModelImpl<Apply> implements Apply {
	public ApplyClp() {
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
	public long getPrimaryKey() {
		return _applyId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setApplyId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _applyId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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

	@Override
	public String getUuid() {
		return _uuid;
	}

	@Override
	public void setUuid(String uuid) {
		_uuid = uuid;

		if (_applyRemoteModel != null) {
			try {
				Class<?> clazz = _applyRemoteModel.getClass();

				Method method = clazz.getMethod("setUuid", String.class);

				method.invoke(_applyRemoteModel, uuid);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getApplyId() {
		return _applyId;
	}

	@Override
	public void setApplyId(long applyId) {
		_applyId = applyId;

		if (_applyRemoteModel != null) {
			try {
				Class<?> clazz = _applyRemoteModel.getClass();

				Method method = clazz.getMethod("setApplyId", long.class);

				method.invoke(_applyRemoteModel, applyId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_groupId = groupId;

		if (_applyRemoteModel != null) {
			try {
				Class<?> clazz = _applyRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_applyRemoteModel, groupId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;

		if (_applyRemoteModel != null) {
			try {
				Class<?> clazz = _applyRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_applyRemoteModel, companyId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;

		if (_applyRemoteModel != null) {
			try {
				Class<?> clazz = _applyRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_applyRemoteModel, userId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	@Override
	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	@Override
	public String getUserName() {
		return _userName;
	}

	@Override
	public void setUserName(String userName) {
		_userName = userName;

		if (_applyRemoteModel != null) {
			try {
				Class<?> clazz = _applyRemoteModel.getClass();

				Method method = clazz.getMethod("setUserName", String.class);

				method.invoke(_applyRemoteModel, userName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getProjectName() {
		return _projectName;
	}

	@Override
	public void setProjectName(String projectName) {
		_projectName = projectName;

		if (_applyRemoteModel != null) {
			try {
				Class<?> clazz = _applyRemoteModel.getClass();

				Method method = clazz.getMethod("setProjectName", String.class);

				method.invoke(_applyRemoteModel, projectName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getIntegrationObject() {
		return _integrationObject;
	}

	@Override
	public void setIntegrationObject(String integrationObject) {
		_integrationObject = integrationObject;

		if (_applyRemoteModel != null) {
			try {
				Class<?> clazz = _applyRemoteModel.getClass();

				Method method = clazz.getMethod("setIntegrationObject",
						String.class);

				method.invoke(_applyRemoteModel, integrationObject);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUseType() {
		return _useType;
	}

	@Override
	public void setUseType(String useType) {
		_useType = useType;

		if (_applyRemoteModel != null) {
			try {
				Class<?> clazz = _applyRemoteModel.getClass();

				Method method = clazz.getMethod("setUseType", String.class);

				method.invoke(_applyRemoteModel, useType);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getApproveFlag() {
		return _approveFlag;
	}

	@Override
	public void setApproveFlag(String approveFlag) {
		_approveFlag = approveFlag;

		if (_applyRemoteModel != null) {
			try {
				Class<?> clazz = _applyRemoteModel.getClass();

				Method method = clazz.getMethod("setApproveFlag", String.class);

				method.invoke(_applyRemoteModel, approveFlag);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getApproveDate() {
		return _approveDate;
	}

	@Override
	public void setApproveDate(Date approveDate) {
		_approveDate = approveDate;

		if (_applyRemoteModel != null) {
			try {
				Class<?> clazz = _applyRemoteModel.getClass();

				Method method = clazz.getMethod("setApproveDate", Date.class);

				method.invoke(_applyRemoteModel, approveDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getCreationDate() {
		return _creationDate;
	}

	@Override
	public void setCreationDate(Date creationDate) {
		_creationDate = creationDate;

		if (_applyRemoteModel != null) {
			try {
				Class<?> clazz = _applyRemoteModel.getClass();

				Method method = clazz.getMethod("setCreationDate", Date.class);

				method.invoke(_applyRemoteModel, creationDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCreatedBy() {
		return _createdBy;
	}

	@Override
	public void setCreatedBy(long createdBy) {
		_createdBy = createdBy;

		if (_applyRemoteModel != null) {
			try {
				Class<?> clazz = _applyRemoteModel.getClass();

				Method method = clazz.getMethod("setCreatedBy", long.class);

				method.invoke(_applyRemoteModel, createdBy);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getUpdateDate() {
		return _updateDate;
	}

	@Override
	public void setUpdateDate(Date updateDate) {
		_updateDate = updateDate;

		if (_applyRemoteModel != null) {
			try {
				Class<?> clazz = _applyRemoteModel.getClass();

				Method method = clazz.getMethod("setUpdateDate", Date.class);

				method.invoke(_applyRemoteModel, updateDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getUpdatedBy() {
		return _updatedBy;
	}

	@Override
	public void setUpdatedBy(long updatedBy) {
		_updatedBy = updatedBy;

		if (_applyRemoteModel != null) {
			try {
				Class<?> clazz = _applyRemoteModel.getClass();

				Method method = clazz.getMethod("setUpdatedBy", long.class);

				method.invoke(_applyRemoteModel, updatedBy);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getProductId() {
		return _productId;
	}

	@Override
	public void setProductId(long productId) {
		_productId = productId;

		if (_applyRemoteModel != null) {
			try {
				Class<?> clazz = _applyRemoteModel.getClass();

				Method method = clazz.getMethod("setProductId", long.class);

				method.invoke(_applyRemoteModel, productId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getUseDate() {
		return _useDate;
	}

	@Override
	public void setUseDate(Date useDate) {
		_useDate = useDate;

		if (_applyRemoteModel != null) {
			try {
				Class<?> clazz = _applyRemoteModel.getClass();

				Method method = clazz.getMethod("setUseDate", Date.class);

				method.invoke(_applyRemoteModel, useDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getApplyRemoteModel() {
		return _applyRemoteModel;
	}

	public void setApplyRemoteModel(BaseModel<?> applyRemoteModel) {
		_applyRemoteModel = applyRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _applyRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_applyRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			ApplyLocalServiceUtil.addApply(this);
		}
		else {
			ApplyLocalServiceUtil.updateApply(this);
		}
	}

	@Override
	public Apply toEscapedModel() {
		return (Apply)ProxyUtil.newProxyInstance(Apply.class.getClassLoader(),
			new Class[] { Apply.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		ApplyClp clone = new ApplyClp();

		clone.setUuid(getUuid());
		clone.setApplyId(getApplyId());
		clone.setGroupId(getGroupId());
		clone.setCompanyId(getCompanyId());
		clone.setUserId(getUserId());
		clone.setUserName(getUserName());
		clone.setProjectName(getProjectName());
		clone.setIntegrationObject(getIntegrationObject());
		clone.setUseType(getUseType());
		clone.setApproveFlag(getApproveFlag());
		clone.setApproveDate(getApproveDate());
		clone.setCreationDate(getCreationDate());
		clone.setCreatedBy(getCreatedBy());
		clone.setUpdateDate(getUpdateDate());
		clone.setUpdatedBy(getUpdatedBy());
		clone.setProductId(getProductId());
		clone.setUseDate(getUseDate());

		return clone;
	}

	@Override
	public int compareTo(Apply apply) {
		long primaryKey = apply.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ApplyClp)) {
			return false;
		}

		ApplyClp apply = (ApplyClp)obj;

		long primaryKey = apply.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	public Class<?> getClpSerializerClass() {
		return _clpSerializerClass;
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(35);

		sb.append("{uuid=");
		sb.append(getUuid());
		sb.append(", applyId=");
		sb.append(getApplyId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", userName=");
		sb.append(getUserName());
		sb.append(", projectName=");
		sb.append(getProjectName());
		sb.append(", integrationObject=");
		sb.append(getIntegrationObject());
		sb.append(", useType=");
		sb.append(getUseType());
		sb.append(", approveFlag=");
		sb.append(getApproveFlag());
		sb.append(", approveDate=");
		sb.append(getApproveDate());
		sb.append(", creationDate=");
		sb.append(getCreationDate());
		sb.append(", createdBy=");
		sb.append(getCreatedBy());
		sb.append(", updateDate=");
		sb.append(getUpdateDate());
		sb.append(", updatedBy=");
		sb.append(getUpdatedBy());
		sb.append(", productId=");
		sb.append(getProductId());
		sb.append(", useDate=");
		sb.append(getUseDate());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(55);

		sb.append("<model><model-name>");
		sb.append("com.liferay.product.store.model.Apply");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>uuid</column-name><column-value><![CDATA[");
		sb.append(getUuid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>applyId</column-name><column-value><![CDATA[");
		sb.append(getApplyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userName</column-name><column-value><![CDATA[");
		sb.append(getUserName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>projectName</column-name><column-value><![CDATA[");
		sb.append(getProjectName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>integrationObject</column-name><column-value><![CDATA[");
		sb.append(getIntegrationObject());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>useType</column-name><column-value><![CDATA[");
		sb.append(getUseType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>approveFlag</column-name><column-value><![CDATA[");
		sb.append(getApproveFlag());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>approveDate</column-name><column-value><![CDATA[");
		sb.append(getApproveDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>creationDate</column-name><column-value><![CDATA[");
		sb.append(getCreationDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createdBy</column-name><column-value><![CDATA[");
		sb.append(getCreatedBy());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>updateDate</column-name><column-value><![CDATA[");
		sb.append(getUpdateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>updatedBy</column-name><column-value><![CDATA[");
		sb.append(getUpdatedBy());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>productId</column-name><column-value><![CDATA[");
		sb.append(getProductId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>useDate</column-name><column-value><![CDATA[");
		sb.append(getUseDate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private String _uuid;
	private long _applyId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private String _projectName;
	private String _integrationObject;
	private String _useType;
	private String _approveFlag;
	private Date _approveDate;
	private Date _creationDate;
	private long _createdBy;
	private Date _updateDate;
	private long _updatedBy;
	private long _productId;
	private Date _useDate;
	private BaseModel<?> _applyRemoteModel;
	private Class<?> _clpSerializerClass = com.liferay.product.store.service.ClpSerializer.class;
}