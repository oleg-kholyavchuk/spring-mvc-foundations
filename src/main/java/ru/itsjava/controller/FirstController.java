package ru.itsjava.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@SuppressWarnings("all")
public class FirstController {

    @GetMapping("/")
    public String getFoeAll() {
        return "index";
    }
}

