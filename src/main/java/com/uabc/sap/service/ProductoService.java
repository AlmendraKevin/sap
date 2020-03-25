package com.uabc.sap.service;

import com.uabc.sap.model.ProductoEntity;
import com.uabc.sap.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoService {
    @Autowired
    ProductoRepository repositorio;

    public ProductoEntity crearProducto(ProductoEntity producto){
        if(producto.getIdProducto() ==null){
            producto = repositorio.save(producto);
            return producto;
        }else{
            return producto;
        }
    }
}
