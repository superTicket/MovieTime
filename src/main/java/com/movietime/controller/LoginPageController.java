package com.movietime.controller;

import com.movietime.Repository.UserRepository;
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
@RequestMapping(value={"/login", "/login.html"})
public class LoginPageController {
    @Autowired
    private UserRepository ur;

    @RequestMapping(method = RequestMethod.GET)
    public String get_login(Model model, HttpSession session) {
        if (session.getAttribute("name") != null)
            return "redirect:/";
        else
            return "login";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String post_login(String email, String password, Model model, HttpSession session) {
        User user = ur.getUserByUsername(email);
        if (user != null) {
            if (ur.checkPassword(email)) {
                session.setAttribute("user", user);
                return "redirect:/";
            }
        }

        return "redirect:/login";

    }
}
