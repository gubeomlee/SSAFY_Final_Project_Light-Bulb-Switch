package com.ssafy.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.board.model.dto.User;
import com.ssafy.board.model.service.UserService;

import io.swagger.annotations.Api;

@RestController
@RequestMapping("/ssafit-user")
@Api(tags = "유저 컨트롤러")
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping("/userList")
	public ResponseEntity<?> sellectAllUsers() {
		List<User> userList = userService.sellectAllUsers();
		if (userList != null) {
			return new ResponseEntity<List<User>>(userList, HttpStatus.OK);
		} else {
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
		}
	}

	@PostMapping("/singup")
	public ResponseEntity<?> singup(@RequestBody User user) {
		userService.singup(user);
		return new ResponseEntity<User>(HttpStatus.CREATED);
	}

	@PostMapping("/login")
	public ResponseEntity<?> login(@RequestBody String userId, @RequestBody String password) {
		User loginUser = userService.login(userId, password);
		if (loginUser != null) {
			return new ResponseEntity<User>(loginUser, HttpStatus.OK);
		} else {
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
		}
	}
}
