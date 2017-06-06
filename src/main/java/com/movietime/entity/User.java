package com.movietime.entity;

/**
 * Created by yangzy on 2017/6/6.
 */
public class User {
    public String name;
    public String iconPath;

    public User() {
        this.name = "Alice";
        this.iconPath = "/images/user_icon/p1.png";
    }

    public User(String username, String iconPath) {
        this.name = username;
        this.iconPath = iconPath;
    }
}
