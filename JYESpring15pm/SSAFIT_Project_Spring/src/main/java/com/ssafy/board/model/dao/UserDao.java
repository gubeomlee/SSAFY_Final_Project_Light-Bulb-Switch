package com.ssafy.board.model.dao;

import java.util.List;

import com.ssafy.board.model.dto.*;

public interface UserDao {
	
	//전체 유저 가져와
	List<User> selecAll();
	
	// 회원가입
	void singupUser(User user);

	// 로그인
	User loginId(String userId);

	// 회원정보 수정
	int updateUser(User user);

	// 회원 탈퇴 (userId로 삭제)
	int deleteUser(int id);
}
