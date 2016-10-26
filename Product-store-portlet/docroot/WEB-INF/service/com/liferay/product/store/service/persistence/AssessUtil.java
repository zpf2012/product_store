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

import com.liferay.product.store.model.Assess;

import java.util.List;

/**
 * The persistence utility for the assess service. This utility wraps {@link AssessPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author zhangpengfei
 * @see AssessPersistence
 * @see AssessPersistenceImpl
 * @generated
 */
public class AssessUtil {
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
	public static void clearCache(Assess assess) {
		getPersistence().clearCache(assess);
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
	public static List<Assess> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Assess> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Assess> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static Assess update(Assess assess) throws SystemException {
		return getPersistence().update(assess);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static Assess update(Assess assess, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(assess, serviceContext);
	}

	/**
	* Returns all the assesses where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching assesses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.product.store.model.Assess> findByUuid(
		java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid(uuid);
	}

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
	public static java.util.List<com.liferay.product.store.model.Assess> findByUuid(
		java.lang.String uuid, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid(uuid, start, end);
	}

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
	public static java.util.List<com.liferay.product.store.model.Assess> findByUuid(
		java.lang.String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	* Returns the first assess in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching assess
	* @throws com.liferay.product.store.NoSuchAssessException if a matching assess could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.product.store.model.Assess findByUuid_First(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.product.store.NoSuchAssessException {
		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the first assess in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching assess, or <code>null</code> if a matching assess could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.product.store.model.Assess fetchByUuid_First(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the last assess in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching assess
	* @throws com.liferay.product.store.NoSuchAssessException if a matching assess could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.product.store.model.Assess findByUuid_Last(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.product.store.NoSuchAssessException {
		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the last assess in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching assess, or <code>null</code> if a matching assess could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.product.store.model.Assess fetchByUuid_Last(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

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
	public static com.liferay.product.store.model.Assess[] findByUuid_PrevAndNext(
		long assessId, java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.product.store.NoSuchAssessException {
		return getPersistence()
				   .findByUuid_PrevAndNext(assessId, uuid, orderByComparator);
	}

	/**
	* Removes all the assesses where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByUuid(uuid);
	}

	/**
	* Returns the number of assesses where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching assesses
	* @throws SystemException if a system exception occurred
	*/
	public static int countByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByUuid(uuid);
	}

	/**
	* Returns the assess where uuid = &#63; and groupId = &#63; or throws a {@link com.liferay.product.store.NoSuchAssessException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching assess
	* @throws com.liferay.product.store.NoSuchAssessException if a matching assess could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.product.store.model.Assess findByUUID_G(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.product.store.NoSuchAssessException {
		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	* Returns the assess where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching assess, or <code>null</code> if a matching assess could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.product.store.model.Assess fetchByUUID_G(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	* Returns the assess where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching assess, or <code>null</code> if a matching assess could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.product.store.model.Assess fetchByUUID_G(
		java.lang.String uuid, long groupId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUUID_G(uuid, groupId, retrieveFromCache);
	}

	/**
	* Removes the assess where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the assess that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.product.store.model.Assess removeByUUID_G(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.product.store.NoSuchAssessException {
		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	* Returns the number of assesses where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching assesses
	* @throws SystemException if a system exception occurred
	*/
	public static int countByUUID_G(java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	* Returns all the assesses where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching assesses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.product.store.model.Assess> findByUuid_C(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

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
	public static java.util.List<com.liferay.product.store.model.Assess> findByUuid_C(
		java.lang.String uuid, long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

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
	public static java.util.List<com.liferay.product.store.model.Assess> findByUuid_C(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end, orderByComparator);
	}

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
	public static com.liferay.product.store.model.Assess findByUuid_C_First(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.product.store.NoSuchAssessException {
		return getPersistence()
				   .findByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the first assess in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching assess, or <code>null</code> if a matching assess could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.product.store.model.Assess fetchByUuid_C_First(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByUuid_C_First(uuid, companyId, orderByComparator);
	}

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
	public static com.liferay.product.store.model.Assess findByUuid_C_Last(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.product.store.NoSuchAssessException {
		return getPersistence()
				   .findByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last assess in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching assess, or <code>null</code> if a matching assess could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.product.store.model.Assess fetchByUuid_C_Last(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByUuid_C_Last(uuid, companyId, orderByComparator);
	}

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
	public static com.liferay.product.store.model.Assess[] findByUuid_C_PrevAndNext(
		long assessId, java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.product.store.NoSuchAssessException {
		return getPersistence()
				   .findByUuid_C_PrevAndNext(assessId, uuid, companyId,
			orderByComparator);
	}

	/**
	* Removes all the assesses where uuid = &#63; and companyId = &#63; from the database.
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
	* Returns the number of assesses where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching assesses
	* @throws SystemException if a system exception occurred
	*/
	public static int countByUuid_C(java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	* Returns the assess where assessId = &#63; or throws a {@link com.liferay.product.store.NoSuchAssessException} if it could not be found.
	*
	* @param assessId the assess ID
	* @return the matching assess
	* @throws com.liferay.product.store.NoSuchAssessException if a matching assess could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.product.store.model.Assess findByassessId(
		long assessId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.product.store.NoSuchAssessException {
		return getPersistence().findByassessId(assessId);
	}

	/**
	* Returns the assess where assessId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param assessId the assess ID
	* @return the matching assess, or <code>null</code> if a matching assess could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.product.store.model.Assess fetchByassessId(
		long assessId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByassessId(assessId);
	}

	/**
	* Returns the assess where assessId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param assessId the assess ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching assess, or <code>null</code> if a matching assess could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.product.store.model.Assess fetchByassessId(
		long assessId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByassessId(assessId, retrieveFromCache);
	}

	/**
	* Removes the assess where assessId = &#63; from the database.
	*
	* @param assessId the assess ID
	* @return the assess that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.product.store.model.Assess removeByassessId(
		long assessId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.product.store.NoSuchAssessException {
		return getPersistence().removeByassessId(assessId);
	}

	/**
	* Returns the number of assesses where assessId = &#63;.
	*
	* @param assessId the assess ID
	* @return the number of matching assesses
	* @throws SystemException if a system exception occurred
	*/
	public static int countByassessId(long assessId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByassessId(assessId);
	}

	/**
	* Returns the assess where applyId = &#63; or throws a {@link com.liferay.product.store.NoSuchAssessException} if it could not be found.
	*
	* @param applyId the apply ID
	* @return the matching assess
	* @throws com.liferay.product.store.NoSuchAssessException if a matching assess could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.product.store.model.Assess findByapplyId(
		long applyId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.product.store.NoSuchAssessException {
		return getPersistence().findByapplyId(applyId);
	}

	/**
	* Returns the assess where applyId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param applyId the apply ID
	* @return the matching assess, or <code>null</code> if a matching assess could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.product.store.model.Assess fetchByapplyId(
		long applyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByapplyId(applyId);
	}

	/**
	* Returns the assess where applyId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param applyId the apply ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching assess, or <code>null</code> if a matching assess could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.product.store.model.Assess fetchByapplyId(
		long applyId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByapplyId(applyId, retrieveFromCache);
	}

	/**
	* Removes the assess where applyId = &#63; from the database.
	*
	* @param applyId the apply ID
	* @return the assess that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.product.store.model.Assess removeByapplyId(
		long applyId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.product.store.NoSuchAssessException {
		return getPersistence().removeByapplyId(applyId);
	}

	/**
	* Returns the number of assesses where applyId = &#63;.
	*
	* @param applyId the apply ID
	* @return the number of matching assesses
	* @throws SystemException if a system exception occurred
	*/
	public static int countByapplyId(long applyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByapplyId(applyId);
	}

	/**
	* Caches the assess in the entity cache if it is enabled.
	*
	* @param assess the assess
	*/
	public static void cacheResult(
		com.liferay.product.store.model.Assess assess) {
		getPersistence().cacheResult(assess);
	}

	/**
	* Caches the assesses in the entity cache if it is enabled.
	*
	* @param assesses the assesses
	*/
	public static void cacheResult(
		java.util.List<com.liferay.product.store.model.Assess> assesses) {
		getPersistence().cacheResult(assesses);
	}

	/**
	* Creates a new assess with the primary key. Does not add the assess to the database.
	*
	* @param assessId the primary key for the new assess
	* @return the new assess
	*/
	public static com.liferay.product.store.model.Assess create(long assessId) {
		return getPersistence().create(assessId);
	}

	/**
	* Removes the assess with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param assessId the primary key of the assess
	* @return the assess that was removed
	* @throws com.liferay.product.store.NoSuchAssessException if a assess with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.product.store.model.Assess remove(long assessId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.product.store.NoSuchAssessException {
		return getPersistence().remove(assessId);
	}

	public static com.liferay.product.store.model.Assess updateImpl(
		com.liferay.product.store.model.Assess assess)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(assess);
	}

	/**
	* Returns the assess with the primary key or throws a {@link com.liferay.product.store.NoSuchAssessException} if it could not be found.
	*
	* @param assessId the primary key of the assess
	* @return the assess
	* @throws com.liferay.product.store.NoSuchAssessException if a assess with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.product.store.model.Assess findByPrimaryKey(
		long assessId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.product.store.NoSuchAssessException {
		return getPersistence().findByPrimaryKey(assessId);
	}

	/**
	* Returns the assess with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param assessId the primary key of the assess
	* @return the assess, or <code>null</code> if a assess with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.product.store.model.Assess fetchByPrimaryKey(
		long assessId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(assessId);
	}

	/**
	* Returns all the assesses.
	*
	* @return the assesses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.product.store.model.Assess> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
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
	public static java.util.List<com.liferay.product.store.model.Assess> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<com.liferay.product.store.model.Assess> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the assesses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of assesses.
	*
	* @return the number of assesses
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static AssessPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (AssessPersistence)PortletBeanLocatorUtil.locate(com.liferay.product.store.service.ClpSerializer.getServletContextName(),
					AssessPersistence.class.getName());

			ReferenceRegistry.registerReference(AssessUtil.class, "_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(AssessPersistence persistence) {
	}

	private static AssessPersistence _persistence;
}