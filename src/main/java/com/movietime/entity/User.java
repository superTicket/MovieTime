package com.movietime.entity;

import java.io.Serializable;
import java.util.Random;

<<<<<<< HEAD
public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    private long id;
    private String email;
    private String iconPath;
    private String firstName;
    private String lastName;
    private String password;
=======
public class User {
    public long id;
    public String email;
    public String iconPath;
    public String first_name;
    public String last_name;
    public String password;
>>>>>>> origin/master

    public User() {
        this.id = new Random().nextInt();
        this.email = "Alice";
        this.iconPath = "/images/user_icon/p1.png";
    }

    public User(String email, String iconPath) {
        this.id = new Random().nextInt();
        this.email = email;
        this.iconPath = iconPath;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIconPath() {
        return iconPath;
    }

    public void setIconPath(String iconPath) {
        this.iconPath = iconPath;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
