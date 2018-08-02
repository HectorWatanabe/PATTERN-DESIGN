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
public class Auto implements IEstadoAuto{

    private IEstadoAuto autoEncendido;
    private IEstadoAuto autoApagado;
    private IEstadoAuto autoMovimiento;
    
    private IEstadoAuto estadoActual;
    
    public Auto(){
        this.autoEncendido = new AutoEncender(this);
        this.autoApagado = new AutoApagar(this);
        this.autoMovimiento = new AutoManejar(this);
        
        this.estadoActual = this.autoEncendido;
    }
    
    
    @Override
    public void encender() {
        this.estadoActual.encender();
    }

    @Override
    public void manejar() {
        this.estadoActual.manejar();
    }

    @Override
    public void apagar() {
        this.estadoActual.apagar();
    }

    public IEstadoAuto getEstadoActual() {
        return estadoActual;
    }

    public void setEstadoActual(IEstadoAuto estadoActual) {
        this.estadoActual = estadoActual;
    }

    public IEstadoAuto getAutoEncendido() {
        return autoEncendido;
    }

    public void setAutoEncendido(IEstadoAuto autoEncendido) {
        this.autoEncendido = autoEncendido;
    }

    public IEstadoAuto getAutoApagado() {
        return autoApagado;
    }

    public void setAutoApagado(IEstadoAuto autoApagado) {
        this.autoApagado = autoApagado;
    }

    public IEstadoAuto getAutoMovimiento() {
        return autoMovimiento;
    }

    public void setAutoMovimiento(IEstadoAuto autoMovimiento) {
        this.autoMovimiento = autoMovimiento;
    }
    
}
