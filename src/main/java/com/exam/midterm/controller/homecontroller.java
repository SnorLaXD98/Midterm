package com.exam.midterm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class homecontroller {

    @GetMapping("/")
    public String index(){

        return "Index/index";
    }
}
