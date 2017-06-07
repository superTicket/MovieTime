package com.movietime.DAO;

import com.movietime.entity.Movie;

import java.util.List;

/**
 * Created by yangzy on 2017/6/7.
 */
public interface MovieDAO {
    Movie findOne(int id);

    List<Movie> findAll();

    List<Movie> getMovieByTag(String tag);

    List<String> getTags();
}
