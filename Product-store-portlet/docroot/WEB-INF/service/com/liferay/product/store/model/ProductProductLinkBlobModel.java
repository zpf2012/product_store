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

package com.liferay.product.store.model;

import java.sql.Blob;

/**
 * The Blob model class for lazy loading the productLink column in Product.
 *
 * @author zhangpengfei
 * @see Product
 * @generated
 */
public class ProductProductLinkBlobModel {
	public ProductProductLinkBlobModel() {
	}

	public ProductProductLinkBlobModel(long productId) {
		_productId = productId;
	}

	public ProductProductLinkBlobModel(long productId, Blob productLinkBlob) {
		_productId = productId;
		_productLinkBlob = productLinkBlob;
	}

	public long getProductId() {
		return _productId;
	}

	public void setProductId(long productId) {
		_productId = productId;
	}

	public Blob getProductLinkBlob() {
		return _productLinkBlob;
	}

	public void setProductLinkBlob(Blob productLinkBlob) {
		_productLinkBlob = productLinkBlob;
	}

	private long _productId;
	private Blob _productLinkBlob;
}