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
public class Semaphor {
    private static final int INTENTOS = 3;
    private static final int N = 3;
    
    public static void main(String[] args) {
        int i = 0;
        boolean acierto = false;
        int numero;
        Scanner in = new Scanner(System.in);
        String mensaje;
        
        while (!acierto && i < INTENTOS) {
            numero = in.nextInt();
            
            if (numero == N) acierto = true;
            
            i++;
        }
        
        if (acierto == true) {
            mensaje = "Acierto!";
        } else {
            mensaje = "Error";
        }
        
        System.out.println(mensaje);
    }
    
    
}
