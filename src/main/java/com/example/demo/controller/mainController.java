package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class mainController {

    @GetMapping("/main")
    public String main(String fname, String lname){
        System.out.println(fname + ", " + lname);
        return "main";
    }
}
