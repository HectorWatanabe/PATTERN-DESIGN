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
public class Deposito implements IManejadorTransacciones{

    private IManejadorTransacciones next;
    
    @Override
    public void setNextManejador(IManejadorTransacciones next) {
        this.next = next;
    }

    @Override
    public void ejecutarTransaccion(Transaction tras) {
        if(tras.getTipo() == TipoTransaccion.DEPOSITO){
            float cantidad = tras.getCantidad() + tras.getBalance();
            System.out.println("El nuevo balance después de un deposito es: " + cantidad);
        }else{
            this.next.ejecutarTransaccion(tras);
        }
        
    }
    
}
