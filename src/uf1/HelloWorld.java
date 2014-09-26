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
public class HelloWorld {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int n1;
        int n2;
        int resultado;
        
        System.out.println("Introduce el primer número: ");
        n1 = teclado.nextInt();
        
        System.out.println("Introduce el segundo número: ");
        n2 = teclado.nextInt();
        
        System.out.println("Introduce el resultado de la suma: ");
        resultado = teclado.nextInt();
        
        int suma = n1 + n2;
        
        if (suma == resultado) {
            System.out.println("Correcto!");
        } else {
            System.out.println("Error");
        }
        
        
    }
}
