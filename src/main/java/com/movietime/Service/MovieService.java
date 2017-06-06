package com.movietime.Service;

import com.movietime.VO.MovieforDisplay;

import java.util.List;

/**
 * Created by yangzy on 2017/6/6.
 */
public interface MovieService {
    MovieforDisplay findOne(int id);

    List<MovieforDisplay> findAll();

    List<MovieforDisplay> getMovieByTag(String tag);

    List<String> getAllMovieTags();
}
