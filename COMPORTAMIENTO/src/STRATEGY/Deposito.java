/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package STRATEGY;

/**
 *
 * @author HectorChW
 */
public class Deposito implements IEstrategia{

    @Override
    public float operacion(float balance, float cantidad) {
        return balance + cantidad;
    }
    
}
