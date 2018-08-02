/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryMethod;

/**
 *
 * @author Hector
 */
public class FabricaPizzaAmericana implements IFabricaPizza{

    @Override
    public Pizza crearPizzaMediana(String masa) {
        return new Pizza("Mediana", masa, 6, "Americana");
    }

    @Override
    public Pizza crearPizzaGrande(String masa) {
        return new Pizza("Grande", masa, 8, "Americana");
    }

    @Override
    public Pizza crearPizzaFamiliar(String masa) {
        return new Pizza("Familiar", masa, 10, "Americana");
    }

}
