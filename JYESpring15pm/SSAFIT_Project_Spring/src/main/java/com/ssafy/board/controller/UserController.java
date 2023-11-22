package com.ssafy.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.board.model.dto.User;
import com.ssafy.board.model.service.UserService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/ssafit-user")
@Api(tags = "유저 컨트롤러")
public class UserController {

	@Autowired
	private UserService userService;

//	//전체 유저 가져와
//	@GetMapping("/users")
//	public ResponseEntity<?> users(@)

	@GetMapping("/users")
	@ApiOperation(value = "users test", notes = "users test")
	public ResponseEntity<?> getAllUsers() {
		List<User> userList = userService.selecAll();
		if (userList == null)
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
		return new ResponseEntity<List<User>>(userList, HttpStatus.OK);
	}

//	
//	@GetMapping("/users")
//    @ApiOperation(value = "users test", notes = "users test")
//	public List<User> users(){
//		return userService.selecAll();
//	}
//	
	// 회원 가입
	@PostMapping("/signup")
	@ApiOperation(value = "회원가입", notes = "회원 가입")
	public ResponseEntity<?> signgupUser(@RequestBody User user) {
		userService.singupUser(user);
		return new ResponseEntity<User>(HttpStatus.CREATED);

	}

	// 로그인
	@PostMapping("/login")
	public ResponseEntity<?> loginUser(@RequestParam String userId, @RequestParam String userPw) {
		User loggedInUser = userService.loginId(userId, userPw);
		if (loggedInUser == null)
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
		return new ResponseEntity<User>(HttpStatus.OK);
	}

	// 회원 정보 수정
	@PutMapping("/update")
	public ResponseEntity<?> updateUser(@RequestBody User user) {
		int updatedUser = userService.updateUser(user);
		System.out.println(updatedUser);
		if (updatedUser == 0)
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
		return new ResponseEntity<User>(HttpStatus.OK);

	}

	// 회원 탈퇴
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> deleteUser(@RequestBody User user, @PathVariable(name = "id") int id) {
		int deleteUser = userService.deleteUser(id);
		if (deleteUser == 0)
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
		return new ResponseEntity<String>(HttpStatus.OK);
	}
}
