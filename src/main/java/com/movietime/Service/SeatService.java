package com.movietime.Service;

import com.movietime.entity.Seat;

import java.util.List;

/**
 * Created by yangzy on 2017/6/7.
 */
public interface SeatService {
    List<Seat> findByShowId(int id);

    String[] getSeatMapByShowId(int id);

    String[] getSoldSeatByShowId(int id);

    Seat findByShowIdAndLoc(int id, int row, int col);

    boolean book(Seat seat);
}
