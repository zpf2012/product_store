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
import com.liferay.portal.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import com.liferay.product.store.service.ClpSerializer;
import com.liferay.product.store.service.ProductLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author zhangpengfei
 */
public class ProductClp extends BaseModelImpl<Product> implements Product {
	public ProductClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return Product.class;
	}

	@Override
	public String getModelClassName() {
		return Product.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _productId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setProductId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _productId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("productId", getProductId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("productName", getProductName());
		attributes.put("productDesc", getProductDesc());
		attributes.put("videoLink", getVideoLink());
		attributes.put("productLink", getProductLink());
		attributes.put("wikiLink", getWikiLink());
		attributes.put("createdBy", getCreatedBy());
		attributes.put("updatedBy", getUpdatedBy());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long productId = (Long)attributes.get("productId");

		if (productId != null) {
			setProductId(productId);
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

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String productName = (String)attributes.get("productName");

		if (productName != null) {
			setProductName(productName);
		}

		String productDesc = (String)attributes.get("productDesc");

		if (productDesc != null) {
			setProductDesc(productDesc);
		}

		String videoLink = (String)attributes.get("videoLink");

		if (videoLink != null) {
			setVideoLink(videoLink);
		}

		String productLink = (String)attributes.get("productLink");

		if (productLink != null) {
			setProductLink(productLink);
		}

		String wikiLink = (String)attributes.get("wikiLink");

		if (wikiLink != null) {
			setWikiLink(wikiLink);
		}

		Long createdBy = (Long)attributes.get("createdBy");

		if (createdBy != null) {
			setCreatedBy(createdBy);
		}

		Long updatedBy = (Long)attributes.get("updatedBy");

		if (updatedBy != null) {
			setUpdatedBy(updatedBy);
		}
	}

	@Override
	public String getUuid() {
		return _uuid;
	}

	@Override
	public void setUuid(String uuid) {
		_uuid = uuid;

		if (_productRemoteModel != null) {
			try {
				Class<?> clazz = _productRemoteModel.getClass();

				Method method = clazz.getMethod("setUuid", String.class);

				method.invoke(_productRemoteModel, uuid);
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

		if (_productRemoteModel != null) {
			try {
				Class<?> clazz = _productRemoteModel.getClass();

				Method method = clazz.getMethod("setProductId", long.class);

				method.invoke(_productRemoteModel, productId);
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

		if (_productRemoteModel != null) {
			try {
				Class<?> clazz = _productRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_productRemoteModel, groupId);
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

		if (_productRemoteModel != null) {
			try {
				Class<?> clazz = _productRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_productRemoteModel, companyId);
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

		if (_productRemoteModel != null) {
			try {
				Class<?> clazz = _productRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_productRemoteModel, userId);
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

		if (_productRemoteModel != null) {
			try {
				Class<?> clazz = _productRemoteModel.getClass();

				Method method = clazz.getMethod("setUserName", String.class);

				method.invoke(_productRemoteModel, userName);
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

		if (_productRemoteModel != null) {
			try {
				Class<?> clazz = _productRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_productRemoteModel, createDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;

		if (_productRemoteModel != null) {
			try {
				Class<?> clazz = _productRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_productRemoteModel, modifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getProductName() {
		return _productName;
	}

	@Override
	public void setProductName(String productName) {
		_productName = productName;

		if (_productRemoteModel != null) {
			try {
				Class<?> clazz = _productRemoteModel.getClass();

				Method method = clazz.getMethod("setProductName", String.class);

				method.invoke(_productRemoteModel, productName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getProductDesc() {
		return _productDesc;
	}

	@Override
	public void setProductDesc(String productDesc) {
		_productDesc = productDesc;

		if (_productRemoteModel != null) {
			try {
				Class<?> clazz = _productRemoteModel.getClass();

				Method method = clazz.getMethod("setProductDesc", String.class);

				method.invoke(_productRemoteModel, productDesc);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getVideoLink() {
		return _videoLink;
	}

	@Override
	public void setVideoLink(String videoLink) {
		_videoLink = videoLink;

		if (_productRemoteModel != null) {
			try {
				Class<?> clazz = _productRemoteModel.getClass();

				Method method = clazz.getMethod("setVideoLink", String.class);

				method.invoke(_productRemoteModel, videoLink);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getProductLink() {
		return _productLink;
	}

	@Override
	public void setProductLink(String productLink) {
		_productLink = productLink;

		if (_productRemoteModel != null) {
			try {
				Class<?> clazz = _productRemoteModel.getClass();

				Method method = clazz.getMethod("setProductLink", String.class);

				method.invoke(_productRemoteModel, productLink);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getWikiLink() {
		return _wikiLink;
	}

	@Override
	public void setWikiLink(String wikiLink) {
		_wikiLink = wikiLink;

		if (_productRemoteModel != null) {
			try {
				Class<?> clazz = _productRemoteModel.getClass();

				Method method = clazz.getMethod("setWikiLink", String.class);

				method.invoke(_productRemoteModel, wikiLink);
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

		if (_productRemoteModel != null) {
			try {
				Class<?> clazz = _productRemoteModel.getClass();

				Method method = clazz.getMethod("setCreatedBy", long.class);

				method.invoke(_productRemoteModel, createdBy);
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

		if (_productRemoteModel != null) {
			try {
				Class<?> clazz = _productRemoteModel.getClass();

				Method method = clazz.getMethod("setUpdatedBy", long.class);

				method.invoke(_productRemoteModel, updatedBy);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public StagedModelType getStagedModelType() {
		return new StagedModelType(PortalUtil.getClassNameId(
				Product.class.getName()));
	}

	public BaseModel<?> getProductRemoteModel() {
		return _productRemoteModel;
	}

	public void setProductRemoteModel(BaseModel<?> productRemoteModel) {
		_productRemoteModel = productRemoteModel;
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

		Class<?> remoteModelClass = _productRemoteModel.getClass();

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

		Object returnValue = method.invoke(_productRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			ProductLocalServiceUtil.addProduct(this);
		}
		else {
			ProductLocalServiceUtil.updateProduct(this);
		}
	}

	@Override
	public Product toEscapedModel() {
		return (Product)ProxyUtil.newProxyInstance(Product.class.getClassLoader(),
			new Class[] { Product.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		ProductClp clone = new ProductClp();

		clone.setUuid(getUuid());
		clone.setProductId(getProductId());
		clone.setGroupId(getGroupId());
		clone.setCompanyId(getCompanyId());
		clone.setUserId(getUserId());
		clone.setUserName(getUserName());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setProductName(getProductName());
		clone.setProductDesc(getProductDesc());
		clone.setVideoLink(getVideoLink());
		clone.setProductLink(getProductLink());
		clone.setWikiLink(getWikiLink());
		clone.setCreatedBy(getCreatedBy());
		clone.setUpdatedBy(getUpdatedBy());

		return clone;
	}

	@Override
	public int compareTo(Product product) {
		long primaryKey = product.getPrimaryKey();

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

		if (!(obj instanceof ProductClp)) {
			return false;
		}

		ProductClp product = (ProductClp)obj;

		long primaryKey = product.getPrimaryKey();

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
		sb.append(", productId=");
		sb.append(getProductId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", userName=");
		sb.append(getUserName());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", productName=");
		sb.append(getProductName());
		sb.append(", productDesc=");
		sb.append(getProductDesc());
		sb.append(", videoLink=");
		sb.append(getVideoLink());
		sb.append(", productLink=");
		sb.append(getProductLink());
		sb.append(", wikiLink=");
		sb.append(getWikiLink());
		sb.append(", createdBy=");
		sb.append(getCreatedBy());
		sb.append(", updatedBy=");
		sb.append(getUpdatedBy());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(49);

		sb.append("<model><model-name>");
		sb.append("com.liferay.product.store.model.Product");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>uuid</column-name><column-value><![CDATA[");
		sb.append(getUuid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>productId</column-name><column-value><![CDATA[");
		sb.append(getProductId());
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
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>productName</column-name><column-value><![CDATA[");
		sb.append(getProductName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>productDesc</column-name><column-value><![CDATA[");
		sb.append(getProductDesc());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>videoLink</column-name><column-value><![CDATA[");
		sb.append(getVideoLink());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>productLink</column-name><column-value><![CDATA[");
		sb.append(getProductLink());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>wikiLink</column-name><column-value><![CDATA[");
		sb.append(getWikiLink());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createdBy</column-name><column-value><![CDATA[");
		sb.append(getCreatedBy());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>updatedBy</column-name><column-value><![CDATA[");
		sb.append(getUpdatedBy());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private String _uuid;
	private long _productId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _productName;
	private String _productDesc;
	private String _videoLink;
	private String _productLink;
	private String _wikiLink;
	private long _createdBy;
	private long _updatedBy;
	private BaseModel<?> _productRemoteModel;
	private Class<?> _clpSerializerClass = com.liferay.product.store.service.ClpSerializer.class;
}