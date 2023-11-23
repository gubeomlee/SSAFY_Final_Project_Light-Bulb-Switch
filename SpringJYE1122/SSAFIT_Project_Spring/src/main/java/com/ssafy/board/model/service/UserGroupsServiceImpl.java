package com.ssafy.board.model.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ssafy.board.model.dao.UserGroupsDao;
import com.ssafy.board.model.dto.UserGroups;

@Service
public class UserGroupsServiceImpl implements UserGroupsService {

	private UserGroupsDao userGroupsDao;
	
	@Transactional
	@Override
	public List<UserGroups> getAllGroupLists() {
		return userGroupsDao.getAllGroupLists();
	}
	
	@Override
	@Transactional
	public UserGroups getGroupListById(int id) {
		return userGroupsDao.getGroupListById(id);
	}
	
	@Transactional
	@Override
	public void insertGroupToUser(UserGroups userGroups) {
		userGroupsDao.insertGroupToUser(userGroups);
	}
	
	@Override
	public int deleteGroupFromUser(int id) {
		return userGroupsDao.deleteGroupFromUser(id);
	}
	
}
