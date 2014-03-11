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
public class Raiz 
{
    private double x0;
    private double x1;
    
    Raiz(double x0, double x1) {
        this.x0 = x0;
        this.x1 = x1;
    }

    public double getX0() {
        return x0;
    }

    public void setX0(double x0) {
        this.x0 = x0;
    }

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }
    
}
