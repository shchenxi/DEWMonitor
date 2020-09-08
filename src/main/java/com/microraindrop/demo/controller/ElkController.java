package com.microraindrop.demo.controller;

import com.microraindrop.demo.properties.Modules;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ElkController {

    @Autowired
    private Modules modules;

    @GetMapping("/elkList")
    public String elkList(Model model)
    {
        model.addAttribute("elk", modules.getElk());
        return "logadv";
    }

    @GetMapping("/monitorList")
    public String monitorList(Model model)
    {
        model.addAttribute("elk", modules.getElk());
        return "elkhref";
    }

}
