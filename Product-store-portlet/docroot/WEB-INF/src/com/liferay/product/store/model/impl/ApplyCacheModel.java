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

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.liferay.product.store.model.Apply;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Apply in entity cache.
 *
 * @author zhangpengfei
 * @see Apply
 * @generated
 */
public class ApplyCacheModel implements CacheModel<Apply>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(35);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", applyId=");
		sb.append(applyId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", projectName=");
		sb.append(projectName);
		sb.append(", integrationObject=");
		sb.append(integrationObject);
		sb.append(", useType=");
		sb.append(useType);
		sb.append(", approveFlag=");
		sb.append(approveFlag);
		sb.append(", approveDate=");
		sb.append(approveDate);
		sb.append(", creationDate=");
		sb.append(creationDate);
		sb.append(", createdBy=");
		sb.append(createdBy);
		sb.append(", updateDate=");
		sb.append(updateDate);
		sb.append(", updatedBy=");
		sb.append(updatedBy);
		sb.append(", productId=");
		sb.append(productId);
		sb.append(", useDate=");
		sb.append(useDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Apply toEntityModel() {
		ApplyImpl applyImpl = new ApplyImpl();

		if (uuid == null) {
			applyImpl.setUuid(StringPool.BLANK);
		}
		else {
			applyImpl.setUuid(uuid);
		}

		applyImpl.setApplyId(applyId);
		applyImpl.setGroupId(groupId);
		applyImpl.setCompanyId(companyId);
		applyImpl.setUserId(userId);

		if (userName == null) {
			applyImpl.setUserName(StringPool.BLANK);
		}
		else {
			applyImpl.setUserName(userName);
		}

		if (projectName == null) {
			applyImpl.setProjectName(StringPool.BLANK);
		}
		else {
			applyImpl.setProjectName(projectName);
		}

		if (integrationObject == null) {
			applyImpl.setIntegrationObject(StringPool.BLANK);
		}
		else {
			applyImpl.setIntegrationObject(integrationObject);
		}

		if (useType == null) {
			applyImpl.setUseType(StringPool.BLANK);
		}
		else {
			applyImpl.setUseType(useType);
		}

		if (approveFlag == null) {
			applyImpl.setApproveFlag(StringPool.BLANK);
		}
		else {
			applyImpl.setApproveFlag(approveFlag);
		}

		if (approveDate == Long.MIN_VALUE) {
			applyImpl.setApproveDate(null);
		}
		else {
			applyImpl.setApproveDate(new Date(approveDate));
		}

		if (creationDate == Long.MIN_VALUE) {
			applyImpl.setCreationDate(null);
		}
		else {
			applyImpl.setCreationDate(new Date(creationDate));
		}

		applyImpl.setCreatedBy(createdBy);

		if (updateDate == Long.MIN_VALUE) {
			applyImpl.setUpdateDate(null);
		}
		else {
			applyImpl.setUpdateDate(new Date(updateDate));
		}

		applyImpl.setUpdatedBy(updatedBy);
		applyImpl.setProductId(productId);

		if (useDate == Long.MIN_VALUE) {
			applyImpl.setUseDate(null);
		}
		else {
			applyImpl.setUseDate(new Date(useDate));
		}

		applyImpl.resetOriginalValues();

		return applyImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();
		applyId = objectInput.readLong();
		groupId = objectInput.readLong();
		companyId = objectInput.readLong();
		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		projectName = objectInput.readUTF();
		integrationObject = objectInput.readUTF();
		useType = objectInput.readUTF();
		approveFlag = objectInput.readUTF();
		approveDate = objectInput.readLong();
		creationDate = objectInput.readLong();
		createdBy = objectInput.readLong();
		updateDate = objectInput.readLong();
		updatedBy = objectInput.readLong();
		productId = objectInput.readLong();
		useDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(applyId);
		objectOutput.writeLong(groupId);
		objectOutput.writeLong(companyId);
		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userName);
		}

		if (projectName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(projectName);
		}

		if (integrationObject == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(integrationObject);
		}

		if (useType == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(useType);
		}

		if (approveFlag == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(approveFlag);
		}

		objectOutput.writeLong(approveDate);
		objectOutput.writeLong(creationDate);
		objectOutput.writeLong(createdBy);
		objectOutput.writeLong(updateDate);
		objectOutput.writeLong(updatedBy);
		objectOutput.writeLong(productId);
		objectOutput.writeLong(useDate);
	}

	public String uuid;
	public long applyId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public String projectName;
	public String integrationObject;
	public String useType;
	public String approveFlag;
	public long approveDate;
	public long creationDate;
	public long createdBy;
	public long updateDate;
	public long updatedBy;
	public long productId;
	public long useDate;
}