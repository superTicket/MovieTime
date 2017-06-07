package com.movietime.DAO;

import com.movietime.entity.User;

/**
 * Created by yangzy on 2017/6/7.
 */
public interface UserDAO {
    User findByUsername(String username);

    User findOne(long id);

    boolean InsertOne(String email, String password, String first_name, String last_name);

    boolean UpdateOne(long id, User user);
}
