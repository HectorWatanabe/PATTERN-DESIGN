/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DECORATOR;

/**
 *
 * @author Hector
 */
public class BlueGoku implements ISuperGoku{

    private SuperGoku sg;

    public BlueGoku(SuperGoku sg) {
        this.sg = sg;
    }
    
    @Override
    public int aumentarDaño() {
        return this.sg.aumentarDaño() * 2;
    }

    @Override
    public int aumentarVelocidad() {
        return this.sg.aumentarVelocidad() * 2;
    }
    
}
