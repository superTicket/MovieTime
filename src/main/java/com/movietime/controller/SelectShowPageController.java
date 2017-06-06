package com.movietime.controller;

import com.movietime.Service.MovieService;
import com.movietime.Service.ShowService;
import com.movietime.VO.Converter;
import com.movietime.VO.ScheduleForDisplay;
import com.movietime.entity.Movie;
import com.movietime.entity.Show;
import com.movietime.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Created by yangzy on 2017/6/5.
 */
@Controller
@RequestMapping(value = {"/selectShow", "/selectShow.html"})
public class SelectShowPageController {
    @Autowired
    MovieService ms;

    @Autowired
    ShowService ss;

    @RequestMapping(method = RequestMethod.GET)
    public String get_selectShow(@RequestParam("movie_id") int movie_id,
                                 Model model,
                                 HttpSession session) {
        System.out.println("GET@'/selectShow': movie_id='" + movie_id + "'");

        // 登录状态
        User user = (User) session.getAttribute("user");
        if (user != null) {
            model.addAttribute("username", user.name);
            model.addAttribute("usericon_path", user.iconPath);
        }

        // 电影信息
        Movie movie = ms.findOne(movie_id);
        model.addAttribute("movie", Converter.convert(movie));

        // 场次信息
        List<Show> showList = ss.findShowByMovie(movie_id);
        Map<String, List<Show>> theaterMap = new HashMap<String, List<Show>>();
        for (Show show : showList) {
            List<Show> showInThisTheater = theaterMap.get(show.theater_name);
            if (showInThisTheater == null)
                showInThisTheater = new LinkedList<Show>();
            showInThisTheater.add(show);
            theaterMap.put(show.theater_name, showInThisTheater);
        }
        List<ScheduleForDisplay> scheduleList = new LinkedList<ScheduleForDisplay>();
        for (String theater : theaterMap.keySet()) {
            List<Show> showInThisTheaterList = theaterMap.get(theater);
            ScheduleForDisplay schedule = new ScheduleForDisplay();
            schedule.name = theater;
            schedule.location = "";
            schedule.showList = new String[showInThisTheaterList.size()];
            for (int i = 0; i < showInThisTheaterList.size(); i++)
                schedule.showList[i] = showInThisTheaterList.get(i).name;
            scheduleList.add(schedule);
        }

        model.addAttribute("theaterList", scheduleList.toArray());

        return "selectShow";
    }
}
