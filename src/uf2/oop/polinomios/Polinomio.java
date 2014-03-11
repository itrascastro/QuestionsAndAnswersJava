/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uf2.oop.polinomios;

/**
 *
 * @author ismael trascastro
 */
public class Polinomio 
{
    private int a;
    private int b;
    private int c;
    
    public Polinomio(int a, int b, int c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
    
    public Polinomio sumar(Polinomio p)
    {
        int a = this.a + p.getA();
        int b = this.b + p.getB();
        int c = this.c + p.getC();
        
        return new Polinomio(a, b, c); 
    }
    
    public void producto(int n)
    {
        this.a = this.a * n;
        this.b = this.b * n;
        this.c = this.c * n;
    }
    
    @Override
    public String toString()
    {
        return "Polinomio(" +
                this.a +
                ", " +
                this.b +
                ", " +
                this.c +
                ")";
    }

    public int resolver(int i) 
    {
        return this.a * (int) Math.pow(i, 2) + this.b * i + this.c;
    }
    
    public Raiz solucion()
    {
        double radicando = Math.pow(this.b, 2) - 4 * this.a * this.c;
        
        if (radicando < 0) {
            
            throw new UnsupportedOperationException("Not supported yet.");
        }
        
        double x0 = (-1 * this.b + Math.sqrt(radicando)) / 2 * this.a;
        double x1 = (-1 * this.b - Math.sqrt(radicando)) / 2 * this.a;
        
        return new Raiz(x0, x1);
    }
    
}
