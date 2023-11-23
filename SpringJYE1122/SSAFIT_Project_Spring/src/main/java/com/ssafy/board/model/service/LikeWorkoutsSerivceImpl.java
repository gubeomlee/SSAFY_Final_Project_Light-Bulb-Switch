package com.ssafy.board.model.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ssafy.board.model.dao.LikeWorkoutsDao;
import com.ssafy.board.model.dto.LikeWorkouts;

@Service
public class LikeWorkoutsSerivceImpl implements LikeWorkoutsSerivce {

	@Autowired
	LikeWorkoutsDao likeWorkoutDao;

//	@Transactional
//	@Override
//	public List<LikeWorkouts> setLikeWorkouts(int UserId, int[] WorkoutsId) {
//		return likeWorkoutDao.setLikeWorkouts(UserId, WorkoutsId);
//	}

	@Override
	public void insertSelectedWorkouts(Map<String, Object> paramMap) {
		likeWorkoutDao.insertSelectedWorkouts(paramMap);
	}

	@Override
	@Transactional
	public List<LikeWorkouts> setLikeWorkouts(int UserId, int[] WorkoutsId) {
		Map<String, Object> paramMap = new HashMap<>();
		paramMap.put("userId", UserId);
		paramMap.put("workoutsIds", WorkoutsId);
		likeWorkoutDao.insertSelectedWorkouts(paramMap);
		return likeWorkoutDao.getAllLikeWorkouts();
	}

	@Transactional
	@Override
	public List<LikeWorkouts> getAllLikeWorkouts() {
		return likeWorkoutDao.getAllLikeWorkouts();
	}
}
