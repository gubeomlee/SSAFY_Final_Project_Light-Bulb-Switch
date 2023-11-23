package com.ssafy.board.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ssafy.board.model.dao.UserDao;
import com.ssafy.board.model.dto.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Override
	@Transactional
	public List<User> sellectAllUsers() {
		List<User> userInfoList = userDao.sellectAllUsers();
		return userInfoList;
	}

	@Override
	@Transactional
	public void singup(User user) {
		userDao.singup(user);
	}

	@Override
	@Transactional
	public User login(String userId, String password) {
		User user = userDao.login(userId, password);
		return user;
	}
}
