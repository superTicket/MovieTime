package com.movietime.controller;

import com.movietime.service.MovieService;
import com.movietime.service.SeatService;
import com.movietime.service.ShowService;
import com.movietime.entity.Movie;
import com.movietime.entity.Seat;
import com.movietime.entity.Show;
import com.movietime.entity.User;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.LinkedList;
import java.util.List;

@Controller
@RequestMapping(value = "/selectSeat/cinema/{cinema_id}")
public class SelectSeatPageController {
    @Autowired
    MovieService ms;
    @Autowired
    ShowService ss;
    @Autowired
    SeatService ses;

    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public String post_selectSeat(int theater_id, String show_time, String selectedList_JSON, Model model) {
        System.out.println("POST@'/selectSeat': theaterId=" + theater_id + ", show_time=" + show_time + ", selectedList_JSON=");
        System.out.println(selectedList_JSON);
        JSONArray jsonArray = JSONArray.fromObject(selectedList_JSON);
        List<Seat> seatList = new LinkedList<Seat>();
        Show show = ss.findShowByTheaterIdAndTime(theater_id, show_time);
        for (int i = 0; i < jsonArray.size(); i++) {
            JSONObject jsonObject = JSONObject.fromObject(jsonArray.get(i));
            Seat seat = new Seat();
            seat.setRow((Integer) jsonObject.get("row"));
            seat.setCol((Integer) jsonObject.get("col"));
            seat.setBooked(true);
            seat.setShowId(show.getId());
            seatList.add(seat);
        }
        return ses.book(seatList) ? "succeed" : "failure";
    }

    @RequestMapping(method = RequestMethod.GET)
    public String get_selectSeat(@PathVariable("cinema_id") int theater_id,
                                 @RequestParam("movieId") int movie_id,
                                 @RequestParam("show") String show_name,
                                 Model model,
                                 HttpSession session) {
        System.out.println("GET@'/selectSeat': theaterId='" + theater_id + "', show='" + show_name + "'");

        Movie movie = ms.findOne(movie_id);
        Show show = ss.findShowByTheaterIdAndTime(theater_id, show_name);
        // 检查参数正确性
        if (movie == null || show == null)
            return "redirect:/";

        // 登录状态
        User user = (User) session.getAttribute("user");
        if (user != null) {
            model.addAttribute("username", user.getEmail());
            model.addAttribute("usericon_path", user.getIconPath());
        }

        // 电影&场次信息
        model.addAttribute("movie_name", movie.getName());
        model.addAttribute("show_time", show.getTime());
        model.addAttribute("price", show.getPrice());
        model.addAttribute("seat_map", ses.getSeatMapByShowId(show.getId()));
        model.addAttribute("sold_seat", ses.getSoldSeatByShowId(show.getId()));

        return "selectSeat";
    }
}
