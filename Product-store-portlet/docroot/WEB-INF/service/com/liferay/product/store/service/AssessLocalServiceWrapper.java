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
 * Provides a wrapper for {@link AssessLocalService}.
 *
 * @author zhangpengfei
 * @see AssessLocalService
 * @generated
 */
public class AssessLocalServiceWrapper implements AssessLocalService,
	ServiceWrapper<AssessLocalService> {
	public AssessLocalServiceWrapper(AssessLocalService assessLocalService) {
		_assessLocalService = assessLocalService;
	}

	/**
	* Adds the assess to the database. Also notifies the appropriate model listeners.
	*
	* @param assess the assess
	* @return the assess that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.product.store.model.Assess addAssess(
		com.liferay.product.store.model.Assess assess)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _assessLocalService.addAssess(assess);
	}

	/**
	* Creates a new assess with the primary key. Does not add the assess to the database.
	*
	* @param assessId the primary key for the new assess
	* @return the new assess
	*/
	@Override
	public com.liferay.product.store.model.Assess createAssess(long assessId) {
		return _assessLocalService.createAssess(assessId);
	}

	/**
	* Deletes the assess with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param assessId the primary key of the assess
	* @return the assess that was removed
	* @throws PortalException if a assess with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.product.store.model.Assess deleteAssess(long assessId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _assessLocalService.deleteAssess(assessId);
	}

	/**
	* Deletes the assess from the database. Also notifies the appropriate model listeners.
	*
	* @param assess the assess
	* @return the assess that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.product.store.model.Assess deleteAssess(
		com.liferay.product.store.model.Assess assess)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _assessLocalService.deleteAssess(assess);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _assessLocalService.dynamicQuery();
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
		return _assessLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.product.store.model.impl.AssessModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _assessLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.product.store.model.impl.AssessModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _assessLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _assessLocalService.dynamicQueryCount(dynamicQuery);
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
		return _assessLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.liferay.product.store.model.Assess fetchAssess(long assessId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _assessLocalService.fetchAssess(assessId);
	}

	/**
	* Returns the assess with the matching UUID and company.
	*
	* @param uuid the assess's UUID
	* @param companyId the primary key of the company
	* @return the matching assess, or <code>null</code> if a matching assess could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.product.store.model.Assess fetchAssessByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _assessLocalService.fetchAssessByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Returns the assess matching the UUID and group.
	*
	* @param uuid the assess's UUID
	* @param groupId the primary key of the group
	* @return the matching assess, or <code>null</code> if a matching assess could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.product.store.model.Assess fetchAssessByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _assessLocalService.fetchAssessByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns the assess with the primary key.
	*
	* @param assessId the primary key of the assess
	* @return the assess
	* @throws PortalException if a assess with the primary key could not be found
	* @throws SystemException if a system exception occurred
	* @throws com.liferay.product.store.NoSuchAssessException
	*/
	@Override
	public com.liferay.product.store.model.Assess getAssess(long assessId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			com.liferay.product.store.NoSuchAssessException {
		return _assessLocalService.getAssess(assessId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _assessLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the assess with the matching UUID and company.
	*
	* @param uuid the assess's UUID
	* @param companyId the primary key of the company
	* @return the matching assess
	* @throws PortalException if a matching assess could not be found
	* @throws SystemException if a system exception occurred
	* @throws com.liferay.product.store.NoSuchAssessException
	*/
	@Override
	public com.liferay.product.store.model.Assess getAssessByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			com.liferay.product.store.NoSuchAssessException {
		return _assessLocalService.getAssessByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Returns the assess matching the UUID and group.
	*
	* @param uuid the assess's UUID
	* @param groupId the primary key of the group
	* @return the matching assess
	* @throws PortalException if a matching assess could not be found
	* @throws SystemException if a system exception occurred
	* @throws com.liferay.product.store.NoSuchAssessException
	*/
	@Override
	public com.liferay.product.store.model.Assess getAssessByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			com.liferay.product.store.NoSuchAssessException {
		return _assessLocalService.getAssessByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns a range of all the assesses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.product.store.model.impl.AssessModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of assesses
	* @param end the upper bound of the range of assesses (not inclusive)
	* @return the range of assesses
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.liferay.product.store.model.Assess> getAssesses(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _assessLocalService.getAssesses(start, end);
	}

	/**
	* Returns the number of assesses.
	*
	* @return the number of assesses
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getAssessesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _assessLocalService.getAssessesCount();
	}

	/**
	* Updates the assess in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param assess the assess
	* @return the assess that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.product.store.model.Assess updateAssess(
		com.liferay.product.store.model.Assess assess)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _assessLocalService.updateAssess(assess);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _assessLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_assessLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _assessLocalService.invokeMethod(name, parameterTypes, arguments);
	}

	@Override
	public java.util.List<com.liferay.product.store.model.Assess> getAssesses(
		long groupId, long applyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _assessLocalService.getAssesses(groupId, applyId);
	}

	@Override
	public java.util.List<com.liferay.product.store.model.Assess> getAssesses(
		long groupId, long applyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _assessLocalService.getAssesses(groupId, applyId, start, end);
	}

	@Override
	public java.util.List<com.liferay.product.store.model.Assess> getAssesses(
		long productId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _assessLocalService.getAssesses(productId);
	}

	@Override
	public com.liferay.product.store.model.Assess addAssess(long userId,
		long applyId, java.lang.String projectName, long productId,
		double multipleAssess, double multiPercent, int configurable,
		int stability, int integrationGrade,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.NoSuchUserException,
			com.liferay.portal.kernel.exception.SystemException {
		return _assessLocalService.addAssess(userId, applyId, projectName,
			productId, multipleAssess, multiPercent, configurable, stability,
			integrationGrade, serviceContext);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public AssessLocalService getWrappedAssessLocalService() {
		return _assessLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedAssessLocalService(
		AssessLocalService assessLocalService) {
		_assessLocalService = assessLocalService;
	}

	@Override
	public AssessLocalService getWrappedService() {
		return _assessLocalService;
	}

	@Override
	public void setWrappedService(AssessLocalService assessLocalService) {
		_assessLocalService = assessLocalService;
	}

	private AssessLocalService _assessLocalService;
}