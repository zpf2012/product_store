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
 * The Blob model class for lazy loading the videoLink column in Product.
 *
 * @author zhangpengfei
 * @see Product
 * @generated
 */
public class ProductVideoLinkBlobModel {
	public ProductVideoLinkBlobModel() {
	}

	public ProductVideoLinkBlobModel(long productId) {
		_productId = productId;
	}

	public ProductVideoLinkBlobModel(long productId, Blob videoLinkBlob) {
		_productId = productId;
		_videoLinkBlob = videoLinkBlob;
	}

	public long getProductId() {
		return _productId;
	}

	public void setProductId(long productId) {
		_productId = productId;
	}

	public Blob getVideoLinkBlob() {
		return _videoLinkBlob;
	}

	public void setVideoLinkBlob(Blob videoLinkBlob) {
		_videoLinkBlob = videoLinkBlob;
	}

	private long _productId;
	private Blob _videoLinkBlob;
}