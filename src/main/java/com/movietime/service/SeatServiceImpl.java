package com.movietime.service;

import com.movietime.dao.SeatDao;
import com.movietime.entity.Seat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

@Service
public class SeatServiceImpl implements SeatService {
    @Autowired
    SeatDao seatDao;

    public List<Seat> findByShowId(long id) {
        return seatDao.findByShowId(id);
    }

    public String[] getSeatMapByShowId(long id) {
        List<Seat> seatList = seatDao.findByShowId(id);
        int maxRow = Integer.MIN_VALUE;
        int maxCol = Integer.MIN_VALUE;
        for (Seat seat : seatList) {
            maxRow = maxRow >= seat.row ? maxRow : seat.row;
            maxCol = maxCol >= seat.col ? maxCol : seat.col;
        }
        StringBuffer[] seat_map_buf = new StringBuffer[maxRow];
        for (int i = 0; i < seat_map_buf.length; i++) {
            seat_map_buf[i] = new StringBuffer();
            for (int j = 0; j < maxCol; j++)
                seat_map_buf[i].append("_");
        }
        for (Seat seat : seatList)
            seat_map_buf[seat.row - 1].setCharAt(seat.col - 1, 'a');
        String[] seat_map = new String[maxRow];
        for (int i = 0; i < seat_map_buf.length; i++)
            seat_map[i] = seat_map_buf[i].toString();
        return seat_map;
    }

    public String[] getSoldSeatByShowId(long id) {
        List<Seat> seatList = seatDao.findByShowId(id);
        List<String> soldSeatList_str = new LinkedList<String>();
        for (Seat seat : seatList) {
            if (seat.isBooked)
                soldSeatList_str.add(seat.row + "_" + seat.col);
        }
        String[] str = soldSeatList_str.toArray(new String[1]);
        return soldSeatList_str.toArray(new String[1]);
    }

    public Seat findByShowIdAndLoc(long id, int row, int col) {
        return seatDao.findByShowIdAndLoc(id, row, col);
    }

    public boolean book(Seat seat) {
        List<Seat> seatList = new LinkedList<Seat>();
        seatList.add(seat);
        ReentrantLock reentrantLock = new ReentrantLock(false);
        return book(seatList);
    }

    public boolean book(List<Seat> seatList) {
        for (Seat seat : seatList) {
            Seat seatInDB = seatDao.findByShowIdAndLoc(seat.showId, seat.row, seat.col);
            if (seatInDB.isBooked)
                return false;
        }

        return seatDao.update(seatList);
    }
}
