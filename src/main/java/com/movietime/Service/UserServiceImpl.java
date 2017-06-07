package com.movietime.Service;

import com.movietime.DAO.UserDAO;
import com.movietime.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by yangzy on 2017/6/6.
 */

@Component("UserRepositoryImp")
public class UserServiceImpl implements UserService {
    @Autowired
    UserDAO userDAO;

    public boolean isRegistered(String username) {
        return userDAO.findByUsername(username) != null;
    }

    public boolean checkPassword(String username, String password_input) {
        User user = userDAO.findByUsername(username);
        return user.password.equals(password_input);
    }

    public boolean registerUser(String username, String password, String first_name, String last_name) {
        return userDAO.InsertOne(username, password, first_name, last_name);
    }

    public User getUserInstance(String username, String password) {
        User user = userDAO.findByUsername(username);
        if (user.password.equals(password))
            return user;
        return null;
    }
}

