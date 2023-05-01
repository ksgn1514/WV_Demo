package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.vo.JoinVO;

@Controller
@RequestMapping("/")
public class mainController {
    @GetMapping("/")
    public String test() {
        return "main";
    }

    // @PostMapping("/main")
    // public String main(String fname, String lname) {
    // System.out.println(fname + ", " + lname);
    // return "main";
    // }
    @GetMapping("/test")
    public void test(JoinVO vo) {
        System.out.println(vo.getId());
    }
}
