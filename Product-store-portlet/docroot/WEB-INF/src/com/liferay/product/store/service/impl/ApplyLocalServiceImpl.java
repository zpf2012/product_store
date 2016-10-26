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

package com.liferay.product.store.service.impl;

import java.util.Date;
import java.util.List;

import com.liferay.portal.NoSuchUserException;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.User;
import com.liferay.portal.service.ServiceContext;
import com.liferay.product.store.ProductNameException;
import com.liferay.product.store.ProjectNameException;
import com.liferay.product.store.model.Apply;
import com.liferay.product.store.service.ApplyLocalServiceUtil;
import com.liferay.product.store.service.base.ApplyLocalServiceBaseImpl;

/**
 * The implementation of the apply local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.liferay.product.store.service.ApplyLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author zhangpengfei
 * @see com.liferay.product.store.service.base.ApplyLocalServiceBaseImpl
 * @see com.liferay.product.store.service.ApplyLocalServiceUtil
 */
public class ApplyLocalServiceImpl extends ApplyLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.liferay.product.store.service.ApplyLocalServiceUtil} to access the apply local service.
	 */
	protected void validate(String projectName) throws PortalException {
		if (Validator.isNull(projectName)) {
			throw new ProjectNameException();
		}
	}
	
	public Apply addApply(long userId, String projectName, String integrationObject, String useType, long productId, Date useDate,ServiceContext serviceContext) throws SystemException, PortalException{
		long applyId = counterLocalService.increment();
		Apply apply = applyPersistence.create(applyId);
		User user = userPersistence.findByPrimaryKey(userId);
		Date now = new Date();
		long groupId = serviceContext.getScopeGroupId();
		
		apply.setUuid(serviceContext.getUuid());
		apply.setUserId(userId);
		apply.setGroupId(groupId);
		apply.setCompanyId(user.getCompanyId());
		apply.setUserName(user.getFullName());
		validate(projectName);
		apply.setProjectName(projectName);
		apply.setCreatedBy(userId);
		apply.setCreationDate(now);
		apply.setUpdatedBy(userId);
		apply.setUpdateDate(now);
		apply.setCreationDate(now);
		apply.setApproveFlag("待审核");
		apply.setIntegrationObject(integrationObject);
		apply.setUseType(useType);
		apply.setProductId(productId);
		apply.setUseDate(useDate);
		
		applyPersistence.update(apply);
		return apply;
	}
	
	public List<Apply> getApplies() throws SystemException{
	
		return applyPersistence.findAll();
	}
	
	public Apply updateApply(long userId, long applyId, ServiceContext serviceContext, String approveFlag) throws SystemException, PortalException{
		Apply apply = ApplyLocalServiceUtil.getApply(applyId);
		
		if(approveFlag.equals("approve")){
			apply.setApproveFlag("通过");
		}else if(approveFlag.equals("refuse")){
			apply.setApproveFlag("拒绝");
		}else{
			apply.setApproveFlag("已评价");
		}
		apply.setApproveDate(new Date());
		applyPersistence.update(apply);
		return apply;
	}
	
	@Override
	public List<Apply> getApplies(long groupId, long productId)
			throws SystemException {
		return null;
	}
	
	public List<Apply> getApplies(long productId) throws SystemException{
		List<Apply> all = applyPersistence.findAll();
		List<Apply> applies = null;
		for(Apply apply: applies){
			if(apply.getProductId() == productId){
				applies.add(apply);
			}
		}
		return applies;
	}

	@Override
	public List<Apply> getApplies(long groupId, long productId, int start,
			int end) throws SystemException {
		return null;
	}
}