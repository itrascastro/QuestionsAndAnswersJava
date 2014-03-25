/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uf2.oop.calculadora;

import java.util.Scanner;

/**
 *
 * @author ismael trascastro
 */
public class Test 
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        
        int operacion = teclado.nextInt();
        
        System.out.println("Operando 1:");
        int op1 = teclado.nextInt();
        
        System.out.println("Operando 2:");
        int op2 = teclado.nextInt();
        
        Calculadora c = new Calculadora(op1, op2);
        
        switch (operacion)
        {
            case 1:
                c.sumar();
                break;
            case 2:
                c.restar();
                break;
            case 3:
                c.multiplicar();
                break;
            case 4:
                c.dividir();
                break;
        }
        
        System.out.println(c.getResultado());
    }
}
