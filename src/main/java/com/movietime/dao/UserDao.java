package com.movietime.dao;

import com.movietime.entity.User;


public interface UserDao {

    User findOne(long id);
    User findByUsername(String username);
    boolean InsertOne(String email, String password, String first_name, String last_name);
    boolean UpdateOne(long id, User user);
}
