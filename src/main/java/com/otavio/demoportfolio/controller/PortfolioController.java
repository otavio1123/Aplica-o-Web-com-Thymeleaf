package com.otavio.demoportfolio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PortfolioController {

    @GetMapping("/")
    public String inicio(Model model) {

        model.addAttribute("nome", "Otávio Ramos Ribeiro");
        model.addAttribute("curso", "Sistemas de Informação");

        return "index";
    }
}