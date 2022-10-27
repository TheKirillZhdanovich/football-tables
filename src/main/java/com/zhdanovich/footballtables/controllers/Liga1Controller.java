package com.zhdanovich.footballtables.controllers;

import com.zhdanovich.footballtables.services.Liga1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Liga1Controller {
    private final Liga1Service liga1Service;

    @Autowired
    public Liga1Controller(Liga1Service liga1Service) {
        this.liga1Service = liga1Service;
    }

    @GetMapping("/liga1")
    public String showLiga1(Model model) {
        model.addAttribute("teams", liga1Service.liga1);
        return "pages/liga1";
    }
}
