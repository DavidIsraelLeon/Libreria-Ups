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
public class Libro_Digital extends Libro{
    
      private double comision;

   public Libro_Digital() {

    }
    
   
    public Libro_Digital(int id, String titulo, String autor, String edicion, double precio, double comision) {
        super.setId(id);
        super.setTitulo(titulo);
        super.setAutor(autor);
        super.setEdicion(edicion);
        super.setPrecio(precio);
        this.comision = comision;
    }


    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }
    

    @Override
    protected double costoComision() {
        return ((super.getPrecio() * comision)/100);
    }
    
    
}
