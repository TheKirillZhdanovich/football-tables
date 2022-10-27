package com.zhdanovich.footballtables.controllers;

import com.zhdanovich.footballtables.services.RFLService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RFLController {
    private final RFLService rflService;

    @Autowired
    public RFLController(RFLService rflService) {
        this.rflService = rflService;
    }

    @GetMapping("/rfl")
    public String showRfl(Model model) {
        model.addAttribute("teams", rflService.rfl);
        return "pages/rfl";
    }
}
