/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package arrays;

/**
 *
 * @author ismael trascastro
 */
public class Examples {
    public static int[][] table = {
        {2, 3, 4}, 
        {1, 1, 1}, 
        {3, 5, 6}
    };
    
    public static void main(String[] args)
    {
        Examples.mostrar();
        Examples.buscar(8);
        Examples.buscarIndice(4);
    }
    
    public static void mostrar()
    {
        int[][] myArray = Examples.table;
        
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray.length; j++) {
                System.out.print(myArray[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static void buscar(int n)
    {
        int[][] myArray = Examples.table;
        boolean encontrado = false;
        
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray.length; j++) {
                if (myArray[i][j] == n) {
                    encontrado = true;
                }
            }
        }
        
        if (encontrado) {
            System.out.println("Encontrado");
        } else {
            System.out.println("No Encontrado");
        }
    }
    
    public static void buscarIndice(int n)
    {
        int[][] myArray = Examples.table;
        boolean encontrado = false;
        
        int fila = 10, columna = 10;
        
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray.length; j++) {
                if (myArray[i][j] == n) {
                    encontrado = true;
                    fila = i;
                    columna = j;
                }
            }
        }
        
        if (encontrado) {
            System.out.println("Encontrado en la fila " + fila +
                    " y en la columna " + columna);
        } else {
            System.out.println("No Encontrado");
        }
    }
    
    
}
