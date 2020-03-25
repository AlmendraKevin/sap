package com.uabc.sap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/p")
public class ProductoController {

    @RequestMapping
    public String getHome(Model model){

        return "index_prod";
    }

    @RequestMapping(path="/saveProducto",method = RequestMethod.POST)
    public String saveProducto(
    @RequestParam(value = "type", required = true) String type,
    @RequestParam(value = "race", required = true) String race,
    @RequestParam(value = "color", required = true) String color,
    @RequestParam(value = "fur", required = true) String fur,
    @RequestParam(value = "date", required = true) String date,
    @RequestParam(value = "vaccinated", required = false, defaultValue = "false") boolean vaccinated,
    @RequestParam(value = "adopted", required = false, defaultValue = "false") boolean adopted,
    @RequestParam(value = "responsable", required = false) String responsable,
    @RequestParam(value = "img", required = false) MultipartFile img){

        return "redirect:/p/";
    }    

}
