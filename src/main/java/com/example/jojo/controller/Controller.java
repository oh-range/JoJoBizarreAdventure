package com.example.jojo.controller;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {
    //    @GetMapping("/")
//    public String leejaeyong() {
//        return "leejaeyong";
//    }

    @GetMapping("/")
    public String entry(){
        return "entrypoint";
    }

    @GetMapping("/profile")
    public String getProfile() {
        return "profile";
    }

    @GetMapping("/iwantgohome")
    public String iwantgohome() {
        return "iwantgohome";
    }
    @GetMapping("/myjob")
    public String myjob() {
        return "myjob";
    }
}
