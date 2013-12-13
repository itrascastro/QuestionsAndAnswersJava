/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package questionsandanswersjava;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author ismael trascastro
 */
public class ArrayDynamicallyGrow {
    public static void main(String[] args) {
        String[] vector = new String[0];
        Scanner lector = new Scanner(System.in);
        
        String cadena;
        
        do {
            cadena = lector.next();
            if (cadena.equals("fin")) {
                break;
            }
            vector = Arrays.copyOf(vector, vector.length + 1);
            vector[vector.length - 1] = cadena;
        } while (true);
        
        for (int i=0; i<vector.length; i++) {
            System.out.println(vector[i]);
        }
    }
    
}
