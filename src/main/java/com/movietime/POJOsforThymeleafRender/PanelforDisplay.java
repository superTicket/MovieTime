package com.movietime.POJOsforThymeleafRender;

import com.movietime.entity.Movie;

import java.util.Random;

public class PanelforDisplay {
    public String name;
    public Movie[] movieList;
    public boolean active;
    public int id;

    public PanelforDisplay() {
        active = false;
        id = new Random().nextInt();
    }
}
