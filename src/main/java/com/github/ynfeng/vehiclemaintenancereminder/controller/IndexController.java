package com.github.ynfeng.vehiclemaintenancereminder.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/index")
    public String greeting() {
        return "index";
    }
}
