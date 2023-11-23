package com.ssafy.board.model.service;

import java.util.List;

import com.ssafy.board.model.dto.JHReview;
import com.ssafy.board.model.dto.JHSearchCondition;
import com.ssafy.board.model.dto.JHVideo;

public interface JHVideoService {
    List<JHReview> reviewSelectAll(String youtubeId);

    JHReview reviewSelect(int id);

    int reviewAdd(JHReview review);

    int reviewModify(JHReview review);

    int reviewRemove(int id);

    List<JHVideo> search(JHSearchCondition condition);
}
