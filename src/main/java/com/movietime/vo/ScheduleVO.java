package com.movietime.vo;

import java.util.Random;

public class ScheduleVO {
    public int id;
    public String name;
    public String location;
    public String [] showList;

    public ScheduleVO() {
        this.id = new Random().nextInt();
    }
}
