package com.ssafy.board.model.dao;

import java.util.*;

import com.ssafy.board.model.dto.*;

public interface GroupsDao {
	
	//모든 그룹 리스트 가져오기 
	List<Groups> selectAllGroup();
	
}
