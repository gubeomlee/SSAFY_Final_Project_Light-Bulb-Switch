package com.ssafy.board.model.dao;

import java.util.List;

import com.ssafy.board.model.dto.Workout;

public interface WorkoutDao {
	// 전체 운동 리스트 조회
	List<Workout> sellectAllWorkout();
}
