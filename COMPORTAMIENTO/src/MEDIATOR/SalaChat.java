/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MEDIATOR;

import java.util.HashMap;

/**
 *
 * @author HectorChW
 */
public class SalaChat {
    
    private final HashMap<String,Usuario> usuarios;
    
    public SalaChat(){
        this.usuarios = new HashMap<>();
    }
    
    public void addParticipante(Usuario usuario){
        this.usuarios.put(usuario.getName(), usuario);
    }
    
    public void enviarMensaje(Usuario remitente, Usuario receptor, String mensaje){
        if(this.usuarios.get(remitente.getName()) != null &&
                this.usuarios.get(receptor.getName()) != null){
            mensaje = "De :" + remitente.getName() + " mensaje :" + mensaje;
            receptor.recibirMensaje(mensaje);
        }
    }
    
}
