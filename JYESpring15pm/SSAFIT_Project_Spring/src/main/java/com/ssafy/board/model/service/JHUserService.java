package com.ssafy.board.model.service;

import java.util.List;

import com.ssafy.board.model.dto.JHUser;

public interface JHUserService {
    JHUser login(JHUser user);

    int signup(JHUser user);

    List<String> bookmarkSelectAll(String userId);

    int bookmarkAdd(String userId, String youtubeId);

    int bookmarkRemove(int id);

    List<String> followSelectAll(String userId);

    int followAdd(String userId, String followId);

    int followRemove(int id);

    List<String> followBookmarkSelectAll(String userId);
}