package com.movietime.DAO;

import java.util.List;

/**
 * Created by yangzy on 2017/6/7.
 */
public interface TagDAO {
    public List<String> getAllMovieTags();

    public List<Integer> findMovieIdByTagName(String tag_name);
}
