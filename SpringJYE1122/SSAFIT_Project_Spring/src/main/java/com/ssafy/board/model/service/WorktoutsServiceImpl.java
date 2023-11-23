package com.ssafy.board.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ssafy.board.model.dao.WorkoutsDao;
import com.ssafy.board.model.dto.Workouts;

@Service
public class WorktoutsServiceImpl implements WorkoutsService {
	@Autowired
	private WorkoutsDao workoutdao;
	
	@Override
	@Transactional
	public List<Workouts> selectAllworkouts() {
		return workoutdao.selectAllworkouts();
	}
}
