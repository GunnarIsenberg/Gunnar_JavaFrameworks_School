package com.example.demo.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class AboutController {
    @GetMapping("/mainscreen")
    public String showAboutUsPage(Model theModel){
        return "mainscreen";
    }
}
