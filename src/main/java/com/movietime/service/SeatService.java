package com.movietime.service;

import com.movietime.entity.Seat;

import java.util.List;

public interface SeatService {
    List<Seat> findByShowId(long showId);

    String[] getSeatMapByShowId(long showId);

    String[] getSoldSeatByShowId(long showId);

    Seat findByShowIdAndLoc(long showId, int row, int col);

    boolean book(Seat seat);

    boolean book(List<Seat> seatList);

}
