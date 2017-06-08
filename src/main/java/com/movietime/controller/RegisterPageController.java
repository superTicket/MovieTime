package com.movietime.controller;

import com.movietime.service.UserService;
import com.movietime.util.Validator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping(value = "/register")
public class RegisterPageController {
    @Autowired
    UserService us;

    @RequestMapping(method = RequestMethod.GET)
    public String get_register(Model model) {
        return "register";
    }

    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public String post_register(String first_name, String last_name, String email,
                                boolean newsletter, String password, String confirm_password, Model model, HttpSession session) {
        if (Validator.checkPassword(password) &&
                Validator.checkEmail(email) &&
                Validator.checkName(first_name) &&
                Validator.checkName(last_name) &&
                password.equals(confirm_password) &&
                us.isRegistered(email)) {
            us.registerUser(email, password, first_name, last_name);
            session.setAttribute("user", us.getUserInstance(email, password));
            return "redirect:/";
        }
        return "redirect:/register";
    }
}
