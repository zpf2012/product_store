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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.liferay.product.store.model.Apply;

import java.util.List;

/**
 * The persistence utility for the apply service. This utility wraps {@link ApplyPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author zhangpengfei
 * @see ApplyPersistence
 * @see ApplyPersistenceImpl
 * @generated
 */
public class ApplyUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(Apply apply) {
		getPersistence().clearCache(apply);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Apply> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Apply> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Apply> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static Apply update(Apply apply) throws SystemException {
		return getPersistence().update(apply);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static Apply update(Apply apply, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(apply, serviceContext);
	}

	/**
	* Returns all the applies where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching applies
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.product.store.model.Apply> findByUuid(
		java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid(uuid);
	}

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
	public static java.util.List<com.liferay.product.store.model.Apply> findByUuid(
		java.lang.String uuid, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid(uuid, start, end);
	}

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
	public static java.util.List<com.liferay.product.store.model.Apply> findByUuid(
		java.lang.String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	* Returns the first apply in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching apply
	* @throws com.liferay.product.store.NoSuchApplyException if a matching apply could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.product.store.model.Apply findByUuid_First(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.product.store.NoSuchApplyException {
		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the first apply in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching apply, or <code>null</code> if a matching apply could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.product.store.model.Apply fetchByUuid_First(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the last apply in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching apply
	* @throws com.liferay.product.store.NoSuchApplyException if a matching apply could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.product.store.model.Apply findByUuid_Last(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.product.store.NoSuchApplyException {
		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the last apply in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching apply, or <code>null</code> if a matching apply could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.product.store.model.Apply fetchByUuid_Last(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

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
	public static com.liferay.product.store.model.Apply[] findByUuid_PrevAndNext(
		long applyId, java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.product.store.NoSuchApplyException {
		return getPersistence()
				   .findByUuid_PrevAndNext(applyId, uuid, orderByComparator);
	}

	/**
	* Removes all the applies where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByUuid(uuid);
	}

	/**
	* Returns the number of applies where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching applies
	* @throws SystemException if a system exception occurred
	*/
	public static int countByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByUuid(uuid);
	}

