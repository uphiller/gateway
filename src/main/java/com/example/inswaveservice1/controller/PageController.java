package com.example.inswaveservice1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/service1")
public class PageController {

    @GetMapping("/home")
    public String home(){
        return "index";
    }

    @GetMapping("/chat")
    public String chat(){
        return "chat";
    }
}
