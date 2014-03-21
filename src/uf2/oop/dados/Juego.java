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
public class Juego 
{
    private Jugador jugador1;
    private Jugador jugador2;
    private Jugador jugador3;
    private Jugador jugador4;
    private Dado dado;
    private int ronda;
    private Jugador ganador;
    
    public static void main(String[] args)
    {
        
    }
    
    public Juego(String nombre1, String nombre2, String nombre3, String nombre4)
    {
        this.jugador1 = new Jugador(nombre1);
        this.jugador1 = new Jugador(nombre2);
        this.jugador1 = new Jugador(nombre3);
        this.jugador1 = new Jugador(nombre4);
    }
    
    
    
}
