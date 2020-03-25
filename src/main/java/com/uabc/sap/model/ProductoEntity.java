package com.uabc.sap.model;

import javax.persistence.*;

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

    @Column(name = "archivo")
    private Byte[] archivo;

    @Column(name = "nombre_autor")
    private String idAutor;

    @Column(name = "apellido_paterno_autor")
    private String apellidoPaternoAutor;

    @Column(name = "apellido_materno_autor")
    private String apellidoMaternoAutor;

    @Column(name = "grado_estudio_autor")
    private String gradoEstudioAutor;

    @Column(name = "nombre_articulo")
    private String nombreArticulo;

    @Column(name = "issn_articulo")
    private String ISSNArticulo;

    @Column(name = "indizado")
    private boolean indizadoProducto;

    @Column(name = "arbitraje")
    private boolean arbitrajeProducto;

    @Column(name = "fecha_publicacion")
    private String fechaPublicacion;




}
