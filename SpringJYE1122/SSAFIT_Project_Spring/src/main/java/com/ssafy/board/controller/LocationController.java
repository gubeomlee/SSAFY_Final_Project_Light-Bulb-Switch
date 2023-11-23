package com.ssafy.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.board.model.dto.Location;
import com.ssafy.board.model.service.LocationService;

import io.swagger.annotations.Api;

@RestController
@RequestMapping("/ssafit-location")
@Api(tags = "장소 컨트롤러")
public class LocationController {

	@Autowired
	private LocationService locationService;

	@GetMapping("/locationList")
	public ResponseEntity<?> sellectAllLocation() {
		List<Location> locationList = locationService.sellectAllLocation();
		if (locationList != null) {
			return new ResponseEntity<List<Location>>(locationList, HttpStatus.OK);
		} else {
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
		}
	}
}
