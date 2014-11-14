/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uf1;

import java.util.Scanner;

/**
 *
 * @author ismael trascastro
 */
public class Accumulator {
    
    private final static int LIMIT = 10;
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numero;
        int suma = 0;
        int i = 0;
        
        while (i < LIMIT) {
            numero = in.nextInt();
            
            if (numero == 0) break;
            
            if (numero % 5 == 0) {
                suma += numero;
            }
            
            i++;
        }
        
        System.out.println("La suma total vale: " + suma);
    }
    
}
