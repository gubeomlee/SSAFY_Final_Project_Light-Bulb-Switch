package com.ssafy.board.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class MainBoard {
	private int id;
	private int UserId;
	private String title;
	private String content;
	private String location;
	private String workout;
//	private String img;
//	private String orgImg;
//	private String meetingDatetime;
	private int maxMember;
	private int GroupsId;
	
	

}
