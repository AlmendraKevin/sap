package com.uabc.sap.model;

import javax.persistence.*;
import java.io.File;

@Entity
@Table(name="PRODUCTO")
public class ProductoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProducto;


    @Column(name = "id_revista")
    private Integer idRevista;

    @Column(name = "id_usuario")
    private Integer idUsuario;

    @Column(name = "id_autor")
    private Integer idAutor;

    @Column(name = "archivo")
    private Byte[] archivo;

}
