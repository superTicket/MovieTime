package com.movietime.controller;

import com.movietime.Service.UserService;
import com.movietime.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

/**
 * Created by yangzy on 2017/6/5.
 */

@Controller
@RequestMapping(value = {"/login", "/login.html"})
public class LoginPageController {
    @Autowired
    private UserService us;

    @RequestMapping(method = RequestMethod.GET)
    public String get_login(Model model, HttpSession session) {
        if (session.getAttribute("name") != null)
            return "redirect:/";
        else
            return "login";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String post_login(String email, String password, Model model, HttpSession session) {
        if (us.isRegistered(email)) {
            if (us.checkPassword(email, password)) {
                User user = us.getUserInstance(email, password);
                session.setAttribute("user", user);
                return "redirect:/";
            }
        }

        return "redirect:/login";

    }
}
