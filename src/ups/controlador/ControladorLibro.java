/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.controlador;

import java.util.ArrayList;
import java.util.List;
import ups.modelo.Libro;


/**
 *
 * @author dilgg
 */
public class ControladorLibro {
    private List<Libro> libroList;

    public ControladorLibro() {
        libroList=new ArrayList<>();
    }
    public void crear(Libro libro){
    libroList.add(libro);
    }
    
    public Libro buscar(int id){
    for (Libro libro: libroList){
        if(libro.getId()==id){
            return libro;
        }
    }
     return null;
     }
    
     public boolean eliminar(int id) {
        Libro libro = buscar(id);
        if (libro != null) {
            return libroList.remove(libro);
        }
        return false;
    }
   
    
    
    public List<Libro> getListLibro(){
        return libroList;
    }
    
    
    
    
}
