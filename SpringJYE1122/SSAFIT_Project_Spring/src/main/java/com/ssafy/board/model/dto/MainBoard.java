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
	private String title;
	private String content;
	private String location;
//	private String workout;
	private int UserId;
	private int maxMember;
	private String groupName;

}
