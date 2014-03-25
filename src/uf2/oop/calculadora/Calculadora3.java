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
class Calculadora3 
{
    private int resultado;

    public Calculadora3() {
        this.resultado = 0;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
    
    public void operar(int op1, int op2, int operacion)
    {
        switch (operacion)
        {
            case 1:
                this.resultado = op1 + op2;
                break;
            case 2:
                this.resultado = op1 - op2;
                break;
            case 3:
                this.resultado = op1 * op2;
                break;
            case 4:
                this.resultado = op1 / op2;
                break;
        }
    }

    @Override
    public String toString() {
        return "Calculadora3{" + 
                "resultado=" + resultado + 
                '}';
    }

}
