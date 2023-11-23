package com.ssafy.board.model.dao;

import java.util.List;
import java.util.Map;

import com.ssafy.board.model.dto.LikeWorkouts;

public interface LikeWorkoutsDao {
	
	//유저가 좋아하는 운동 선택하기
//	List<LikeWorkouts> setLikeWorkouts(int WorkoutsId, int[] workoutsId2);
    void insertSelectedWorkouts(Map<String, Object> paramMap);
    
	//유저의  찜운동 list 가져오기 
	List<LikeWorkouts> getAllLikeWorkouts();

	
}
