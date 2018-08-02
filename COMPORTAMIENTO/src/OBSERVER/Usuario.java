/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OBSERVER;

/**
 *
 * @author HectorChW
 */
public class Usuario implements IObserver{

    @Override
    public void notificacion(String mensaje) {
        System.out.println(mensaje);
    }

    
}
