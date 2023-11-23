package com.ssafy.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.board.model.service.PhotosService;

import io.github.classgraph.Resource;
import io.swagger.annotations.Api;

@RestController
@RequestMapping("/ssafit-photos")
@Api(tags = "사진 Photos 컨트롤러")
public class PhotosController {

	@Autowired
	private PhotosService photoService;

	@GetMapping("/image/{imageName}")
	public ResponseEntity<?> getImage(@PathVariable String imageName){
		Resource image = (Resource) photoService.loadImage(imageName);
		return ResponseEntity.ok()
				.header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + imageName + "\"")
				.body(image);
	}

}
