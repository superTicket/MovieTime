package com.movietime.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by yangzy on 2017/6/5.
 */

@Controller
@RequestMapping(value={"/login", "/login.html"})
public class LoginPageController {
    @RequestMapping(method = RequestMethod.GET)
    public String get_login(Model model) {
        return "login";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String post_login(String email, String password, Model model) {
        System.out.println("Email:" + email + "\n" + "Password" + password + "\n");
        return "Email:" + email + "<br/>" + "Password:" + password + "<br/>";
    }
}
