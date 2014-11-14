/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questionsandanswersjava;

import java.util.Scanner;

/**
 *
 * @author ismael trascastro
 */
public class Endevinar {
    
    private static int N = 4;
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int n;
        String mensaje;
        
        System.out.println("Introduce un número: ");
        n = entrada.nextInt();
        
        if (n == N) { // true
            mensaje = "Correcto!";
        } else { // false
            mensaje = "Fallaste";
        }
        
        System.out.println(mensaje);
    }
    
}
