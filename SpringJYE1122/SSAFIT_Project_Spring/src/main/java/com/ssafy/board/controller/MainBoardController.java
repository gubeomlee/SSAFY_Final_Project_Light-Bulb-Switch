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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.board.model.dto.MainBoard;
import com.ssafy.board.model.dto.User;
import com.ssafy.board.model.service.MainBoardSerivce;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/ssafit-mainboard")
@Api(tags = "게시글(MainBoard) 컨트롤러 ")
public class MainBoardController {

	@Autowired
	private MainBoardSerivce mainBoards;

	// 전체 게시글 가져와
	@GetMapping("/lists")
	@ApiOperation(value = "mainboard lists", notes = "mainboard lilsts")
	public ResponseEntity<?> getAllmainBoards() {
		List<MainBoard> lists = mainBoards.getAllMainBoards();
		if (lists == null)
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
		return new ResponseEntity<List<MainBoard>>(lists, HttpStatus.OK);

	}

	// 특정 게시글 가져와
	@GetMapping("/lists{}")
	@ApiOperation(value = "mainboard group name ", notes = "mainboard group name")
	public ResponseEntity<?> getMBgroupName(@PathVariable(name = "groupName") String groupName) {
		MainBoard name = mainBoards.getMainBoardBygroupName(groupName);
		if (name == null)
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
		return new ResponseEntity<MainBoard>(HttpStatus.OK);
	}

	// 게시글 쓰기
	@PostMapping("/write")
	public ResponseEntity<?> insertMainBoard(@RequestBody MainBoard mainBoard) {
		try {
			mainBoards.insertMainBoard(mainBoard);
			return new ResponseEntity<MainBoard>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
		}

	}

	// 게시글 수정하기
	@PutMapping("/update")
	public ResponseEntity<?> updateMainBoard(@RequestBody MainBoard mainBoard) {
		int update = mainBoards.updateMainBoard(mainBoard);
		if (update == 0)
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
		return new ResponseEntity<MainBoard>(HttpStatus.OK);

	}

	// 게시글 삭제하기
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> deleteMainBoard(@RequestBody MainBoard mainBoard, @PathVariable(name = "id") int id) {
		int tmp = mainBoards.deleteMainBoard(id);
		if (tmp == 0)
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
		return new ResponseEntity<String>(HttpStatus.OK);
	}
}
