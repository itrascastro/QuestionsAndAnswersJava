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
public class Arrays2D {
    public static void main(String[] args)
    {
        int[][] tablero = new int[2][2];
        Scanner teclado = new Scanner(System.in);
        
        for (int i=0; i<2; i++) {
            for (int j=0; j<2; j++) {
                tablero[i][j] = teclado.nextInt();
            }
        }
        
        for (int i=0; i<2; i++) {
            for (int j=0; j<2; j++) {
                if (i == 0) {
                    System.out.print(tablero[i][j] + " ");
                }
            }
        }
        
        int suma = 0;
        for (int i=0; i<2; i++) {
            for (int j=0; j<2; j++) {
                suma = suma + tablero[i][j];
            }
        }
        
    }
}
