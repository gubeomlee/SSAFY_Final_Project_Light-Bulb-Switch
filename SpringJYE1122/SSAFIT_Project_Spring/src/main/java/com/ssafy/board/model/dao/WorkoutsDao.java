package com.ssafy.board.model.dao;

import java.util.List;
import com.ssafy.board.model.dto.*;


public interface WorkoutsDao {

	//전체 운동 리스트 가져와
	List<Workouts> selectAllworkouts();

}
