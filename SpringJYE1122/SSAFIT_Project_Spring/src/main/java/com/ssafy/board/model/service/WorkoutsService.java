package com.ssafy.board.model.service;

import java.util.List;

import com.ssafy.board.model.dto.Workouts;

public interface WorkoutsService {

	//전체 운동 리스트 가져와
	List<Workouts> selectAllworkouts();
	
}
