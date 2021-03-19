package com.cs.personal.controller;

import com.cs.personal.dto.UserDto;
import com.cs.personal.service.LoginService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@RestController
@RequestMapping(value = "/api/v1")
public class LoginController {

    private Logger logger = LoggerFactory.getLogger(LoginController.class);

    @Resource
    private LoginService loginService;

    @GetMapping(value="/index")
    public ModelAndView toIndex() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        return modelAndView;
    }

    @GetMapping(value = "/toLogin")
    public ModelAndView toLogin() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/login/login");
        return modelAndView;
    }

    @PostMapping(value = "/login")
    public ModelAndView login(UserDto userDto) {
        boolean flag = loginService.login(userDto.getUserName(), userDto.getPassword());
        ModelAndView modelAndView = new ModelAndView();
        if (flag) {
            modelAndView.setViewName("/login/loginSuccess");
        } else {
            modelAndView.setViewName("/user/register");
        }
        return modelAndView;
    }

}
