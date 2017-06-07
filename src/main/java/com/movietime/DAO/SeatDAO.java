package com.movietime.DAO;

import com.movietime.entity.Seat;

import java.util.List;

/**
 * Created by yangzy on 2017/6/7.
 */
public interface SeatDAO {
    List<Seat> findByShowId(int id);

    Seat findByShowIdAndLoc(int id, int row, int col);

    boolean update(Seat seat);
}
