package com.movietime.Service;

import com.movietime.entity.Movie;

import java.util.List;

/**
 * Created by yangzy on 2017/6/7.
 */
public interface TagService {
    List<Movie> getMovieByTag(String tag);

    List<String> getAllMovieTags();
}
