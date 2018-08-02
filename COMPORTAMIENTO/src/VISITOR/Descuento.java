/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VISITOR;

/**
 *
 * @author HectorChW
 */
public class Descuento implements IMiVisitor{

    @Override
    public float visit(Manzana m) {
        return m.getPrecio() * 0.10f;
    }
    
}
