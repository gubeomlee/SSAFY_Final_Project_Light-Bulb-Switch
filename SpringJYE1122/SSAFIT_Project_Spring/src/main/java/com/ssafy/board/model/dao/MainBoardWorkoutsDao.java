package com.ssafy.board.model.dao;

import java.util.List;
import java.util.Map;

import com.ssafy.board.model.dto.LikeWorkouts;

public interface MainBoardWorkoutsDao {

	//MainBoard애서 선택한 운동 뭐야?
    void insertSelectedMBWorkouts(Map<String, Object> paramMap);
	
	
}
