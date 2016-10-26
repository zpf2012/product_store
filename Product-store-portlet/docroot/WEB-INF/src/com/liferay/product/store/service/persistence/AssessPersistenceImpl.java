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

import com.liferay.product.store.NoSuchAssessException;
import com.liferay.product.store.model.Assess;
import com.liferay.product.store.model.impl.AssessImpl;
import com.liferay.product.store.model.impl.AssessModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the assess service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author zhangpengfei
 * @see AssessPersistence
 * @see AssessUtil
 * @generated
 */
public class AssessPersistenceImpl extends BasePersistenceImpl<Assess>
	implements AssessPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link AssessUtil} to access the assess persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = AssessImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(AssessModelImpl.ENTITY_CACHE_ENABLED,
			AssessModelImpl.FINDER_CACHE_ENABLED, AssessImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(AssessModelImpl.ENTITY_CACHE_ENABLED,
			AssessModelImpl.FINDER_CACHE_ENABLED, AssessImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(AssessModelImpl.ENTITY_CACHE_ENABLED,
			AssessModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID = new FinderPath(AssessModelImpl.ENTITY_CACHE_ENABLED,
			AssessModelImpl.FINDER_CACHE_ENABLED, AssessImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID = new FinderPath(AssessModelImpl.ENTITY_CACHE_ENABLED,
			AssessModelImpl.FINDER_CACHE_ENABLED, AssessImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] { String.class.getName() },
			AssessModelImpl.UUID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID = new FinderPath(AssessModelImpl.ENTITY_CACHE_ENABLED,
			AssessModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] { String.class.getName() });

	/**
	 * Returns all the assesses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching assesses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Assess> findByUuid(String uuid) throws SystemException {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Assess> findByUuid(String uuid, int start, int end)
		throws SystemException {
		return findByUuid(uuid, start, end, null);
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
	@Override
	public List<Assess> findByUuid(String uuid, int start, int end,
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

		List<Assess> list = (List<Assess>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Assess assess : list) {
				if (!Validator.equals(uuid, assess.getUuid())) {
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

			query.append(_SQL_SELECT_ASSESS_WHERE);

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
				query.append(AssessModelImpl.ORDER_BY_JPQL);
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
					list = (List<Assess>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Assess>(list);
				}
				else {
					list = (List<Assess>)QueryUtil.list(q, getDialect(), start,
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
	 * Returns the first assess in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assess
	 * @throws com.liferay.product.store.NoSuchAssessException if a matching assess could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Assess findByUuid_First(String uuid,
		OrderByComparator orderByComparator)
		throws NoSuchAssessException, SystemException {
		Assess assess = fetchByUuid_First(uuid, orderByComparator);

		if (assess != null) {
			return assess;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAssessException(msg.toString());
	}

	/**
	 * Returns the first assess in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assess, or <code>null</code> if a matching assess could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Assess fetchByUuid_First(String uuid,
		OrderByComparator orderByComparator) throws SystemException {
		List<Assess> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Assess findByUuid_Last(String uuid,
		OrderByComparator orderByComparator)
		throws NoSuchAssessException, SystemException {
		Assess assess = fetchByUuid_Last(uuid, orderByComparator);

		if (assess != null) {
			return assess;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAssessException(msg.toString());
	}

	/**
	 * Returns the last assess in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assess, or <code>null</code> if a matching assess could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Assess fetchByUuid_Last(String uuid,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<Assess> list = findByUuid(uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Assess[] findByUuid_PrevAndNext(long assessId, String uuid,
		OrderByComparator orderByComparator)
		throws NoSuchAssessException, SystemException {
		Assess assess = findByPrimaryKey(assessId);

		Session session = null;

		try {
			session = openSession();

			Assess[] array = new AssessImpl[3];

			array[0] = getByUuid_PrevAndNext(session, assess, uuid,
					orderByComparator, true);

			array[1] = assess;

			array[2] = getByUuid_PrevAndNext(session, assess, uuid,
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

	protected Assess getByUuid_PrevAndNext(Session session, Assess assess,
		String uuid, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_ASSESS_WHERE);

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
			query.append(AssessModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(assess);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Assess> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the assesses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByUuid(String uuid) throws SystemException {
		for (Assess assess : findByUuid(uuid, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(assess);
		}
	}

	/**
	 * Returns the number of assesses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching assesses
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

			query.append(_SQL_COUNT_ASSESS_WHERE);

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

	private static final String _FINDER_COLUMN_UUID_UUID_1 = "assess.uuid IS NULL";
	private static final String _FINDER_COLUMN_UUID_UUID_2 = "assess.uuid = ?";
	private static final String _FINDER_COLUMN_UUID_UUID_3 = "(assess.uuid IS NULL OR assess.uuid = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_UUID_G = new FinderPath(AssessModelImpl.ENTITY_CACHE_ENABLED,
			AssessModelImpl.FINDER_CACHE_ENABLED, AssessImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByUUID_G",
			new String[] { String.class.getName(), Long.class.getName() },
			AssessModelImpl.UUID_COLUMN_BITMASK |
			AssessModelImpl.GROUPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID_G = new FinderPath(AssessModelImpl.ENTITY_CACHE_ENABLED,
			AssessModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUUID_G",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns the assess where uuid = &#63; and groupId = &#63; or throws a {@link com.liferay.product.store.NoSuchAssessException} if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching assess
	 * @throws com.liferay.product.store.NoSuchAssessException if a matching assess could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Assess findByUUID_G(String uuid, long groupId)
		throws NoSuchAssessException, SystemException {
		Assess assess = fetchByUUID_G(uuid, groupId);

		if (assess == null) {
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

			throw new NoSuchAssessException(msg.toString());
		}

		return assess;
	}

	/**
	 * Returns the assess where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching assess, or <code>null</code> if a matching assess could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Assess fetchByUUID_G(String uuid, long groupId)
		throws SystemException {
		return fetchByUUID_G(uuid, groupId, true);
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
	@Override
	public Assess fetchByUUID_G(String uuid, long groupId,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { uuid, groupId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_UUID_G,
					finderArgs, this);
		}

		if (result instanceof Assess) {
			Assess assess = (Assess)result;

			if (!Validator.equals(uuid, assess.getUuid()) ||
					(groupId != assess.getGroupId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_ASSESS_WHERE);

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

				List<Assess> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G,
						finderArgs, list);
				}
				else {
					Assess assess = list.get(0);

					result = assess;

					cacheResult(assess);

					if ((assess.getUuid() == null) ||
							!assess.getUuid().equals(uuid) ||
							(assess.getGroupId() != groupId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G,
							finderArgs, assess);
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
			return (Assess)result;
		}
	}

	/**
	 * Removes the assess where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the assess that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Assess removeByUUID_G(String uuid, long groupId)
		throws NoSuchAssessException, SystemException {
		Assess assess = findByUUID_G(uuid, groupId);

		return remove(assess);
	}

	/**
	 * Returns the number of assesses where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching assesses
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

			query.append(_SQL_COUNT_ASSESS_WHERE);

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

	private static final String _FINDER_COLUMN_UUID_G_UUID_1 = "assess.uuid IS NULL AND ";
	private static final String _FINDER_COLUMN_UUID_G_UUID_2 = "assess.uuid = ? AND ";
	private static final String _FINDER_COLUMN_UUID_G_UUID_3 = "(assess.uuid IS NULL OR assess.uuid = '') AND ";
	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 = "assess.groupId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID_C = new FinderPath(AssessModelImpl.ENTITY_CACHE_ENABLED,
			AssessModelImpl.FINDER_CACHE_ENABLED, AssessImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid_C",
			new String[] {
				String.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C =
		new FinderPath(AssessModelImpl.ENTITY_CACHE_ENABLED,
			AssessModelImpl.FINDER_CACHE_ENABLED, AssessImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid_C",
			new String[] { String.class.getName(), Long.class.getName() },
			AssessModelImpl.UUID_COLUMN_BITMASK |
			AssessModelImpl.COMPANYID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID_C = new FinderPath(AssessModelImpl.ENTITY_CACHE_ENABLED,
			AssessModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid_C",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns all the assesses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching assesses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Assess> findByUuid_C(String uuid, long companyId)
		throws SystemException {
		return findByUuid_C(uuid, companyId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
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
	@Override
	public List<Assess> findByUuid_C(String uuid, long companyId, int start,
		int end) throws SystemException {
		return findByUuid_C(uuid, companyId, start, end, null);
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
	@Override
	public List<Assess> findByUuid_C(String uuid, long companyId, int start,
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

		List<Assess> list = (List<Assess>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Assess assess : list) {
				if (!Validator.equals(uuid, assess.getUuid()) ||
						(companyId != assess.getCompanyId())) {
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

			query.append(_SQL_SELECT_ASSESS_WHERE);

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
				query.append(AssessModelImpl.ORDER_BY_JPQL);
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
					list = (List<Assess>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Assess>(list);
				}
				else {
					list = (List<Assess>)QueryUtil.list(q, getDialect(), start,
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
	 * Returns the first assess in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assess
	 * @throws com.liferay.product.store.NoSuchAssessException if a matching assess could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Assess findByUuid_C_First(String uuid, long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchAssessException, SystemException {
		Assess assess = fetchByUuid_C_First(uuid, companyId, orderByComparator);

		if (assess != null) {
			return assess;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAssessException(msg.toString());
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
	@Override
	public Assess fetchByUuid_C_First(String uuid, long companyId,
		OrderByComparator orderByComparator) throws SystemException {
		List<Assess> list = findByUuid_C(uuid, companyId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Assess findByUuid_C_Last(String uuid, long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchAssessException, SystemException {
		Assess assess = fetchByUuid_C_Last(uuid, companyId, orderByComparator);

		if (assess != null) {
			return assess;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAssessException(msg.toString());
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
	@Override
	public Assess fetchByUuid_C_Last(String uuid, long companyId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<Assess> list = findByUuid_C(uuid, companyId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Assess[] findByUuid_C_PrevAndNext(long assessId, String uuid,
		long companyId, OrderByComparator orderByComparator)
		throws NoSuchAssessException, SystemException {
		Assess assess = findByPrimaryKey(assessId);

		Session session = null;

		try {
			session = openSession();

			Assess[] array = new AssessImpl[3];

			array[0] = getByUuid_C_PrevAndNext(session, assess, uuid,
					companyId, orderByComparator, true);

			array[1] = assess;

			array[2] = getByUuid_C_PrevAndNext(session, assess, uuid,
					companyId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Assess getByUuid_C_PrevAndNext(Session session, Assess assess,
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

		query.append(_SQL_SELECT_ASSESS_WHERE);

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
			query.append(AssessModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(assess);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Assess> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the assesses where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId)
		throws SystemException {
		for (Assess assess : findByUuid_C(uuid, companyId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(assess);
		}
	}

	/**
	 * Returns the number of assesses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching assesses
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

			query.append(_SQL_COUNT_ASSESS_WHERE);

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

	private static final String _FINDER_COLUMN_UUID_C_UUID_1 = "assess.uuid IS NULL AND ";
	private static final String _FINDER_COLUMN_UUID_C_UUID_2 = "assess.uuid = ? AND ";
	private static final String _FINDER_COLUMN_UUID_C_UUID_3 = "(assess.uuid IS NULL OR assess.uuid = '') AND ";
	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 = "assess.companyId = ?";
	public static final FinderPath FINDER_PATH_FETCH_BY_ASSESSID = new FinderPath(AssessModelImpl.ENTITY_CACHE_ENABLED,
			AssessModelImpl.FINDER_CACHE_ENABLED, AssessImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByassessId",
			new String[] { Long.class.getName() },
			AssessModelImpl.ASSESSID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ASSESSID = new FinderPath(AssessModelImpl.ENTITY_CACHE_ENABLED,
			AssessModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByassessId",
			new String[] { Long.class.getName() });

	/**
	 * Returns the assess where assessId = &#63; or throws a {@link com.liferay.product.store.NoSuchAssessException} if it could not be found.
	 *
	 * @param assessId the assess ID
	 * @return the matching assess
	 * @throws com.liferay.product.store.NoSuchAssessException if a matching assess could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Assess findByassessId(long assessId)
		throws NoSuchAssessException, SystemException {
		Assess assess = fetchByassessId(assessId);

		if (assess == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("assessId=");
			msg.append(assessId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchAssessException(msg.toString());
		}

		return assess;
	}

	/**
	 * Returns the assess where assessId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param assessId the assess ID
	 * @return the matching assess, or <code>null</code> if a matching assess could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Assess fetchByassessId(long assessId) throws SystemException {
		return fetchByassessId(assessId, true);
	}

	/**
	 * Returns the assess where assessId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param assessId the assess ID
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching assess, or <code>null</code> if a matching assess could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Assess fetchByassessId(long assessId, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { assessId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_ASSESSID,
					finderArgs, this);
		}

		if (result instanceof Assess) {
			Assess assess = (Assess)result;

			if ((assessId != assess.getAssessId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_ASSESS_WHERE);

			query.append(_FINDER_COLUMN_ASSESSID_ASSESSID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(assessId);

				List<Assess> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_ASSESSID,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"AssessPersistenceImpl.fetchByassessId(long, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					Assess assess = list.get(0);

					result = assess;

					cacheResult(assess);

					if ((assess.getAssessId() != assessId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_ASSESSID,
							finderArgs, assess);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_ASSESSID,
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
			return (Assess)result;
		}
	}

	/**
	 * Removes the assess where assessId = &#63; from the database.
	 *
	 * @param assessId the assess ID
	 * @return the assess that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Assess removeByassessId(long assessId)
		throws NoSuchAssessException, SystemException {
		Assess assess = findByassessId(assessId);

		return remove(assess);
	}

	/**
	 * Returns the number of assesses where assessId = &#63;.
	 *
	 * @param assessId the assess ID
	 * @return the number of matching assesses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByassessId(long assessId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_ASSESSID;

		Object[] finderArgs = new Object[] { assessId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_ASSESS_WHERE);

			query.append(_FINDER_COLUMN_ASSESSID_ASSESSID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(assessId);

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

	private static final String _FINDER_COLUMN_ASSESSID_ASSESSID_2 = "assess.assessId = ?";
	public static final FinderPath FINDER_PATH_FETCH_BY_APPLYID = new FinderPath(AssessModelImpl.ENTITY_CACHE_ENABLED,
			AssessModelImpl.FINDER_CACHE_ENABLED, AssessImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByapplyId",
			new String[] { Long.class.getName() },
			AssessModelImpl.APPLYID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_APPLYID = new FinderPath(AssessModelImpl.ENTITY_CACHE_ENABLED,
			AssessModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByapplyId",
			new String[] { Long.class.getName() });

	/**
	 * Returns the assess where applyId = &#63; or throws a {@link com.liferay.product.store.NoSuchAssessException} if it could not be found.
	 *
	 * @param applyId the apply ID
	 * @return the matching assess
	 * @throws com.liferay.product.store.NoSuchAssessException if a matching assess could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Assess findByapplyId(long applyId)
		throws NoSuchAssessException, SystemException {
		Assess assess = fetchByapplyId(applyId);

		if (assess == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("applyId=");
			msg.append(applyId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchAssessException(msg.toString());
		}

		return assess;
	}

	/**
	 * Returns the assess where applyId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param applyId the apply ID
	 * @return the matching assess, or <code>null</code> if a matching assess could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Assess fetchByapplyId(long applyId) throws SystemException {
		return fetchByapplyId(applyId, true);
	}

	/**
	 * Returns the assess where applyId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param applyId the apply ID
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching assess, or <code>null</code> if a matching assess could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Assess fetchByapplyId(long applyId, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { applyId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_APPLYID,
					finderArgs, this);
		}

		if (result instanceof Assess) {
			Assess assess = (Assess)result;

			if ((applyId != assess.getApplyId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_ASSESS_WHERE);

			query.append(_FINDER_COLUMN_APPLYID_APPLYID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(applyId);

				List<Assess> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_APPLYID,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"AssessPersistenceImpl.fetchByapplyId(long, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					Assess assess = list.get(0);

					result = assess;

					cacheResult(assess);

					if ((assess.getApplyId() != applyId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_APPLYID,
							finderArgs, assess);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_APPLYID,
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
			return (Assess)result;
		}
	}

	/**
	 * Removes the assess where applyId = &#63; from the database.
	 *
	 * @param applyId the apply ID
	 * @return the assess that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Assess removeByapplyId(long applyId)
		throws NoSuchAssessException, SystemException {
		Assess assess = findByapplyId(applyId);

		return remove(assess);
	}

	/**
	 * Returns the number of assesses where applyId = &#63;.
	 *
	 * @param applyId the apply ID
	 * @return the number of matching assesses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByapplyId(long applyId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_APPLYID;

		Object[] finderArgs = new Object[] { applyId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_ASSESS_WHERE);

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

	private static final String _FINDER_COLUMN_APPLYID_APPLYID_2 = "assess.applyId = ?";

	public AssessPersistenceImpl() {
		setModelClass(Assess.class);
	}

	/**
	 * Caches the assess in the entity cache if it is enabled.
	 *
	 * @param assess the assess
	 */
	@Override
	public void cacheResult(Assess assess) {
		EntityCacheUtil.putResult(AssessModelImpl.ENTITY_CACHE_ENABLED,
			AssessImpl.class, assess.getPrimaryKey(), assess);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G,
			new Object[] { assess.getUuid(), assess.getGroupId() }, assess);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_ASSESSID,
			new Object[] { assess.getAssessId() }, assess);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_APPLYID,
			new Object[] { assess.getApplyId() }, assess);

		assess.resetOriginalValues();
	}

	/**
	 * Caches the assesses in the entity cache if it is enabled.
	 *
	 * @param assesses the assesses
	 */
	@Override
	public void cacheResult(List<Assess> assesses) {
		for (Assess assess : assesses) {
			if (EntityCacheUtil.getResult(
						AssessModelImpl.ENTITY_CACHE_ENABLED, AssessImpl.class,
						assess.getPrimaryKey()) == null) {
				cacheResult(assess);
			}
			else {
				assess.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all assesses.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(AssessImpl.class.getName());
		}

		EntityCacheUtil.clearCache(AssessImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the assess.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Assess assess) {
		EntityCacheUtil.removeResult(AssessModelImpl.ENTITY_CACHE_ENABLED,
			AssessImpl.class, assess.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(assess);
	}

	@Override
	public void clearCache(List<Assess> assesses) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Assess assess : assesses) {
			EntityCacheUtil.removeResult(AssessModelImpl.ENTITY_CACHE_ENABLED,
				AssessImpl.class, assess.getPrimaryKey());

			clearUniqueFindersCache(assess);
		}
	}

	protected void cacheUniqueFindersCache(Assess assess) {
		if (assess.isNew()) {
			Object[] args = new Object[] { assess.getUuid(), assess.getGroupId() };

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_UUID_G, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G, args, assess);

			args = new Object[] { assess.getAssessId() };

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_ASSESSID, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_ASSESSID, args,
				assess);

			args = new Object[] { assess.getApplyId() };

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_APPLYID, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_APPLYID, args, assess);
		}
		else {
			AssessModelImpl assessModelImpl = (AssessModelImpl)assess;

			if ((assessModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_UUID_G.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						assess.getUuid(), assess.getGroupId()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_UUID_G, args,
					Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G, args,
					assess);
			}

			if ((assessModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_ASSESSID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { assess.getAssessId() };

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_ASSESSID, args,
					Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_ASSESSID, args,
					assess);
			}

			if ((assessModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_APPLYID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { assess.getApplyId() };

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_APPLYID, args,
					Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_APPLYID, args,
					assess);
			}
		}
	}

	protected void clearUniqueFindersCache(Assess assess) {
		AssessModelImpl assessModelImpl = (AssessModelImpl)assess;

		Object[] args = new Object[] { assess.getUuid(), assess.getGroupId() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);

		if ((assessModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_UUID_G.getColumnBitmask()) != 0) {
			args = new Object[] {
					assessModelImpl.getOriginalUuid(),
					assessModelImpl.getOriginalGroupId()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);
		}

		args = new Object[] { assess.getAssessId() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ASSESSID, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_ASSESSID, args);

		if ((assessModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_ASSESSID.getColumnBitmask()) != 0) {
			args = new Object[] { assessModelImpl.getOriginalAssessId() };

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ASSESSID, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_ASSESSID, args);
		}

		args = new Object[] { assess.getApplyId() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_APPLYID, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_APPLYID, args);

		if ((assessModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_APPLYID.getColumnBitmask()) != 0) {
			args = new Object[] { assessModelImpl.getOriginalApplyId() };

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_APPLYID, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_APPLYID, args);
		}
	}

	/**
	 * Creates a new assess with the primary key. Does not add the assess to the database.
	 *
	 * @param assessId the primary key for the new assess
	 * @return the new assess
	 */
	@Override
	public Assess create(long assessId) {
		Assess assess = new AssessImpl();

		assess.setNew(true);
		assess.setPrimaryKey(assessId);

		String uuid = PortalUUIDUtil.generate();

		assess.setUuid(uuid);

		return assess;
	}

	/**
	 * Removes the assess with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param assessId the primary key of the assess
	 * @return the assess that was removed
	 * @throws com.liferay.product.store.NoSuchAssessException if a assess with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Assess remove(long assessId)
		throws NoSuchAssessException, SystemException {
		return remove((Serializable)assessId);
	}

	/**
	 * Removes the assess with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the assess
	 * @return the assess that was removed
	 * @throws com.liferay.product.store.NoSuchAssessException if a assess with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Assess remove(Serializable primaryKey)
		throws NoSuchAssessException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Assess assess = (Assess)session.get(AssessImpl.class, primaryKey);

			if (assess == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAssessException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(assess);
		}
		catch (NoSuchAssessException nsee) {
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
	protected Assess removeImpl(Assess assess) throws SystemException {
		assess = toUnwrappedModel(assess);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(assess)) {
				assess = (Assess)session.get(AssessImpl.class,
						assess.getPrimaryKeyObj());
			}

			if (assess != null) {
				session.delete(assess);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (assess != null) {
			clearCache(assess);
		}

		return assess;
	}

	@Override
	public Assess updateImpl(com.liferay.product.store.model.Assess assess)
		throws SystemException {
		assess = toUnwrappedModel(assess);

		boolean isNew = assess.isNew();

		AssessModelImpl assessModelImpl = (AssessModelImpl)assess;

		if (Validator.isNull(assess.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			assess.setUuid(uuid);
		}

		Session session = null;

		try {
			session = openSession();

			if (assess.isNew()) {
				session.save(assess);

				assess.setNew(false);
			}
			else {
				session.merge(assess);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !AssessModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((assessModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { assessModelImpl.getOriginalUuid() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);

				args = new Object[] { assessModelImpl.getUuid() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);
			}

			if ((assessModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						assessModelImpl.getOriginalUuid(),
						assessModelImpl.getOriginalCompanyId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
					args);

				args = new Object[] {
						assessModelImpl.getUuid(),
						assessModelImpl.getCompanyId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
					args);
			}
		}

		EntityCacheUtil.putResult(AssessModelImpl.ENTITY_CACHE_ENABLED,
			AssessImpl.class, assess.getPrimaryKey(), assess);

		clearUniqueFindersCache(assess);
		cacheUniqueFindersCache(assess);

		return assess;
	}

	protected Assess toUnwrappedModel(Assess assess) {
		if (assess instanceof AssessImpl) {
			return assess;
		}

		AssessImpl assessImpl = new AssessImpl();

		assessImpl.setNew(assess.isNew());
		assessImpl.setPrimaryKey(assess.getPrimaryKey());

		assessImpl.setUuid(assess.getUuid());
		assessImpl.setAssessId(assess.getAssessId());
		assessImpl.setGroupId(assess.getGroupId());
		assessImpl.setCompanyId(assess.getCompanyId());
		assessImpl.setUserId(assess.getUserId());
		assessImpl.setUserName(assess.getUserName());
		assessImpl.setProjectName(assess.getProjectName());
		assessImpl.setCreateDate(assess.getCreateDate());
		assessImpl.setMultipleAssess(assess.getMultipleAssess());
		assessImpl.setMultiPercent(assess.getMultiPercent());
		assessImpl.setConfigurable(assess.getConfigurable());
		assessImpl.setStability(assess.getStability());
		assessImpl.setIntegrationGrade(assess.getIntegrationGrade());
		assessImpl.setApplyId(assess.getApplyId());
		assessImpl.setProductId(assess.getProductId());

		return assessImpl;
	}

	/**
	 * Returns the assess with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the assess
	 * @return the assess
	 * @throws com.liferay.product.store.NoSuchAssessException if a assess with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Assess findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAssessException, SystemException {
		Assess assess = fetchByPrimaryKey(primaryKey);

		if (assess == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAssessException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return assess;
	}

	/**
	 * Returns the assess with the primary key or throws a {@link com.liferay.product.store.NoSuchAssessException} if it could not be found.
	 *
	 * @param assessId the primary key of the assess
	 * @return the assess
	 * @throws com.liferay.product.store.NoSuchAssessException if a assess with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Assess findByPrimaryKey(long assessId)
		throws NoSuchAssessException, SystemException {
		return findByPrimaryKey((Serializable)assessId);
	}

	/**
	 * Returns the assess with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the assess
	 * @return the assess, or <code>null</code> if a assess with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Assess fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		Assess assess = (Assess)EntityCacheUtil.getResult(AssessModelImpl.ENTITY_CACHE_ENABLED,
				AssessImpl.class, primaryKey);

		if (assess == _nullAssess) {
			return null;
		}

		if (assess == null) {
			Session session = null;

			try {
				session = openSession();

				assess = (Assess)session.get(AssessImpl.class, primaryKey);

				if (assess != null) {
					cacheResult(assess);
				}
				else {
					EntityCacheUtil.putResult(AssessModelImpl.ENTITY_CACHE_ENABLED,
						AssessImpl.class, primaryKey, _nullAssess);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(AssessModelImpl.ENTITY_CACHE_ENABLED,
					AssessImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return assess;
	}

	/**
	 * Returns the assess with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param assessId the primary key of the assess
	 * @return the assess, or <code>null</code> if a assess with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Assess fetchByPrimaryKey(long assessId) throws SystemException {
		return fetchByPrimaryKey((Serializable)assessId);
	}

	/**
	 * Returns all the assesses.
	 *
	 * @return the assesses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Assess> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	public List<Assess> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
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
	@Override
	public List<Assess> findAll(int start, int end,
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

		List<Assess> list = (List<Assess>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_ASSESS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_ASSESS;

				if (pagination) {
					sql = sql.concat(AssessModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Assess>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Assess>(list);
				}
				else {
					list = (List<Assess>)QueryUtil.list(q, getDialect(), start,
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
	 * Removes all the assesses from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (Assess assess : findAll()) {
			remove(assess);
		}
	}

	/**
	 * Returns the number of assesses.
	 *
	 * @return the number of assesses
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

				Query q = session.createQuery(_SQL_COUNT_ASSESS);

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
	 * Initializes the assess persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.liferay.product.store.model.Assess")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Assess>> listenersList = new ArrayList<ModelListener<Assess>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Assess>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(AssessImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_ASSESS = "SELECT assess FROM Assess assess";
	private static final String _SQL_SELECT_ASSESS_WHERE = "SELECT assess FROM Assess assess WHERE ";
	private static final String _SQL_COUNT_ASSESS = "SELECT COUNT(assess) FROM Assess assess";
	private static final String _SQL_COUNT_ASSESS_WHERE = "SELECT COUNT(assess) FROM Assess assess WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "assess.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Assess exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Assess exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(AssessPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"uuid"
			});
	private static Assess _nullAssess = new AssessImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Assess> toCacheModel() {
				return _nullAssessCacheModel;
			}
		};

	private static CacheModel<Assess> _nullAssessCacheModel = new CacheModel<Assess>() {
			@Override
			public Assess toEntityModel() {
				return _nullAssess;
			}
		};
}