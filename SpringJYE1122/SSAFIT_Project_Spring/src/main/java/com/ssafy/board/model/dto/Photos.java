package com.ssafy.board.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Photos {
	private int id;
	private String img;
	private String orgImg;
	private int MainBoardId;
}
