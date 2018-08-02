/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PROXY;

/**
 *
 * @author Hector
 */
public class Servicio implements IServicio{

    public Servicio() {
    }

    @Override
    public void leer() {
        System.out.println("El servicio lee");
    }

    @Override
    public void escribir() {
        System.out.println("El servicio escribe");
    }
    
}
