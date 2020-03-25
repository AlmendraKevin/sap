package com.uabc.sap.model;

import javax.persistence.*;

@Entity
@Table(name = "AUTOR")
public class AutorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "nombre")
    private String nombreAutor;

    @Column(name = "apellido_paterno")
    private String apellidoPaternoAutor;

    @Column(name = "apellido_materno")
    private String apellidoMaternoAutor;

    @Column(name = "grado")
    private String gradoAutor;

}
