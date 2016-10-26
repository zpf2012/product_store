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

package com.liferay.product.store.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.liferay.product.store.model.Assess;

/**
 * The persistence interface for the assess service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author zhangpengfei
 * @see AssessPersistenceImpl
 * @see AssessUtil
 * @generated
 */
public interface AssessPersistence extends BasePersistence<Assess> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AssessUtil} to access the assess persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the assesses where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching assesses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.product.store.model.Assess> findByUuid(
		java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the assesses where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.product.store.model.impl.AssessModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of assesses
	* @param end the upper bound of the range of assesses (not inclusive)
	* @return the range of matching assesses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.product.store.model.Assess> findByUuid(
		java.lang.String uuid, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the assesses where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.product.store.model.impl.AssessModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of assesses
	* @param end the upper bound of the range of assesses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching assesses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.product.store.model.Assess> findByUuid(
		java.lang.String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first assess in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching assess
	* @throws com.liferay.product.store.NoSuchAssessException if a matching assess could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.product.store.model.Assess findByUuid_First(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.product.store.NoSuchAssessException;

	/**
	* Returns the first assess in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching assess, or <code>null</code> if a matching assess could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.product.store.model.Assess fetchByUuid_First(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last assess in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching assess
	* @throws com.liferay.product.store.NoSuchAssessException if a matching assess could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.product.store.model.Assess findByUuid_Last(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.product.store.NoSuchAssessException;

	/**
	* Returns the last assess in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching assess, or <code>null</code> if a matching assess could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.product.store.model.Assess fetchByUuid_Last(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the assesses before and after the current assess in the ordered set where uuid = &#63;.
	*
	* @param assessId the primary key of the current assess
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next assess
	* @throws com.liferay.product.store.NoSuchAssessException if a assess with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.product.store.model.Assess[] findByUuid_PrevAndNext(
		long assessId, java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.product.store.NoSuchAssessException;

	/**
	* Removes all the assesses where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	* @throws SystemException if a system exception occurred
	*/
	public void removeByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of assesses where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching assesses
	* @throws SystemException if a system exception occurred
	*/
	public int countByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the assess where uuid = &#63; and groupId = &#63; or throws a {@link com.liferay.product.store.NoSuchAssessException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching assess
	* @throws com.liferay.product.store.NoSuchAssessException if a matching assess could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.product.store.model.Assess findByUUID_G(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.product.store.NoSuchAssessException;

	/**
	* Returns the assess where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching assess, or <code>null</code> if a matching assess could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.product.store.model.Assess fetchByUUID_G(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the assess where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching assess, or <code>null</code> if a matching assess could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.product.store.model.Assess fetchByUUID_G(
		java.lang.String uuid, long groupId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the assess where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the assess that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.product.store.model.Assess removeByUUID_G(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.product.store.NoSuchAssessException;

	/**
	* Returns the number of assesses where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching assesses
	* @throws SystemException if a system exception occurred
	*/
	public int countByUUID_G(java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the assesses where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching assesses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.product.store.model.Assess> findByUuid_C(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the assesses where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.product.store.model.impl.AssessModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of assesses
	* @param end the upper bound of the range of assesses (not inclusive)
	* @return the range of matching assesses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.product.store.model.Assess> findByUuid_C(
		java.lang.String uuid, long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the assesses where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.product.store.model.impl.AssessModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of assesses
	* @param end the upper bound of the range of assesses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching assesses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.product.store.model.Assess> findByUuid_C(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first assess in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching assess
	* @throws com.liferay.product.store.NoSuchAssessException if a matching assess could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.product.store.model.Assess findByUuid_C_First(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.product.store.NoSuchAssessException;

	/**
	* Returns the first assess in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching assess, or <code>null</code> if a matching assess could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.product.store.model.Assess fetchByUuid_C_First(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last assess in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching assess
	* @throws com.liferay.product.store.NoSuchAssessException if a matching assess could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.product.store.model.Assess findByUuid_C_Last(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.product.store.NoSuchAssessException;

	/**
	* Returns the last assess in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching assess, or <code>null</code> if a matching assess could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.product.store.model.Assess fetchByUuid_C_Last(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the assesses before and after the current assess in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param assessId the primary key of the current assess
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next assess
	* @throws com.liferay.product.store.NoSuchAssessException if a assess with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.product.store.model.Assess[] findByUuid_C_PrevAndNext(
		long assessId, java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.product.store.NoSuchAssessException;

	/**
	* Removes all the assesses where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByUuid_C(java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of assesses where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching assesses
	* @throws SystemException if a system exception occurred
	*/
	public int countByUuid_C(java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the assess where assessId = &#63; or throws a {@link com.liferay.product.store.NoSuchAssessException} if it could not be found.
	*
	* @param assessId the assess ID
	* @return the matching assess
	* @throws com.liferay.product.store.NoSuchAssessException if a matching assess could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.product.store.model.Assess findByassessId(long assessId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.product.store.NoSuchAssessException;

	/**
	* Returns the assess where assessId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param assessId the assess ID
	* @return the matching assess, or <code>null</code> if a matching assess could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.product.store.model.Assess fetchByassessId(long assessId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the assess where assessId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param assessId the assess ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching assess, or <code>null</code> if a matching assess could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.product.store.model.Assess fetchByassessId(
		long assessId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the assess where assessId = &#63; from the database.
	*
	* @param assessId the assess ID
	* @return the assess that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.product.store.model.Assess removeByassessId(
		long assessId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.product.store.NoSuchAssessException;

	/**
	* Returns the number of assesses where assessId = &#63;.
	*
	* @param assessId the assess ID
	* @return the number of matching assesses
	* @throws SystemException if a system exception occurred
	*/
	public int countByassessId(long assessId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the assess where applyId = &#63; or throws a {@link com.liferay.product.store.NoSuchAssessException} if it could not be found.
	*
	* @param applyId the apply ID
	* @return the matching assess
	* @throws com.liferay.product.store.NoSuchAssessException if a matching assess could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.product.store.model.Assess findByapplyId(long applyId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.product.store.NoSuchAssessException;

	/**
	* Returns the assess where applyId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param applyId the apply ID
	* @return the matching assess, or <code>null</code> if a matching assess could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.product.store.model.Assess fetchByapplyId(long applyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the assess where applyId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param applyId the apply ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching assess, or <code>null</code> if a matching assess could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.product.store.model.Assess fetchByapplyId(long applyId,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the assess where applyId = &#63; from the database.
	*
	* @param applyId the apply ID
	* @return the assess that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.product.store.model.Assess removeByapplyId(long applyId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.product.store.NoSuchAssessException;

	/**
	* Returns the number of assesses where applyId = &#63;.
	*
	* @param applyId the apply ID
	* @return the number of matching assesses
	* @throws SystemException if a system exception occurred
	*/
	public int countByapplyId(long applyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the assess in the entity cache if it is enabled.
	*
	* @param assess the assess
	*/
	public void cacheResult(com.liferay.product.store.model.Assess assess);

	/**
	* Caches the assesses in the entity cache if it is enabled.
	*
	* @param assesses the assesses
	*/
	public void cacheResult(
		java.util.List<com.liferay.product.store.model.Assess> assesses);

	/**
	* Creates a new assess with the primary key. Does not add the assess to the database.
	*
	* @param assessId the primary key for the new assess
	* @return the new assess
	*/
	public com.liferay.product.store.model.Assess create(long assessId);

	/**
	* Removes the assess with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param assessId the primary key of the assess
	* @return the assess that was removed
	* @throws com.liferay.product.store.NoSuchAssessException if a assess with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.product.store.model.Assess remove(long assessId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.product.store.NoSuchAssessException;

	public com.liferay.product.store.model.Assess updateImpl(
		com.liferay.product.store.model.Assess assess)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the assess with the primary key or throws a {@link com.liferay.product.store.NoSuchAssessException} if it could not be found.
	*
	* @param assessId the primary key of the assess
	* @return the assess
	* @throws com.liferay.product.store.NoSuchAssessException if a assess with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.product.store.model.Assess findByPrimaryKey(
		long assessId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.product.store.NoSuchAssessException;

	/**
	* Returns the assess with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param assessId the primary key of the assess
	* @return the assess, or <code>null</code> if a assess with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.product.store.model.Assess fetchByPrimaryKey(
		long assessId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the assesses.
	*
	* @return the assesses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.product.store.model.Assess> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.liferay.product.store.model.Assess> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the assesses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.product.store.model.impl.AssessModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of assesses
	* @param end the upper bound of the range of assesses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of assesses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.product.store.model.Assess> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the assesses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of assesses.
	*
	* @return the number of assesses
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}