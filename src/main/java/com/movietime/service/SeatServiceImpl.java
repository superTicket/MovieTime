package com.movietime.service;

import com.movietime.dao.SeatDao;
import com.movietime.dao.ShowDao;
import com.movietime.entity.Seat;
import com.movietime.entity.Show;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.util.LinkedList;
import java.util.List;

@Service
public class SeatServiceImpl implements SeatService {
    @Autowired
    SeatDao seatDao;
    @Autowired
    ShowDao showDAO;

    public String[] getSeatMap(long id) {
        Show show = showDAO.findOne(id);
        return show.getSeatMap().split("\\|");
        /*List<Seat> seatList = seatDao.findByShowId(id);
        int maxRow = Integer.MIN_VALUE;
        int maxCol = Integer.MIN_VALUE;
        for (Seat seat : seatList) {
            maxRow = maxRow >= seat.getRow() ? maxRow : seat.getRow();
            maxCol = maxCol >= seat.getCol() ? maxCol : seat.getCol();
        }
        StringBuffer[] seat_map_buf = new StringBuffer[maxRow];
        for (int i = 0; i < seat_map_buf.length; i++) {
            seat_map_buf[i] = new StringBuffer();
            for (int j = 0; j < maxCol; j++)
                seat_map_buf[i].append("_");
        }
        for (Seat seat : seatList)
            seat_map_buf[seat.getRow() - 1].setCharAt(seat.getCol() - 1, 'a');
        String[] seat_map = new String[maxRow];
        for (int i = 0; i < seat_map_buf.length; i++)
            seat_map[i] = seat_map_buf[i].toString();
        return seat_map;*/
        // TODO: 从seat_map字段获取，形式：aaa_a|aa_aa|
    }

    public String[] getSoldSeat(long id) {
        List<Seat> seatList = seatDao.findAllBooked(id);
        List<String> soldSeatList_str = new LinkedList<String>();
        for (Seat seat : seatList) {
            if (seat.isBooked())
                soldSeatList_str.add(seat.getRow() + "_" + seat.getCol());
        }
        String[] str = soldSeatList_str.toArray(new String[1]);
        return soldSeatList_str.toArray(new String[1]);
    }

    @Transactional(isolation = Isolation.SERIALIZABLE)
    public boolean book(List<Seat> seatList) {
        for (Seat seat : seatList) {
            if (seatDao.occupied(seat)) return false;
        }
        for (Seat seat : seatList) {
            seatDao.update(seat);
        }
        return true;
    }
}
