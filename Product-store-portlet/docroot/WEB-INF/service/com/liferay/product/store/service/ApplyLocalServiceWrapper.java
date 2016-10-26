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

package com.liferay.product.store.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ApplyLocalService}.
 *
 * @author zhangpengfei
 * @see ApplyLocalService
 * @generated
 */
public class ApplyLocalServiceWrapper implements ApplyLocalService,
	ServiceWrapper<ApplyLocalService> {
	public ApplyLocalServiceWrapper(ApplyLocalService applyLocalService) {
		_applyLocalService = applyLocalService;
	}

	/**
	* Adds the apply to the database. Also notifies the appropriate model listeners.
	*
	* @param apply the apply
	* @return the apply that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.product.store.model.Apply addApply(
		com.liferay.product.store.model.Apply apply)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _applyLocalService.addApply(apply);
	}

	/**
	* Creates a new apply with the primary key. Does not add the apply to the database.
	*
	* @param applyId the primary key for the new apply
	* @return the new apply
	*/
	@Override
	public com.liferay.product.store.model.Apply createApply(long applyId) {
		return _applyLocalService.createApply(applyId);
	}

	/**
	* Deletes the apply with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param applyId the primary key of the apply
	* @return the apply that was removed
	* @throws PortalException if a apply with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.product.store.model.Apply deleteApply(long applyId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _applyLocalService.deleteApply(applyId);
	}

	/**
	* Deletes the apply from the database. Also notifies the appropriate model listeners.
	*
	* @param apply the apply
	* @return the apply that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.product.store.model.Apply deleteApply(
		com.liferay.product.store.model.Apply apply)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _applyLocalService.deleteApply(apply);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _applyLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _applyLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.product.store.model.impl.ApplyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _applyLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.product.store.model.impl.ApplyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _applyLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _applyLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _applyLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.liferay.product.store.model.Apply fetchApply(long applyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _applyLocalService.fetchApply(applyId);
	}

	/**
	* Returns the apply with the matching UUID and company.
	*
	* @param uuid the apply's UUID
	* @param companyId the primary key of the company
	* @return the matching apply, or <code>null</code> if a matching apply could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.product.store.model.Apply fetchApplyByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _applyLocalService.fetchApplyByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Returns the apply matching the UUID and group.
	*
	* @param uuid the apply's UUID
	* @param groupId the primary key of the group
	* @return the matching apply, or <code>null</code> if a matching apply could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.product.store.model.Apply fetchApplyByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _applyLocalService.fetchApplyByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns the apply with the primary key.
	*
	* @param applyId the primary key of the apply
	* @return the apply
	* @throws PortalException if a apply with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.product.store.model.Apply getApply(long applyId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _applyLocalService.getApply(applyId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _applyLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the apply with the matching UUID and company.
	*
	* @param uuid the apply's UUID
	* @param companyId the primary key of the company
	* @return the matching apply
	* @throws PortalException if a matching apply could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.product.store.model.Apply getApplyByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _applyLocalService.getApplyByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Returns the apply matching the UUID and group.
	*
	* @param uuid the apply's UUID
	* @param groupId the primary key of the group
	* @return the matching apply
	* @throws PortalException if a matching apply could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.product.store.model.Apply getApplyByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _applyLocalService.getApplyByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns a range of all the applies.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.product.store.model.impl.ApplyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of applies
	* @param end the upper bound of the range of applies (not inclusive)
	* @return the range of applies
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.liferay.product.store.model.Apply> getApplies(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _applyLocalService.getApplies(start, end);
	}

	/**
	* Returns the number of applies.
	*
	* @return the number of applies
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getAppliesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _applyLocalService.getAppliesCount();
	}

	/**
	* Updates the apply in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param apply the apply
	* @return the apply that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.product.store.model.Apply updateApply(
		com.liferay.product.store.model.Apply apply)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _applyLocalService.updateApply(apply);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _applyLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_applyLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _applyLocalService.invokeMethod(name, parameterTypes, arguments);
	}

	@Override
	public com.liferay.product.store.model.Apply addApply(long userId,
		java.lang.String projectName, java.lang.String integrationObject,
		java.lang.String useType, long productId, java.util.Date useDate,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _applyLocalService.addApply(userId, projectName,
			integrationObject, useType, productId, useDate, serviceContext);
	}

	@Override
	public java.util.List<com.liferay.product.store.model.Apply> getApplies()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _applyLocalService.getApplies();
	}

	@Override
	public com.liferay.product.store.model.Apply updateApply(long userId,
		long applyId, com.liferay.portal.service.ServiceContext serviceContext,
		java.lang.String approveFlag)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _applyLocalService.updateApply(userId, applyId, serviceContext,
			approveFlag);
	}

	@Override
	public java.util.List<com.liferay.product.store.model.Apply> getApplies(
		long groupId, long productId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _applyLocalService.getApplies(groupId, productId);
	}

	@Override
	public java.util.List<com.liferay.product.store.model.Apply> getApplies(
		long productId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _applyLocalService.getApplies(productId);
	}

	@Override
	public java.util.List<com.liferay.product.store.model.Apply> getApplies(
		long groupId, long productId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _applyLocalService.getApplies(groupId, productId, start, end);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public ApplyLocalService getWrappedApplyLocalService() {
		return _applyLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedApplyLocalService(ApplyLocalService applyLocalService) {
		_applyLocalService = applyLocalService;
	}

	@Override
	public ApplyLocalService getWrappedService() {
		return _applyLocalService;
	}

	@Override
	public void setWrappedService(ApplyLocalService applyLocalService) {
		_applyLocalService = applyLocalService;
	}

	private ApplyLocalService _applyLocalService;
}