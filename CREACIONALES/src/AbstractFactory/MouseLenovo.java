/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

/**
 *
 * @author Hector
 */
public class MouseLenovo implements IMouse{

    @Override
    public void hacerClickIzquierdo() {
        System.out.println("El mouse lenovo hace clic izquierdo");
    }

    @Override
    public void hacerClickDerecho() {
        System.out.println("El mouse lenovo hace clic derecho");
    }
    
}
