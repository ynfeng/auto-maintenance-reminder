package com.example.vehiclemaintenancereminder.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/index")
    public String greeting(Model model) {
        return "index";
    }
}
