/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uf2.recursividad;

import java.util.Scanner;

/**
 *
 * @author ismael trascastro
 */
public class SumaRecursiva 
{
    public static Scanner teclado;
    
    public static void main(String[] args)
    {
        teclado = new Scanner(System.in);
        
        int suma = recursiva(10);
        
        System.out.println(suma);
        
    }
    
    public static int sumaIterativa(int n)
    {
	int suma = 0;
        int num = 0;

	for (int i = 1; i <= n; i++) 
	{
		num = teclado.nextInt();
		suma += num;	
	}

	return suma;
    }
    
    public static int recursiva(int n)
    {
        int num = teclado.nextInt();
	
	if (n == 1) return num;

	return num + recursiva(n - 1);
    }
    
}
