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
public class Fibonacci 
{
    public static void main(String[] args)
    {
        Fibonacci.serieFibonacci(11);
    }
    
    public static int recursivo(int n)
    {
        if (n == 1) return 0;
        if (n == 2) return 1;
        
        return Fibonacci.recursivo(n-1) + Fibonacci.recursivo(n-2); 
    }
    
    public static void serieFibonacci(int n)
    {
        for (int i = 1; i <= n; i++) {
            System.out.print(Fibonacci.recursivo(i) + " ");
        }
    }
    
}