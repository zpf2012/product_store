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

import com.liferay.product.store.model.Assess;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Assess in entity cache.
 *
 * @author zhangpengfei
 * @see Assess
 * @generated
 */
public class AssessCacheModel implements CacheModel<Assess>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", assessId=");
		sb.append(assessId);
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
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", multipleAssess=");
		sb.append(multipleAssess);
		sb.append(", multiPercent=");
		sb.append(multiPercent);
		sb.append(", configurable=");
		sb.append(configurable);
		sb.append(", stability=");
		sb.append(stability);
		sb.append(", integrationGrade=");
		sb.append(integrationGrade);
		sb.append(", applyId=");
		sb.append(applyId);
		sb.append(", productId=");
		sb.append(productId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Assess toEntityModel() {
		AssessImpl assessImpl = new AssessImpl();

		if (uuid == null) {
			assessImpl.setUuid(StringPool.BLANK);
		}
		else {
			assessImpl.setUuid(uuid);
		}

		assessImpl.setAssessId(assessId);
		assessImpl.setGroupId(groupId);
		assessImpl.setCompanyId(companyId);
		assessImpl.setUserId(userId);

		if (userName == null) {
			assessImpl.setUserName(StringPool.BLANK);
		}
		else {
			assessImpl.setUserName(userName);
		}

		if (projectName == null) {
			assessImpl.setProjectName(StringPool.BLANK);
		}
		else {
			assessImpl.setProjectName(projectName);
		}

		if (createDate == Long.MIN_VALUE) {
			assessImpl.setCreateDate(null);
		}
		else {
			assessImpl.setCreateDate(new Date(createDate));
		}

		assessImpl.setMultipleAssess(multipleAssess);
		assessImpl.setMultiPercent(multiPercent);
		assessImpl.setConfigurable(configurable);
		assessImpl.setStability(stability);
		assessImpl.setIntegrationGrade(integrationGrade);
		assessImpl.setApplyId(applyId);
		assessImpl.setProductId(productId);

		assessImpl.resetOriginalValues();

		return assessImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();
		assessId = objectInput.readLong();
		groupId = objectInput.readLong();
		companyId = objectInput.readLong();
		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		projectName = objectInput.readUTF();
		createDate = objectInput.readLong();
		multipleAssess = objectInput.readDouble();
		multiPercent = objectInput.readDouble();
		configurable = objectInput.readLong();
		stability = objectInput.readLong();
		integrationGrade = objectInput.readLong();
		applyId = objectInput.readLong();
		productId = objectInput.readLong();
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

		objectOutput.writeLong(assessId);
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

		objectOutput.writeLong(createDate);
		objectOutput.writeDouble(multipleAssess);
		objectOutput.writeDouble(multiPercent);
		objectOutput.writeLong(configurable);
		objectOutput.writeLong(stability);
		objectOutput.writeLong(integrationGrade);
		objectOutput.writeLong(applyId);
		objectOutput.writeLong(productId);
	}

	public String uuid;
	public long assessId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public String projectName;
	public long createDate;
	public double multipleAssess;
	public double multiPercent;
	public long configurable;
	public long stability;
	public long integrationGrade;
	public long applyId;
	public long productId;
}