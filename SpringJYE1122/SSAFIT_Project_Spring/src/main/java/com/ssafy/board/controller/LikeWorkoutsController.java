package com.ssafy.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.board.model.dto.LikeWorkouts;
import com.ssafy.board.model.service.LikeWorkoutsSerivce;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/ssafit-likeWorkouts")
@Api(tags ="likeWorkouts 컨트롤러")
public class LikeWorkoutsController {

	@Autowired
	private LikeWorkoutsSerivce likeWorkoutsService;
	
	@PostMapping("/likes")
	@ApiOperation(value ="좋아하는 운동", notes ="유저가 좋아하는 운동")
	public ResponseEntity<?> likeWorkouts(@RequestParam int userId, @RequestParam int[] workoutsId){
		List<LikeWorkouts> list = likeWorkoutsService.setLikeWorkouts(userId, workoutsId);
		if(list == null)
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
		return new ResponseEntity<List<LikeWorkouts>>(list, HttpStatus.OK);
		
	}
	
}
