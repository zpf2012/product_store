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

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.liferay.product.store.NoSuchApplyException;
import com.liferay.product.store.model.Apply;
import com.liferay.product.store.model.impl.ApplyImpl;
import com.liferay.product.store.model.impl.ApplyModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the apply service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author zhangpengfei
 * @see ApplyPersistence
 * @see ApplyUtil
 * @generated
 */
public class ApplyPersistenceImpl extends BasePersistenceImpl<Apply>
	implements ApplyPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ApplyUtil} to access the apply persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ApplyImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ApplyModelImpl.ENTITY_CACHE_ENABLED,
			ApplyModelImpl.FINDER_CACHE_ENABLED, ApplyImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ApplyModelImpl.ENTITY_CACHE_ENABLED,
			ApplyModelImpl.FINDER_CACHE_ENABLED, ApplyImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ApplyModelImpl.ENTITY_CACHE_ENABLED,
			ApplyModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID = new FinderPath(ApplyModelImpl.ENTITY_CACHE_ENABLED,
			ApplyModelImpl.FINDER_CACHE_ENABLED, ApplyImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID = new FinderPath(ApplyModelImpl.ENTITY_CACHE_ENABLED,
			ApplyModelImpl.FINDER_CACHE_ENABLED, ApplyImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] { String.class.getName() },
			ApplyModelImpl.UUID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID = new FinderPath(ApplyModelImpl.ENTITY_CACHE_ENABLED,
			ApplyModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] { String.class.getName() });

	/**
	 * Returns all the applies where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching applies
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Apply> findByUuid(String uuid) throws SystemException {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Apply> findByUuid(String uuid, int start, int end)
		throws SystemException {
		return findByUuid(uuid, start, end, null);
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
	@Override
	public List<Apply> findByUuid(String uuid, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID;
			finderArgs = new Object[] { uuid };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID;
			finderArgs = new Object[] { uuid, start, end, orderByComparator };
		}

		List<Apply> list = (List<Apply>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Apply apply : list) {
				if (!Validator.equals(uuid, apply.getUuid())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_APPLY_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ApplyModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				if (!pagination) {
					list = (List<Apply>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Apply>(list);
				}
				else {
					list = (List<Apply>)QueryUtil.list(q, getDialect(), start,
							end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
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
	@Override
	public Apply findByUuid_First(String uuid,
		OrderByComparator orderByComparator)
		throws NoSuchApplyException, SystemException {
		Apply apply = fetchByUuid_First(uuid, orderByComparator);

		if (apply != null) {
			return apply;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchApplyException(msg.toString());
	}

	/**
	 * Returns the first apply in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching apply, or <code>null</code> if a matching apply could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Apply fetchByUuid_First(String uuid,
		OrderByComparator orderByComparator) throws SystemException {
		List<Apply> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Apply findByUuid_Last(String uuid,
		OrderByComparator orderByComparator)
		throws NoSuchApplyException, SystemException {
		Apply apply = fetchByUuid_Last(uuid, orderByComparator);

		if (apply != null) {
			return apply;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchApplyException(msg.toString());
	}

	/**
	 * Returns the last apply in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching apply, or <code>null</code> if a matching apply could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Apply fetchByUuid_Last(String uuid,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<Apply> list = findByUuid(uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Apply[] findByUuid_PrevAndNext(long applyId, String uuid,
		OrderByComparator orderByComparator)
		throws NoSuchApplyException, SystemException {
		Apply apply = findByPrimaryKey(applyId);

		Session session = null;

		try {
			session = openSession();

			Apply[] array = new ApplyImpl[3];

			array[0] = getByUuid_PrevAndNext(session, apply, uuid,
					orderByComparator, true);

			array[1] = apply;

			array[2] = getByUuid_PrevAndNext(session, apply, uuid,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Apply getByUuid_PrevAndNext(Session session, Apply apply,
		String uuid, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_APPLY_WHERE);

		boolean bindUuid = false;

		if (uuid == null) {
			query.append(_FINDER_COLUMN_UUID_UUID_1);
		}
		else if (uuid.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_UUID_UUID_3);
		}
		else {
			bindUuid = true;

			query.append(_FINDER_COLUMN_UUID_UUID_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(ApplyModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindUuid) {
			qPos.add(uuid);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(apply);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Apply> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the applies where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByUuid(String uuid) throws SystemException {
		for (Apply apply : findByUuid(uuid, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(apply);
		}
	}

	/**
	 * Returns the number of applies where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching applies
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByUuid(String uuid) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID;

		Object[] finderArgs = new Object[] { uuid };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_APPLY_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_UUID_1 = "apply.uuid IS NULL";
	private static final String _FINDER_COLUMN_UUID_UUID_2 = "apply.uuid = ?";
	private static final String _FINDER_COLUMN_UUID_UUID_3 = "(apply.uuid IS NULL OR apply.uuid = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_UUID_G = new FinderPath(ApplyModelImpl.ENTITY_CACHE_ENABLED,
			ApplyModelImpl.FINDER_CACHE_ENABLED, ApplyImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByUUID_G",
			new String[] { String.class.getName(), Long.class.getName() },
			ApplyModelImpl.UUID_COLUMN_BITMASK |
			ApplyModelImpl.GROUPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID_G = new FinderPath(ApplyModelImpl.ENTITY_CACHE_ENABLED,
			ApplyModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUUID_G",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns the apply where uuid = &#63; and groupId = &#63; or throws a {@link com.liferay.product.store.NoSuchApplyException} if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching apply
	 * @throws com.liferay.product.store.NoSuchApplyException if a matching apply could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Apply findByUUID_G(String uuid, long groupId)
		throws NoSuchApplyException, SystemException {
		Apply apply = fetchByUUID_G(uuid, groupId);

		if (apply == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("uuid=");
			msg.append(uuid);

			msg.append(", groupId=");
			msg.append(groupId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchApplyException(msg.toString());
		}

		return apply;
	}

	/**
	 * Returns the apply where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching apply, or <code>null</code> if a matching apply could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Apply fetchByUUID_G(String uuid, long groupId)
		throws SystemException {
		return fetchByUUID_G(uuid, groupId, true);
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
	@Override
	public Apply fetchByUUID_G(String uuid, long groupId,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { uuid, groupId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_UUID_G,
					finderArgs, this);
		}

		if (result instanceof Apply) {
			Apply apply = (Apply)result;

			if (!Validator.equals(uuid, apply.getUuid()) ||
					(groupId != apply.getGroupId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_APPLY_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_G_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(groupId);

				List<Apply> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G,
						finderArgs, list);
				}
				else {
					Apply apply = list.get(0);

					result = apply;

					cacheResult(apply);

					if ((apply.getUuid() == null) ||
							!apply.getUuid().equals(uuid) ||
							(apply.getGroupId() != groupId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G,
							finderArgs, apply);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_UUID_G,
					finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (Apply)result;
		}
	}

	/**
	 * Removes the apply where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the apply that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Apply removeByUUID_G(String uuid, long groupId)
		throws NoSuchApplyException, SystemException {
		Apply apply = findByUUID_G(uuid, groupId);

		return remove(apply);
	}

	/**
	 * Returns the number of applies where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching applies
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_G;

		Object[] finderArgs = new Object[] { uuid, groupId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_APPLY_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_G_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(groupId);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_G_UUID_1 = "apply.uuid IS NULL AND ";
	private static final String _FINDER_COLUMN_UUID_G_UUID_2 = "apply.uuid = ? AND ";
	private static final String _FINDER_COLUMN_UUID_G_UUID_3 = "(apply.uuid IS NULL OR apply.uuid = '') AND ";
	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 = "apply.groupId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID_C = new FinderPath(ApplyModelImpl.ENTITY_CACHE_ENABLED,
			ApplyModelImpl.FINDER_CACHE_ENABLED, ApplyImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid_C",
			new String[] {
				String.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C =
		new FinderPath(ApplyModelImpl.ENTITY_CACHE_ENABLED,
			ApplyModelImpl.FINDER_CACHE_ENABLED, ApplyImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid_C",
			new String[] { String.class.getName(), Long.class.getName() },
			ApplyModelImpl.UUID_COLUMN_BITMASK |
			ApplyModelImpl.COMPANYID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID_C = new FinderPath(ApplyModelImpl.ENTITY_CACHE_ENABLED,
			ApplyModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid_C",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns all the applies where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching applies
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Apply> findByUuid_C(String uuid, long companyId)
		throws SystemException {
		return findByUuid_C(uuid, companyId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
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
	@Override
	public List<Apply> findByUuid_C(String uuid, long companyId, int start,
		int end) throws SystemException {
		return findByUuid_C(uuid, companyId, start, end, null);
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
	@Override
	public List<Apply> findByUuid_C(String uuid, long companyId, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C;
			finderArgs = new Object[] { uuid, companyId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID_C;
			finderArgs = new Object[] {
					uuid, companyId,
					
					start, end, orderByComparator
				};
		}

		List<Apply> list = (List<Apply>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Apply apply : list) {
				if (!Validator.equals(uuid, apply.getUuid()) ||
						(companyId != apply.getCompanyId())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(4 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_APPLY_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_C_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ApplyModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(companyId);

				if (!pagination) {
					list = (List<Apply>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Apply>(list);
				}
				else {
					list = (List<Apply>)QueryUtil.list(q, getDialect(), start,
							end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
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
	@Override
	public Apply findByUuid_C_First(String uuid, long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchApplyException, SystemException {
		Apply apply = fetchByUuid_C_First(uuid, companyId, orderByComparator);

		if (apply != null) {
			return apply;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchApplyException(msg.toString());
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
	@Override
	public Apply fetchByUuid_C_First(String uuid, long companyId,
		OrderByComparator orderByComparator) throws SystemException {
		List<Apply> list = findByUuid_C(uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Apply findByUuid_C_Last(String uuid, long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchApplyException, SystemException {
		Apply apply = fetchByUuid_C_Last(uuid, companyId, orderByComparator);

		if (apply != null) {
			return apply;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchApplyException(msg.toString());
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
	@Override
	public Apply fetchByUuid_C_Last(String uuid, long companyId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<Apply> list = findByUuid_C(uuid, companyId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Apply[] findByUuid_C_PrevAndNext(long applyId, String uuid,
		long companyId, OrderByComparator orderByComparator)
		throws NoSuchApplyException, SystemException {
		Apply apply = findByPrimaryKey(applyId);

		Session session = null;

		try {
			session = openSession();

			Apply[] array = new ApplyImpl[3];

			array[0] = getByUuid_C_PrevAndNext(session, apply, uuid, companyId,
					orderByComparator, true);

			array[1] = apply;

			array[2] = getByUuid_C_PrevAndNext(session, apply, uuid, companyId,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Apply getByUuid_C_PrevAndNext(Session session, Apply apply,
		String uuid, long companyId, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_APPLY_WHERE);

		boolean bindUuid = false;

		if (uuid == null) {
			query.append(_FINDER_COLUMN_UUID_C_UUID_1);
		}
		else if (uuid.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_UUID_C_UUID_3);
		}
		else {
			bindUuid = true;

			query.append(_FINDER_COLUMN_UUID_C_UUID_2);
		}

		query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(ApplyModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindUuid) {
			qPos.add(uuid);
		}

		qPos.add(companyId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(apply);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Apply> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the applies where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId)
		throws SystemException {
		for (Apply apply : findByUuid_C(uuid, companyId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(apply);
		}
	}

	/**
	 * Returns the number of applies where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching applies
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_C;

		Object[] finderArgs = new Object[] { uuid, companyId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_APPLY_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_C_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(companyId);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_C_UUID_1 = "apply.uuid IS NULL AND ";
	private static final String _FINDER_COLUMN_UUID_C_UUID_2 = "apply.uuid = ? AND ";
	private static final String _FINDER_COLUMN_UUID_C_UUID_3 = "(apply.uuid IS NULL OR apply.uuid = '') AND ";
	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 = "apply.companyId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_APPLYID = new FinderPath(ApplyModelImpl.ENTITY_CACHE_ENABLED,
			ApplyModelImpl.FINDER_CACHE_ENABLED, ApplyImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByApplyId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_APPLYID =
		new FinderPath(ApplyModelImpl.ENTITY_CACHE_ENABLED,
			ApplyModelImpl.FINDER_CACHE_ENABLED, ApplyImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByApplyId",
			new String[] { Long.class.getName() },
			ApplyModelImpl.APPLYID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_APPLYID = new FinderPath(ApplyModelImpl.ENTITY_CACHE_ENABLED,
			ApplyModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByApplyId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the applies where applyId = &#63;.
	 *
	 * @param applyId the apply ID
	 * @return the matching applies
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Apply> findByApplyId(long applyId) throws SystemException {
		return findByApplyId(applyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Apply> findByApplyId(long applyId, int start, int end)
		throws SystemException {
		return findByApplyId(applyId, start, end, null);
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
	@Override
	public List<Apply> findByApplyId(long applyId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_APPLYID;
			finderArgs = new Object[] { applyId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_APPLYID;
			finderArgs = new Object[] { applyId, start, end, orderByComparator };
		}

		List<Apply> list = (List<Apply>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Apply apply : list) {
				if ((applyId != apply.getApplyId())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_APPLY_WHERE);

			query.append(_FINDER_COLUMN_APPLYID_APPLYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ApplyModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(applyId);

				if (!pagination) {
					list = (List<Apply>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Apply>(list);
				}
				else {
					list = (List<Apply>)QueryUtil.list(q, getDialect(), start,
							end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
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
	@Override
	public Apply findByApplyId_First(long applyId,
		OrderByComparator orderByComparator)
		throws NoSuchApplyException, SystemException {
		Apply apply = fetchByApplyId_First(applyId, orderByComparator);

		if (apply != null) {
			return apply;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("applyId=");
		msg.append(applyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchApplyException(msg.toString());
	}

	/**
	 * Returns the first apply in the ordered set where applyId = &#63;.
	 *
	 * @param applyId the apply ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching apply, or <code>null</code> if a matching apply could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Apply fetchByApplyId_First(long applyId,
		OrderByComparator orderByComparator) throws SystemException {
		List<Apply> list = findByApplyId(applyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Apply findByApplyId_Last(long applyId,
		OrderByComparator orderByComparator)
		throws NoSuchApplyException, SystemException {
		Apply apply = fetchByApplyId_Last(applyId, orderByComparator);

		if (apply != null) {
			return apply;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("applyId=");
		msg.append(applyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchApplyException(msg.toString());
	}

	/**
	 * Returns the last apply in the ordered set where applyId = &#63;.
	 *
	 * @param applyId the apply ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching apply, or <code>null</code> if a matching apply could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Apply fetchByApplyId_Last(long applyId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByApplyId(applyId);

		if (count == 0) {
			return null;
		}

		List<Apply> list = findByApplyId(applyId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Removes all the applies where applyId = &#63; from the database.
	 *
	 * @param applyId the apply ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByApplyId(long applyId) throws SystemException {
		for (Apply apply : findByApplyId(applyId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(apply);
		}
	}

	/**
	 * Returns the number of applies where applyId = &#63;.
	 *
	 * @param applyId the apply ID
	 * @return the number of matching applies
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByApplyId(long applyId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_APPLYID;

		Object[] finderArgs = new Object[] { applyId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_APPLY_WHERE);

			query.append(_FINDER_COLUMN_APPLYID_APPLYID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(applyId);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_APPLYID_APPLYID_2 = "apply.applyId = ?";

	public ApplyPersistenceImpl() {
		setModelClass(Apply.class);
	}

	/**
	 * Caches the apply in the entity cache if it is enabled.
	 *
	 * @param apply the apply
	 */
	@Override
	public void cacheResult(Apply apply) {
		EntityCacheUtil.putResult(ApplyModelImpl.ENTITY_CACHE_ENABLED,
			ApplyImpl.class, apply.getPrimaryKey(), apply);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G,
			new Object[] { apply.getUuid(), apply.getGroupId() }, apply);

		apply.resetOriginalValues();
	}

	/**
	 * Caches the applies in the entity cache if it is enabled.
	 *
	 * @param applies the applies
	 */
	@Override
	public void cacheResult(List<Apply> applies) {
		for (Apply apply : applies) {
			if (EntityCacheUtil.getResult(ApplyModelImpl.ENTITY_CACHE_ENABLED,
						ApplyImpl.class, apply.getPrimaryKey()) == null) {
				cacheResult(apply);
			}
			else {
				apply.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all applies.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(ApplyImpl.class.getName());
		}

		EntityCacheUtil.clearCache(ApplyImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the apply.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Apply apply) {
		EntityCacheUtil.removeResult(ApplyModelImpl.ENTITY_CACHE_ENABLED,
			ApplyImpl.class, apply.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(apply);
	}

	@Override
	public void clearCache(List<Apply> applies) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Apply apply : applies) {
			EntityCacheUtil.removeResult(ApplyModelImpl.ENTITY_CACHE_ENABLED,
				ApplyImpl.class, apply.getPrimaryKey());

			clearUniqueFindersCache(apply);
		}
	}

	protected void cacheUniqueFindersCache(Apply apply) {
		if (apply.isNew()) {
			Object[] args = new Object[] { apply.getUuid(), apply.getGroupId() };

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_UUID_G, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G, args, apply);
		}
		else {
			ApplyModelImpl applyModelImpl = (ApplyModelImpl)apply;

			if ((applyModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_UUID_G.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { apply.getUuid(), apply.getGroupId() };

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_UUID_G, args,
					Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G, args,
					apply);
			}
		}
	}

	protected void clearUniqueFindersCache(Apply apply) {
		ApplyModelImpl applyModelImpl = (ApplyModelImpl)apply;

		Object[] args = new Object[] { apply.getUuid(), apply.getGroupId() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);

		if ((applyModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_UUID_G.getColumnBitmask()) != 0) {
			args = new Object[] {
					applyModelImpl.getOriginalUuid(),
					applyModelImpl.getOriginalGroupId()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);
		}
	}

	/**
	 * Creates a new apply with the primary key. Does not add the apply to the database.
	 *
	 * @param applyId the primary key for the new apply
	 * @return the new apply
	 */
	@Override
	public Apply create(long applyId) {
		Apply apply = new ApplyImpl();

		apply.setNew(true);
		apply.setPrimaryKey(applyId);

		String uuid = PortalUUIDUtil.generate();

		apply.setUuid(uuid);

		return apply;
	}

	/**
	 * Removes the apply with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param applyId the primary key of the apply
	 * @return the apply that was removed
	 * @throws com.liferay.product.store.NoSuchApplyException if a apply with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Apply remove(long applyId)
		throws NoSuchApplyException, SystemException {
		return remove((Serializable)applyId);
	}

	/**
	 * Removes the apply with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the apply
	 * @return the apply that was removed
	 * @throws com.liferay.product.store.NoSuchApplyException if a apply with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Apply remove(Serializable primaryKey)
		throws NoSuchApplyException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Apply apply = (Apply)session.get(ApplyImpl.class, primaryKey);

			if (apply == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchApplyException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(apply);
		}
		catch (NoSuchApplyException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected Apply removeImpl(Apply apply) throws SystemException {
		apply = toUnwrappedModel(apply);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(apply)) {
				apply = (Apply)session.get(ApplyImpl.class,
						apply.getPrimaryKeyObj());
			}

			if (apply != null) {
				session.delete(apply);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (apply != null) {
			clearCache(apply);
		}

		return apply;
	}

	@Override
	public Apply updateImpl(com.liferay.product.store.model.Apply apply)
		throws SystemException {
		apply = toUnwrappedModel(apply);

		boolean isNew = apply.isNew();

		ApplyModelImpl applyModelImpl = (ApplyModelImpl)apply;

		if (Validator.isNull(apply.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			apply.setUuid(uuid);
		}

		Session session = null;

		try {
			session = openSession();

			if (apply.isNew()) {
				session.save(apply);

				apply.setNew(false);
			}
			else {
				session.merge(apply);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !ApplyModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((applyModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { applyModelImpl.getOriginalUuid() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);

				args = new Object[] { applyModelImpl.getUuid() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);
			}

			if ((applyModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						applyModelImpl.getOriginalUuid(),
						applyModelImpl.getOriginalCompanyId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
					args);

				args = new Object[] {
						applyModelImpl.getUuid(), applyModelImpl.getCompanyId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
					args);
			}

			if ((applyModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_APPLYID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { applyModelImpl.getOriginalApplyId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_APPLYID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_APPLYID,
					args);

				args = new Object[] { applyModelImpl.getApplyId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_APPLYID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_APPLYID,
					args);
			}
		}

		EntityCacheUtil.putResult(ApplyModelImpl.ENTITY_CACHE_ENABLED,
			ApplyImpl.class, apply.getPrimaryKey(), apply);

		clearUniqueFindersCache(apply);
		cacheUniqueFindersCache(apply);

		return apply;
	}

	protected Apply toUnwrappedModel(Apply apply) {
		if (apply instanceof ApplyImpl) {
			return apply;
		}

		ApplyImpl applyImpl = new ApplyImpl();

		applyImpl.setNew(apply.isNew());
		applyImpl.setPrimaryKey(apply.getPrimaryKey());

		applyImpl.setUuid(apply.getUuid());
		applyImpl.setApplyId(apply.getApplyId());
		applyImpl.setGroupId(apply.getGroupId());
		applyImpl.setCompanyId(apply.getCompanyId());
		applyImpl.setUserId(apply.getUserId());
		applyImpl.setUserName(apply.getUserName());
		applyImpl.setProjectName(apply.getProjectName());
		applyImpl.setIntegrationObject(apply.getIntegrationObject());
		applyImpl.setUseType(apply.getUseType());
		applyImpl.setApproveFlag(apply.getApproveFlag());
		applyImpl.setApproveDate(apply.getApproveDate());
		applyImpl.setCreationDate(apply.getCreationDate());
		applyImpl.setCreatedBy(apply.getCreatedBy());
		applyImpl.setUpdateDate(apply.getUpdateDate());
		applyImpl.setUpdatedBy(apply.getUpdatedBy());
		applyImpl.setProductId(apply.getProductId());
		applyImpl.setUseDate(apply.getUseDate());

		return applyImpl;
	}

	/**
	 * Returns the apply with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the apply
	 * @return the apply
	 * @throws com.liferay.product.store.NoSuchApplyException if a apply with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Apply findByPrimaryKey(Serializable primaryKey)
		throws NoSuchApplyException, SystemException {
		Apply apply = fetchByPrimaryKey(primaryKey);

		if (apply == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchApplyException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return apply;
	}

	/**
	 * Returns the apply with the primary key or throws a {@link com.liferay.product.store.NoSuchApplyException} if it could not be found.
	 *
	 * @param applyId the primary key of the apply
	 * @return the apply
	 * @throws com.liferay.product.store.NoSuchApplyException if a apply with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Apply findByPrimaryKey(long applyId)
		throws NoSuchApplyException, SystemException {
		return findByPrimaryKey((Serializable)applyId);
	}

	/**
	 * Returns the apply with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the apply
	 * @return the apply, or <code>null</code> if a apply with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Apply fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		Apply apply = (Apply)EntityCacheUtil.getResult(ApplyModelImpl.ENTITY_CACHE_ENABLED,
				ApplyImpl.class, primaryKey);

		if (apply == _nullApply) {
			return null;
		}

		if (apply == null) {
			Session session = null;

			try {
				session = openSession();

				apply = (Apply)session.get(ApplyImpl.class, primaryKey);

				if (apply != null) {
					cacheResult(apply);
				}
				else {
					EntityCacheUtil.putResult(ApplyModelImpl.ENTITY_CACHE_ENABLED,
						ApplyImpl.class, primaryKey, _nullApply);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(ApplyModelImpl.ENTITY_CACHE_ENABLED,
					ApplyImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return apply;
	}

	/**
	 * Returns the apply with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param applyId the primary key of the apply
	 * @return the apply, or <code>null</code> if a apply with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Apply fetchByPrimaryKey(long applyId) throws SystemException {
		return fetchByPrimaryKey((Serializable)applyId);
	}

	/**
	 * Returns all the applies.
	 *
	 * @return the applies
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Apply> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	public List<Apply> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
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
	@Override
	public List<Apply> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<Apply> list = (List<Apply>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_APPLY);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_APPLY;

				if (pagination) {
					sql = sql.concat(ApplyModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Apply>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Apply>(list);
				}
				else {
					list = (List<Apply>)QueryUtil.list(q, getDialect(), start,
							end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the applies from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (Apply apply : findAll()) {
			remove(apply);
		}
	}

	/**
	 * Returns the number of applies.
	 *
	 * @return the number of applies
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_APPLY);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	protected Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	/**
	 * Initializes the apply persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.liferay.product.store.model.Apply")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Apply>> listenersList = new ArrayList<ModelListener<Apply>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Apply>)InstanceFactory.newInstance(
							getClassLoader(), listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	public void destroy() {
		EntityCacheUtil.removeCache(ApplyImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_APPLY = "SELECT apply FROM Apply apply";
	private static final String _SQL_SELECT_APPLY_WHERE = "SELECT apply FROM Apply apply WHERE ";
	private static final String _SQL_COUNT_APPLY = "SELECT COUNT(apply) FROM Apply apply";
	private static final String _SQL_COUNT_APPLY_WHERE = "SELECT COUNT(apply) FROM Apply apply WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "apply.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Apply exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Apply exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(ApplyPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"uuid"
			});
	private static Apply _nullApply = new ApplyImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Apply> toCacheModel() {
				return _nullApplyCacheModel;
			}
		};

	private static CacheModel<Apply> _nullApplyCacheModel = new CacheModel<Apply>() {
			@Override
			public Apply toEntityModel() {
				return _nullApply;
			}
		};
}