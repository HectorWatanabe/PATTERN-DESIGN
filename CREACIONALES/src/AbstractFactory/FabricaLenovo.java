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
public class FabricaLenovo implements IFabricaInputs{

    @Override
    public IMouse fabricarMouse() {
        return new MouseLenovo();
    }

    @Override
    public ITeclado fabricarTeclado() {
        return new TecladoLenovo();
    }
    
}
