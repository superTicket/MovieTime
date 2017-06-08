package com.movietime.service;

import com.movietime.entity.Show;

import java.util.List;

public interface ShowService {
<<<<<<< HEAD
=======
    public Show findOne(long show_id);
>>>>>>> origin/master

    public Show findOne(long showId);
    public List<Show> findAll();
<<<<<<< HEAD
    public List<Show> findByMovie(long movieId);
    public Show findShowByTheaterIdAndTime(long theaterId, String name);
=======

    public List<Show> findShowByMovie(long movie_id);

    public Show findShowByTheaterIDAndtime(long theater_id, String name);
>>>>>>> origin/master
}
