/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OBSERVER;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 *
 * @author HectorChW
 */
public class Producto implements IObservable{
    
    private Set<IObserver> observers; 
    
    private int stock;

    public Producto(int stock) {
        this.stock = stock;
        this.observers = new LinkedHashSet<>();
    }

    public void venta(){
        this.setStock(this.stock - 1);
        System.out.println("Producto Vendido");
        this.notificarObservers();
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public void addObserver(IObserver o) {
        this.observers.add(o);
    }

    @Override
    public void notificarObservers() {
        for(IObserver observador : this.observers){
            observador.notificacion("El producto se vendió");
        }
    }
    
}
