package com.ssafy.board.model.dao;

import java.util.List;

import com.ssafy.board.model.dto.Location;

public interface LocationDao {
	// 전체 장소 조회
	List<Location> sellectAllLocation();
}
