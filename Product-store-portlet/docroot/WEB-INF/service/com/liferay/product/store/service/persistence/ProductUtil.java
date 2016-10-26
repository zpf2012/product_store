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

import com.liferay.product.store.model.Product;

import java.util.List;

/**
 * The persistence utility for the product service. This utility wraps {@link ProductPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author zhangpengfei
 * @see ProductPersistence
 * @see ProductPersistenceImpl
 * @generated
 */
public class ProductUtil {
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
	public static void clearCache(Product product) {
		getPersistence().clearCache(product);
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
	public static List<Product> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Product> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Product> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static Product update(Product product) throws SystemException {
		return getPersistence().update(product);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static Product update(Product product, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(product, serviceContext);
	}

	/**
	* Returns all the products where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching products
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.product.store.model.Product> findByUuid(
		java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid(uuid);
	}

	/**
	* Returns a range of all the products where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.product.store.model.impl.ProductModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of products
	* @param end the upper bound of the range of products (not inclusive)
	* @return the range of matching products
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.product.store.model.Product> findByUuid(
		java.lang.String uuid, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	* Returns an ordered range of all the products where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.product.store.model.impl.ProductModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of products
	* @param end the upper bound of the range of products (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching products
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.product.store.model.Product> findByUuid(
		java.lang.String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	* Returns the first product in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching product
	* @throws com.liferay.product.store.NoSuchProductException if a matching product could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.product.store.model.Product findByUuid_First(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.product.store.NoSuchProductException {
		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the first product in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching product, or <code>null</code> if a matching product could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.product.store.model.Product fetchByUuid_First(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the last product in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching product
	* @throws com.liferay.product.store.NoSuchProductException if a matching product could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.product.store.model.Product findByUuid_Last(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.product.store.NoSuchProductException {
		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the last product in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching product, or <code>null</code> if a matching product could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.product.store.model.Product fetchByUuid_Last(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the products before and after the current product in the ordered set where uuid = &#63;.
	*
	* @param productId the primary key of the current product
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next product
	* @throws com.liferay.product.store.NoSuchProductException if a product with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.product.store.model.Product[] findByUuid_PrevAndNext(
		long productId, java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.product.store.NoSuchProductException {
		return getPersistence()
				   .findByUuid_PrevAndNext(productId, uuid, orderByComparator);
	}

	/**
	* Removes all the products where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByUuid(uuid);
	}

	/**
	* Returns the number of products where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching products
	* @throws SystemException if a system exception occurred
	*/
	public static int countByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByUuid(uuid);
	}

	/**
	* Returns the product where uuid = &#63; and groupId = &#63; or throws a {@link com.liferay.product.store.NoSuchProductException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching product
	* @throws com.liferay.product.store.NoSuchProductException if a matching product could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.product.store.model.Product findByUUID_G(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.product.store.NoSuchProductException {
		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	* Returns the product where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching product, or <code>null</code> if a matching product could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.product.store.model.Product fetchByUUID_G(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	* Returns the product where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching product, or <code>null</code> if a matching product could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.product.store.model.Product fetchByUUID_G(
		java.lang.String uuid, long groupId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUUID_G(uuid, groupId, retrieveFromCache);
	}

	/**
	* Removes the product where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the product that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.product.store.model.Product removeByUUID_G(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.product.store.NoSuchProductException {
		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	* Returns the number of products where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching products
	* @throws SystemException if a system exception occurred
	*/
	public static int countByUUID_G(java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	* Returns all the products where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching products
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.product.store.model.Product> findByUuid_C(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	* Returns a range of all the products where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.product.store.model.impl.ProductModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of products
	* @param end the upper bound of the range of products (not inclusive)
	* @return the range of matching products
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.product.store.model.Product> findByUuid_C(
		java.lang.String uuid, long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	* Returns an ordered range of all the products where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.product.store.model.impl.ProductModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of products
	* @param end the upper bound of the range of products (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching products
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.product.store.model.Product> findByUuid_C(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end, orderByComparator);
	}

	/**
	* Returns the first product in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching product
	* @throws com.liferay.product.store.NoSuchProductException if a matching product could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.product.store.model.Product findByUuid_C_First(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.product.store.NoSuchProductException {
		return getPersistence()
				   .findByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the first product in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching product, or <code>null</code> if a matching product could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.product.store.model.Product fetchByUuid_C_First(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last product in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching product
	* @throws com.liferay.product.store.NoSuchProductException if a matching product could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.product.store.model.Product findByUuid_C_Last(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.product.store.NoSuchProductException {
		return getPersistence()
				   .findByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last product in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching product, or <code>null</code> if a matching product could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.product.store.model.Product fetchByUuid_C_Last(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the products before and after the current product in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param productId the primary key of the current product
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next product
	* @throws com.liferay.product.store.NoSuchProductException if a product with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.product.store.model.Product[] findByUuid_C_PrevAndNext(
		long productId, java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.product.store.NoSuchProductException {
		return getPersistence()
				   .findByUuid_C_PrevAndNext(productId, uuid, companyId,
			orderByComparator);
	}

	/**
	* Removes all the products where uuid = &#63; and companyId = &#63; from the database.
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
	* Returns the number of products where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching products
	* @throws SystemException if a system exception occurred
	*/
	public static int countByUuid_C(java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	* Returns all the products where productId = &#63;.
	*
	* @param productId the product ID
	* @return the matching products
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.product.store.model.Product> findByProductId(
		long productId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByProductId(productId);
	}

	/**
	* Returns a range of all the products where productId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.product.store.model.impl.ProductModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param productId the product ID
	* @param start the lower bound of the range of products
	* @param end the upper bound of the range of products (not inclusive)
	* @return the range of matching products
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.product.store.model.Product> findByProductId(
		long productId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByProductId(productId, start, end);
	}

	/**
	* Returns an ordered range of all the products where productId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.product.store.model.impl.ProductModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param productId the product ID
	* @param start the lower bound of the range of products
	* @param end the upper bound of the range of products (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching products
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.product.store.model.Product> findByProductId(
		long productId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByProductId(productId, start, end, orderByComparator);
	}

	/**
	* Returns the first product in the ordered set where productId = &#63;.
	*
	* @param productId the product ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching product
	* @throws com.liferay.product.store.NoSuchProductException if a matching product could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.product.store.model.Product findByProductId_First(
		long productId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.product.store.NoSuchProductException {
		return getPersistence()
				   .findByProductId_First(productId, orderByComparator);
	}

	/**
	* Returns the first product in the ordered set where productId = &#63;.
	*
	* @param productId the product ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching product, or <code>null</code> if a matching product could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.product.store.model.Product fetchByProductId_First(
		long productId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByProductId_First(productId, orderByComparator);
	}

	/**
	* Returns the last product in the ordered set where productId = &#63;.
	*
	* @param productId the product ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching product
	* @throws com.liferay.product.store.NoSuchProductException if a matching product could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.product.store.model.Product findByProductId_Last(
		long productId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.product.store.NoSuchProductException {
		return getPersistence()
				   .findByProductId_Last(productId, orderByComparator);
	}

	/**
	* Returns the last product in the ordered set where productId = &#63;.
	*
	* @param productId the product ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching product, or <code>null</code> if a matching product could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.product.store.model.Product fetchByProductId_Last(
		long productId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByProductId_Last(productId, orderByComparator);
	}

	/**
	* Removes all the products where productId = &#63; from the database.
	*
	* @param productId the product ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByProductId(long productId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByProductId(productId);
	}

	/**
	* Returns the number of products where productId = &#63;.
	*
	* @param productId the product ID
	* @return the number of matching products
	* @throws SystemException if a system exception occurred
	*/
	public static int countByProductId(long productId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByProductId(productId);
	}

	/**
	* Caches the product in the entity cache if it is enabled.
	*
	* @param product the product
	*/
	public static void cacheResult(
		com.liferay.product.store.model.Product product) {
		getPersistence().cacheResult(product);
	}

	/**
	* Caches the products in the entity cache if it is enabled.
	*
	* @param products the products
	*/
	public static void cacheResult(
		java.util.List<com.liferay.product.store.model.Product> products) {
		getPersistence().cacheResult(products);
	}

	/**
	* Creates a new product with the primary key. Does not add the product to the database.
	*
	* @param productId the primary key for the new product
	* @return the new product
	*/
	public static com.liferay.product.store.model.Product create(long productId) {
		return getPersistence().create(productId);
	}

	/**
	* Removes the product with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param productId the primary key of the product
	* @return the product that was removed
	* @throws com.liferay.product.store.NoSuchProductException if a product with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.product.store.model.Product remove(long productId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.product.store.NoSuchProductException {
		return getPersistence().remove(productId);
	}

	public static com.liferay.product.store.model.Product updateImpl(
		com.liferay.product.store.model.Product product)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(product);
	}

	/**
	* Returns the product with the primary key or throws a {@link com.liferay.product.store.NoSuchProductException} if it could not be found.
	*
	* @param productId the primary key of the product
	* @return the product
	* @throws com.liferay.product.store.NoSuchProductException if a product with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.product.store.model.Product findByPrimaryKey(
		long productId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.product.store.NoSuchProductException {
		return getPersistence().findByPrimaryKey(productId);
	}

	/**
	* Returns the product with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param productId the primary key of the product
	* @return the product, or <code>null</code> if a product with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.product.store.model.Product fetchByPrimaryKey(
		long productId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(productId);
	}

	/**
	* Returns all the products.
	*
	* @return the products
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.product.store.model.Product> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the products.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.product.store.model.impl.ProductModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of products
	* @param end the upper bound of the range of products (not inclusive)
	* @return the range of products
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.product.store.model.Product> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the products.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.product.store.model.impl.ProductModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of products
	* @param end the upper bound of the range of products (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of products
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.product.store.model.Product> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the products from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of products.
	*
	* @return the number of products
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static ProductPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (ProductPersistence)PortletBeanLocatorUtil.locate(com.liferay.product.store.service.ClpSerializer.getServletContextName(),
					ProductPersistence.class.getName());

			ReferenceRegistry.registerReference(ProductUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(ProductPersistence persistence) {
	}

	private static ProductPersistence _persistence;
}