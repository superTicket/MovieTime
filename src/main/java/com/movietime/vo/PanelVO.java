package com.movietime.vo;

import java.util.Random;

public class PanelVO {
    public String name;
    public MovieVO[] movieList;
    public boolean active;
    public int id;

    public PanelVO() {
        active = false;
        id = new Random().nextInt();
    }
}
