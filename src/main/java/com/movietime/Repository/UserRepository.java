package com.movietime.Repository;

import com.movietime.entity.User;

/**
 * Created by yangzy on 2017/6/6.
 */
public interface UserRepository {
    User getUserByUsername(String username);

    boolean checkPassword(String username);
}
