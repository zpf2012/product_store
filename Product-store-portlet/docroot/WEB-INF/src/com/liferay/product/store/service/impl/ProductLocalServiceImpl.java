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

package com.liferay.product.store.service.impl;

import java.util.Date;
import java.util.List;

import com.liferay.portal.NoSuchUserException;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.User;
import com.liferay.portal.service.ServiceContext;
import com.liferay.product.store.ProductNameException;
import com.liferay.product.store.model.Product;
import com.liferay.product.store.model.ProductModel;
import com.liferay.product.store.model.impl.ProductModelImpl;
import com.liferay.product.store.service.ProductLocalServiceUtil;
import com.liferay.product.store.service.base.ProductLocalServiceBaseImpl;

/**
 * The implementation of the product local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link com.liferay.product.store.service.ProductLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author zhangpengfei
 * @see com.liferay.product.store.service.base.ProductLocalServiceBaseImpl
 * @see com.liferay.product.store.service.ProductLocalServiceUtil
 */
public class ProductLocalServiceImpl extends ProductLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 * 
	 * Never reference this interface directly. Always use {@link
	 * com.liferay.product.store.service.ProductLocalServiceUtil} to access the
	 * product local service.
	 */
	public List<Product> getProducts(long groupId) throws SystemException {
		return productPersistence.findAll();
	}
	
	public List<Product> getProducts() throws SystemException {
		return productPersistence.findAll();
	}

	public List<Product> getProducts(long groupId, int start, int end)
			throws SystemException {
		return productPersistence.findByProductId(groupId, start, end);
	}

	protected void validate(String productName) throws PortalException {
		if (Validator.isNull(productName)) {
			throw new ProductNameException();
		}
	}
	
	public Product addProduct(long userId, String productName, String productDesc, String videoLink, String wikiLink, String productLink,
			ServiceContext serviceContext) throws SystemException,
			PortalException {
		long productId = counterLocalService.increment();
		Product product = productPersistence.create(productId);

		long groupId = serviceContext.getScopeGroupId();
		User user = userPersistence.findByPrimaryKey(userId);
		Date now = new Date();
		validate(productName);
		product.setUserId(userId);
		product.setUserName(user.getFullName());
		product.setCreateDate(now);
		product.setGroupId(groupId);
		product.setCompanyId(user.getCompanyId());
		product.setCreatedBy(userId);
		product.setUuid(serviceContext.getUuid());
		product.setExpandoBridgeAttributes(serviceContext);
		product.setModifiedDate(now);
		product.setProductName(productName);
		product.setProductDesc(productDesc);
		product.setVideoLink(videoLink);
		product.setWikiLink(wikiLink);
		product.setProductLink(productLink);
		product.setUpdatedBy(userId);

		productPersistence.update(product);

		return product;
	}
	
	public Product updateProduct(long userId, long productId,String productName, String productDesc, String videoLink, String wikiLink, String productLink,
			ServiceContext serviceContext) throws PortalException, SystemException{
		Product product  =ProductLocalServiceUtil.getProduct(productId);
		
		long groupId = serviceContext.getScopeGroupId();
		User user = userPersistence.findByPrimaryKey(userId);
		Date now = new Date();
		validate(productName);
		
		product.setUserId(userId);
		product.setUserName(user.getFullName());
//		product.setCreateDate(now);
		product.setGroupId(groupId);
		product.setCompanyId(user.getCompanyId());
		product.setCreatedBy(userId);
		product.setUuid(serviceContext.getUuid());
		product.setExpandoBridgeAttributes(serviceContext);
		product.setModifiedDate(now);
		product.setProductName(productName);
		product.setProductDesc(productDesc);
		product.setVideoLink(videoLink);
		product.setWikiLink(wikiLink);
		product.setProductLink(productLink);
		product.setUpdatedBy(userId);
		
		ProductLocalServiceUtil.updateProduct(product);
		return product;
	}

}