package com.ssafy.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.board.model.dto.UserWorkout;
import com.ssafy.board.model.dto.Workout;
import com.ssafy.board.model.service.UserWorkoutService;

import io.swagger.annotations.Api;

@RestController
@RequestMapping("/ssafit-userWorkout")
@Api(tags = "유저/운동 관계 컨트롤러")
public class UserWorkoutController {

	@Autowired
	private UserWorkoutService userWorkoutService;

	@GetMapping("/userWorkoutList")
	public ResponseEntity<?> sellectAllRelation() {
		List<UserWorkout> userWorkoutList = userWorkoutService.sellectAllRelation();
		if (userWorkoutList != null) {
			return new ResponseEntity<List<UserWorkout>>(userWorkoutList, HttpStatus.OK);
		} else {
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
		}
	}

	@GetMapping("/workoutList")
	public ResponseEntity<?> sellectWorkoutByUserId(@RequestBody int userId) {
		List<Workout> workoutList = userWorkoutService.sellectWorkoutByUserId(userId);
		if (workoutList != null) {
			return new ResponseEntity<List<Workout>>(workoutList, HttpStatus.OK);
		} else {
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
		}
	}
}
