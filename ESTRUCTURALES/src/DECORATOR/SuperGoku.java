/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DECORATOR;

/**
 *
 * @author Hector
 */
public class SuperGoku implements ISuperGoku{

    private int daño;
    private int velocidad;

    public SuperGoku(int daño, int velocidad) {
        this.daño = daño;
        this.velocidad = velocidad;
    }
   
    @Override
    public int aumentarDaño() {
        return this.daño * 2;
    }

    @Override
    public int aumentarVelocidad() {
        return this.velocidad * 2;
    }
    
}
