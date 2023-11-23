package com.ssafy.board.model.dao;

import java.util.List;

import org.springframework.core.io.Resource;

import com.ssafy.board.model.dto.Photos;

public interface PhotosDao {

	// 사진 넣기
	public int insert(Photos photos);

	// 사진 다 가져오기
	public List<Photos> getAllPhotos();

	// 사진 삭제하기
	public int delete(Photos photos);

	public Resource loadImage(String imageName);
}
