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

import com.liferay.product.store.service.AssessLocalServiceUtil;
import com.liferay.product.store.service.ClpSerializer;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author zhangpengfei
 */
public class AssessClp extends BaseModelImpl<Assess> implements Assess {
	public AssessClp() {
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
	public long getPrimaryKey() {
		return _assessId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setAssessId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _assessId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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

	@Override
	public String getUuid() {
		return _uuid;
	}

	@Override
	public void setUuid(String uuid) {
		_uuid = uuid;

		if (_assessRemoteModel != null) {
			try {
				Class<?> clazz = _assessRemoteModel.getClass();

				Method method = clazz.getMethod("setUuid", String.class);

				method.invoke(_assessRemoteModel, uuid);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getAssessId() {
		return _assessId;
	}

	@Override
	public void setAssessId(long assessId) {
		_assessId = assessId;

		if (_assessRemoteModel != null) {
			try {
				Class<?> clazz = _assessRemoteModel.getClass();

				Method method = clazz.getMethod("setAssessId", long.class);

				method.invoke(_assessRemoteModel, assessId);
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

		if (_assessRemoteModel != null) {
			try {
				Class<?> clazz = _assessRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_assessRemoteModel, groupId);
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

		if (_assessRemoteModel != null) {
			try {
				Class<?> clazz = _assessRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_assessRemoteModel, companyId);
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

		if (_assessRemoteModel != null) {
			try {
				Class<?> clazz = _assessRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_assessRemoteModel, userId);
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

		if (_assessRemoteModel != null) {
			try {
				Class<?> clazz = _assessRemoteModel.getClass();

				Method method = clazz.getMethod("setUserName", String.class);

				method.invoke(_assessRemoteModel, userName);
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

		if (_assessRemoteModel != null) {
			try {
				Class<?> clazz = _assessRemoteModel.getClass();

				Method method = clazz.getMethod("setProjectName", String.class);

				method.invoke(_assessRemoteModel, projectName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;

		if (_assessRemoteModel != null) {
			try {
				Class<?> clazz = _assessRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_assessRemoteModel, createDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getMultipleAssess() {
		return _multipleAssess;
	}

	@Override
	public void setMultipleAssess(double multipleAssess) {
		_multipleAssess = multipleAssess;

		if (_assessRemoteModel != null) {
			try {
				Class<?> clazz = _assessRemoteModel.getClass();

				Method method = clazz.getMethod("setMultipleAssess",
						double.class);

				method.invoke(_assessRemoteModel, multipleAssess);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getMultiPercent() {
		return _multiPercent;
	}

	@Override
	public void setMultiPercent(double multiPercent) {
		_multiPercent = multiPercent;

		if (_assessRemoteModel != null) {
			try {
				Class<?> clazz = _assessRemoteModel.getClass();

				Method method = clazz.getMethod("setMultiPercent", double.class);

				method.invoke(_assessRemoteModel, multiPercent);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getConfigurable() {
		return _configurable;
	}

	@Override
	public void setConfigurable(long configurable) {
		_configurable = configurable;

		if (_assessRemoteModel != null) {
			try {
				Class<?> clazz = _assessRemoteModel.getClass();

				Method method = clazz.getMethod("setConfigurable", long.class);

				method.invoke(_assessRemoteModel, configurable);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getStability() {
		return _stability;
	}

	@Override
	public void setStability(long stability) {
		_stability = stability;

		if (_assessRemoteModel != null) {
			try {
				Class<?> clazz = _assessRemoteModel.getClass();

				Method method = clazz.getMethod("setStability", long.class);

				method.invoke(_assessRemoteModel, stability);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getIntegrationGrade() {
		return _integrationGrade;
	}

	@Override
	public void setIntegrationGrade(long integrationGrade) {
		_integrationGrade = integrationGrade;

		if (_assessRemoteModel != null) {
			try {
				Class<?> clazz = _assessRemoteModel.getClass();

				Method method = clazz.getMethod("setIntegrationGrade",
						long.class);

				method.invoke(_assessRemoteModel, integrationGrade);
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

		if (_assessRemoteModel != null) {
			try {
				Class<?> clazz = _assessRemoteModel.getClass();

				Method method = clazz.getMethod("setApplyId", long.class);

				method.invoke(_assessRemoteModel, applyId);
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

		if (_assessRemoteModel != null) {
			try {
				Class<?> clazz = _assessRemoteModel.getClass();

				Method method = clazz.getMethod("setProductId", long.class);

				method.invoke(_assessRemoteModel, productId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getAssessRemoteModel() {
		return _assessRemoteModel;
	}

	public void setAssessRemoteModel(BaseModel<?> assessRemoteModel) {
		_assessRemoteModel = assessRemoteModel;
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

		Class<?> remoteModelClass = _assessRemoteModel.getClass();

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

		Object returnValue = method.invoke(_assessRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			AssessLocalServiceUtil.addAssess(this);
		}
		else {
			AssessLocalServiceUtil.updateAssess(this);
		}
	}

	@Override
	public Assess toEscapedModel() {
		return (Assess)ProxyUtil.newProxyInstance(Assess.class.getClassLoader(),
			new Class[] { Assess.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		AssessClp clone = new AssessClp();

		clone.setUuid(getUuid());
		clone.setAssessId(getAssessId());
		clone.setGroupId(getGroupId());
		clone.setCompanyId(getCompanyId());
		clone.setUserId(getUserId());
		clone.setUserName(getUserName());
		clone.setProjectName(getProjectName());
		clone.setCreateDate(getCreateDate());
		clone.setMultipleAssess(getMultipleAssess());
		clone.setMultiPercent(getMultiPercent());
		clone.setConfigurable(getConfigurable());
		clone.setStability(getStability());
		clone.setIntegrationGrade(getIntegrationGrade());
		clone.setApplyId(getApplyId());
		clone.setProductId(getProductId());

		return clone;
	}

	@Override
	public int compareTo(Assess assess) {
		long primaryKey = assess.getPrimaryKey();

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

		if (!(obj instanceof AssessClp)) {
			return false;
		}

		AssessClp assess = (AssessClp)obj;

		long primaryKey = assess.getPrimaryKey();

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
		StringBundler sb = new StringBundler(31);

		sb.append("{uuid=");
		sb.append(getUuid());
		sb.append(", assessId=");
		sb.append(getAssessId());
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
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", multipleAssess=");
		sb.append(getMultipleAssess());
		sb.append(", multiPercent=");
		sb.append(getMultiPercent());
		sb.append(", configurable=");
		sb.append(getConfigurable());
		sb.append(", stability=");
		sb.append(getStability());
		sb.append(", integrationGrade=");
		sb.append(getIntegrationGrade());
		sb.append(", applyId=");
		sb.append(getApplyId());
		sb.append(", productId=");
		sb.append(getProductId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(49);

		sb.append("<model><model-name>");
		sb.append("com.liferay.product.store.model.Assess");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>uuid</column-name><column-value><![CDATA[");
		sb.append(getUuid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>assessId</column-name><column-value><![CDATA[");
		sb.append(getAssessId());
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
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>multipleAssess</column-name><column-value><![CDATA[");
		sb.append(getMultipleAssess());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>multiPercent</column-name><column-value><![CDATA[");
		sb.append(getMultiPercent());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>configurable</column-name><column-value><![CDATA[");
		sb.append(getConfigurable());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>stability</column-name><column-value><![CDATA[");
		sb.append(getStability());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>integrationGrade</column-name><column-value><![CDATA[");
		sb.append(getIntegrationGrade());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>applyId</column-name><column-value><![CDATA[");
		sb.append(getApplyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>productId</column-name><column-value><![CDATA[");
		sb.append(getProductId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private String _uuid;
	private long _assessId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private String _projectName;
	private Date _createDate;
	private double _multipleAssess;
	private double _multiPercent;
	private long _configurable;
	private long _stability;
	private long _integrationGrade;
	private long _applyId;
	private long _productId;
	private BaseModel<?> _assessRemoteModel;
	private Class<?> _clpSerializerClass = com.liferay.product.store.service.ClpSerializer.class;
}