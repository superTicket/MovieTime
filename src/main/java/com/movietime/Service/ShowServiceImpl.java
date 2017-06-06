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
        String[] seat_map = {  //Seating chart
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
        String[] sold_seat = {
                "1_2", "4_4", "4_5", "6_6", "6_7", "8_5", "8_6", "8_7", "8_8", "10_1", "10_2", "11_4"
        };
        show.name = "12:25";
        show.seat_map = seat_map;
        show.sold_seat = sold_seat;
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
        show[0].name = "08:32";
        show[1].theater_name = "King Street Theater";
        show[1].name = "11:33";
        show[2].theater_name = "StoneBraker Theater";
        show[2].name = "14:32";
        show[3].theater_name = "StoneBraker Theater";
        show[3].name = "21:50";
        showList.add(show[0]);
        showList.add(show[1]);
        showList.add(show[2]);
        showList.add(show[3]);

        return showList;
    }

    public Show findShowByTheaterIDAndName(int theater_id, String name) {
        return findOne(123);
    }
}
