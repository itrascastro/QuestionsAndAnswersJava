/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uf2.oop.los3cerditos;

/**
 *
 * @author ismael trascastro
 */
public class Cerdito 
{
    private String nombre;
    private Casa c;

    Cerdito(String nombre) 
    {
        this.nombre = nombre;
    }
    
    public Casa construir(String material)
    {
        this.c = new Casa(material);
        
        return c;
    }
    
    public void mover(Casa c)
    {
        this.c = c;
    }
    
    @Override
    public String toString()
    {
        String cad = "Cerdito[" + 
                this.nombre + 
                ", " + 
                this.c.toString() +
                "]";
        
        return cad;
    }
    
}
