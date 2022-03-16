package com.g.veterinaryApp.controller;

import com.g.veterinaryApp.repository.SahipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class SahipController {

    private final SahipRepository sahipRepository;

    public SahipController(SahipRepository sahipRepository){
        this.sahipRepository=sahipRepository;
    }
    @ModelAttribute("sahipler")
    public String Sahipler(Model model){
        model.addAttribute("sahipler",sahipRepository.findAll());
        return "index";
    }
}
