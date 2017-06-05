package com.movietime.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
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
    @ResponseBody
    public String post_login(String email, String password, Model model) {
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(email, password);
        token.setRememberMe(true);
        String msg = null;

        try{
            subject.login(token);
        } catch (UnknownAccountException e) {
            msg = "用户名不存在";
        } catch (IncorrectCredentialsException e) {
            msg = "密码错误";
        } catch (AuthenticationException e) {
            msg = "其他错误：" + e.getMessage();
        }

        if (msg != null) {
            return msg;
        } else {
            return "Success";
        }
    }
}
