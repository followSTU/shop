package com.xyn.shop.service.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.xyn.shop.dao.ShopCategoryDao;
import com.xyn.shop.dto.ShopCategoryExecution;
import com.xyn.shop.entity.ShopCategory;
import com.xyn.shop.enums.ShopCategoryStateEnum;
import com.xyn.shop.service.ShopCategoryService;
import com.xyn.shop.until.FileUtil;
import com.xyn.shop.until.ImageUtil;

@Service
public class ShopCategoryServiceImpl implements ShopCategoryService {
	
	@Autowired
	private ShopCategoryDao shopCategoryDao;

	@Override
	public List<ShopCategory> getFirstLevelShopCategoryList() throws IOException {
		return null;
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<ShopCategory> getShopCategoryList(Long parentId) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ShopCategory> getAllSecondLevelShopCategory() throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ShopCategory getShopCategoryById(Long shopCategoryId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ShopCategoryExecution addShopCategory(ShopCategory shopCategory, CommonsMultipartFile thumbnail) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ShopCategoryExecution modifyShopCategory(ShopCategory shopCategory, CommonsMultipartFile thumbnail,
			boolean thumbnailChange) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ShopCategoryExecution removeShopCategory(long shopCategoryId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ShopCategoryExecution removeShopCategoryList(List<Long> shopCategoryIdList) {
		// TODO Auto-generated method stub
		return null;
	}



	
};
