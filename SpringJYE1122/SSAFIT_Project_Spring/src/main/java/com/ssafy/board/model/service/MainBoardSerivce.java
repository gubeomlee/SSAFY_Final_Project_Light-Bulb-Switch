package com.ssafy.board.model.service;

import java.util.List;

import com.ssafy.board.model.dto.MainBoard;

public interface MainBoardSerivce {

	// 모든 게시글 가져오기
	List<MainBoard> getAllMainBoards();

	// 특정 게시글 groupName으로 가져오기
	MainBoard getMainBoardBygroupName(String groupName);

	// 게시글 쓰기
	void insertMainBoard(MainBoard mainBoard);

	// 게시글 수정하기
	int updateMainBoard(MainBoard mainBoard);

	// 게시글 삭제하기
	int deleteMainBoard(int id);

}
