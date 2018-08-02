/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MEDIATOR;

/**
 *
 * @author HectorChW
 */
public class Usuario {
    
    private final String nombre;

    public Usuario(String nombre) {
        this.nombre = nombre;
    }
    
    public void recibirMensaje(String mensaje){
        System.out.println(mensaje);
    }
    
    public String getName(){
        return this.nombre;
    }
    
}
