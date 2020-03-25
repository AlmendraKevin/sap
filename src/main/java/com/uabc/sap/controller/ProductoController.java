package com.uabc.sap.controller;

import java.io.IOException;
import java.util.Base64;

import com.uabc.sap.model.ProductoEntity;
import com.uabc.sap.service.ProductoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/p")
public class ProductoController {

    @Autowired
    ProductoService service;

    @RequestMapping
    public String getHome(Model model){

        return "index_prod";
    }

    @RequestMapping(path="/saveArticle",method = RequestMethod.POST)
    public String saveProducto(
        /** parametros para entidad producto */
    @RequestParam(value = "id_revista", required = true) Integer id_revista,
    @RequestParam(value = "id_usuario", required = true) String id_usuario,
    @RequestParam(value = "file", required = true) MultipartFile file,
    @RequestParam(value = "nombre_autor", required = true) String nombre_autor,
    @RequestParam(value = "apellido_paterno_autor", required = true) String apellido_paterno_autor,
    @RequestParam(value = "apellido_materno_autor", required = true) String apellido_materno_autor,
    @RequestParam(value = "grado_estudio_autor", required = true) String grado_estudio_autor,
    @RequestParam(value = "nombre_articulo", required = true) String nombre_articulo,
    @RequestParam(value = "issn_articulo", required = true) String issn_articulo,
    @RequestParam(value = "indizado", required = true) String indizado,
    @RequestParam(value = "arbitraje", required = true) String arbitraje,
    @RequestParam(value = "fecha_publicacion", required = true) String fecha_publicacion    
    ){
        ProductoEntity prod = new ProductoEntity();
        /** setters atribs */
        try {
            String archivo = Base64.getEncoder().encodeToString(file.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }

        service.crearProducto(prod);
        return "redirect:/p/";
    }    

}
