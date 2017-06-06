package com.movietime.controller;

import com.movietime.entity.User;
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
    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public String try_bookTicket(String selectedList_JSON, Model model) {
        System.out.println(selectedList_JSON);

        int randNum = new Random().nextInt(3);
        return randNum % 2 == 0 ? "succeed" : "fail";
    }

    @RequestMapping(method = RequestMethod.GET)
    public String get_selectSeat(@PathVariable("cinema_id") String cinema_id,
                                 @RequestParam("movie_id") String movie_id,
                                 @RequestParam("show_id") String show_id,
                                 Model model,
                                 HttpSession session) {
        System.out.println("POST@'/selectSeat': theater_name='" + cinema_id + "', show='" + show_id + "'");
        // 登录状态
        User user = (User) session.getAttribute("user");
        if (user != null) {
            model.addAttribute("username", user.name);
            model.addAttribute("usericon_path", user.iconPath);
        }

        model.addAttribute("movie_name", "Gingerclown");
        model.addAttribute("show_time", "April 3, 21:00");
        model.addAttribute("price", 20);

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
        String [] sold_seat = {
                "1_2", "4_4", "4_5", "6_6", "6_7", "8_5", "8_6", "8_7", "8_8", "10_1", "10_2", "11_4"
        };
        model.addAttribute("seat_map",seat_map);
        model.addAttribute("sold_seat", sold_seat);

        return "selectSeat";
    }
}
