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

package com.liferay.product.store.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import com.liferay.product.store.model.Assess;
import com.liferay.product.store.model.AssessModel;
import com.liferay.product.store.model.AssessSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the Assess service. Represents a row in the &quot;CUX_Assess&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.liferay.product.store.model.AssessModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link AssessImpl}.
 * </p>
 *
 * @author zhangpengfei
 * @see AssessImpl
 * @see com.liferay.product.store.model.Assess
 * @see com.liferay.product.store.model.AssessModel
 * @generated
 */
@JSON(strict = true)
public class AssessModelImpl extends BaseModelImpl<Assess>
	implements AssessModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a assess model instance should use the {@link com.liferay.product.store.model.Assess} interface instead.
	 */
	public static final String TABLE_NAME = "CUX_Assess";
	public static final Object[][] TABLE_COLUMNS = {
			{ "uuid_", Types.VARCHAR },
			{ "assessId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "userName", Types.VARCHAR },
			{ "projectName", Types.VARCHAR },
			{ "createDate", Types.TIMESTAMP },
			{ "multipleAssess", Types.DOUBLE },
			{ "multiPercent", Types.DOUBLE },
			{ "configurable", Types.BIGINT },
			{ "stability", Types.BIGINT },
			{ "integrationGrade", Types.BIGINT },
			{ "applyId", Types.BIGINT },
			{ "productId", Types.BIGINT }
		};
	public static final String TABLE_SQL_CREATE = "create table CUX_Assess (uuid_ VARCHAR(75) null,assessId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,projectName VARCHAR(75) null,createDate DATE null,multipleAssess DOUBLE,multiPercent DOUBLE,configurable LONG,stability LONG,integrationGrade LONG,applyId LONG,productId LONG)";
	public static final String TABLE_SQL_DROP = "drop table CUX_Assess";
	public static final String ORDER_BY_JPQL = " ORDER BY assess.assessId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY CUX_Assess.assessId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.liferay.product.store.model.Assess"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.liferay.product.store.model.Assess"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.liferay.product.store.model.Assess"),
			true);
	public static long APPLYID_COLUMN_BITMASK = 1L;
	public static long ASSESSID_COLUMN_BITMASK = 2L;
	public static long COMPANYID_COLUMN_BITMASK = 4L;
	public static long GROUPID_COLUMN_BITMASK = 8L;
	public static long UUID_COLUMN_BITMASK = 16L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static Assess toModel(AssessSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		Assess model = new AssessImpl();

		model.setUuid(soapModel.getUuid());
		model.setAssessId(soapModel.getAssessId());
		model.setGroupId(soapModel.getGroupId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setUserId(soapModel.getUserId());
		model.setUserName(soapModel.getUserName());
		model.setProjectName(soapModel.getProjectName());
		model.setCreateDate(soapModel.getCreateDate());
		model.setMultipleAssess(soapModel.getMultipleAssess());
		model.setMultiPercent(soapModel.getMultiPercent());
		model.setConfigurable(soapModel.getConfigurable());
		model.setStability(soapModel.getStability());
		model.setIntegrationGrade(soapModel.getIntegrationGrade());
		model.setApplyId(soapModel.getApplyId());
		model.setProductId(soapModel.getProductId());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<Assess> toModels(AssessSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<Assess> models = new ArrayList<Assess>(soapModels.length);

		for (AssessSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.liferay.product.store.model.Assess"));

	public AssessModelImpl() {
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

	@JSON
	@Override
	public String getUuid() {
		if (_uuid == null) {
			return StringPool.BLANK;
		}
		else {
			return _uuid;
		}
	}

	@Override
	public void setUuid(String uuid) {
		if (_originalUuid == null) {
			_originalUuid = _uuid;
		}

		_uuid = uuid;
	}

	public String getOriginalUuid() {
		return GetterUtil.getString(_originalUuid);
	}

	@JSON
	@Override
	public long getAssessId() {
		return _assessId;
	}

	@Override
	public void setAssessId(long assessId) {
		_columnBitmask |= ASSESSID_COLUMN_BITMASK;

		if (!_setOriginalAssessId) {
			_setOriginalAssessId = true;

			_originalAssessId = _assessId;
		}

		_assessId = assessId;
	}

	public long getOriginalAssessId() {
		return _originalAssessId;
	}

	@JSON
	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_columnBitmask |= GROUPID_COLUMN_BITMASK;

		if (!_setOriginalGroupId) {
			_setOriginalGroupId = true;

			_originalGroupId = _groupId;
		}

		_groupId = groupId;
	}

	public long getOriginalGroupId() {
		return _originalGroupId;
	}

	@JSON
	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_columnBitmask |= COMPANYID_COLUMN_BITMASK;

		if (!_setOriginalCompanyId) {
			_setOriginalCompanyId = true;

			_originalCompanyId = _companyId;
		}

		_companyId = companyId;
	}

	public long getOriginalCompanyId() {
		return _originalCompanyId;
	}

	@JSON
	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;
	}

	@Override
	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	@Override
	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	@JSON
	@Override
	public String getUserName() {
		if (_userName == null) {
			return StringPool.BLANK;
		}
		else {
			return _userName;
		}
	}

	@Override
	public void setUserName(String userName) {
		_userName = userName;
	}

	@JSON
	@Override
	public String getProjectName() {
		if (_projectName == null) {
			return StringPool.BLANK;
		}
		else {
			return _projectName;
		}
	}

	@Override
	public void setProjectName(String projectName) {
		_projectName = projectName;
	}

	@JSON
	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	@JSON
	@Override
	public double getMultipleAssess() {
		return _multipleAssess;
	}

	@Override
	public void setMultipleAssess(double multipleAssess) {
		_multipleAssess = multipleAssess;
	}

	@JSON
	@Override
	public double getMultiPercent() {
		return _multiPercent;
	}

	@Override
	public void setMultiPercent(double multiPercent) {
		_multiPercent = multiPercent;
	}

	@JSON
	@Override
	public long getConfigurable() {
		return _configurable;
	}

	@Override
	public void setConfigurable(long configurable) {
		_configurable = configurable;
	}

	@JSON
	@Override
	public long getStability() {
		return _stability;
	}

	@Override
	public void setStability(long stability) {
		_stability = stability;
	}

	@JSON
	@Override
	public long getIntegrationGrade() {
		return _integrationGrade;
	}

	@Override
	public void setIntegrationGrade(long integrationGrade) {
		_integrationGrade = integrationGrade;
	}

	@JSON
	@Override
	public long getApplyId() {
		return _applyId;
	}

	@Override
	public void setApplyId(long applyId) {
		_columnBitmask |= APPLYID_COLUMN_BITMASK;

		if (!_setOriginalApplyId) {
			_setOriginalApplyId = true;

			_originalApplyId = _applyId;
		}

		_applyId = applyId;
	}

	public long getOriginalApplyId() {
		return _originalApplyId;
	}

	@JSON
	@Override
	public long getProductId() {
		return _productId;
	}

	@Override
	public void setProductId(long productId) {
		_productId = productId;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			Assess.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Assess toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (Assess)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		AssessImpl assessImpl = new AssessImpl();

		assessImpl.setUuid(getUuid());
		assessImpl.setAssessId(getAssessId());
		assessImpl.setGroupId(getGroupId());
		assessImpl.setCompanyId(getCompanyId());
		assessImpl.setUserId(getUserId());
		assessImpl.setUserName(getUserName());
		assessImpl.setProjectName(getProjectName());
		assessImpl.setCreateDate(getCreateDate());
		assessImpl.setMultipleAssess(getMultipleAssess());
		assessImpl.setMultiPercent(getMultiPercent());
		assessImpl.setConfigurable(getConfigurable());
		assessImpl.setStability(getStability());
		assessImpl.setIntegrationGrade(getIntegrationGrade());
		assessImpl.setApplyId(getApplyId());
		assessImpl.setProductId(getProductId());

		assessImpl.resetOriginalValues();

		return assessImpl;
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

		if (!(obj instanceof Assess)) {
			return false;
		}

		Assess assess = (Assess)obj;

		long primaryKey = assess.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public void resetOriginalValues() {
		AssessModelImpl assessModelImpl = this;

		assessModelImpl._originalUuid = assessModelImpl._uuid;

		assessModelImpl._originalAssessId = assessModelImpl._assessId;

		assessModelImpl._setOriginalAssessId = false;

		assessModelImpl._originalGroupId = assessModelImpl._groupId;

		assessModelImpl._setOriginalGroupId = false;

		assessModelImpl._originalCompanyId = assessModelImpl._companyId;

		assessModelImpl._setOriginalCompanyId = false;

		assessModelImpl._originalApplyId = assessModelImpl._applyId;

		assessModelImpl._setOriginalApplyId = false;

		assessModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<Assess> toCacheModel() {
		AssessCacheModel assessCacheModel = new AssessCacheModel();

		assessCacheModel.uuid = getUuid();

		String uuid = assessCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			assessCacheModel.uuid = null;
		}

		assessCacheModel.assessId = getAssessId();

		assessCacheModel.groupId = getGroupId();

		assessCacheModel.companyId = getCompanyId();

		assessCacheModel.userId = getUserId();

		assessCacheModel.userName = getUserName();

		String userName = assessCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			assessCacheModel.userName = null;
		}

		assessCacheModel.projectName = getProjectName();

		String projectName = assessCacheModel.projectName;

		if ((projectName != null) && (projectName.length() == 0)) {
			assessCacheModel.projectName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			assessCacheModel.createDate = createDate.getTime();
		}
		else {
			assessCacheModel.createDate = Long.MIN_VALUE;
		}

		assessCacheModel.multipleAssess = getMultipleAssess();

		assessCacheModel.multiPercent = getMultiPercent();

		assessCacheModel.configurable = getConfigurable();

		assessCacheModel.stability = getStability();

		assessCacheModel.integrationGrade = getIntegrationGrade();

		assessCacheModel.applyId = getApplyId();

		assessCacheModel.productId = getProductId();

		return assessCacheModel;
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

	private static ClassLoader _classLoader = Assess.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] { Assess.class };
	private String _uuid;
	private String _originalUuid;
	private long _assessId;
	private long _originalAssessId;
	private boolean _setOriginalAssessId;
	private long _groupId;
	private long _originalGroupId;
	private boolean _setOriginalGroupId;
	private long _companyId;
	private long _originalCompanyId;
	private boolean _setOriginalCompanyId;
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
	private long _originalApplyId;
	private boolean _setOriginalApplyId;
	private long _productId;
	private long _columnBitmask;
	private Assess _escapedModel;
}