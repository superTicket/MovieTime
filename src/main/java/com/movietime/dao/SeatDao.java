package com.movietime.dao;

import com.movietime.entity.Seat;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SeatDao {

    public Seat create(Seat seat);
    public boolean update(Seat seat);
    public boolean update(List<Seat> seatList); // 若其中一个Record update失败则返回false，并撤销其他Record的update
    public void delete(long id);
    public List<Seat> findByShowId(@Param("showId1")long showId);
    public Seat findByShowIdAndLoc(@Param("showId2")long showId, @Param("row")int row, @Param("col")int col);
}