package com.ssafy.board.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.board.model.dao.GroupsDao;
import com.ssafy.board.model.dto.Groups;
import com.ssafy.board.model.dto.User;

@Service
public class GroupsSerivceImpl implements GroupService {

	@Autowired
	private GroupsDao groupsDao;

	@Override
	public List<Groups> selectAllGroups() {
		List<Groups> tmp = groupsDao.selectAllGroups();
		return tmp;
	}
}
