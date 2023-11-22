package com.ssafy.board.model.dao;

import java.util.List;

import com.ssafy.board.model.dto.LikeWorkouts;

public interface LikeWorkoutsDao {
	
	//유저가 좋아하는 운동 선택하기
	List<LikeWorkouts> setLikeWorkouts();
	
	//유저가 선택한 운동 list 가져오기 
	List<LikeWorkouts> getAllLikeWorkouts();

	
}
