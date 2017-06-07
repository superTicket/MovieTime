package com.movietime.Service;

import com.movietime.entity.User;
import org.springframework.stereotype.Component;

/**
 * Created by yangzy on 2017/6/6.
 */

@Component("UserRepositoryImp")
public class UserServiceImpl implements UserService {
    public User getUserByUsername(String username) {
        return new User();
    }

    public boolean checkPassword(String username) {
        return true;
    }

    public boolean registerUser(String username, String password, String first_name, String last_name) {
        return true;
    }

    public boolean registerUser(String username, String password) {
        return true;
    }
}
