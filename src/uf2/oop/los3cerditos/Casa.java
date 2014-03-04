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
public class Casa 
{
    private String material;
    private boolean derrumbada;
    
    Casa(String material)
    {
        this.material = material;
        this.derrumbada = false;
    }
    
    public boolean fabricada(String material)
    {
        return this.material == material;
    }
    
    public void derrumbar()
    {
        this.derrumbada = true;
    }
    
    @Override
    public String toString()
    {
        return "Casa[" + 
                this.material + 
                ", " + 
                this.derrumbada +
                "]";
    }
    
}
