/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FACADE;

/**
 *
 * @author Hector
 */
public class ConstruirCarro {
    
    private final CuerpoCarro cc;
    private final Ruedas r;

    public ConstruirCarro(CuerpoCarro cc, Ruedas r) {
        this.cc = cc;
        this.r = r;
    }
    
    public void armar(){
        System.out.println("Se armó el carro");
    }
    
}
