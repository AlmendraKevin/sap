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

    public Long getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Long idProducto) {
        this.idProducto = idProducto;
    }

    public Integer getIdRevista() {
        return idRevista;
    }

    public void setIdRevista(Integer idRevista) {
        this.idRevista = idRevista;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Byte[] getArchivo() {
        return archivo;
    }

    public void setArchivo(Byte[] archivo) {
        this.archivo = archivo;
    }

    public String getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(String idAutor) {
        this.idAutor = idAutor;
    }

    public String getApellidoPaternoAutor() {
        return apellidoPaternoAutor;
    }

    public void setApellidoPaternoAutor(String apellidoPaternoAutor) {
        this.apellidoPaternoAutor = apellidoPaternoAutor;
    }

    public String getApellidoMaternoAutor() {
        return apellidoMaternoAutor;
    }

    public void setApellidoMaternoAutor(String apellidoMaternoAutor) {
        this.apellidoMaternoAutor = apellidoMaternoAutor;
    }

    public String getGradoEstudioAutor() {
        return gradoEstudioAutor;
    }

    public void setGradoEstudioAutor(String gradoEstudioAutor) {
        this.gradoEstudioAutor = gradoEstudioAutor;
    }

    public String getNombreArticulo() {
        return nombreArticulo;
    }

    public void setNombreArticulo(String nombreArticulo) {
        this.nombreArticulo = nombreArticulo;
    }

    public String getISSNArticulo() {
        return ISSNArticulo;
    }

    public void setISSNArticulo(String ISSNArticulo) {
        this.ISSNArticulo = ISSNArticulo;
    }

    public boolean isIndizadoProducto() {
        return indizadoProducto;
    }

    public void setIndizadoProducto(boolean indizadoProducto) {
        this.indizadoProducto = indizadoProducto;
    }

    public boolean isArbitrajeProducto() {
        return arbitrajeProducto;
    }

    public void setArbitrajeProducto(boolean arbitrajeProducto) {
        this.arbitrajeProducto = arbitrajeProducto;
    }

    public String getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(String fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }
}
