package com.xyn.shop.dao;

import java.util.List;

import com.xyn.shop.entity.Area;


public interface AreaDao {
	/**
	 * �г������б�
	 * 
	 * @param areaCondition
	 * @return
	 */
	List<Area> queryArea();

	/**
	 * 
	 * @param area
	 * @return
	 */
	int insertArea(Area area);

	/**
	 * 
	 * @param area
	 * @return
	 */
	int updateArea(Area area);

	/**
	 * 
	 * @param areaId
	 * @return
	 */
	int deleteArea(long areaId);

	/**
	 * 
	 * @param areaIdList
	 * @return
	 */
	int batchDeleteArea(List<Long> areaIdList);
}
