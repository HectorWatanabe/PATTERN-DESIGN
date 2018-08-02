/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comportamiento;

import STRATEGY.Retiro;
import STRATEGY.Transaccion;
/**
 *
 * @author Hector
 */
public class COMPORTAMIENTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Transaccion trans = new Transaccion( new Retiro() );
        System.out.println(trans.ejecutarTransaccion(20, 10));
    }
    
}
