package com.movietime.service;

import com.movietime.entity.User;

public interface UserService {
    boolean isRegistered(String username);

<<<<<<< HEAD
    boolean checkPassword(String username, String passwordInput);
    boolean registerUser(String username, String password, String firstName, String lastName);
=======
    boolean checkPassword(String username, String password_input);
    boolean registerUser(String username, String password, String first_name, String last_name);
>>>>>>> origin/master

    User getUserInstance(String username, String password);
}
