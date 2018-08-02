/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package COMMAND;

/**
 *
 * @author HectorChW
 */
public class Usuario implements IUsuario{

    @Override
    public void hablar() {
        System.out.println("El usuario está hablando");
    }

    @Override
    public void saludar() {
        System.out.println("El usuario está saludando");
    }
    
    
    
}
