package com.ssafy.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.board.model.dto.Groups;
import com.ssafy.board.model.dto.LikeWorkouts;
import com.ssafy.board.model.service.GroupService;

import io.swagger.annotations.Api;

@RestController
@RequestMapping("/ssafit-gropus")
@Api(tags = "Groups")
public class GroupsController {

	@Autowired
	private GroupService groupsService;
	
	
	@PostMapping("")
	public ResponseEntity<?> groups(){
		List<Groups> list = groupsService.selectAllGroups();
		if(list == null)
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
		return new ResponseEntity<List<Groups>>(list, HttpStatus.OK);
		
	}

}
