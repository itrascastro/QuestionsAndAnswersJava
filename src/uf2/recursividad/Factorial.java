/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uf2.recursividad;

/**
 *
 * @author ismael trascastro
 */
public class Factorial 
{
    public static void main(String[] args)
    {
        System.out.println(Factorial.recursivo(5));
    }
    
    public static int recursivo(int n)
    {
        if (n == 0) return 1;
        if (n == 1) return 1;
        return n * Factorial.recursivo(n-1); 
    }
    
    public static int iterativo(int n)
    {
        if (n == 0) return 1;
        if (n == 1) return 1;
        
        int factorial = 1;
        
        for (int i = 2; i <= n; i++) {
            factorial = factorial * i;
        }
        
        return factorial;
    }
}
