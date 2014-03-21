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
    private Dado dado;
    private int ronda;
    private Jugador ganador;
    
    public static int NUM_RONDAS = 3;
    
    public static void main(String[] args)
    {
        Juego juego = new Juego("Garnet", "Pearce", "Allen");
        
        System.out.println(juego.jugar());
    }
    
    public Juego(String nombre1, String nombre2, String nombre3)
    {
        this.jugador1 = new Jugador(nombre1);
        this.jugador2 = new Jugador(nombre2);
        this.jugador3 = new Jugador(nombre3);
        
        this.dado = new Dado();
        
        this.ronda = 1;
    }
    
    public Jugador jugar()
    {
        for (int i=0; i < Juego.NUM_RONDAS; i++) {
            this.jugador1.lanzar(this.dado);
            this.jugador2.lanzar(this.dado);
            this.jugador3.lanzar(this.dado);
            
            this.mejorTirada().setPuntuacion();
        }
        
        return this.mejorPuntuacion();
    }
    
    private Jugador mejorTirada()
    {
        int p1 = this.jugador1.getValorTirada();
        int p2 = this.jugador2.getValorTirada();
        int p3 = this.jugador1.getValorTirada();
        
        if (p1 > p2 && p1 > p3) {
            return this.jugador1;
        }
        
        if (p2 > p1 && p2 > p3) {
            return this.jugador2;
        }
        
        return this.jugador3;
    }
    
    private Jugador mejorPuntuacion()
    {
        int p1 = this.jugador1.getPuntuacion();
        int p2 = this.jugador2.getPuntuacion();
        int p3 = this.jugador1.getPuntuacion();
        
        if (p1 > p2 && p1 > p3) {
            return this.jugador1;
        }
        
        if (p2 > p1 && p2 > p3) {
            return this.jugador2;
        }
        
        return this.jugador3;
    }
    
    
}
