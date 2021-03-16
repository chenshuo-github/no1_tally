package com.cs.personal.controller;

import com.cs.personal.service.LoginService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@RestController
@RequestMapping(value = "/api/v1/login")
public class LoginController {

    @Resource
    private LoginService loginService;

    @GetMapping(value = "/toLogin/{userName}/{password}")
    public ModelAndView login(@PathVariable(value = "userName") String userName, @PathVariable(value = "password") String password) {
        boolean flag = loginService.login(userName, password);
        ModelAndView modelAndView = new ModelAndView();
        if (flag) {
            modelAndView.setViewName("loginSuccess");
        } else {
            modelAndView.setViewName("loginFail");
        }
        return modelAndView;
    }

}
