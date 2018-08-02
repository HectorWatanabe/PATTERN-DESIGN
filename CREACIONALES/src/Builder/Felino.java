/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder;

/**
 *
 * @author Hector
 */
public class Felino {
    
    private String nombre;
    
    private int edad;
    private double peso;

    private Felino(String nombre) {
        this.nombre = nombre;
        this.edad = 0;
        this.peso = 0.00;
    }
    
    public static Felino make(String nombre){
        return new Felino(nombre);
    }
    
    public Felino setEdad(int edad) {
        this.edad = edad;
        return this;
    }

    public Felino setPeso(double peso) {
        this.peso = peso;
        return this;
    }

    @Override
    public String toString() {
        return "Felino{" + "nombre=" + nombre + ", edad=" + edad + ", peso=" + peso + '}';
    }
    
    
    
}
