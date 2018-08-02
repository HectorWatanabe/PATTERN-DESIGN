/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder;

/**
 *
 * @author Hector
 */
public class Usuario {
    
    private String usuario;
    private String contrasena;
    
    private boolean extender;
    
    private String correo;
    private String direccion;

    private Usuario(String usuario, String contrasena) {
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.correo = "";
        this.direccion = "";
    }

    public static Usuario make(String usuario, String contrasena){
        return new Usuario(usuario, contrasena);
    }
    
    public BuilderUsuario setExtender(boolean extender) {
        
        if(!extender){
            throw new IllegalArgumentException("No es posible asignar falso");
        }
        
        this.extender = extender;
        
        return new BuilderUsuario(this);
        
    }
    
    public static class BuilderUsuario{
        private Usuario usuario;
        
        public BuilderUsuario(Usuario usuario){
            this.usuario = usuario;
        }
        
        public BuilderUsuario setCorreo(String correo) {
            this.usuario.correo = correo;
            return this;
        }

        public BuilderUsuario setDireccion(String direccion) {
            this.usuario.direccion = direccion;
            return this;
        }
        
        public Usuario build(){
            return usuario;
        }
        
    }

    @Override
    public String toString() {
        return this.usuario + " " + this.contrasena + " " + this.correo + " " + this.direccion;
    }
    
}
