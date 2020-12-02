package com.microraindrop.demo.controller;

import com.microraindrop.demo.properties.Module;
import com.microraindrop.demo.properties.Modules;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class WebController {

    @Autowired
    private Modules modules;

    @RequestMapping("/Menulist")
    public String Menulist(Model model)
    {
        model.addAttribute("atarget", modules.getTarget());
        return "Menulist";
    }

    @GetMapping("/Modulelist")
    public String Modulelist(@RequestParam("moduleid")String moduleid,Model model)
    {
        Module module = modules.getModeuls().stream().filter(mods -> moduleid.equals(mods.getModuleId()) ).findFirst().orElse(null);
        model.addAttribute("module", module);
        return "Modulelist";
    }

    @GetMapping("/demoUrl")
    public ModelAndView monitor(Model model)
    {
        return new ModelAndView(new RedirectView(modules.getDemoUrl()));
    }


}
