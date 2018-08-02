/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PROXY;

/**
 *
 * @author Hector
 */
public class SeguridadMenosCostosa implements IServicio{

    private IServicio servicio;
    private final Usuario usuario;

    public SeguridadMenosCostosa(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public void leer() {
        this.obtenerServicio().leer();
    }

    @Override
    public void escribir() {
        if(usuario.getTipo() == 1){
            this.obtenerServicio().escribir();
        }else{
            throw new UnsupportedOperationException("El usuario no tiene permiso para escribrir");
        }
    }
    
    public IServicio obtenerServicio(){
        if(this.servicio == null){
            this.servicio = new Servicio();
        }
        return this.servicio;
    }
    
}
