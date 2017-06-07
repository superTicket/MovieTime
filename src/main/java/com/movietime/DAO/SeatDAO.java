package com.movietime.DAO;

import com.movietime.entity.Seat;

import java.util.List;

/**
 * Created by yangzy on 2017/6/7.
 */
public interface SeatDAO {
    List<Seat> findByShowId(long id);

    Seat findByShowIdAndLoc(long id, int row, int col);

    boolean update(Seat seat);

    boolean update(List<Seat> seatList); // 若其中一个Record update失败则返回false，并撤销其他Record的update
}
