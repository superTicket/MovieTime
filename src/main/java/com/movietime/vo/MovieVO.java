package com.movietime.vo;


import java.util.Random;

public class MovieVO {
    public int id;
    public String name;
    public String posterPath;
    public String bannerPath;
    public String releaseDate;
    public String duration;
    public String director;
    public String language;
    public String genre;
    public String castAndCrew;

    public MovieVO() {
        this.id = new Random().nextInt();
    }

    public MovieVO(String name, String posterPath) {
        this.id = new Random().nextInt();
        this.name = name;
        this.posterPath = posterPath;
    }

    public MovieVO(String name, String posterPath, String bannerPath) {
        this(name, posterPath);
        this.bannerPath = bannerPath;
    }
}
