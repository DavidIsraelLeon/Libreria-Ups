/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.modelo;

import java.util.List;

/**
 *
 * @author dilgg
 */
public class Compra {
    
    private int codigo;
    private List<Libro> libros;

    public Compra() {
    }

    public Compra(int codigo, List<Libro> libros) {
        this.codigo = codigo;
        this.libros = libros;
    }

    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }
    
}
