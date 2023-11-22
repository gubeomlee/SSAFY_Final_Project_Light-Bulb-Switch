package com.ssafy.board.model.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ssafy.board.model.dao.MainBoardWorkoutsDao;

@Service
public class MainBoardWorkoutsServiceImpl implements MainBoardWorkoutsService{

	@Autowired
	private MainBoardWorkoutsDao mbWorkoutsDao;
//	private MainBoardWorkoutsService mbWorkoutsService;
	
	@Transactional
	@Override
	public void insertSelectedMBWorkouts(Map<String, Object> paramMap) {
		mbWorkoutsDao.insertSelectedMBWorkouts(paramMap);
	}
}
