/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uf2.oop.los3cerditos;

/**
 *
 * @author ismael trascastro
 */
public class Los3Cerditos 
{
    private Cerdito c1;
    private Cerdito c2;
    private Cerdito c3;
    
    private Lobo lobo;
    
    private Casa house1;
    private Casa house2;
    private Casa house3;
    
    public static void main(String[] args)
    {
        Los3Cerditos cuento = new Los3Cerditos();
        
        cuento.explicar();
    }
    
    public void explicar()
    {
        this.c1 = new Cerdito("small");
        this.c2 = new Cerdito("medium");
        this.c3 = new Cerdito("big");
        
        this.lobo = new Lobo("forious");
        
        this.house1 = c1.construir("paja");
        this.house2 = c2.construir("madera");
        this.house3 = c3.construir("ladrillo");
        
        System.out.println(this.toString());
        
        this.lobo.mover(this.house1);
        this.lobo.soplar();
        
        System.out.println(this.toString());
        
        this.c1.mover(this.house2);
        
        System.out.println(this.toString());
        
        this.lobo.mover(this.house2);
        this.lobo.soplar();
        
        System.out.println(this.toString());
        
        this.c1.mover(this.house3);
        this.c2.mover(this.house3);
        
        System.out.println(this.toString());
        
        this.lobo.mover(this.house3);
        this.lobo.soplar();
        
        System.out.println(this.toString());
        
        this.lobo.subirChimenea();
        
        System.out.println(this.toString());
        
        this.lobo.morir();
        
        System.out.println(this.toString());
    }
    
    @Override
    public String toString()
    {
        return "Los3Cerditos[" + 
                this.c1.toString() + 
                ", " + 
                this.c2.toString() +
                ", " +
                this.c3.toString() +
                ", " +
                this.lobo.toString() +
                ", " +
                this.house1.toString() +
                ", " +
                this.house2.toString() +
                ", " +
                this.house3.toString() +
                "]";
    }
}
