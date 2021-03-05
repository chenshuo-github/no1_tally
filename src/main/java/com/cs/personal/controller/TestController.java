package com.cs.personal.controller;

import com.cs.personal.dto.UserDto;
import com.cs.personal.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author cs
 * @date 2021/3/1 17:52
 */
@RestController
public class TestController {

    @Resource
    private UserService userService;

    @GetMapping(value="/index")
    public String testF2F() {
        return "index";
    }

    @GetMapping(value = "/getUser/{id}")
    public UserDto queryUserInfo(@PathVariable Integer id){
        return userService.queryUserInfo(id);
    }
}
