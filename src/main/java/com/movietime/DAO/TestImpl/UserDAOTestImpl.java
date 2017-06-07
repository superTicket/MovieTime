package com.movietime.DAO.TestImpl;

import com.movietime.DAO.UserDAO;
import com.movietime.entity.User;
import org.springframework.stereotype.Component;

/**
 * Created by yangzy on 2017/6/7.
 */
@Component
public class UserDAOTestImpl implements UserDAO {
    public User findByUsername(String username) {
        return new User();
    }

    public User findOne(long id) {
        return null;
    }

    public boolean InsertOne(String username, String password, String first_name, String last_name) {
        return false;
    }

    public boolean UpdateOne(int id, User user) {
        return false;
    }

    public boolean UpdateOne(long id, User user) {
        return false;
    }
}
