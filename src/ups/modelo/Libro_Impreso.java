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
public class Libro_Impreso extends Libro{
    
    public Libro_Impreso() {

    }

    public Libro_Impreso(int id, String titulo, String autor, String edicion, double precio) {
        super.setId(id);
        super.setTitulo(titulo);
        super.setAutor(autor);
        super.setEdicion(edicion);
        super.setPrecio(precio);
    }
    
 

    @Override
    protected double costoComision() {
        return (((super.getPrecio()*2)/100)+20);
        
    }

    
    
}
