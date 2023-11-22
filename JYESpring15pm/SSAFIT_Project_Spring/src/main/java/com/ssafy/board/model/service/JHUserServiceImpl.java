package com.ssafy.board.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ssafy.board.model.dao.JHUserDao;
import com.ssafy.board.model.dto.JHUser;

@Service
public class JHUserServiceImpl implements JHUserService {

    @Autowired
    private JHUserDao userDao;

    @Override
    public JHUser login(JHUser user) {
        JHUser tmp = userDao.selectOne(user.getUserId());
        if (tmp != null && tmp.getPassword().equals(user.getPassword()))
            return tmp;
        return null;
    }

    @Transactional
    @Override
    public int signup(JHUser user) {
        return userDao.insertUser(user);
    }

    @Override
    public List<String> bookmarkSelectAll(String userId) {
        return userDao.bookmarkSelectAll(userId);
    }

    @Transactional
    @Override
    public int bookmarkAdd(String userId, String youtubeId) {
        return userDao.bookmarkAdd(userId, youtubeId);
    }

    @Transactional
    @Override
    public int bookmarkRemove(int id) {
        return userDao.bookmarkRemove(id);
    }

    @Override
    public List<String> followSelectAll(String userId) {
        return userDao.followSelectAll(userId);
    }

    @Transactional
    @Override
    public int followAdd(String userId, String followId) {
        return userDao.followAdd(userId, followId);
    }

    @Transactional
    @Override
    public int followRemove(int id) {
        return userDao.followRemove(id);
    }

    @Override
    public List<String> followBookmarkSelectAll(String userId) {
        return userDao.followBookmarkSelectAll(userId);
    }
}
