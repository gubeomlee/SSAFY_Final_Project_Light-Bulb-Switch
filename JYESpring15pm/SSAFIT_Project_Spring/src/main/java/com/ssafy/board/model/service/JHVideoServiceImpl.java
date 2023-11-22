package com.ssafy.board.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ssafy.board.model.dao.JHVideoDao;
import com.ssafy.board.model.dto.JHReview;
import com.ssafy.board.model.dto.JHSearchCondition;
import com.ssafy.board.model.dto.JHVideo;

@Service
public class JHVideoServiceImpl implements JHVideoService {

    private JHVideoDao videoDao;

    @Autowired
    public void setBoardDao(JHVideoDao boardDao) {
        this.videoDao = boardDao;
    }

    @Override
    public List<JHVideo> search(JHSearchCondition condition) {
        return videoDao.search(condition);
    }

    @Override
    public List<JHReview> reviewSelectAll(String youtubeId) {
        return videoDao.reviewSelectAll(youtubeId);
    }

    @Override
    public JHReview reviewSelect(int id) {
        return videoDao.reviewSelect(id);
    }

    @Transactional
    @Override
    public int reviewAdd(JHReview review) {
        return videoDao.reviewAdd(review);
    }

    @Transactional
    @Override
    public int reviewModify(JHReview review) {
        return videoDao.reviewModify(review);
    }

    @Transactional
    @Override
    public int reviewRemove(int id) {
        return videoDao.reviewRemove(id);
    }

}
