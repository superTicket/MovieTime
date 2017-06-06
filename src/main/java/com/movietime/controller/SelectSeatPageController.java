package com.movietime.controller;

import com.movietime.Service.MovieService;
import com.movietime.Service.ShowService;
import com.movietime.entity.Movie;
import com.movietime.entity.Show;
import com.movietime.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.Random;

/**
 * Created by yangzy on 2017/6/5.
 */
@Controller
@RequestMapping(value = "/selectSeat/cinema/{cinema_id}")
public class SelectSeatPageController {
    @Autowired
    MovieService ms;
    @Autowired
    ShowService ss;

    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public String try_bookTicket(String selectedList_JSON, Model model) {
        System.out.println(selectedList_JSON);

        int randNum = new Random().nextInt(3);
        return randNum % 2 == 0 ? "succeed" : "fail";
    }

    @RequestMapping(method = RequestMethod.GET)
    public String get_selectSeat(@PathVariable("cinema_id") int theater_id,
                                 @RequestParam("movie_id") int movie_id,
                                 @RequestParam("show_id") String show_name,
                                 Model model,
                                 HttpSession session) {
        System.out.println("GET@'/selectSeat': theater_id='" + theater_id + "', show='" + show_name + "'");

        Movie movie = ms.findOne(movie_id);
        Show show = ss.findShowByTheaterIDAndName(theater_id, show_name);
        // 检查参数正确性
        if (movie == null || show == null)
            return "redirect:/";

        // 登录状态
        User user = (User) session.getAttribute("user");
        if (user != null) {
            model.addAttribute("username", user.name);
            model.addAttribute("usericon_path", user.iconPath);
        }

        // 电影&场次信息
        model.addAttribute("movie_name", movie.name);
        model.addAttribute("show_time", show.name);
        model.addAttribute("price", show.price);
        model.addAttribute("seat_map", show.seat_map);
        model.addAttribute("sold_seat", show.sold_seat);

        return "selectSeat";
    }
}
