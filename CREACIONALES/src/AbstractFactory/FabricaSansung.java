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
public class FabricaSansung implements IFabricaInputs{

    @Override
    public IMouse fabricarMouse() {
        return new MouseSansung();
    }

    @Override
    public ITeclado fabricarTeclado() {
        return new TecladoSansung();
    }


    
}
