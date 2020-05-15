/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.modelo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author dilgg
 */
public class Cliente {
    
    private String cedula;
    private String nombre;
    private double credito;
    private List<Compra> compra;

    public Cliente() {
    }

    public Cliente(String cedula, String nombre, double credito) {
        
        this.cedula = cedula;
        this.nombre = nombre;
        this.credito = credito;
        this.compra = new ArrayList<>();
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }

    public List<Compra> getCompra() {
        return compra;
    }

    public void setCompra(List<Compra> compra) {
        this.compra = compra;
    }
    
    public void debitaCredito(double valorAgregado) {
        this.credito -= valorAgregado;
    }
    
    public void recargaCredito(double valorAgregado) {
        this.credito += valorAgregado;
    }
    
    public void comprar(Compra compra) {
        this.compra.add(compra);
        Iterator<Libro> libros = compra.getLibros().iterator();
        while(libros.hasNext()) {
            debitaCredito(libros.next().calcularPrecio());
        }
    }
    
}
