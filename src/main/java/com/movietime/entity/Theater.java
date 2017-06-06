package com.movietime.entity;

import java.util.Random;

public class Theater {
    public int id;
    public String name;
    public String location;
    public String [] showList;

    public Theater() {
        this.id = new Random().nextInt();
    }
}
