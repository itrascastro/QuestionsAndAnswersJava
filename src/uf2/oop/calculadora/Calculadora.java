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
class Calculadora 
{
    private int op1;
    private int op2;
    private int resultado;

    public Calculadora(int op1, int op2) 
    {
        this.op1 = op1;
        this.op2 = op2;
    }

    public int getOp1() {
        return op1;
    }

    public void setOp1(int op1) {
        this.op1 = op1;
    }

    public int getOp2() {
        return op2;
    }

    public void setOp2(int op2) {
        this.op2 = op2;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    public void sumar() 
    {
        this.resultado = this.op1 + this.op2;
    }

    public void restar() 
    {
        this.resultado = this.op1 - this.op2;
    }

    public void multiplicar() 
    {
        this.resultado = this.op1 * this.op2;
    }

    public void dividir() 
    {
        this.resultado = this.op1 / this.op2;
    }

    @Override
    public String toString() {
        return "Calculadora{" + 
                "op1="          + this.op1 + 
                ", op2="        + this.op2 + 
                ", resultado="  + this.resultado + 
                '}';
    }
    
}
