package com.ssafy.board.model.dao;


import java.util.*;

import com.ssafy.board.model.dto.*;

public interface MainBoardDao {
	
	//모든 게시글 가져오기
	List<MainBoard> getAllMainBoards();
	
	
	MainBoard getMainBoardById(int id);
	
	//게시글 쓰기
	void insertMainBoard(MainBoard mainBoard);
	
	//게시글 수정하기
	void updateMainBoard(MainBoard mainBoard);
	
	//게시글 삭제하기
	void deleteMainBoard(MainBoard mainBoard);

	//photos
	List<MainBoard> getAllPhotos();
	MainBoard getPhotosById(int id);
    void insertPhotos(MainBoard photos);
    void deletePhotos(int id);
	
	//meeting schedule
	List<MainBoard> getAllMeetingSchedules();
	MainBoard getMeetingScheduleById(int id);
	void insertMeetingSchedule(MainBoard meetingSchedule);
	void deleteMeetingSchedule(int id);
}
