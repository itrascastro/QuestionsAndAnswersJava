/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uf1;

/**
 *
 * @author ismael trascastro
 */
public class PiramideFor {
    private static final int FILAS = 20;
    
    public static void main(String[] args) {
        for (int i=0; i<FILAS; i++) {
            for (int j=FILAS-i-1; j>0; j--) {
                System.out.print(" ");
            }
            for (int k=0; k<2*i+1; k++) {
                System.out.print("*");
            }    
            System.out.println("");
        }
    }
    
}
