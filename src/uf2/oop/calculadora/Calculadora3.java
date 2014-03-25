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
    
    

    @Override
    public String toString() {
        return "Calculadora3{" + 
                "resultado=" + resultado + 
                '}';
    }

    void operar(int op1, int op2, int operacion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
