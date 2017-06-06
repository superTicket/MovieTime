package com.movietime.controller;

import com.movietime.Service.MovieService;
import com.movietime.VO.BannerforDisplay;
import com.movietime.VO.MovieforDisplay;
import com.movietime.VO.PanelforDisplay;
import com.movietime.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import java.util.LinkedList;
import java.util.List;

@Controller
@RequestMapping(value = {"/", "/homepage", "/index", "/index.html"})
public class HomePageController {
    @Autowired
    MovieService ms;

    @RequestMapping(method = RequestMethod.GET)
    public String get_homepage(Model model, HttpSession session) {
        // 登录状态
        User user = (User) session.getAttribute("user");
        if (user != null) {
            model.addAttribute("username", user.name);
            model.addAttribute("usericon_path", user.iconPath);
        }

        List<MovieforDisplay> movieList = ms.findAll();
        // 从数据库获取banner，注入模型
        List<BannerforDisplay> bannerList = new LinkedList<BannerforDisplay>();
        List<MovieforDisplay> toBeDeleted = new LinkedList<MovieforDisplay>();
        for (int i = 0; i < movieList.size(); i++) {
            MovieforDisplay movie = movieList.get(i);
            if (movie.banner_path != null) {
                bannerList.add(new BannerforDisplay(movie.id, movie.name, movie.banner_path));
                toBeDeleted.add(movie);
            }
        }
        movieList.removeAll(toBeDeleted);

        if (bannerList.size() == 0) {
            System.err.println("WARNING: BannerList is empty");
        } else {
            model.addAttribute("bannerList", bannerList.toArray());
        }

        // 从数据库获取panel，注入模型. 每个panel与数据库中的tag对应
        List<String> tagList = ms.getAllMovieTags();
        PanelforDisplay[] panelList = new PanelforDisplay[tagList.size()];
        for (int i = 0; i < tagList.size(); i++) {
            // 将panel元数据注入模型
            String tag = tagList.get(i);
            panelList[i] = new PanelforDisplay();
            panelList[i].name = tag;
            if (i == 0) panelList[i].active = true;
            // 将与该panel相关的电影注入模型
            List<MovieforDisplay> relevantMovieList = ms.getMovieByTag(tag);
            List<MovieforDisplay> noPosterList = new LinkedList<MovieforDisplay>(); // 排除没有poster的电影
            for (MovieforDisplay movie : relevantMovieList) {
                if (movie.poster_path == null)
                    noPosterList.add(movie);
            }
            relevantMovieList.removeAll(noPosterList);
            panelList[i].movieList = relevantMovieList.toArray(new MovieforDisplay[1]);
        }
        model.addAttribute("panelList", panelList);
        return "homepage";
    }
}
