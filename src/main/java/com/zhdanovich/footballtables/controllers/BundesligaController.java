package com.zhdanovich.footballtables.controllers;

import com.zhdanovich.footballtables.services.BundesligaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BundesligaController {
    private final BundesligaService bundesligaService;

    @Autowired
    public BundesligaController(BundesligaService bundesligaService) {
        this.bundesligaService = bundesligaService;
    }

    @GetMapping("/bundesliga")
    public String showBundesliga(Model model) {
        model.addAttribute("teams", bundesligaService.bundesliga);
        return "pages/bundesliga";
    }
}
