package com.movietime.entity;

import java.util.Random;

public class User {
    public long id;
    public String name;
    public String iconPath;
    public String first_name;
    public String last_name;
    public String password;

    public User() {
        this.id = new Random().nextInt();
        this.name = "Alice";
        this.iconPath = "/images/user_icon/p1.png";
    }

    public User(String username, String iconPath) {
        this.id = new Random().nextInt();
        this.name = username;
        this.iconPath = iconPath;
    }
}
