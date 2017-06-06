package com.movietime.Service;

import com.movietime.entity.Movie;

import java.util.List;

/**
 * Created by yangzy on 2017/6/6.
 */
public interface MovieService {
    Movie findOne(int id);

    List<Movie> findAll();

    List<Movie> getMovieByTag(String tag);

    List<String> getAllMovieTags();
}
