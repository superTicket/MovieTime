package com.movietime.VO;

import java.util.Random;

public class PanelforDisplay {
    public String name;
    public MovieforDisplay[] movieList;
    public boolean active;
    public int id;

    public PanelforDisplay() {
        active = false;
        id = new Random().nextInt();
    }
}
