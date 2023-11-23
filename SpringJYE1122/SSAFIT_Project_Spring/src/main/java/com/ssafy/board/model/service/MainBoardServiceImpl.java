package com.ssafy.board.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ssafy.board.model.dao.MainBoardDao;
import com.ssafy.board.model.dto.MainBoard;

@Service
public class MainBoardServiceImpl implements MainBoardSerivce {

	@Autowired
	private MainBoardDao mainBoardDao;

	@Transactional
	@Override
	public List<MainBoard> getAllMainBoards() {
		return mainBoardDao.getAllMainBoards();
	}

	@Transactional
	@Override
	public MainBoard getMainBoardBygroupName(String groupName) {
		return mainBoardDao.getMainBoardBygroupName(groupName);
	}

	@Transactional
	@Override
	public void insertMainBoard(MainBoard mainBoard) {
		mainBoardDao.insertMainBoard(mainBoard);
	}

	@Transactional
	@Override
	public int updateMainBoard(MainBoard mainBoard) {
		return mainBoardDao.updateMainBoard(mainBoard);
	}

	@Transactional
	@Override
	public int deleteMainBoard(int id) {
		return mainBoardDao.deleteMainBoard(id);
	}
}
