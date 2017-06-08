package com.movietime.VO;

import com.movietime.entity.Show;

import java.util.Random;

public class ScheduleForDisplay {
    public int id;
    public String name;
    public String location;
    public Show[] showList;

    public ScheduleForDisplay() {
        this.id = new Random().nextInt();
    }
}
