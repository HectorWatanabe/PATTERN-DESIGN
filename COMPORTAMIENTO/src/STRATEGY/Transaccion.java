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
public class Transaccion {
    
    private final IEstrategia estrategia;
    
    public Transaccion(IEstrategia estrategia){
        this.estrategia = estrategia;
    }
    
    public float ejecutarTransaccion(float balance, float cantidad){
        return estrategia.operacion(balance, cantidad);
    }
    
}
