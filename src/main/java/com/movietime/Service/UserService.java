package com.movietime.Service;

import com.movietime.entity.User;

/**
 * Created by yangzy on 2017/6/6.
 */
public interface UserService {
    boolean isRegistered(String username);

    boolean checkPassword(String username, String password_input);

    boolean registerUser(String username, String password, String first_name, String last_name);

    User getUserInstance(String username, String password);
}
