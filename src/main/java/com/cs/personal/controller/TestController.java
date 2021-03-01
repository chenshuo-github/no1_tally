package com.cs.personal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author cs
 * @date 2021/3/1 17:52
 */
@Controller
public class TestController {

    @GetMapping(value="/index")
    public String testF2F() {
        return "index";
    }
}
