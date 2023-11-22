package com.ssafy.board.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.board.model.dao.LikeWorkoutsDao;
import com.ssafy.board.model.dto.LikeWorkouts;

@Service
public class LikeWorkoutsSerivceImpl implements LikeWorkoutsSerivce{

	@Autowired
	LikeWorkoutsDao workoutDao;
	
	@Override
	public List<LikeWorkouts> getWorkouts(String workout) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public LikeWorkoutsSerivceImpl() {
		// TODO Auto-generated constructor stub
	}
}
