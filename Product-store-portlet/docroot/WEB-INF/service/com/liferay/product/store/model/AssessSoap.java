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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.liferay.product.store.service.http.AssessServiceSoap}.
 *
 * @author zhangpengfei
 * @see com.liferay.product.store.service.http.AssessServiceSoap
 * @generated
 */
public class AssessSoap implements Serializable {
	public static AssessSoap toSoapModel(Assess model) {
		AssessSoap soapModel = new AssessSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setAssessId(model.getAssessId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setProjectName(model.getProjectName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setMultipleAssess(model.getMultipleAssess());
		soapModel.setMultiPercent(model.getMultiPercent());
		soapModel.setConfigurable(model.getConfigurable());
		soapModel.setStability(model.getStability());
		soapModel.setIntegrationGrade(model.getIntegrationGrade());
		soapModel.setApplyId(model.getApplyId());
		soapModel.setProductId(model.getProductId());

		return soapModel;
	}

	public static AssessSoap[] toSoapModels(Assess[] models) {
		AssessSoap[] soapModels = new AssessSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static AssessSoap[][] toSoapModels(Assess[][] models) {
		AssessSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new AssessSoap[models.length][models[0].length];
		}
		else {
			soapModels = new AssessSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static AssessSoap[] toSoapModels(List<Assess> models) {
		List<AssessSoap> soapModels = new ArrayList<AssessSoap>(models.size());

		for (Assess model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new AssessSoap[soapModels.size()]);
	}

	public AssessSoap() {
	}

	public long getPrimaryKey() {
		return _assessId;
	}

	public void setPrimaryKey(long pk) {
		setAssessId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getAssessId() {
		return _assessId;
	}

	public void setAssessId(long assessId) {
		_assessId = assessId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public String getProjectName() {
		return _projectName;
	}

	public void setProjectName(String projectName) {
		_projectName = projectName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public double getMultipleAssess() {
		return _multipleAssess;
	}

	public void setMultipleAssess(double multipleAssess) {
		_multipleAssess = multipleAssess;
	}

	public double getMultiPercent() {
		return _multiPercent;
	}

	public void setMultiPercent(double multiPercent) {
		_multiPercent = multiPercent;
	}

	public long getConfigurable() {
		return _configurable;
	}

	public void setConfigurable(long configurable) {
		_configurable = configurable;
	}

	public long getStability() {
		return _stability;
	}

	public void setStability(long stability) {
		_stability = stability;
	}

	public long getIntegrationGrade() {
		return _integrationGrade;
	}

	public void setIntegrationGrade(long integrationGrade) {
		_integrationGrade = integrationGrade;
	}

	public long getApplyId() {
		return _applyId;
	}

	public void setApplyId(long applyId) {
		_applyId = applyId;
	}

	public long getProductId() {
		return _productId;
	}

	public void setProductId(long productId) {
		_productId = productId;
	}

	private String _uuid;
	private long _assessId;
	private long _groupId;
	private long _companyId;
	private long _userId;
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
}