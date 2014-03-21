/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uf2.oop.dados;

import java.util.Random;

/**
 *
 * @author ismael trascastro
 */
public class Dado 
{
    private int numero;
    
    public Dado()
    {
    }

    public int getNumero() 
    {
        return this.numero;
    }

    public void setNumero(int numero) 
    {
        if (numero > 0 && numero < 7) {
            this.numero = numero;
        }
    }
    
    public void lanzar()
    {
        Random aleatorio = new Random();
        
        this.numero = aleatorio.nextInt(6) + 1;
    }

    @Override
    public String toString() {
        return "Dado{" + "numero=" + numero + '}';
    }
}
