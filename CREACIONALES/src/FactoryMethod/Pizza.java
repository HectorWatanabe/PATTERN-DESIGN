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
public class Pizza {

    private String tamano;
    private String masa;
    private String tipo;
    private int porciones;

    public Pizza(String tamano, String masa, int porciones, String tipo) {
        this.setMasa(masa);
        this.setPorciones(porciones);
        this.setTamano(tamano);
        this.setTipo(tipo);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getMasa() {
        return masa;
    }

    public void setMasa(String masa) {
        this.masa = masa;
    }

    public int getPorciones() {
        return porciones;
    }

    public void setPorciones(int porciones) {
        this.porciones = porciones;
    }

    @Override
    public String toString() {
        return "Pizza{" + "tamano=" + tamano + ", masa=" + masa + ", porciones=" + porciones + '}';
    }
}
