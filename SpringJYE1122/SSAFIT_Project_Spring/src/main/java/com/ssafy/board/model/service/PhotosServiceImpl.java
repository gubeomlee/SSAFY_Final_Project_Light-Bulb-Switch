package com.ssafy.board.model.service;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import com.ssafy.board.model.dao.PhotosDao;
import com.ssafy.board.model.dto.Photos;

//import io.github.classgraph.Resource;

@Service
public class PhotosServiceImpl implements PhotosService {

	@Autowired
	PhotosDao photoDao;

	File uploadFolder = new File("uploads");
	Path uploadFolderPath = null;

	PhotosServiceImpl() throws IOException {
		uploadFolderPath = Paths.get(uploadFolder.getCanonicalPath());
	}

	@Override
	public int insertPhotos(Photos photos, MultipartFile image) throws IOException {
		if (!uploadFolder.exists()) {
			Files.createDirectory(uploadFolderPath);
		}

		if (!image.isEmpty() && image.getSize() != 0) {
			String today = Long.toString(System.currentTimeMillis());
			String newImageName = today + "_" + image.getOriginalFilename();

			photos.setOrgImg(image.getOriginalFilename());
			photos.setImg(newImageName);

			Path imagePath = uploadFolderPath.resolve(photos.getImg());

			image.transferTo(new File(imagePath.toString()));
		}

		return photoDao.insert(photos);
	}

	@Transactional
	public Resource loadImage(String imageName) {
		Path characterIamge = uploadFolderPath.resolve(imageName);
		Resource resource;
		try {
			resource = new UrlResource(characterIamge.toUri());
			return resource;

		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Transactional
	@Override
	public int deletePhotos(Photos photos) {
		return photoDao.delete(photos);
	}

	@Transactional
	@Override
	public List<Photos> getAllPhotos() {
		return photoDao.getAllPhotos();
	}

}
