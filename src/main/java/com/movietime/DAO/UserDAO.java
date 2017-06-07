package com.movietime.DAO;

import com.movietime.entity.User;

/**
 * Created by yangzy on 2017/6/7.
 */
public interface UserDAO {
    User findByUsername(String username);

    User findOne(int id);

    boolean InsertOne(User user);

    boolean UpdateOne(int id, User user);
}
