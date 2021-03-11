package com.cs.personal.controller;

import com.cs.personal.dto.ResultObject;
import com.cs.personal.dto.UserDto;
import com.cs.personal.service.UserService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.validation.Valid;

/**
 * @author cs
 * @date 2021/3/1 17:52
 */
@RestController
@RequestMapping(value = "/api/v1")
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping(value="/index")
    public ModelAndView testF2F() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        return modelAndView;
    }

    @GetMapping(value = "/getUser/{id}")
    public UserDto queryUserInfo(@PathVariable Integer id){
        return userService.queryUserInfo(id);
    }

    @PostMapping(value = "/addUser")
    public ResultObject addUserInfo(@Valid @RequestBody UserDto userDto) {
        return userService.addUserInfo(userDto);
    }
}
