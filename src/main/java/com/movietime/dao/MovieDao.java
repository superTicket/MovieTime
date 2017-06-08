package com.movietime.dao;

import com.movietime.entity.Movie;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MovieDao {

    public Movie create(Movie movie);
    public Movie update(Movie movie);
    public void delete(long id);
    public Movie findOne(long id);
    public List<Movie> findAll();
    List<Movie> findByTagName(@Param("tagName")String tagName);
}
