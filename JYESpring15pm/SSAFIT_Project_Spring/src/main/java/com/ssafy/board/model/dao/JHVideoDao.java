package com.ssafy.board.model.dao;

import java.util.List;

import com.ssafy.board.model.dto.JHReview;
import com.ssafy.board.model.dto.JHSearchCondition;
import com.ssafy.board.model.dto.JHVideo;

public interface JHVideoDao {
    public List<JHReview> reviewSelectAll(String youtubeId);

    public List<JHVideo> search(JHSearchCondition condition);

    public JHReview reviewSelect(int id);

    public int reviewAdd(JHReview review);

    public int reviewModify(JHReview review);

    public int reviewRemove(int id);

}
