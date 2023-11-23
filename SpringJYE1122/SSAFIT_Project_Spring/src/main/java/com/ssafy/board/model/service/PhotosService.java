package com.ssafy.board.model.service;

import java.io.IOException;
import java.util.List;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

import com.ssafy.board.model.dto.Photos;

public interface PhotosService {

	// 사진 다 가져오기
	public List<Photos> getAllPhotos();

	// 사진 넣기
	public int insertPhotos(Photos photos, MultipartFile image) throws IOException;

	// 사진 삭제하기
	public int deletePhotos(Photos photos);

	public Resource loadImage(String imageName);
}
