package com.example.jojo.controller;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {
    @GetMapping("/iwantgohome")
    public String iwantgohome() {
        return "iwantgohome";
    }
}
