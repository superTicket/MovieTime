package com.movietime.Service;

import com.movietime.DAO.ShowDAO;
import com.movietime.entity.Show;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by yangzy on 2017/6/6.
 */
@Component
public class ShowServiceImpl implements ShowService {
    @Autowired
    ShowDAO showDAO;

    public Show findOne(long show_id) {
        return showDAO.findOne(show_id);
    }

    public List<Show> findAll() {
        return showDAO.findAll();
    }

    public List<Show> findShowByMovie(long movie_id) {
        return showDAO.findShowByMovie(movie_id);
    }

    public Show findShowByTheaterIDAndtime(long theater_id, String time) {
        List<Show> showList = showDAO.findShowByTheaterId(theater_id);
        if (showList == null) return null;
        for (int i = 0; i < showList.size(); i++) {
            Show show = showList.get(i);
            if (show.time.equals(time))
                return show;
        }
        return null;
    }
}
