/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uf2.oop.dados;

/**
 *
 * @author ismael trascastro
 */
public class Test 
{
    public static void main(String[] args)
    {
        Dado d = new Dado();
        
        d.lanzar();
        
        d.setNumero(5);
        
        System.out.println(d.getNumero());
        
        System.out.println(d);
    }
}
