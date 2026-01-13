package com.example.jojo.controller;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {

    @GetMapping("/profile")
    public String getProfile() {
        return "profile";
    }
}
