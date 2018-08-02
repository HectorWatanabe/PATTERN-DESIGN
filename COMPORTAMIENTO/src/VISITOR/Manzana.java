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
public class Manzana implements IMiVisitable{
    
    public float getPrecio(){
        return 2f;
    }

    @Override
    public float aplicarDescuento(IMiVisitor visitor) {
        return visitor.visit(this);
    }
    
}
