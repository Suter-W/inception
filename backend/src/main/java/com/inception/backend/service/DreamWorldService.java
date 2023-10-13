package com.inception.backend.service;

import com.inception.backend.pojo.*;

import java.util.List;

public interface DreamWorldService {
    List<Dream> getDreamList();

    List<Like> userLikeList(Integer userID);

    List<Favorite> userFavoriteList(Integer userID);

    void like(Integer dreamID, Integer userID);

    void cancelLike(Integer dreamID, Integer userID);

    void favorite(Integer dreamID, Integer userID);

    void cancelFavorite(Integer dreamID, Integer userID);

    List<User> getUserInfoByIDs(List<Integer> userIDs);

    // 查询指定梦境的评论
    List<Comment> getDreamCommentList(Integer dreamID);

    void publishComment(Comment comment);
}