	/**
	* Returns the apply where uuid = &#63; and groupId = &#63; or throws a {@link com.liferay.product.store.NoSuchApplyException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching apply
	* @throws com.liferay.product.store.NoSuchApplyException if a matching apply could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.product.store.model.Apply findByUUID_G(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.product.store.NoSuchApplyException {
		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	* Returns the apply where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching apply, or <code>null</code> if a matching apply could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.product.store.model.Apply fetchByUUID_G(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	* Returns the apply where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching apply, or <code>null</code> if a matching apply could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.product.store.model.Apply fetchByUUID_G(
		java.lang.String uuid, long groupId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUUID_G(uuid, groupId, retrieveFromCache);
	}

	/**
	* Removes the apply where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the apply that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.product.store.model.Apply removeByUUID_G(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.product.store.NoSuchApplyException {
		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	* Returns the number of applies where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching applies
	* @throws SystemException if a system exception occurred
	*/
	public static int countByUUID_G(java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	* Returns all the applies where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching applies
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.product.store.model.Apply> findByUuid_C(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

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
	public static java.util.List<com.liferay.product.store.model.Apply> findByUuid_C(
		java.lang.String uuid, long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

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
	public static java.util.List<com.liferay.product.store.model.Apply> findByUuid_C(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end, orderByComparator);
	}

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
	public static com.liferay.product.store.model.Apply findByUuid_C_First(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.product.store.NoSuchApplyException {
		return getPersistence()
				   .findByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the first apply in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching apply, or <code>null</code> if a matching apply could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.product.store.model.Apply fetchByUuid_C_First(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByUuid_C_First(uuid, companyId, orderByComparator);
	}

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
	public static com.liferay.product.store.model.Apply findByUuid_C_Last(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.product.store.NoSuchApplyException {
		return getPersistence()
				   .findByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last apply in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching apply, or <code>null</code> if a matching apply could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.product.store.model.Apply fetchByUuid_C_Last(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByUuid_C_Last(uuid, companyId, orderByComparator);
	}

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
	public static com.liferay.product.store.model.Apply[] findByUuid_C_PrevAndNext(
		long applyId, java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.product.store.NoSuchApplyException {
		return getPersistence()
				   .findByUuid_C_PrevAndNext(applyId, uuid, companyId,
			orderByComparator);
	}

	/**
	* Removes all the applies where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByUuid_C(java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	* Returns the number of applies where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching applies
	* @throws SystemException if a system exception occurred
	*/
	public static int countByUuid_C(java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	* Returns all the applies where applyId = &#63;.
	*
	* @param applyId the apply ID
	* @return the matching applies
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.product.store.model.Apply> findByApplyId(
		long applyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByApplyId(applyId);
	}

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
	public static java.util.List<com.liferay.product.store.model.Apply> findByApplyId(
		long applyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByApplyId(applyId, start, end);
	}

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
	public static java.util.List<com.liferay.product.store.model.Apply> findByApplyId(
		long applyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByApplyId(applyId, start, end, orderByComparator);
	}

	/**
	* Returns the first apply in the ordered set where applyId = &#63;.
	*
	* @param applyId the apply ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching apply
	* @throws com.liferay.product.store.NoSuchApplyException if a matching apply could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.product.store.model.Apply findByApplyId_First(
		long applyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.product.store.NoSuchApplyException {
		return getPersistence().findByApplyId_First(applyId, orderByComparator);
	}

	/**
	* Returns the first apply in the ordered set where applyId = &#63;.
	*
	* @param applyId the apply ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching apply, or <code>null</code> if a matching apply could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.product.store.model.Apply fetchByApplyId_First(
		long applyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByApplyId_First(applyId, orderByComparator);
	}

	/**
	* Returns the last apply in the ordered set where applyId = &#63;.
	*
	* @param applyId the apply ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching apply
	* @throws com.liferay.product.store.NoSuchApplyException if a matching apply could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.product.store.model.Apply findByApplyId_Last(
		long applyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.product.store.NoSuchApplyException {
		return getPersistence().findByApplyId_Last(applyId, orderByComparator);
	}

	/**
	* Returns the last apply in the ordered set where applyId = &#63;.
	*
	* @param applyId the apply ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching apply, or <code>null</code> if a matching apply could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.product.store.model.Apply fetchByApplyId_Last(
		long applyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByApplyId_Last(applyId, orderByComparator);
	}

	/**
	* Removes all the applies where applyId = &#63; from the database.
	*
	* @param applyId the apply ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByApplyId(long applyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByApplyId(applyId);
	}

	/**
	* Returns the number of applies where applyId = &#63;.
	*
	* @param applyId the apply ID
	* @return the number of matching applies
	* @throws SystemException if a system exception occurred
	*/
	public static int countByApplyId(long applyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByApplyId(applyId);
	}

	/**
	* Caches the apply in the entity cache if it is enabled.
	*
	* @param apply the apply
	*/
	public static void cacheResult(com.liferay.product.store.model.Apply apply) {
		getPersistence().cacheResult(apply);
	}

	/**
	* Caches the applies in the entity cache if it is enabled.
	*
	* @param applies the applies
	*/
	public static void cacheResult(
		java.util.List<com.liferay.product.store.model.Apply> applies) {
		getPersistence().cacheResult(applies);
	}

	/**
	* Creates a new apply with the primary key. Does not add the apply to the database.
	*
	* @param applyId the primary key for the new apply
	* @return the new apply
	*/
	public static com.liferay.product.store.model.Apply create(long applyId) {
		return getPersistence().create(applyId);
	}

	/**
	* Removes the apply with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param applyId the primary key of the apply
	* @return the apply that was removed
	* @throws com.liferay.product.store.NoSuchApplyException if a apply with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.product.store.model.Apply remove(long applyId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.product.store.NoSuchApplyException {
		return getPersistence().remove(applyId);
	}

	public static com.liferay.product.store.model.Apply updateImpl(
		com.liferay.product.store.model.Apply apply)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(apply);
	}

	/**
	* Returns the apply with the primary key or throws a {@link com.liferay.product.store.NoSuchApplyException} if it could not be found.
	*
	* @param applyId the primary key of the apply
	* @return the apply
	* @throws com.liferay.product.store.NoSuchApplyException if a apply with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.product.store.model.Apply findByPrimaryKey(
		long applyId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.product.store.NoSuchApplyException {
		return getPersistence().findByPrimaryKey(applyId);
	}

	/**
	* Returns the apply with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param applyId the primary key of the apply
	* @return the apply, or <code>null</code> if a apply with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.product.store.model.Apply fetchByPrimaryKey(
		long applyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(applyId);
	}

	/**
	* Returns all the applies.
	*
	* @return the applies
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.product.store.model.Apply> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
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
	public static java.util.List<com.liferay.product.store.model.Apply> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<com.liferay.product.store.model.Apply> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the applies from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of applies.
	*
	* @return the number of applies
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static ApplyPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (ApplyPersistence)PortletBeanLocatorUtil.locate(com.liferay.product.store.service.ClpSerializer.getServletContextName(),
					ApplyPersistence.class.getName());

			ReferenceRegistry.registerReference(ApplyUtil.class, "_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(ApplyPersistence persistence) {
	}

	private static ApplyPersistence _persistence;
}