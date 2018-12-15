package com.xyn.shop.test.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.xyn.shop.dao.AreaDao;
import com.xyn.shop.entity.Area;
import com.xyn.shop.test.BaseTest;


public class TestAreaDao extends BaseTest{
	@Autowired
	private AreaDao areaDao;
	@Test
	public void testQuery(){
		System.out.println(areaDao.queryArea());
	}
	@Test
	public void testInsert(){
		Area area=new Area();
		area.setAreaName("tes444");
		area.setAreaDesc("test44");
		area.setPriority(7);
		area.setCreateTime(new Date());
		area.setLastEditTime(new Date());
		areaDao.insertArea(area);
	}
	@Test
	public void testDelete(){
		List<Long> listid=new ArrayList<>();
		listid.add(11L);
		listid.add(13L);
		areaDao.batchDeleteArea(listid);
	}
}
