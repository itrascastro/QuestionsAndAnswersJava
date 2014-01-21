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
    
    public static int[] vector = {0, 2, 4, 1, 0, 2};
    
    public static void main(String[] args)
    {
        Examples.mostrar();
        Examples.buscar(8);
        Examples.buscarIndice(4);
//        Examples.reemplazar(1, 0);
//        Examples.mostrar();
//        Examples.bordesA(1);
//        Examples.mostrar();
//        Examples.sumar();
//        Examples.sumarFilasColumnas();
        Examples.sumasParciales();
    }
    
    public static void mostrar()
    {
        int[][] myArray = Examples.table;
        
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray.length; j++) {
                System.out.print(myArray[i][j] + " ");
            }
            //fin de fila i
            System.out.println();
        }
        
        System.out.println();
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
    
    public static void reemplazar(int origen, int destino)
    {
        int[][] myArray = Examples.table;
        
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray.length; j++) {
                if (myArray[i][j] == origen) {
                    myArray[i][j] = destino;
                }
            }
        }
    }
    
    public static void bordesA(int n)
    {
        int[][] myArray = Examples.table;
        
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray.length; j++) {
                if (i == 0 || i == 2 || j == 0 || j == 2) {
                    myArray[i][j] = n;
                }
            }
        }
    }
    
    public static void diagonal(int n)
    {
        int[][] myArray = Examples.table;
        
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray.length; j++) {
                if (i == j) {
                    myArray[i][j] = n;
                }
            }
        }
    }
    
    public static void fila(int fila, int n)
    {
        int[][] myArray = Examples.table;
        
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray.length; j++) {
                if (i == fila) {
                    myArray[i][j] = n;
                }
            }
        }
    }
    
    public static void columna(int columna, int n)
    {
        int[][] myArray = Examples.table;
        
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray.length; j++) {
                if (j == columna) {
                    myArray[i][j] = n;
                }
            }
        }
    }
    
    public static void sumar()
    {
        int[][] myArray = Examples.table;
        
        int suma = 0;
        
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray.length; j++) {
                suma = suma + myArray[i][j];
            }
        }
        
        System.out.println(suma);
    }
    
    public static void sumarColumna(int col)
    {
        int[][] myArray = Examples.table;
        
        int suma = 0;
        
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray.length; j++) {
                if (j == col) {
                    suma = suma + myArray[i][j];
                }
            }
        }
        
        System.out.println(suma);
    }
    
    public static void sumarFilasColumnas()
    {
        int[][] myArray = Examples.table;
        
        int sumaFila        = 0;
        int sumaColumna     = 0;
        
        for (int i = 0; i < myArray.length; i++) {
            //Se empieza una fila o columna
            sumaFila = 0;
            sumaColumna = 0;
            for (int j = 0; j < myArray.length; j++) {
                sumaFila = sumaFila + myArray[i][j];
                sumaColumna = sumaColumna + myArray[j][i];
            }
            //Se acaba la fila o columna
            System.out.println("La suma de la fila " + i +
                                " es igual a: " + sumaFila);
            System.out.println("La suma de la columna " + i +
                                " es igual a: " + sumaColumna);
        }
    }
    
    public static void sumasParciales()
    {
        int[] vector = Examples.vector;
        
        int sumandos = 2;
        int suma = 0;
        
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }
        
        System.out.println();
        
        for (int i = 0; i < vector.length - 1; i++) {
            for (int j = 0; j < sumandos; j++) {
                suma += vector[j];
            }
            System.out.println("La suma de los " + sumandos + 
                    " sumandos vale: " + suma);
            suma = 0;
            sumandos++;
        }
    }
}
