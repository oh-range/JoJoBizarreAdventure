package com.example.jojo.controller;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller

public class Controller {
    @GetMapping("/")
    public String entry(){
        return "entrypoint";
    }
    @GetMapping("/iwantgohome")
    public String iwantgohome() {
        return "iwantgohome";
    }

    @GetMapping("/usa")
    public String usa(){
        return "usa";
    }
    }
