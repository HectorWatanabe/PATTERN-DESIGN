/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADAPTER;

/**
 *
 * @author Hector
 */
public class AdaptadorSQL implements IServicioSQL{

    private final IServicioNoSQL snsql;

    public AdaptadorSQL(IServicioNoSQL snsql) {
        this.snsql = snsql;
    }
    
    @Override
    public void conectar() {
        snsql.establecerConexion();
    }

    @Override
    public void runQuery() {
        snsql.runOtroQuery();
    }
    
}
