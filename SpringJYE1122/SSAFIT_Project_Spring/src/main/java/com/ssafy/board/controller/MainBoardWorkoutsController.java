package com.ssafy.board.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.board.model.service.MainBoardWorkoutsService;

import io.swagger.annotations.Api;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/ssafit-mainBoardWorkouts")
@Api(tags = "Main Board Workouts 컨트롤러")
public class MainBoardWorkoutsController {

	@Autowired
	private MainBoardWorkoutsService mbWorkoutsService;

	@PostMapping("/likeWorkouts")
	public ResponseEntity<?> insertSelectedWorkouts(@RequestBody Map<String, Object> paramMap) {
		try {
			mbWorkoutsService.insertSelectedMBWorkouts(paramMap);
			return new ResponseEntity<>(HttpStatus.OK);
//			return new ResponseEntity<>("Success: Workouts selected successfully.", HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
//			return new ResponseEntity<>("Error: " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
