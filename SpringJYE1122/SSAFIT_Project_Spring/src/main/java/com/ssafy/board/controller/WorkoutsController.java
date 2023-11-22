package com.ssafy.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.board.model.dto.Workouts;
import com.ssafy.board.model.service.WorkoutsService;

import io.swagger.annotations.Api;

@RestController
@RequestMapping("/ssafit-workouts")
@Api(tags ="workouts 컨트롤러")
public class WorkoutsController {

	@Autowired
	private WorkoutsService workoutsService;
	
	@GetMapping("/list")
	public ResponseEntity<?> selectAllWorkouts(){
		List<Workouts> list = workoutsService.selectAllworkouts();
		System.out.println(list);
		if(list == null)
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
		return new ResponseEntity<List<Workouts>>(list, HttpStatus.OK);
		
	}
}
