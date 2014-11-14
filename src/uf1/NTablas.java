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
public class NTablas {
    public static void main(String[] args) {
        int producto;
        
        for (int i=0; i<10; i++) {
            System.out.println("Tabla del " + i);
            for (int j=0; j<10; j++) {
                producto = i * j;
                System.out.println(i + "x" + j + " = " + producto);
            }
            System.out.println();
        }
    }
}
