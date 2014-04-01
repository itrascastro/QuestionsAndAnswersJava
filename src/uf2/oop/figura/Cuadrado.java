/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uf2.oop.figura;

/**
 *
 * @author ismael trascastro
 */
public class Cuadrado 
{
    private int lado;
    private Punto origen;
    
    public Cuadrado(int lado, Punto origen)
    {
        this.lado   = lado;
        this.origen = origen;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    public Punto getOrigen() {
        return origen;
    }

    public void setOrigen(Punto origen) {
        this.origen = origen;
    }

    @Override
    public String toString() {
        return "Cuadrado{" + "lado=" + lado + ", origen=" + origen + '}';
    }
    
}
