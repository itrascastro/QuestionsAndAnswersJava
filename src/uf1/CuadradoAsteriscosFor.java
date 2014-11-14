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
public class CuadradoAsteriscosFor {
    private static final int FILAS      = 3;
    private static final int COLUMNAS   = 10;
    
    public static void main(String[] args) {
        for (int i=0; i<FILAS; i++) {
            for (int j=0; j<COLUMNAS; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
}

















