package com.movietime.service;

import com.movietime.dao.ShowDao;
import com.movietime.entity.Show;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShowServiceImpl implements ShowService {
    @Autowired
    ShowDao showDao;

    public Show findOne(long showId) {
        return showDao.findOne(showId);
    }

    public List<Show> findAll() {
        return showDao.findAll();
    }

    public List<Show> findByMovie(long movieId) {
        return showDao.findByMovie(movieId);
    }

    public Show findShowByTheaterIdAndTime(long theaterId, String time) {
        List<Show> showList = showDao.findByTheaterId(theaterId);
        if (showList == null) return null;
        for (int i = 0; i < showList.size(); i++) {
            Show show = showList.get(i);
            if (show.getTime().equals(time))
                return show;
        }
        return null;
    }
}
