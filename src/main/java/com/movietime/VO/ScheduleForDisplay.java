package com.movietime.VO;

import java.util.Random;

public class ScheduleForDisplay {
    public int id;
    public String name;
    public String location;
    public String [] showList;

    public ScheduleForDisplay() {
        this.id = new Random().nextInt();
    }
}
