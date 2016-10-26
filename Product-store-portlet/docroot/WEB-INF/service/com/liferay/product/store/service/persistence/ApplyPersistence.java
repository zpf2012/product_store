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

import com.liferay.product.store.model.Apply;

/**
 * The persistence interface for the apply service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author zhangpengfei
 * @see ApplyPersistenceImpl
 * @see ApplyUtil
 * @generated
 */
public interface ApplyPersistence extends BasePersistence<Apply> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ApplyUtil} to access the apply persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the applies where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching applies
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.product.store.model.Apply> findByUuid(
		java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the applies where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.product.store.model.impl.ApplyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of applies
	* @param end the upper bound of the range of applies (not inclusive)
	* @return the range of matching applies
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.product.store.model.Apply> findByUuid(
		java.lang.String uuid, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the applies where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.product.store.model.impl.ApplyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of applies
	* @param end the upper bound of the range of applies (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching applies
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.product.store.model.Apply> findByUuid(
		java.lang.String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first apply in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching apply
	* @throws com.liferay.product.store.NoSuchApplyException if a matching apply could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.product.store.model.Apply findByUuid_First(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.product.store.NoSuchApplyException;

	/**
	* Returns the first apply in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching apply, or <code>null</code> if a matching apply could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.product.store.model.Apply fetchByUuid_First(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last apply in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching apply
	* @throws com.liferay.product.store.NoSuchApplyException if a matching apply could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.product.store.model.Apply findByUuid_Last(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.product.store.NoSuchApplyException;

	/**
	* Returns the last apply in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching apply, or <code>null</code> if a matching apply could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.product.store.model.Apply fetchByUuid_Last(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the applies before and after the current apply in the ordered set where uuid = &#63;.
	*
	* @param applyId the primary key of the current apply
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next apply
	* @throws com.liferay.product.store.NoSuchApplyException if a apply with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.product.store.model.Apply[] findByUuid_PrevAndNext(
		long applyId, java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.product.store.NoSuchApplyException;

	/**
	* Removes all the applies where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	* @throws SystemException if a system exception occurred
	*/
	public void removeByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of applies where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching applies
	* @throws SystemException if a system exception occurred
	*/
	public int countByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the apply where uuid = &#63; and groupId = &#63; or throws a {@link com.liferay.product.store.NoSuchApplyException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching apply
	* @throws com.liferay.product.store.NoSuchApplyException if a matching apply could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.product.store.model.Apply findByUUID_G(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.product.store.NoSuchApplyException;

	/**
	* Returns the apply where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching apply, or <code>null</code> if a matching apply could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.product.store.model.Apply fetchByUUID_G(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the apply where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching apply, or <code>null</code> if a matching apply could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.product.store.model.Apply fetchByUUID_G(
		java.lang.String uuid, long groupId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the apply where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the apply that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.product.store.model.Apply removeByUUID_G(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.product.store.NoSuchApplyException;

	/**
	* Returns the number of applies where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching applies
	* @throws SystemException if a system exception occurred
	*/
	public int countByUUID_G(java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the applies where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching applies
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.product.store.model.Apply> findByUuid_C(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the applies where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.product.store.model.impl.ApplyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of applies
	* @param end the upper bound of the range of applies (not inclusive)
	* @return the range of matching applies
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.product.store.model.Apply> findByUuid_C(
		java.lang.String uuid, long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the applies where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.product.store.model.impl.ApplyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of applies
	* @param end the upper bound of the range of applies (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching applies
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.product.store.model.Apply> findByUuid_C(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first apply in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching apply
	* @throws com.liferay.product.store.NoSuchApplyException if a matching apply could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.product.store.model.Apply findByUuid_C_First(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.product.store.NoSuchApplyException;

	/**
	* Returns the first apply in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching apply, or <code>null</code> if a matching apply could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.product.store.model.Apply fetchByUuid_C_First(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last apply in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching apply
	* @throws com.liferay.product.store.NoSuchApplyException if a matching apply could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.product.store.model.Apply findByUuid_C_Last(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.product.store.NoSuchApplyException;

	/**
	* Returns the last apply in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching apply, or <code>null</code> if a matching apply could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.product.store.model.Apply fetchByUuid_C_Last(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the applies before and after the current apply in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param applyId the primary key of the current apply
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next apply
	* @throws com.liferay.product.store.NoSuchApplyException if a apply with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.product.store.model.Apply[] findByUuid_C_PrevAndNext(
		long applyId, java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.product.store.NoSuchApplyException;

	/**
	* Removes all the applies where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByUuid_C(java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of applies where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching applies
	* @throws SystemException if a system exception occurred
	*/
	public int countByUuid_C(java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the applies where applyId = &#63;.
	*
	* @param applyId the apply ID
	* @return the matching applies
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.product.store.model.Apply> findByApplyId(
		long applyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the applies where applyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.product.store.model.impl.ApplyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param applyId the apply ID
	* @param start the lower bound of the range of applies
	* @param end the upper bound of the range of applies (not inclusive)
	* @return the range of matching applies
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.product.store.model.Apply> findByApplyId(
		long applyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the applies where applyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.product.store.model.impl.ApplyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param applyId the apply ID
	* @param start the lower bound of the range of applies
	* @param end the upper bound of the range of applies (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching applies
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.product.store.model.Apply> findByApplyId(
		long applyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first apply in the ordered set where applyId = &#63;.
	*
	* @param applyId the apply ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching apply
	* @throws com.liferay.product.store.NoSuchApplyException if a matching apply could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.product.store.model.Apply findByApplyId_First(
		long applyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.product.store.NoSuchApplyException;

	/**
	* Returns the first apply in the ordered set where applyId = &#63;.
	*
	* @param applyId the apply ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching apply, or <code>null</code> if a matching apply could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.product.store.model.Apply fetchByApplyId_First(
		long applyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last apply in the ordered set where applyId = &#63;.
	*
	* @param applyId the apply ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching apply
	* @throws com.liferay.product.store.NoSuchApplyException if a matching apply could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.product.store.model.Apply findByApplyId_Last(
		long applyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.product.store.NoSuchApplyException;

	/**
	* Returns the last apply in the ordered set where applyId = &#63;.
	*
	* @param applyId the apply ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching apply, or <code>null</code> if a matching apply could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.product.store.model.Apply fetchByApplyId_Last(
		long applyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the applies where applyId = &#63; from the database.
	*
	* @param applyId the apply ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByApplyId(long applyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of applies where applyId = &#63;.
	*
	* @param applyId the apply ID
	* @return the number of matching applies
	* @throws SystemException if a system exception occurred
	*/
	public int countByApplyId(long applyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the apply in the entity cache if it is enabled.
	*
	* @param apply the apply
	*/
	public void cacheResult(com.liferay.product.store.model.Apply apply);

	/**
	* Caches the applies in the entity cache if it is enabled.
	*
	* @param applies the applies
	*/
	public void cacheResult(
		java.util.List<com.liferay.product.store.model.Apply> applies);

	/**
	* Creates a new apply with the primary key. Does not add the apply to the database.
	*
	* @param applyId the primary key for the new apply
	* @return the new apply
	*/
	public com.liferay.product.store.model.Apply create(long applyId);

	/**
	* Removes the apply with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param applyId the primary key of the apply
	* @return the apply that was removed
	* @throws com.liferay.product.store.NoSuchApplyException if a apply with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.product.store.model.Apply remove(long applyId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.product.store.NoSuchApplyException;

	public com.liferay.product.store.model.Apply updateImpl(
		com.liferay.product.store.model.Apply apply)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the apply with the primary key or throws a {@link com.liferay.product.store.NoSuchApplyException} if it could not be found.
	*
	* @param applyId the primary key of the apply
	* @return the apply
	* @throws com.liferay.product.store.NoSuchApplyException if a apply with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.product.store.model.Apply findByPrimaryKey(long applyId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.product.store.NoSuchApplyException;

	/**
	* Returns the apply with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param applyId the primary key of the apply
	* @return the apply, or <code>null</code> if a apply with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.product.store.model.Apply fetchByPrimaryKey(long applyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the applies.
	*
	* @return the applies
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.product.store.model.Apply> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.liferay.product.store.model.Apply> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the applies.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.product.store.model.impl.ApplyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of applies
	* @param end the upper bound of the range of applies (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of applies
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.product.store.model.Apply> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the applies from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of applies.
	*
	* @return the number of applies
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}