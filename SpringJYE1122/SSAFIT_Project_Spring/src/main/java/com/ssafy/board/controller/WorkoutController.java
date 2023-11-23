package com.ssafy.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.board.model.dto.Workout;
import com.ssafy.board.model.service.WorkoutService;

import io.swagger.annotations.Api;

@RestController
@RequestMapping("/ssafit-workout")
@Api(tags = "workout 컨트롤러")
public class WorkoutController {

	@Autowired
	private WorkoutService workoutService;

	@GetMapping("/workoutList")
	public ResponseEntity<?> sellectAllWorkout() {
		List<Workout> workoutList = workoutService.sellectAllWorkout();
		if (workoutList != null) {
			return new ResponseEntity<List<Workout>>(workoutList, HttpStatus.OK);
		} else {
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
		}
	}
}
