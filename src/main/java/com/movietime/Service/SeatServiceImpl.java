package com.movietime.Service;

import com.movietime.entity.Seat;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by yangzy on 2017/6/7.
 */
@Component
public class SeatServiceImpl implements SeatService {
    public List<Seat> findByShowId(int id) {
        return null;
    }

    public String[] getSeatMapByShowId(int id) {
        return new String[]{  //Seating chart
                "aaaaaaaaaa",
                "aaaaaaaaaa",
                "__________",
                "aaaaaaaa__",
                "aaaaaaaaaa",
                "aaaaaaaaaa",
                "aaaaaaaaaa",
                "aaaaaaaaaa",
                "aaaaaaaaaa",
                "__aaaaaa__",
                "__aaaaaa__"
        };
    }

    public String[] getSoldSeatByShowId(int id) {
        return new String[]{
                "1_2", "4_4", "4_5", "6_6", "6_7", "8_5", "8_6", "8_7", "8_8", "10_1", "10_2", "11_4"
        };
    }

    public Seat findByShowIdAndLoc(int id, int row, int col) {
        return null;
    }

    public boolean book(Seat seat) {
        return false;
    }
}
