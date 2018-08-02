/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FLYWEIGHT;

/**
 *
 * @author Hector
 */
public class Arma {
    
    private int balas;
    private TipoArma tipo;
    private int daño;

    public Arma(int balas, TipoArma tipo, int daño) {
        this.balas = balas;
        this.tipo = tipo;
        this.daño = daño;
    }

}
