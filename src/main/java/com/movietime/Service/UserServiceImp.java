package com.movietime.Service;

import com.movietime.entity.User;
import org.springframework.stereotype.Component;

/**
 * Created by yangzy on 2017/6/6.
 */

@Component("UserRepositoryImp")
public class UserServiceImp implements UserService {
    public User getUserByUsername(String username) {
        return new User();
    }

    public boolean checkPassword(String username) {
        return true;
    }
}
