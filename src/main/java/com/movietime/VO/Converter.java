package com.movietime.VO;

import com.movietime.entity.Movie;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by yangzy on 2017/6/6.
 */
public class Converter {
    public static MovieforDisplay convert(Movie movie) {
        MovieforDisplay movieforDisplay = new MovieforDisplay();
        movieforDisplay.banner_path = movie.banner_path;
        movieforDisplay.cast_and_crew = movie.cast_and_crew;
        movieforDisplay.director = movie.director;
        movieforDisplay.duration = movie.duration;
        movieforDisplay.genre = movie.genre;
        movieforDisplay.id = (int) movie.id;
        movieforDisplay.language = movie.language;
        movieforDisplay.name = movie.name;
        movieforDisplay.poster_path = movie.poster_path;
        movieforDisplay.release_date = movie.release_date;
        return movieforDisplay;
    }

    public static List<MovieforDisplay> convert(List<Movie> movie) {
        List<MovieforDisplay> mfd = new LinkedList<MovieforDisplay>();
        for (Movie aMovie : movie) mfd.add(Converter.convert(aMovie));
        return mfd;
    }
}
