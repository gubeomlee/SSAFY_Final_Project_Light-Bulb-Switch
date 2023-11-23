package com.ssafy.board.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ssafy.board.model.dao.WorkoutDao;
import com.ssafy.board.model.dto.Workout;

@Service
public class WorktoutServiceImpl implements WorkoutService {

	@Autowired
	private WorkoutDao workoutDao;

	@Override
	@Transactional
	public List<Workout> sellectAllWorkout() {
		List<Workout> workoutList = workoutDao.sellectAllWorkout();
		return workoutList;
	}
}
