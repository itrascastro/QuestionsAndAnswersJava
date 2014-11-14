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
public class Sort3 {
    public static void main(String[] arg) {
        int n1 = 4;
        int n2 = 1;
        int n3 = 5;
        
        int primero = 0;
        int segundo = 0;
        int tercero = 0;
        
        int opcion = 4;
        
        String salida = "Los números ordenados de mayor a menor son: ";
        
        switch (opcion) {
            case 1:
                System.out.println("Sumar");
                break;
            case 2: 
                System.out.println("Restar");
                break;
            case 3: 
                System.out.println("Multiplicar");
                break;
            case 4:
                System.out.println("Dividir");
                break;
            default:
                System.out.println("Opción incorrecta");
        }
        
//        if (n1 > n2 && n2 > n3) {
//            salida = salida + n1 + ", " + n2 + ", " + n3;
//        } else if (n1 > n3 && n3 > n2) {
//            salida = salida + n1 + ", " + n3 + ", " + n2;
//        } else if (n2 > n1 && n1 > n3) {
//            salida = salida + n2 + ", " + n1 + ", " + n3;
//        } else if (n2 > n3 && n3 > n1) {
//            salida = salida + n2 + ", " + n3 + ", " + n1;
//        } else if (n3 > n1 && n1 > n2) {
//            salida = salida + n3 + ", " + n1 + ", " + n2;
//        } else {
//            salida = salida + n3 + ", " + n2 + ", " + n1;
//        }
        
        if (n1 > n2 && n1 > n3) {
            primero = n1;
            if (n2 > n3) {
                segundo = n2;
                tercero = n3;
            } else {
                segundo = n3;
                tercero = n2;
            }
            
        } else if (n2 > n1 && n2 > n3) {
            primero = n2;
        } else primero = n3;
        
//        if (n1 < n2 && n1 > n3) {
//            segundo = n1;
//        } else if (n2 <)
//        
//        if (n1 < n2 && n1 < n3) {
//            tercero = n1;
//        } else if (n2 < n1 && n2 < n3) {
//            tercero = n2;
//        } else tercero = n3;
        
        // segundo = (n1 + n2 + n3) - (primero + tercero);
        
        System.out.println(salida);
    }
    
}


















