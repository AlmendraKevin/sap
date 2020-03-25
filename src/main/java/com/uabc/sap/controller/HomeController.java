package com.uabc.sap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {

    @RequestMapping
    public String getHome(){
        return "login";
    }

    @RequestMapping("/index")
    public String getIndex(){
        return "index";
    }

}
