package com.ssafy.board.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.ssafy.board.model.dao.LocationDao;
import com.ssafy.board.model.dto.Location;

public class LocationServiceImpl implements LocationService {

	@Autowired
	private LocationDao locationDao;

	@Override
	@Transactional
	public List<Location> sellectAllLocation() {
		List<Location> locationList = locationDao.sellectAllLocation();
		return locationList;
	}
}
