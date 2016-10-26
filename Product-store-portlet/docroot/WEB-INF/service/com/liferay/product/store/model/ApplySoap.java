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
 * This class is used by SOAP remote services, specifically {@link com.liferay.product.store.service.http.ApplyServiceSoap}.
 *
 * @author zhangpengfei
 * @see com.liferay.product.store.service.http.ApplyServiceSoap
 * @generated
 */
public class ApplySoap implements Serializable {
	public static ApplySoap toSoapModel(Apply model) {
		ApplySoap soapModel = new ApplySoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setApplyId(model.getApplyId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setProjectName(model.getProjectName());
		soapModel.setIntegrationObject(model.getIntegrationObject());
		soapModel.setUseType(model.getUseType());
		soapModel.setApproveFlag(model.getApproveFlag());
		soapModel.setApproveDate(model.getApproveDate());
		soapModel.setCreationDate(model.getCreationDate());
		soapModel.setCreatedBy(model.getCreatedBy());
		soapModel.setUpdateDate(model.getUpdateDate());
		soapModel.setUpdatedBy(model.getUpdatedBy());
		soapModel.setProductId(model.getProductId());
		soapModel.setUseDate(model.getUseDate());

		return soapModel;
	}

	public static ApplySoap[] toSoapModels(Apply[] models) {
		ApplySoap[] soapModels = new ApplySoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ApplySoap[][] toSoapModels(Apply[][] models) {
		ApplySoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ApplySoap[models.length][models[0].length];
		}
		else {
			soapModels = new ApplySoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ApplySoap[] toSoapModels(List<Apply> models) {
		List<ApplySoap> soapModels = new ArrayList<ApplySoap>(models.size());

		for (Apply model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ApplySoap[soapModels.size()]);
	}

	public ApplySoap() {
	}

	public long getPrimaryKey() {
		return _applyId;
	}

	public void setPrimaryKey(long pk) {
		setApplyId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getApplyId() {
		return _applyId;
	}

	public void setApplyId(long applyId) {
		_applyId = applyId;
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

	public String getIntegrationObject() {
		return _integrationObject;
	}

	public void setIntegrationObject(String integrationObject) {
		_integrationObject = integrationObject;
	}

	public String getUseType() {
		return _useType;
	}

	public void setUseType(String useType) {
		_useType = useType;
	}

	public String getApproveFlag() {
		return _approveFlag;
	}

	public void setApproveFlag(String approveFlag) {
		_approveFlag = approveFlag;
	}

	public Date getApproveDate() {
		return _approveDate;
	}

	public void setApproveDate(Date approveDate) {
		_approveDate = approveDate;
	}

	public Date getCreationDate() {
		return _creationDate;
	}

	public void setCreationDate(Date creationDate) {
		_creationDate = creationDate;
	}

	public long getCreatedBy() {
		return _createdBy;
	}

	public void setCreatedBy(long createdBy) {
		_createdBy = createdBy;
	}

	public Date getUpdateDate() {
		return _updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		_updateDate = updateDate;
	}

	public long getUpdatedBy() {
		return _updatedBy;
	}

	public void setUpdatedBy(long updatedBy) {
		_updatedBy = updatedBy;
	}

	public long getProductId() {
		return _productId;
	}

	public void setProductId(long productId) {
		_productId = productId;
	}

	public Date getUseDate() {
		return _useDate;
	}

	public void setUseDate(Date useDate) {
		_useDate = useDate;
	}

	private String _uuid;
	private long _applyId;
	private long _groupId;
	private long _companyId;
	private long _userId;
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
}