/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SimpleFactory;

/**
 *
 * @author Hector
 */
public class FabricaPizza {
    
    public Pizza crearPizzaHawaianaGrandeArtesanal(){
       return new Pizza("Grande", "Artesanal", 8, "Hawaiana");
    }
    
    public Pizza crearPizzaAmericanaMedianaPan(){
       return new Pizza("Mediana", "Pan", 6,"Americana");
    }
    
}
