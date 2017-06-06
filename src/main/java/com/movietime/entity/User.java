package com.movietime.entity;

import java.util.Random;

public class User {
    public int id;
    public String name;
    public String iconPath;

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
