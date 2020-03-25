package com.uabc.sap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/p")
public class ProductoController {

    @RequestMapping
    public String getHome(Model model){

        return "index_prod";
    }

    @RequestMapping("/saveProducto")
    public String saveProducto(){

        return "redirect:/p/";
    }    

}
