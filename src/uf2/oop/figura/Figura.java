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
public class Figura 
{
    public static void main(String[] args)
    {
        Punto p1 = new Punto(2,2);
        
        Cuadrado c = new Cuadrado(3, p1);
        
        System.out.println(c.area());
    }
}
