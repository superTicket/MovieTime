package com.movietime.service;

import com.movietime.dao.UserDao;
import com.movietime.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;

    public boolean isRegistered(String username) {
        return userDao.findByUsername(username) != null;
    }

    public boolean checkPassword(String username, String password_input) {
        User user = userDao.findByUsername(username);
        return user.getPassword().equals(password_input);
    }

    public boolean registerUser(String username, String password, String first_name, String last_name) {
        return userDao.InsertOne(username, password, first_name, last_name);
    }

    public User getUserInstance(String username, String password) {
        User user = userDao.findByUsername(username);
        if (user.getPassword().equals(password))
            return user;
        return null;
    }
}
