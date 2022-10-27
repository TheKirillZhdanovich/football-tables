package com.zhdanovich.footballtables.controllers;

import com.zhdanovich.footballtables.services.AplService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AplController {
    private final AplService aplService;

    @Autowired
    public AplController(AplService aplService) {
        this.aplService = aplService;
    }

    @GetMapping("/apl")
    public String showApl(Model model) {
        model.addAttribute("teams", aplService.apl);
        return "pages/apl";
    }
}
