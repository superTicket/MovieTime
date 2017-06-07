package com.movietime.DAO;

import com.movietime.entity.User;

/**
 * Created by yangzy on 2017/6/7.
 */
public interface UserDAO {
    User findByUsername(String username);

    User findOne(long id);

    boolean InsertOne(User user);

    boolean UpdateOne(long id, User user);
}
