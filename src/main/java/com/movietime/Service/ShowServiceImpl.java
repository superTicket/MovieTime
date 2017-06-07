package com.movietime.Service;

import com.movietime.entity.Show;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by yangzy on 2017/6/6.
 */
@Component
public class ShowServiceImpl implements ShowService {
    public Show findOne(int show_id) {
        Show show = new Show();
        show.time = "12:25";
        return show;
    }

    public List<Show> findAll() {
        return null;
    }

    public List<Show> findShowByMovie(int movie_id) {
        List<Show> showList = new LinkedList<Show>();
        Show[] show = new Show[4];
        for (int i = 0; i < 4; i++)
            show[i] = new Show();
        show[0].theater_name = "King Street Theater";
        show[0].time = "08:32";
        show[1].theater_name = "King Street Theater";
        show[1].time = "11:33";
        show[2].theater_name = "StoneBraker Theater";
        show[2].time = "14:32";
        show[3].theater_name = "StoneBraker Theater";
        show[3].time = "21:50";
        showList.add(show[0]);
        showList.add(show[1]);
        showList.add(show[2]);
        showList.add(show[3]);

        return showList;
    }

    public Show findShowByTheaterIDAndtime(int theater_id, String time) {
        return findOne(123);
    }
}
