package com.xyn.shop.service.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.xyn.shop.dao.AreaDao;
import com.xyn.shop.dto.AreaExecution;
import com.xyn.shop.entity.Area;
import com.xyn.shop.enums.AreaStateEnum;
import com.xyn.shop.service.AreaService;


@Service
public class AreaServiceImpl implements AreaService {
	@Autowired
	private AreaDao areaDao;

	@Override
	public List<Area> getAreaList() {
		// TODO Auto-generated method stub
		return areaDao.queryArea();
	}

	@Override
	public AreaExecution addArea(Area area) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AreaExecution modifyArea(Area area) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AreaExecution removeArea(long areaId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AreaExecution removeAreaList(List<Long> areaIdList) {
		// TODO Auto-generated method stub
		return null;
	}

}
