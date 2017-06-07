package com.movietime.DAO.TestImpl;

import com.movietime.DAO.SeatDAO;
import com.movietime.entity.Seat;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * Created by yangzy on 2017/6/7.
 */
@Component
public class SeatDAOTestImpl implements SeatDAO {
    public List<Seat> findByShowId(long id) {
        int row = 11, col = 10;
        List<Seat> seatList = new LinkedList<Seat>();
        for (int i = 0; i < row; i++)
            for (int j = 0; j < col; j++) {
                Seat seat = new Seat();
                seat.row = i + 1;
                seat.col = j + 1;
                String[] sold_seat = {
                        "1_2", "4_4", "4_5", "6_6", "6_7", "8_5", "8_6", "8_7", "8_8", "10_1", "10_2", "11_4"
                };
                String str = seat.row + "_" + seat.col;
                seat.isBooked = false;
                for (int k = 0; k < sold_seat.length; k++) {
                    if (str.equals(sold_seat[k]))
                        seat.isBooked = true;
                }
                seat.show_id = 1;
                seatList.add(seat);
            }
        return seatList;

//        return new String[]{  //Seating chart
//                "aaaaaaaaaa",
//                "aaaaaaaaaa",
//                "__________",
//                "aaaaaaaa__",
//                "aaaaaaaaaa",
//                "aaaaaaaaaa",
//                "aaaaaaaaaa",
//                "aaaaaaaaaa",
//                "aaaaaaaaaa",
//                "__aaaaaa__",
//                "__aaaaaa__"
//        };
    }

    public Seat findByShowIdAndLoc(long id, int row, int col) {
        Seat seat = new Seat();
        seat.isBooked = false;
        seat.show_id = 123;
        seat.col = 3;
        seat.row = 5;
        return seat;
    }

    public boolean update(Seat seat) {
        int randNum = new Random().nextInt(3);
        return randNum % 2 == 0;
    }

    public boolean update(List<Seat> seatList) {
        int randNum = new Random().nextInt(3);
        return randNum % 2 == 0;
    }
}
