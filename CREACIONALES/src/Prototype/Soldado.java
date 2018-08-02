/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prototype;

/**
 *
 * @author Hector
 */
public class Soldado {
    
    private String nombre;
    private String arma;
    private int balas;
    private int vidas;

    public Soldado(String nombre, String arma, int balas, int vidas) {
        this.nombre = nombre;
        this.arma = arma;
        this.balas = balas;
        this.vidas = vidas;
    }
    
    public Soldado(Soldado soldado){
        this.setArma(soldado.getArma());
        this.setBalas(soldado.getBalas());
        this.setNombre(soldado.getNombre());
        this.setVidas(soldado.getVidas());
    }
    
    public Soldado clone(){
        return new Soldado(this.nombre, this.arma, this.balas, this.vidas);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    public int getBalas() {
        return balas;
    }

    public void setBalas(int balas) {
        this.balas = balas;
    }

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }

    @Override
    public String toString() {
        return "Soldado{" + "nombre=" + nombre + ", arma=" + arma + ", balas=" + balas + ", vidas=" + vidas + '}';
    }
    
    
}
