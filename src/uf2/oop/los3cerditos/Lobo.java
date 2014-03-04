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
public class Lobo 
{
    private String nombre;
    private Casa c;
    private boolean subiendo;
    private boolean muerto;
    
    Lobo(String nombre)
    {
        this.nombre = nombre;
        this.subiendo = false;
        this.muerto = false;
        this.c = null;
    }
    
    public void mover(Casa c)
    {
        this.c = c;
    }
    
    public void soplar()
    {
        if (!this.c.fabricada("ladrillo")) {
            c.derrumbar();
        }
    }
    
    public void subirChimenea()
    {
        this.subiendo = true;
    }
    
    public void morir()
    {
        this.muerto = true;
    }
    
    @Override
    public String toString()
    {
        String casa = "Ninguna";
        
        if (this.c != null) {
            casa = this.c.toString();
        }
        
        return "Lobo[" + 
                this.nombre + 
                ", " + 
                casa +
                ", " +
                this.subiendo +
                ", " +
                this.muerto +
                "]";
    }
    
}
