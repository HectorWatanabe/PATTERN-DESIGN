/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package STATE;

/**
 *
 * @author HectorChW
 */
public class AutoManejar implements IEstadoAuto{
    
    private final Auto auto;
    
    public AutoManejar(Auto auto){
        this.auto = auto;
    }

    @Override
    public void encender() {
        System.out.println("El auto ya está prendido");
    }

    @Override
    public void manejar() {
        System.out.println("El auto ya está en movimiento");
    }

    @Override
    public void apagar() {
        System.out.println("El auto está apagado");
        this.auto.setEstadoActual(auto.getAutoApagado());
    }
    
}