package com.movietime.dao;

import com.movietime.entity.Show;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ShowDao {

    public Show findOne(long showId);
    public List<Show> findAll();
    public List<Show> findByMovie(@Param("movieId")long movieId);
    public List<Show> findByTheaterId(@Param("theaterId")long theaterId);
}
