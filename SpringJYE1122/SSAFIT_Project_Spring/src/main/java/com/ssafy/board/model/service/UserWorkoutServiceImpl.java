package com.ssafy.board.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ssafy.board.model.dao.UserWorkoutDao;
import com.ssafy.board.model.dto.UserWorkout;
import com.ssafy.board.model.dto.Workout;

public class UserWorkoutServiceImpl implements UserWorkoutService {

	@Autowired
	private UserWorkoutDao userWorkoutDao;

	@Override
	public List<UserWorkout> sellectAllRelation() {
		List<UserWorkout> userWorkoutRelation = userWorkoutDao.sellectAllRelation();
		return userWorkoutRelation;
	}

	@Override
	public List<Workout> sellectWorkoutByUserId(int userId) {
		List<Workout> userWorkout = userWorkoutDao.sellectWorkoutByUserId(userId);
		return userWorkout;
	}

}
