/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uf2.oop.polinomios;

import java.util.Scanner;
/**
 *
 * @author ismael trascastro
 */
public class Test 
{
    public static void main(String[] args) 
    {
        Polinomio p1 = new Polinomio(2, 3, 1);
        Polinomio p2 = new Polinomio(0, 1, -2);
        
        Polinomio p3 = p1.sumar(p2);
        
        System.out.println("La suma de " + p1 + " y " + p2 + " es igual a " + p3);
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce un número:");
        int n = teclado.nextInt();
        
        p3.producto(n);
        
        System.out.println(p3);
        
        int res = p3.resolver(2);
        
        System.out.println(res);
        
    }
    
}
