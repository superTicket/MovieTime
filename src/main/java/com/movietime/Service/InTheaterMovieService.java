package com.movietime.Service;

import com.movietime.entity.Movie;

import java.util.List;

/**
 * Created by yangzy on 2017/6/6.
 */
public interface InTheaterMovieService {
    List<Movie> getAllMovies();

    List<Movie> getMovieByTag(String tag);

    Movie getMovieById(int id);

    List<String> getAllMovieTags();
}
