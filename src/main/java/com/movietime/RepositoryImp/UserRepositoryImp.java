package com.movietime.RepositoryImp;

import com.movietime.Repository.UserRepository;
import com.movietime.entity.User;
import org.springframework.stereotype.Component;

/**
 * Created by yangzy on 2017/6/6.
 */

@Component("UserRepositoryImp")
public class UserRepositoryImp implements UserRepository {
    public User getUserByUsername(String username) {
        return new User();
    }

    public boolean checkPassword(String username) {
        return true;
    }
}
