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

	@Transactional
	@Override
	public List<User> selecAll() {
		List<User> tmp = userDao.selecAll();
		System.out.println(tmp);
		return tmp;
	}

	@Transactional
	@Override
	public void singupUser(User user) {
		System.out.println(user);

		userDao.singupUser(user);
	}

	@Transactional
	@Override
	public User loginId(String userId, String userPw) {
		return userDao.loginId(userId);
	}

	@Transactional
	@Override
	public int updateUser(User user) {
	System.out.println(user);
		return userDao.updateUser(user);
	}

	@Transactional
	@Override
	public int deleteUser(int id) {
		return userDao.deleteUser(id);
	}
}
