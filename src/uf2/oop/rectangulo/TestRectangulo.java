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
public class TestRectangulo {
    public static Rectangulo r;
    
    public static void main(String[] args) throws Exception {
        try {
            TestRectangulo.r = new Rectangulo(
                new Punto(0,0),
                new Punto(4,0),
                new Punto(4,2),
                new Punto(0,2)
            );
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        System.out.println("Área: " + TestRectangulo.r.area());
        System.out.println("Perímetro: " + TestRectangulo.r.perimetro());
        System.out.println(TestRectangulo.r);
        TestRectangulo.r.desplazar(new Punto(5,0));
        System.out.println(TestRectangulo.r);
        TestRectangulo.r.escalar(2);
        System.out.println(TestRectangulo.r);
    }
}
