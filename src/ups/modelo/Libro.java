/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.modelo;

/**
 *
 * @author dilgg
 */
public abstract class Libro {
   private int id;
   private String titulo;
   private String autor;
   private String edicion;
   private double  precio;

   
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
     public double calcularPrecio(){
        return precio + costoComision();
    }

    @Override
    public String toString() {
        return "TITULO=" + titulo + ", AUTOR=" + autor + ", EDICION=" + edicion + ", PRECIO=" + calcularPrecio();
    }

      
    protected abstract double costoComision(); 
    
 
   
   
}