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

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.liferay.portal.NoSuchUserException;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.User;
import com.liferay.portal.service.ServiceContext;
import com.liferay.product.store.NoSuchAssessException;
import com.liferay.product.store.ProductNameException;
import com.liferay.product.store.model.Assess;
import com.liferay.product.store.model.Product;
import com.liferay.product.store.service.base.AssessLocalServiceBaseImpl;

/**
 * The implementation of the assess local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link com.liferay.product.store.service.AssessLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author zhangpengfei
 * @see com.liferay.product.store.service.base.AssessLocalServiceBaseImpl
 * @see com.liferay.product.store.service.AssessLocalServiceUtil
 */
public class AssessLocalServiceImpl extends AssessLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 * 
	 * Never reference this interface directly. Always use {@link
	 * com.liferay.product.store.service.AssessLocalServiceUtil} to access the
	 * assess local service.
	 */

	@Override
	public List<Assess> getAssesses(long groupId, long applyId)
			throws SystemException {
		return null;
	}

	@Override
	public List<Assess> getAssesses(long groupId, long applyId, int start,
			int end) throws SystemException {
		return null;
	}
	
	public Assess getAssess(long applyId) throws SystemException, NoSuchAssessException{
		return assessPersistence.findByapplyId(applyId);
	}
	
	public List<Assess> getAssesses(long productId) throws SystemException{
		List<Assess> allAssesses =  assessPersistence.findAll();
		List<Assess> assesses = new ArrayList<>();
		for(Assess assess: allAssesses){
			if(assess.getProductId() == productId){
				assesses.add(assess);
			}
		}
		return assesses;
	}
	
	protected void validate(double multiPercent) throws PortalException {
		if (multiPercent> 100 && multiPercent < 0) {
			throw new ProductNameException();
		}
	}
	
	public Assess addAssess(long userId, long applyId, String projectName, long productId, double multipleAssess, double multiPercent, int configurable, int stability, int integrationGrade, ServiceContext serviceContext) throws SystemException, NoSuchUserException {
		long assessId = counterLocalService.increment();
		Assess assess = assessPersistence.create(assessId);
		long groupId = serviceContext.getScopeGroupId();
		User user = userPersistence.findByPrimaryKey(userId);
		assess.setUserId(userId);
		assess.setGroupId(groupId);
		assess.setCompanyId(user.getCompanyId());
		assess.setUserName(user.getFullName());
		assess.setCreateDate(new Date());
		assess.setMultipleAssess(multipleAssess);
		assess.setMultiPercent(multiPercent);
		assess.setConfigurable(configurable);
		assess.setStability(stability);
		assess.setProjectName(projectName);
		assess.setIntegrationGrade(integrationGrade);
		assess.setApplyId(applyId);
		assess.setProductId(productId);

		assessPersistence.update(assess);
		return assess;
	}

}