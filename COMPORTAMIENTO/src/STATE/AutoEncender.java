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
public class AutoEncender implements IEstadoAuto{
    
    private final Auto auto;
    
    public AutoEncender(Auto auto){
        this.auto = auto;
    }

    @Override
    public void encender() {
        System.out.println("El auto ya está encendido");
    }

    @Override
    public void manejar() {
        System.out.println("El auto está en movimiento");
        this.auto.setEstadoActual(auto.getAutoMovimiento());
    }

    @Override
    public void apagar() {
        System.out.println("El auto está en apagado");
        this.auto.setEstadoActual(auto.getAutoApagado());
    }
    
}
