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
        return this.lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    public Punto getOrigen() {
        return this.origen;
    }

    public void setOrigen(Punto origen) {
        this.origen = origen;
    }

    @Override
    public String toString() {
        return "Cuadrado{" + "lado=" + lado + ", origen=" + origen + '}';
    }
    
    public boolean iguales(Cuadrado c)
    {
        return this.lado == c.getLado() && this.origen.iguales(c.getOrigen());
    }
    
    public void desplazar(Punto p)
    {
        this.origen.desplazar(p);
    }
    
    public double area()
    {
        return Math.pow(this.lado, 2);
    }
    
    public int perimetro()
    {
        return this.lado * 4;
    }
    
    public void escalar(int n)
    {
        this.lado = this.lado + n;
    }
    
}
