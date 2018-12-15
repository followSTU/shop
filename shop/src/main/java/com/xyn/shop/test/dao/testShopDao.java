package com.xyn.shop.test.dao;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.xyn.shop.dao.ShopDao;
import com.xyn.shop.entity.Area;
import com.xyn.shop.test.BaseTest;

public class testShopDao extends BaseTest{
	@Autowired
	private ShopDao shopDao;
	@Test
	public void testQuery(){
		Area area=shopDao.queryByShopId(23).getArea();
		System.out.println(area.getAreaId());
	}
}
