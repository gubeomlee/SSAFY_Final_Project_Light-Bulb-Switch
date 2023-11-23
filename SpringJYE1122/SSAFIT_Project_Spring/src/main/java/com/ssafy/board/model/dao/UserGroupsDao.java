package com.ssafy.board.model.dao;

import java.util.List;

import com.ssafy.board.model.dto.UserGroups;

public interface UserGroupsDao {

	// 유저가 찜한 전체 소모임_그룹 가져오기
	List<UserGroups> getAllGroupLists();

	// 유저가 찜한 소모임_그룹 중 '특정한' 그룹 가져오기
	UserGroups getGroupListById(int id);

	// 소모임 찜하기
	void insertGroupToUser(UserGroups userGroups);

	// 소모임 취소하기
	int deleteGroupFromUser(int id);

}
