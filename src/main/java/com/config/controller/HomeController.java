package com.config.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @GetMapping("/")
    public ModelAndView homePage() {
        ModelAndView mav = new ModelAndView("index");
        mav.addObject("User", "Huyen Trang");
        return mav;
    }
}
