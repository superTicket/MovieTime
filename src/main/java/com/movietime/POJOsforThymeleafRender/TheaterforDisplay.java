package com.movietime.POJOsforThymeleafRender;

import java.util.Random;

public class TheaterforDisplay {
    public int id;
    public String name;
    public String location;
    public String [] showList;

    public TheaterforDisplay () { this.id = new Random().nextInt(); }
}
