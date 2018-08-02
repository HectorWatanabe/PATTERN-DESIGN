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
public class Hablar implements ICommand{

    private IUsuario user;
    
    public Hablar(IUsuario user){
        this.user = user;
    }
    
    @Override
    public void operacion() {
        this.user.hablar();
    }
    
}
