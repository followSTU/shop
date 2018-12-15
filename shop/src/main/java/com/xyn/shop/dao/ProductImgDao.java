package com.xyn.shop.dao;

import java.util.List;

import com.xyn.shop.entity.*;

public interface ProductImgDao {

	List<ProductImg> queryProductImgList(long productId);

	int batchInsertProductImg(List<ProductImg> productImgList);

	int deleteProductImgByProductId(long productId);
}
