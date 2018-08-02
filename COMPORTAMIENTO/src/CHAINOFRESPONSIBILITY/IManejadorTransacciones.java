/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CHAINOFRESPONSIBILITY;

/**
 *
 * @author Hector
 */
public interface IManejadorTransacciones {
    
    void setNextManejador(IManejadorTransacciones next);
    
    void ejecutarTransaccion(Transaction tras);
    
}
