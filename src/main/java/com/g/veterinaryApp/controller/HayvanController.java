package com.g.veterinaryApp.controller;

import com.g.veterinaryApp.repository.HayvanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HayvanController {
    @Autowired
    HayvanRepository hayvanRepository;

    @RequestMapping("/")
    public String Hayvan(Model model){
        model.addAttribute("hayvanlar",hayvanRepository.findAll());
        return "index";
    }
}
