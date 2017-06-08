package com.movietime.controller;

import com.movietime.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.Random;

/**
 * Created by yangzy on 2017/6/5.
 */
@Controller
@RequestMapping(value = "/payment")
public class PaymentPageController {
    @RequestMapping(method = RequestMethod.GET)
    public String get_payment(Model model, HttpSession session) {
        // 登录状态
        User user = (User) session.getAttribute("user");
        if (user != null) {
            model.addAttribute("username", user.name);
            model.addAttribute("usericon_path", user.iconPath);
        }

        model.addAttribute("movie_name", "Baahubali");
        model.addAttribute("theater_name", "Lorem Ipsum");
        model.addAttribute("theater_location", "Trivandrum, Trivandrum");
        model.addAttribute("show_date", "Sat, 8 Aug, 2015");
        model.addAttribute("show_time", "11:30am");
        model.addAttribute("seat", "Balkani-s12(a)");
        model.addAttribute("total", 150);
        model.addAttribute("extra_fees_note", "+ (Internet handling fees : RMB. 42.00 (incl. of Service Tax))");
        model.addAttribute("grand_total", 192);

        return "payment";
    }
    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public String post_payment(String email, String phone, String card_number,
                                     String cvv, String card_holder_name, String valid_thru, Model model) {
        System.out.println("\nemail:" + email + "\nphone:" + phone + "\ncard_number:" +
                card_number + "\ncvv:" + cvv + "\ncard_holder_name:" + card_holder_name +
                "\nvalid_thru:" + valid_thru);

        int randNum = new Random().nextInt(3);
        return randNum % 2 == 0 ? "succeed" : "fail";
    }
}
