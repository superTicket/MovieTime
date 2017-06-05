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
@RequestMapping(value = "/register")
public class RegisterPageController {
    @RequestMapping(method = RequestMethod.GET)
    public String get_register(Model model) {
        return "register";
    }

    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public String post_register(String first_name, String last_name, String email,
                               boolean newsletter, String password, String confirm_password, Model model) {
        return "first_name:" + first_name +
                "<br/>last_name:" + last_name +
                "<br/>Email:" + email +
                "<br/>Password:" + password +
                "<br/>confirm_password:" + confirm_password +
                "<br/>newsletter:" + (newsletter ? "true" : "false");
    }
}
