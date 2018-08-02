/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ITERATOR;

import java.util.ArrayList;

/**
 *
 * @author HectorChW
 */
public class Palabras {
    
    private ArrayList<String> palabras;
    
    public Palabras(){
        this.palabras = new ArrayList<>();
    }
    
    public void addPalabra(String palabra){
        this.palabras.add(palabra);
    }
    
    public ArrayList<String> getPalabras(){
        return this.palabras;
    }
    
}
