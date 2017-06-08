package com.movietime.Service;

import com.movietime.entity.Seat;

import java.util.List;

/**
 * Created by yangzy on 2017/6/7.
 */
public interface SeatService {
    List<Seat> findByShowId(long id);

    String[] getSeatMapByShowId(long id);

    String[] getSoldSeatByShowId(long id);

    Seat findByShowIdAndLoc(long id, int row, int col);

    boolean book(Seat seat);

    boolean book(List<Seat> seatList);

}
