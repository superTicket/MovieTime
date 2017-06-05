package com.movietime.controller;

/**
 * Created by yangzy on 2017/6/5.
 */

import com.movietime.POJOsforThymeleafRender.BannerforDisplay;
import com.movietime.POJOsforThymeleafRender.MovieforDisplay;
import com.movietime.POJOsforThymeleafRender.PanelforDisplay;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value={"/", "/homepage", "/index", "/index.html"})
public class HomePageController {
    @RequestMapping(method = RequestMethod.GET)
    public String get_homepage(Model model) {
//        model.addAttribute("username", "Alice");
        model.addAttribute("usericon_path", "/images/user_icon/p1.png");
        model.addAttribute("bannerMovie_name", "Guardians of the Galaxy");
        model.addAttribute("banner_path", "/images/homepage/banner.jpg");

        BannerforDisplay[] bannerList = new BannerforDisplay[3];
        bannerList[0] = new BannerforDisplay("Guardians of the Galaxy", "/images/homepage/banner.jpg");
        bannerList[1] = new BannerforDisplay("Transformers 4", "/images/homepage/banner1.jpg");
        bannerList[2] = new BannerforDisplay("Game of Thrones", "/images/homepage/banner2.jpg");
        model.addAttribute("bannerList", bannerList);

        PanelforDisplay[] panelList = new PanelforDisplay[4];
        for (int i = 0; i < 4; i++) {
            panelList[i] = new PanelforDisplay();
        }

        panelList[0].name = "Featured";
        panelList[0].active = true;
        panelList[0].movieList = new MovieforDisplay[12];   // 注意：数组长度要刚刚好，模板实例化时会报错！
        panelList[0].movieList[0] = new MovieforDisplay("God’s Compass", "/images/homepage/featureMoviesImages/m15.jpg");
        panelList[0].movieList[1] = new MovieforDisplay("Bad Moms", "/images/homepage/featureMoviesImages/m2.jpg");
        panelList[0].movieList[2] = new MovieforDisplay("Jason Bourne", "/images/homepage/featureMoviesImages/m5.jpg");
        panelList[0].movieList[3] = new MovieforDisplay("Rezort", "/images/homepage/featureMoviesImages/m16.jpg");
        panelList[0].movieList[4] = new MovieforDisplay("Peter", "/images/homepage/featureMoviesImages/m17.jpg");
        panelList[0].movieList[5] = new MovieforDisplay("ISRA 88", "/images/homepage/featureMoviesImages/m18.jpg");
        panelList[0].movieList[6] = new MovieforDisplay("WAR DOGS", "/images/homepage/featureMoviesImages/m1.jpg");
        panelList[0].movieList[7] = new MovieforDisplay("The Other Side", "/images/homepage/featureMoviesImages/m14.jpg");
        panelList[0].movieList[8] = new MovieforDisplay("Civil War", "/images/homepage/featureMoviesImages/m19.jpg");
        panelList[0].movieList[9] = new MovieforDisplay("The Secret Life of Pets", "/images/homepage/featureMoviesImages/m20.jpg");
        panelList[0].movieList[10] = new MovieforDisplay("The Jungle Book", "/images/homepage/featureMoviesImages/m21.jpg");
        panelList[0].movieList[11] = new MovieforDisplay("Assassin's Creed 3", "/images/homepage/featureMoviesImages/m22.jpg");

        panelList[1].name = "Top viewed";
        panelList[1].active = false;
        panelList[1].movieList = new MovieforDisplay[2];
        panelList[1].movieList[0] = new MovieforDisplay("MovieforDisplay 3", "/images/homepage/featureMoviesImages/m3.jpg");
        panelList[1].movieList[1] = new MovieforDisplay("MovieforDisplay 4", "/images/homepage/featureMoviesImages/m4.jpg");

        panelList[2].name = "Top Rating";
        panelList[2].active = false;
        panelList[2].movieList = new MovieforDisplay[2];
        panelList[2].movieList[0] = new MovieforDisplay("MovieforDisplay 5", "/images/homepage/featureMoviesImages/m5.jpg");
        panelList[2].movieList[1] = new MovieforDisplay("MovieforDisplay 6", "/images/homepage/featureMoviesImages/m6.jpg");

        panelList[3].name = "Recently Added";
        panelList[3].active = false;
        panelList[3].movieList = new MovieforDisplay[2];
        panelList[3].movieList[0] = new MovieforDisplay("MovieforDisplay 7", "/images/homepage/featureMoviesImages/m7.jpg");
        panelList[3].movieList[1] = new MovieforDisplay("MovieforDisplay 8", "/images/homepage/featureMoviesImages/m8.jpg");

        model.addAttribute("panelList", panelList);

        return "homepage";
    }
}
