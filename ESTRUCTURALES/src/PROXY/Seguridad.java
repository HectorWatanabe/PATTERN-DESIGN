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
public class Seguridad implements IServicio{

    private IServicio servicio;
    private Usuario usuario;

    public Seguridad(IServicio servicio, Usuario usuario) {
        this.servicio = servicio;
        this.usuario = usuario;
    }

    @Override
    public void leer() {
        this.servicio.leer();
    }

    @Override
    public void escribir() {
        if(usuario.getTipo() == 1){
            this.servicio.escribir();
        }else{
            throw new UnsupportedOperationException("El usuario no tiene permiso para escribrir");
        }
    }
    
}
