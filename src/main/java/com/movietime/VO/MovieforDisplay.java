package com.movietime.VO;


import java.util.Random;

// 这个类用于传输给模板
public class MovieforDisplay {
    public int id;
    public String name; // 注意：属性名在模板里有使用，不要轻易修改！
    public String poster_path;
    public String banner_path;
    public String release_date;
    public String duration;
    public String director;
    public String language;
    public String genre;
    public String cast_and_crew;

    public MovieforDisplay() {
        this.id = new Random().nextInt();
    }

    public MovieforDisplay(String name, String poster_path) {
        this.id = new Random().nextInt();
        this.name = name;
        this.poster_path = poster_path;
    }

    public MovieforDisplay(String name, String poster_path, String banner_path) {
        this(name, poster_path);
        this.banner_path = banner_path;
    }
}
