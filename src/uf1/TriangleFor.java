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
public class TriangleFor {
    private static final int FILAS = 10;
    
    public static void main(String[] args) {
        for (int i=0; i<FILAS; i++) {
            for (int j=0; j<i+1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}















