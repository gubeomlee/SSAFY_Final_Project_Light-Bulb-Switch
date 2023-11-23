package com.ssafy.board.model.dao;

import java.util.List;

import com.ssafy.board.model.dto.UserGroups;

public interface UserGroupsDao {
	List<UserGroups> getAllGroupLists();

	UserGroups getGroupListById(int id);

	void insertGroupList(UserGroups groupList);

	void deleteGroupList(int id);

}
