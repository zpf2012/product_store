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

import com.liferay.product.store.model.Product;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Product in entity cache.
 *
 * @author zhangpengfei
 * @see Product
 * @generated
 */
public class ProductCacheModel implements CacheModel<Product>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", productId=");
		sb.append(productId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", productName=");
		sb.append(productName);
		sb.append(", productDesc=");
		sb.append(productDesc);
		sb.append(", videoLink=");
		sb.append(videoLink);
		sb.append(", productLink=");
		sb.append(productLink);
		sb.append(", wikiLink=");
		sb.append(wikiLink);
		sb.append(", createdBy=");
		sb.append(createdBy);
		sb.append(", updatedBy=");
		sb.append(updatedBy);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Product toEntityModel() {
		ProductImpl productImpl = new ProductImpl();

		if (uuid == null) {
			productImpl.setUuid(StringPool.BLANK);
		}
		else {
			productImpl.setUuid(uuid);
		}

		productImpl.setProductId(productId);
		productImpl.setGroupId(groupId);
		productImpl.setCompanyId(companyId);
		productImpl.setUserId(userId);

		if (userName == null) {
			productImpl.setUserName(StringPool.BLANK);
		}
		else {
			productImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			productImpl.setCreateDate(null);
		}
		else {
			productImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			productImpl.setModifiedDate(null);
		}
		else {
			productImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (productName == null) {
			productImpl.setProductName(StringPool.BLANK);
		}
		else {
			productImpl.setProductName(productName);
		}

		if (productDesc == null) {
			productImpl.setProductDesc(StringPool.BLANK);
		}
		else {
			productImpl.setProductDesc(productDesc);
		}

		if (videoLink == null) {
			productImpl.setVideoLink(StringPool.BLANK);
		}
		else {
			productImpl.setVideoLink(videoLink);
		}

		if (productLink == null) {
			productImpl.setProductLink(StringPool.BLANK);
		}
		else {
			productImpl.setProductLink(productLink);
		}

		if (wikiLink == null) {
			productImpl.setWikiLink(StringPool.BLANK);
		}
		else {
			productImpl.setWikiLink(wikiLink);
		}

		productImpl.setCreatedBy(createdBy);
		productImpl.setUpdatedBy(updatedBy);

		productImpl.resetOriginalValues();

		return productImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();
		productId = objectInput.readLong();
		groupId = objectInput.readLong();
		companyId = objectInput.readLong();
		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		productName = objectInput.readUTF();
		productDesc = objectInput.readUTF();
		videoLink = objectInput.readUTF();
		productLink = objectInput.readUTF();
		wikiLink = objectInput.readUTF();
		createdBy = objectInput.readLong();
		updatedBy = objectInput.readLong();
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

		objectOutput.writeLong(productId);
		objectOutput.writeLong(groupId);
		objectOutput.writeLong(companyId);
		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (productName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(productName);
		}

		if (productDesc == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(productDesc);
		}

		if (videoLink == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(videoLink);
		}

		if (productLink == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(productLink);
		}

		if (wikiLink == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(wikiLink);
		}

		objectOutput.writeLong(createdBy);
		objectOutput.writeLong(updatedBy);
	}

	public String uuid;
	public long productId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String productName;
	public String productDesc;
	public String videoLink;
	public String productLink;
	public String wikiLink;
	public long createdBy;
	public long updatedBy;
}