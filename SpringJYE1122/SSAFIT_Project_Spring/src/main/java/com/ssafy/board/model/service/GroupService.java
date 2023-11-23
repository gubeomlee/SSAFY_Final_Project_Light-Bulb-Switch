package com.ssafy.board.model.service;

import java.util.List;

import com.ssafy.board.model.dto.Groups;

public interface GroupService {

	//모든 그룹 리스트 가져오기 
	List<Groups> selectAllGroups();
}
