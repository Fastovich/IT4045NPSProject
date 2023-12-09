package com.npsproject.it4045npsproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {
    @GetMapping("/myplaces")
    public String myPlaces(Model model) {
        model.addAttribute("activePage", "my-places");
        return "myplaces";
    }

    @GetMapping("/search")
    public String search(Model model) {
        model.addAttribute("activePage", "search");
        return "search";
    }

    @GetMapping("/settings")
    public String settings(Model model) {
        model.addAttribute("activePage", "settings");
        return "settings";
    }
}
