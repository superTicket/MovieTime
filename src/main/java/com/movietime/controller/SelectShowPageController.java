package com.movietime.controller;

import com.movietime.VO.MovieforDisplay;
import com.movietime.VO.TheaterForDisplay;
import com.movietime.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

/**
 * Created by yangzy on 2017/6/5.
 */
@Controller
@RequestMapping(value = {"/selectShow", "/selectShow.html"})
public class SelectShowPageController {
    @RequestMapping(method = RequestMethod.GET)
    public String get_selectShow(@RequestParam("movieName") String movieName,
                                 Model model,
                                 HttpSession session) {
        System.out.println("GET@'/selectShow': movieName='" + movieName + "'");

        // 登录状态
        User user = (User) session.getAttribute("user");
        if (user != null) {
            model.addAttribute("username", user.name);
            model.addAttribute("usericon_path", user.iconPath);
        }

        MovieforDisplay movie = new MovieforDisplay();
        movie.poster_path = "/images/selectShow/movie-show.jpg";
        movie.release_date = "Jul 10, 2015";
        movie.duration = "2 hrs 30 mins";
        movie.director = "S.S. Rajamouli.";
        movie.language = "Telugu";
        movie.genre = "Action, Romance";
        movie.cast_and_crew = "Prabhas as Amarendra Baahubali and Shivudu, Rana Daggubati as Bhallala Deva in Telugu and Palvaalthevan in Tamil, Anushka Shetty as Devasena, Tamannaah as Avantika, Sathyaraj as Kattappa, Nassar as Bijjala Deva in Telugu and Pingala Devan in Tamil, Ramya Krishnan as Sivagami";
        model.addAttribute("movie", movie);

        TheaterForDisplay[] theaterList = new TheaterForDisplay[2];
        theaterList[0] = new TheaterForDisplay();
        theaterList[0].name = "King Street TheaterForDisplay";
        theaterList[0].location = "123 Street";
        theaterList[0].showList = new String[2];
        theaterList[0].showList[0] = "08:32";
        theaterList[0].showList[1] = "11:33";

        theaterList[1] = new TheaterForDisplay();
        theaterList[1].name = "StoneBraker TheaterForDisplay";
        theaterList[1].location = "666 Street";
        theaterList[1].showList = new String[2];
        theaterList[1].showList[0] = "14:32";
        theaterList[1].showList[1] = "21:50";

        model.addAttribute("theaterList", theaterList);

        return "selectShow";
    }
}
