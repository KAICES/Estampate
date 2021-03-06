package co.edu.uniminuto.arqSw.proyectoEstampas.Hibernate;
// Generated 22/03/2018 11:33:32 PM by Hibernate Tools 3.6.0


import java.util.HashSet;
import java.util.Set;

/**
 * Estampas generated by hbm2java
 */
public class Estampas  implements java.io.Serializable {


     private int idEstampas;
     private String nombreEstampa;
     private String descripcion;
     private String tamanio;
     private Integer precio;
     private String ubicacion;
     private String autor;
     private Integer rating;
     private Integer popularidad;
     private String textoEstampa;
     private Set<FacturaVenta> facturaVentas = new HashSet<FacturaVenta>(0);

    public Estampas() {
    }

	
    public Estampas(int idEstampas) {
        this.idEstampas = idEstampas;
    }
    public Estampas(int idEstampas, String nombreEstampa, String descripcion, String tamanio, Integer precio, String ubicacion, String autor, Integer rating, Integer popularidad, String textoEstampa, Set<FacturaVenta> facturaVentas) {
       this.idEstampas = idEstampas;
       this.nombreEstampa = nombreEstampa;
       this.descripcion = descripcion;
       this.tamanio = tamanio;
       this.precio = precio;
       this.ubicacion = ubicacion;
       this.autor = autor;
       this.rating = rating;
       this.popularidad = popularidad;
       this.textoEstampa = textoEstampa;
       this.facturaVentas = facturaVentas;
    }
   
    public int getIdEstampas() {
        return this.idEstampas;
    }
    
    public void setIdEstampas(int idEstampas) {
        this.idEstampas = idEstampas;
    }
    public String getNombreEstampa() {
        return this.nombreEstampa;
    }
    
    public void setNombreEstampa(String nombreEstampa) {
        this.nombreEstampa = nombreEstampa;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getTamanio() {
        return this.tamanio;
    }
    
    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }
    public Integer getPrecio() {
        return this.precio;
    }
    
    public void setPrecio(Integer precio) {
        this.precio = precio;
    }
    public String getUbicacion() {
        return this.ubicacion;
    }
    
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    public String getAutor() {
        return this.autor;
    }
    
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public Integer getRating() {
        return this.rating;
    }
    
    public void setRating(Integer rating) {
        this.rating = rating;
    }
    public Integer getPopularidad() {
        return this.popularidad;
    }
    
    public void setPopularidad(Integer popularidad) {
        this.popularidad = popularidad;
    }
    public String getTextoEstampa() {
        return this.textoEstampa;
    }
    
    public void setTextoEstampa(String textoEstampa) {
        this.textoEstampa = textoEstampa;
    }
    public Set<FacturaVenta> getFacturaVentas() {
        return this.facturaVentas;
    }
    
    public void setFacturaVentas(Set<FacturaVenta> facturaVentas) {
        this.facturaVentas = facturaVentas;
    }




}


