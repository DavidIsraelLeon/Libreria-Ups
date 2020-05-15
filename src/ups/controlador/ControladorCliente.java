/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.controlador;

import java.util.List;

import java.util.ArrayList;
import ups.modelo.Cliente;

/**
 *
 * @author dilgg
 */
public class ControladorCliente {
    
    
    private List<Cliente> clienteList;

    public ControladorCliente() {
        clienteList=new ArrayList<>();
    }
    
    public void crear(Cliente cliente){
    clienteList.add(cliente);
    }
    
    /*public Cliente buscar(int codigo){
    for (Cliente cliente : clienteList){
        if(cliente.getCodigo()==codigo){
            return cliente;
        }
    }
    return null;
    }
    
    
    
     public boolean eliminar(int codigo) {
        Cliente cliente = buscar(codigo);
        if (cliente != null) {
            return clienteList.remove(cliente);
        }
        return false;
    }
   
    
    public List<Cliente> getListCliente(){
        return clienteList;
    }*/
    
    
}
