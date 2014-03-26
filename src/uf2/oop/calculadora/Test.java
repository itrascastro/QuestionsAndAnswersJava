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
    public static int op1;
    public static int op2;
    public static int operacion;
    
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        
        Test.operacion = teclado.nextInt();
        
        System.out.println("Operando 1:");
        Test.op1 = teclado.nextInt();
        
        System.out.println("Operando 2:");
        Test.op2 = teclado.nextInt();
        
        Test.calculadora1();
    }
    
    public static void calculadora1() 
    {
        Calculadora c = new Calculadora(Test.op1, Test.op2);
        
        switch (Test.operacion)
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
        
        System.out.println(c);
    }
    
    public static void calculadora2() 
    {
        Calculadora2 c = new Calculadora2();
        
        switch (Test.operacion)
        {
            case 1:
                c.sumar(Test.op1, Test.op2);
                break;
            case 2:
                c.restar(Test.op1, Test.op2);
                break;
            case 3:
                c.multiplicar(Test.op1, Test.op2);
                break;
            case 4:
                c.dividir(Test.op1, Test.op2);
                break;
        }
        
        System.out.println(c.getResultado());
    }
    
    public static void calculadora3() 
    {
        Calculadora3 c = new Calculadora3();
        
        c.operar(Test.op1, Test.op2, Test.operacion);
        
        System.out.println(c);
    }
    
    public static void calculadora4() 
    {
        int resultado = 0;
        
        switch (Test.operacion)
        {
            case 1:
                resultado = Calculadora4.sumar(Test.op1, Test.op2);
                break;
            case 2:
                resultado = Calculadora4.restar(Test.op1, Test.op2);
                break;
            case 3:
                resultado = Calculadora4.multiplicar(Test.op1, Test.op2);
                break;
            case 4:
                resultado = Calculadora4.dividir(Test.op1, Test.op2);
                break;
        }
        
        System.out.println(resultado);
    }
    
}
