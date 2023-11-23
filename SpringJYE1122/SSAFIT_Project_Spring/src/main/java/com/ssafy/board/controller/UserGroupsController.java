package com.ssafy.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.board.model.dto.User;
import com.ssafy.board.model.dto.UserGroups;
import com.ssafy.board.model.service.UserGroupsService;

import io.swagger.annotations.Api;

@RestController
@RequestMapping("/ssafit-userGroups")
@Api(tags = "userGroups 컨트롤러")
public class UserGroupsController {

	@Autowired
	private UserGroupsService userGroupsService;

	@GetMapping("/All")
	public ResponseEntity<?> getAllgroupLists() {
		List<UserGroups> lists = userGroupsService.getAllGroupLists();
		if (lists == null)
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
		return new ResponseEntity<List<UserGroups>>(lists, HttpStatus.OK);
	}

	@GetMapping("/specific/{id}")
	public ResponseEntity<?> getGroupListById(@PathVariable int id) {
		UserGroups tmp = userGroupsService.getGroupListById(id);
		if (tmp == null)
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
		return new ResponseEntity<UserGroups>(HttpStatus.OK);
	}

	@PostMapping("/likes")
	public ResponseEntity<?> insertGroupToUser(@RequestBody UserGroups userGroups) {
		try {
			userGroupsService.insertGroupToUser(userGroups);
			return new ResponseEntity<UserGroups>(HttpStatus.OK);

		} catch (Exception e) {
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);

		}
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> deleteGroupFromUser(@PathVariable int id) {
		int result = userGroupsService.deleteGroupFromUser(id);
		if (result == 0) {
			return new ResponseEntity<Integer>(result, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<Integer>(result, HttpStatus.OK);

	}

}
