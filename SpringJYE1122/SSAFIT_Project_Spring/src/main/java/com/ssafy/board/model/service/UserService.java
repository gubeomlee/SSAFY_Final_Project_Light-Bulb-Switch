package com.ssafy.board.model.service;

import java.util.List;

import com.ssafy.board.model.dto.User;

public interface UserService {
	// 유저 리스트 조회
	List<User> sellectAllUsers();

	// 회원가입
	void singup(User user);

	// 로그인
	User login(String userId, String password);
}
