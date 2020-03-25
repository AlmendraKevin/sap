package com.uabc.sap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/p")
public class ProductoController {

    @RequestMapping
    public String getHome(Model model){

        return "index_prod";
    }

    @RequestMapping(path="/saveArticle",method = RequestMethod.POST)
    public String saveProducto(
        /** parametros para entidad producto */
    @RequestParam(value = "id_revista", required = true) Integer id_revista,
    @RequestParam(value = "id_usuario", required = true) String id_usuario,
    @RequestParam(value = "id_autor", required = true) String id_autor,
    @RequestParam(value = "id_articulo", required = true) String id_articulo,
    @RequestParam(value = "file", required = true) MultipartFile file){

        return "redirect:/p/";
    }    

}
