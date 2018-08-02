/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FLYWEIGHT;

import java.util.HashMap;

/**
 *
 * @author Hector
 */
public class ArmaRecursos {
    
    private final HashMap<TipoArma, Arma> armamento;

    public ArmaRecursos() {
        this.armamento = new HashMap<>();
    }
    
    public Arma obtenerArma(TipoArma tipo){
        Arma arma = (Arma)this.armamento.get(tipo);
        
        if(arma == null){
            arma = new Arma(20, tipo, 20);
            this.armamento.put(tipo, arma);
        }
        
        return arma;
        
    }
    
}
