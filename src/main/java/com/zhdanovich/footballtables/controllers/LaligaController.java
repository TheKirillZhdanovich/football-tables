package com.zhdanovich.footballtables.controllers;

import com.zhdanovich.footballtables.services.LaligaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LaligaController {
    private final LaligaService laligaService;

    @Autowired
    public LaligaController(LaligaService laligaService) {
        this.laligaService = laligaService;
    }

    @GetMapping("/laliga")
    public String showLaliga(Model model) {
        model.addAttribute("teams", laligaService.laliga);
        return "pages/laliga";
    }
}
