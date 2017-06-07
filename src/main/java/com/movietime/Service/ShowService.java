package com.movietime.Service;

import com.movietime.entity.Show;

import java.util.List;

/**
 * Created by yangzy on 2017/6/6.
 */
public interface ShowService {
    public Show findOne(long show_id);

    public List<Show> findAll();

    public List<Show> findShowByMovie(long movie_id);

    public Show findShowByTheaterIDAndtime(long theater_id, String name);
}
