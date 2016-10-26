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
 * Provides a wrapper for {@link AssessService}.
 *
 * @author zhangpengfei
 * @see AssessService
 * @generated
 */
public class AssessServiceWrapper implements AssessService,
	ServiceWrapper<AssessService> {
	public AssessServiceWrapper(AssessService assessService) {
		_assessService = assessService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _assessService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_assessService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _assessService.invokeMethod(name, parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public AssessService getWrappedAssessService() {
		return _assessService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedAssessService(AssessService assessService) {
		_assessService = assessService;
	}

	@Override
	public AssessService getWrappedService() {
		return _assessService;
	}

	@Override
	public void setWrappedService(AssessService assessService) {
		_assessService = assessService;
	}

	private AssessService _assessService;
}