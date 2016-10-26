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

package com.liferay.product.store.service.base;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.BaseServiceImpl;
import com.liferay.portal.service.persistence.UserPersistence;

import com.liferay.product.store.model.Assess;
import com.liferay.product.store.service.AssessService;
import com.liferay.product.store.service.persistence.ApplyPersistence;
import com.liferay.product.store.service.persistence.AssessPersistence;
import com.liferay.product.store.service.persistence.ProductPersistence;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the assess remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.liferay.product.store.service.impl.AssessServiceImpl}.
 * </p>
 *
 * @author zhangpengfei
 * @see com.liferay.product.store.service.impl.AssessServiceImpl
 * @see com.liferay.product.store.service.AssessServiceUtil
 * @generated
 */
public abstract class AssessServiceBaseImpl extends BaseServiceImpl
	implements AssessService, IdentifiableBean {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link com.liferay.product.store.service.AssessServiceUtil} to access the assess remote service.
	 */

	/**
	 * Returns the apply local service.
	 *
	 * @return the apply local service
	 */
	public com.liferay.product.store.service.ApplyLocalService getApplyLocalService() {
		return applyLocalService;
	}

	/**
	 * Sets the apply local service.
	 *
	 * @param applyLocalService the apply local service
	 */
	public void setApplyLocalService(
		com.liferay.product.store.service.ApplyLocalService applyLocalService) {
		this.applyLocalService = applyLocalService;
	}

	/**
	 * Returns the apply remote service.
	 *
	 * @return the apply remote service
	 */
	public com.liferay.product.store.service.ApplyService getApplyService() {
		return applyService;
	}

	/**
	 * Sets the apply remote service.
	 *
	 * @param applyService the apply remote service
	 */
	public void setApplyService(
		com.liferay.product.store.service.ApplyService applyService) {
		this.applyService = applyService;
	}

	/**
	 * Returns the apply persistence.
	 *
	 * @return the apply persistence
	 */
	public ApplyPersistence getApplyPersistence() {
		return applyPersistence;
	}

	/**
	 * Sets the apply persistence.
	 *
	 * @param applyPersistence the apply persistence
	 */
	public void setApplyPersistence(ApplyPersistence applyPersistence) {
		this.applyPersistence = applyPersistence;
	}

	/**
	 * Returns the assess local service.
	 *
	 * @return the assess local service
	 */
	public com.liferay.product.store.service.AssessLocalService getAssessLocalService() {
		return assessLocalService;
	}

	/**
	 * Sets the assess local service.
	 *
	 * @param assessLocalService the assess local service
	 */
	public void setAssessLocalService(
		com.liferay.product.store.service.AssessLocalService assessLocalService) {
		this.assessLocalService = assessLocalService;
	}

	/**
	 * Returns the assess remote service.
	 *
	 * @return the assess remote service
	 */
	public com.liferay.product.store.service.AssessService getAssessService() {
		return assessService;
	}

	/**
	 * Sets the assess remote service.
	 *
	 * @param assessService the assess remote service
	 */
	public void setAssessService(
		com.liferay.product.store.service.AssessService assessService) {
		this.assessService = assessService;
	}

	/**
	 * Returns the assess persistence.
	 *
	 * @return the assess persistence
	 */
	public AssessPersistence getAssessPersistence() {
		return assessPersistence;
	}

	/**
	 * Sets the assess persistence.
	 *
	 * @param assessPersistence the assess persistence
	 */
	public void setAssessPersistence(AssessPersistence assessPersistence) {
		this.assessPersistence = assessPersistence;
	}

	/**
	 * Returns the product local service.
	 *
	 * @return the product local service
	 */
	public com.liferay.product.store.service.ProductLocalService getProductLocalService() {
		return productLocalService;
	}

	/**
	 * Sets the product local service.
	 *
	 * @param productLocalService the product local service
	 */
	public void setProductLocalService(
		com.liferay.product.store.service.ProductLocalService productLocalService) {
		this.productLocalService = productLocalService;
	}

	/**
	 * Returns the product remote service.
	 *
	 * @return the product remote service
	 */
	public com.liferay.product.store.service.ProductService getProductService() {
		return productService;
	}

	/**
	 * Sets the product remote service.
	 *
	 * @param productService the product remote service
	 */
	public void setProductService(
		com.liferay.product.store.service.ProductService productService) {
		this.productService = productService;
	}

	/**
	 * Returns the product persistence.
	 *
	 * @return the product persistence
	 */
	public ProductPersistence getProductPersistence() {
		return productPersistence;
	}

	/**
	 * Sets the product persistence.
	 *
	 * @param productPersistence the product persistence
	 */
	public void setProductPersistence(ProductPersistence productPersistence) {
		this.productPersistence = productPersistence;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public com.liferay.counter.service.CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(
		com.liferay.counter.service.CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	/**
	 * Returns the resource local service.
	 *
	 * @return the resource local service
	 */
	public com.liferay.portal.service.ResourceLocalService getResourceLocalService() {
		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		com.liferay.portal.service.ResourceLocalService resourceLocalService) {
		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Returns the user local service.
	 *
	 * @return the user local service
	 */
	public com.liferay.portal.service.UserLocalService getUserLocalService() {
		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(
		com.liferay.portal.service.UserLocalService userLocalService) {
		this.userLocalService = userLocalService;
	}

	/**
	 * Returns the user remote service.
	 *
	 * @return the user remote service
	 */
	public com.liferay.portal.service.UserService getUserService() {
		return userService;
	}

	/**
	 * Sets the user remote service.
	 *
	 * @param userService the user remote service
	 */
	public void setUserService(
		com.liferay.portal.service.UserService userService) {
		this.userService = userService;
	}

	/**
	 * Returns the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	public void afterPropertiesSet() {
		Class<?> clazz = getClass();

		_classLoader = clazz.getClassLoader();
	}

	public void destroy() {
	}

	/**
	 * Returns the Spring bean ID for this bean.
	 *
	 * @return the Spring bean ID for this bean
	 */
	@Override
	public String getBeanIdentifier() {
		return _beanIdentifier;
	}

	/**
	 * Sets the Spring bean ID for this bean.
	 *
	 * @param beanIdentifier the Spring bean ID for this bean
	 */
	@Override
	public void setBeanIdentifier(String beanIdentifier) {
		_beanIdentifier = beanIdentifier;
	}

	@Override
	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		if (contextClassLoader != _classLoader) {
			currentThread.setContextClassLoader(_classLoader);
		}

		try {
			return _clpInvoker.invokeMethod(name, parameterTypes, arguments);
		}
		finally {
			if (contextClassLoader != _classLoader) {
				currentThread.setContextClassLoader(contextClassLoader);
			}
		}
	}

	protected Class<?> getModelClass() {
		return Assess.class;
	}

	protected String getModelClassName() {
		return Assess.class.getName();
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = assessPersistence.getDataSource();

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql, new int[0]);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = com.liferay.product.store.service.ApplyLocalService.class)
	protected com.liferay.product.store.service.ApplyLocalService applyLocalService;
	@BeanReference(type = com.liferay.product.store.service.ApplyService.class)
	protected com.liferay.product.store.service.ApplyService applyService;
	@BeanReference(type = ApplyPersistence.class)
	protected ApplyPersistence applyPersistence;
	@BeanReference(type = com.liferay.product.store.service.AssessLocalService.class)
	protected com.liferay.product.store.service.AssessLocalService assessLocalService;
	@BeanReference(type = com.liferay.product.store.service.AssessService.class)
	protected com.liferay.product.store.service.AssessService assessService;
	@BeanReference(type = AssessPersistence.class)
	protected AssessPersistence assessPersistence;
	@BeanReference(type = com.liferay.product.store.service.ProductLocalService.class)
	protected com.liferay.product.store.service.ProductLocalService productLocalService;
	@BeanReference(type = com.liferay.product.store.service.ProductService.class)
	protected com.liferay.product.store.service.ProductService productService;
	@BeanReference(type = ProductPersistence.class)
	protected ProductPersistence productPersistence;
	@BeanReference(type = com.liferay.counter.service.CounterLocalService.class)
	protected com.liferay.counter.service.CounterLocalService counterLocalService;
	@BeanReference(type = com.liferay.portal.service.ResourceLocalService.class)
	protected com.liferay.portal.service.ResourceLocalService resourceLocalService;
	@BeanReference(type = com.liferay.portal.service.UserLocalService.class)
	protected com.liferay.portal.service.UserLocalService userLocalService;
	@BeanReference(type = com.liferay.portal.service.UserService.class)
	protected com.liferay.portal.service.UserService userService;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private String _beanIdentifier;
	private ClassLoader _classLoader;
	private AssessServiceClpInvoker _clpInvoker = new AssessServiceClpInvoker();
}