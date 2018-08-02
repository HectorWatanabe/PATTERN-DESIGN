/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ITERATOR;

/**
 *
 * @author HectorChW
 */
public class IteradorPalabras implements Iterator{

    private final Palabras palabras;
    private int position;

    public IteradorPalabras(Palabras palabras) {
        this.palabras = palabras;
    }
    
    @Override
    public String siguiente() {
        return this.palabras.getPalabras().get(this.position++);
    }

    @Override
    public boolean contieneSiguiente() {
        return this.position < this.palabras.getPalabras().size() &&
               this.palabras.getPalabras().get(this.position) != null;
    }
    
}
