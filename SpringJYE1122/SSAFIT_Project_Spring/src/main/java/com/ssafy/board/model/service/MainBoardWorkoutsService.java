package com.ssafy.board.model.service;

import java.util.Map;

public interface MainBoardWorkoutsService {

	//MainBoard애서 선택한 운동 뭐야?
    void insertSelectedMBWorkouts(Map<String, Object> paramMap);
	
	
}
