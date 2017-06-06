package com.movietime.VO;

import java.util.Random;

public class TheaterForDisplay {
    public int id;
    public String name;
    public String location;
    public String [] showList;

    public TheaterForDisplay() {
        this.id = new Random().nextInt();
    }
}
