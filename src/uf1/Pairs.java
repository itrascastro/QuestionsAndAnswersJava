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
public class Pairs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numero;
        int sumaPares = 0;
        
        numero = in.nextInt();
        
        while(numero != 0) {
            if (numero % 2 == 0) {
                sumaPares = sumaPares + numero;
            }
            numero = in.nextInt();
        }
        
        System.out.println("La suma de pares vale " + sumaPares);
    }
    
}
