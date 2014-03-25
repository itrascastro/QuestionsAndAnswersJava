/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uf2.oop.calculadora;

/**
 *
 * @author ismael trascastro
 */
public class Calculadora2 
{
    private int resultado;
    
    public Calculadora2()
    {
        
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
    
    public void sumar(int op1, int op2) 
    {
        this.resultado = op1 + op2;
    }

    public void restar(int op1, int op2) 
    {
        this.resultado = op1 - op2;
    }

    public void multiplicar(int op1, int op2) 
    {
        this.resultado = op1 * op2;
    }

    public void dividir(int op1, int op2) 
    {
        this.resultado = op1 / op2;
    }

    @Override
    public String toString() {
        return "Calculadora2{" + 
                "resultado=" + resultado +
                '}';
    }
    
}
