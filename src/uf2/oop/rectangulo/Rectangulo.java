/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uf2.oop.rectangulo;

/**
 *
 * @author ismael trascastro
 * 
 * v1: inf izq
 * v2: inf dch
 * v3: sup dch
 * v4: sup izq
 */
public class Rectangulo {
    private Punto v1, v2, v3, v4;

    public Rectangulo(Punto v1, Punto v2, Punto v3, Punto v4) throws Exception {
        if (v1.distancia(v2) != v3.distancia(v4) || 
            v1.distancia(v4) != v2.distancia(v3))
        {
            throw new Exception("Rectángulo no valido");
        }
            
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
        this.v4 = v4;
    }
    
    public double area() {
        return this.v1.distancia(this.v2) * this.v1.distancia(v4);
    }
    
    public double perimetro() {
        return v1.distancia(v2) * 2 + v1.distancia(v4) * 2;
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "v1=" + v1 + ", v2=" + v2 + ", v3=" + v3 + ", "
                + "v4=" + v4 + '}';
    }
    
    public void desplazar(Punto p) {
        this.v1.desplazar(p);
        this.v2.desplazar(p);
        this.v3.desplazar(p);
        this.v4.desplazar(p);
    }
    
}
