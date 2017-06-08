package com.movietime.DAO.TestImpl;

import com.movietime.DAO.SeatDAO;
import com.movietime.entity.Seat;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by yangzy on 2017/6/7.
 */
@Component
public class SeatDAOTestImpl implements SeatDAO {
    public List<Seat> findByShowId(long id) {
        return null;
    }

    public Seat findByShowIdAndLoc(long id, int row, int col) {
        return null;
    }

    public boolean update(Seat seat) {
        return false;
    }
}
