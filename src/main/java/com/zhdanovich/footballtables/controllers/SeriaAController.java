package com.zhdanovich.footballtables.controllers;

import com.zhdanovich.footballtables.services.SeriaAService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SeriaAController {
    private final SeriaAService seriaAService;

    @Autowired
    public SeriaAController(SeriaAService seriaAService) {
        this.seriaAService = seriaAService;
    }

    @GetMapping("/seriaA")
    public String showSeriaA(Model model) {
        model.addAttribute("teams", seriaAService.seriaA);
        return "pages/seriaA";
    }
}
