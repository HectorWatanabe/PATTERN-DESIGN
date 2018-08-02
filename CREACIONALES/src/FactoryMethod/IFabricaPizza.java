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
public interface IFabricaPizza {
    
    public Pizza crearPizzaMediana(String masa);
    
    public Pizza crearPizzaGrande(String masa);
    
    public Pizza crearPizzaFamiliar(String masa);
    
}
