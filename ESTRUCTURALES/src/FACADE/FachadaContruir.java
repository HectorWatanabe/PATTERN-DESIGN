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
public class FachadaContruir {
    
    private ConstruirCarro coc;

    public FachadaContruir() {
        
        CuerpoCarro cc = new CuerpoCarro();
        Ruedas r = new Ruedas();
        
        this.coc = new ConstruirCarro(cc, r);
        
    }
    
    public void armarCarro(){
        this.coc.armar();
    }
    
}
