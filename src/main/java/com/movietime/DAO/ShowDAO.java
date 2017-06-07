package com.movietime.DAO;

import com.movietime.entity.Show;

import java.util.List;

/**
 * Created by yangzy on 2017/6/7.
 */
public interface ShowDAO {
    public Show findOne(int show_id);

    public List<Show> findAll();

    public List<Show> findShowByMovie(int movie_id);

    public Show findShowByTheaterName(String theater_name);
}
