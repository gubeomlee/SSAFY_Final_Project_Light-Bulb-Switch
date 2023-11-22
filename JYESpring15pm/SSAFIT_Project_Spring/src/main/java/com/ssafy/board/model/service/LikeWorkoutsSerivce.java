package com.ssafy.board.model.service;

import java.util.List;

import com.ssafy.board.model.dto.LikeWorkouts;

public interface LikeWorkoutsSerivce {
	List<LikeWorkouts> getWorkouts(String workout);

}
