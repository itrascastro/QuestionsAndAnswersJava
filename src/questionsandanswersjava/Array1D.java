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
public class Array1D {
    public static int TAMANY = 10;
    
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        
        int[] datos = new int[TAMANY];
        
        int data = teclado.nextInt();
        int i = 0;
        
        while(data != -1)
        {
            datos[i] = data;
            i++;
            data = teclado.nextInt();
        }
        
        int suma = datos[0];
        int min = datos[0];
        int max = datos[0];
        
        for (int j=1; j<i; j++) {
            suma += datos[j];
            
            if (datos[j] < min) {
                min = datos[j];
            } else if (datos[j] > max) {
                max = datos[j];
            }
        }
        
        int media = suma / i;
        
        System.out.println("El mínimo es " + min);
        System.out.println("El máximo es " + max);
        System.out.println("La media es " + media);
        
    }
}
