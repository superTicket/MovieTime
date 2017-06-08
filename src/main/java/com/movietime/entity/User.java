package com.movietime.entity;

import java.util.Random;

public class User {
    public long id;
    public String email;
    public String iconPath;
    public String first_name;
    public String last_name;
    public String password;

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
}
