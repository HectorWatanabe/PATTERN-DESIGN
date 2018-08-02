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
public class TecladoSansung implements ITeclado{

    @Override
    public void escribir() {
        System.out.println("El teclado sansung está escribiendo");
    }

    @Override
    public void capturaPantalla() {
        System.out.println("El teclado sansung está capturando la pantalla");
    }
    
}
