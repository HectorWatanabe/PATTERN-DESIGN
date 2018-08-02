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
public class Retiro implements IManejadorTransacciones{

    private IManejadorTransacciones next;
    
    @Override
    public void setNextManejador(IManejadorTransacciones next) {
        this.next = next;
    }

    @Override
    public void ejecutarTransaccion(Transaction tras) {
        if(tras.getTipo() == TipoTransaccion.RETIRO){
            float cantidad = tras.getCantidad() - tras.getBalance();
            System.out.println("El nuevo balance después de un retiro es: " + cantidad);
        }else{
            System.out.println("Operación no valida");
        }
        
    }
    
}
