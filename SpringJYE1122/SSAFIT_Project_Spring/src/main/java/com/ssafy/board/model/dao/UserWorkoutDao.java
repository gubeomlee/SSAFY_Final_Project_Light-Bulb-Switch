package com.ssafy.board.model.dao;

import java.util.List;

import com.ssafy.board.model.dto.UserWorkout;
import com.ssafy.board.model.dto.Workout;

public interface UserWorkoutDao {
	// 모든 관계 출력
	List<UserWorkout> sellectAllRelation();

	// 유저 정보가 주어졌을 때 해당 유저가 관심있는 운동목록 출력
	List<Workout> sellectWorkoutByUserId(int userId);
}
