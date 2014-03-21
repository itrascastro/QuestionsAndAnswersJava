/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uf2.oop.dados;

/**
 *
 * @author ismael trascastro
 */
public class Jugador 
{
    private String nombre;
    private int puntuacion;
    
    public Jugador(String nombre)
    {
        this.nombre     = nombre;
        this.puntuacion = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion() {
        this.puntuacion++;
    }
    
    public void lanzar(Dado dado)
    {
        dado.lanzar();
    }
}
