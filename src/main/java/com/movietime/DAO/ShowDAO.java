package com.movietime.DAO;

import com.movietime.entity.Show;

import java.util.List;

/**
 * Created by yangzy on 2017/6/7.
 */
public interface ShowDAO {
    public Show findOne(long show_id);

    public List<Show> findAll();

    public List<Show> findShowByMovie(long movie_id);

    public List<Show> findShowByTheaterId(long theater_id);
}
