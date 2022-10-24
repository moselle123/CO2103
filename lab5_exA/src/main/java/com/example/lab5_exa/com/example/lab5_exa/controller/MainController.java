package com.example.lab5_exa.com.example.lab5_exa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/greet")
public class MainController {
    public String greetWorld(Model model) {
        model.addAttribute("name", "World");
        return "greeting";
    }
}