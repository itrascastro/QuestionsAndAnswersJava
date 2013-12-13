/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package questionsandanswersjava;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author ismael trascastro
 */
public class Arrays2DBarquitos {
    public static int DIMENSION = 10;
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();
        
        int[][] board = new int[DIMENSION][DIMENSION];
        int n;
        int aciertos = 0;
        int fila, columna;
        
        for (int i=0; i<DIMENSION; i++) {
            for (int j=0; j<DIMENSION; j++) {
                n = aleatorio.nextInt(100);
                if (n < 30) {
                    board[i][j] = 1;
                } else {
                    board[i][j] = 0;
                }
            }
        }
        
        for (int i=0; i<DIMENSION; i++) {
            System.out.println("Introduce la fila ...");
            fila = teclado.nextInt();
            System.out.println("Introduce la columna ...");
            columna = teclado.nextInt();
            
            if (board[fila][columna] == 1) {
                aciertos++;
            }
        }
        
        System.out.println("\nHas tenido " + aciertos + " aciertos:\n");
        
        for (int i=0; i<DIMENSION; i++) {
            for (int j=0; j<DIMENSION; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
