/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CHAINOFRESPONSIBILITY;

/**
 *
 * @author Hector
 */
public class Transaction {
    
    private float cantidad;
    private float balance;
    private final TipoTransaccion tipo;

    public Transaction(float cantidad, float balance, TipoTransaccion tipo) {
        this.cantidad = cantidad;
        this.balance = balance;
        this.tipo = tipo;
    }

    public TipoTransaccion getTipo() {
        return tipo;
    }

    public float getCantidad() {
        return cantidad;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }
    
    
    
}
