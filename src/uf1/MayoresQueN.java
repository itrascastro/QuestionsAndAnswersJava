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
public class MayoresQueN {
    private static final int N = 5;
    private static final int INTENTOS = 4;
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numero;
        int mayores = 0;
        
        for (int i=0; i<INTENTOS; i++){
            numero = in.nextInt();
            
            if (numero > N) {
                mayores++;
            } 
        }
        
        System.out.println("La cantidad de números mayores que " + N + " es: " + mayores);
    }
    
}
















