package com.ssafy.board.model.dto;

import io.swagger.annotations.ApiModel;
import lombok.*;

@ApiModel(value = "유저 모델", description = "유저 정보")
public class User {
	private int id;
	private String userId;
	private String userPw;
	private String userName;
	private String userLocation;
	private int userAge;
	private String userGender;
	private String img;
	private String orgImg;
	
	public User() {
	}
	
	public User(String userId, String userPw, String userName) {
		this.userId = userId;
		this.userPw = userPw;
		this.userName = userName;
	}

	public User(int id, String userId, String userPw, String userName, String userLocation, int userAge,
			String userGender, String img, String orgImg) {
		this.id = id;
		this.userId = userId;
		this.userPw = userPw;
		this.userName = userName;
		this.userLocation = userLocation;
		this.userAge = userAge;
		this.userGender = userGender;
		this.img = img;
		this.orgImg = orgImg;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getUserId() {
		return userId;
	}


	public void setUserId(String userId) {
		this.userId = userId;
	}


	public String getUserPw() {
		return userPw;
	}


	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getUserLocation() {
		return userLocation;
	}


	public void setUserLocation(String userLocation) {
		this.userLocation = userLocation;
	}


	public int getUserAge() {
		return userAge;
	}


	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}


	public String getUserGender() {
		return userGender;
	}


	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}


	public String getImg() {
		return img;
	}


	public void setImg(String img) {
		this.img = img;
	}


	public String getOrgImg() {
		return orgImg;
	}


	public void setOrgImg(String orgImg) {
		this.orgImg = orgImg;
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", userId=" + userId + ", userPw=" + userPw + ", userName=" + userName
				+ ", userLocation=" + userLocation + ", userAge=" + userAge + ", userGender=" + userGender + ", img="
				+ img + ", orgImg=" + orgImg + "]";
	}


	
}
