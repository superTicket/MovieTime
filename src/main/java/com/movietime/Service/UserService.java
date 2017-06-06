package com.movietime.Service;

import com.movietime.entity.User;

/**
 * Created by yangzy on 2017/6/6.
 */
public interface UserService {
    User getUserByUsername(String username);

    boolean checkPassword(String username);
}
