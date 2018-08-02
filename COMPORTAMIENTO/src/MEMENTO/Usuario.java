/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MEMENTO;

/**
 *
 * @author HectorChW
 */
public class Usuario {
    
    private String nombre;
    private int edad;

    public Usuario(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public Usuario getMemento(){
        return new Usuario(this.getNombre(),this.getEdad());
    }
    
    public void restarMemento(Usuario usuario){
        this.setNombre(usuario.getNombre());
        this.setEdad(usuario.getEdad());
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
}
