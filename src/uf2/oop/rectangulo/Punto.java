/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uf2.oop.rectangulo;

/**
 *
 * @author ismael trascastro
 */
public class Punto {
    private int x;
    private int y;
    
    public Punto(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    
    public void setX(int x)
    {
        this.x = x;
    }
    
    public int getX()
    {
        return this.x;
    }
    
    public void setY(int y)
    {
        this.y = y;
    }
    
    public int getY()
    {
        return this.y;
    }
    
    @Override
    public String toString()
    {
        return "Punto{x=" + this.x + ", y=" + this.y + "}";
    }
    
    public boolean iguales(Punto p)
    {
        return this.x == p.getX() && this.y == p.getY();
    }
    
    public void desplazar(Punto p)
    {
        this.x = this.x + p.getX();
        this.y = this.y + p.getY();
    }
    
    public double distancia(Punto p)
    {
        int diffx = this.x - p.getX();
        int diffy = this.y - p.getY();
        
        double cuadrado1 = Math.pow(diffx, 2);
        double cuadrado2 = Math.pow(diffy, 2);
        
        return Math.sqrt(cuadrado1 + cuadrado2);
    }
}
