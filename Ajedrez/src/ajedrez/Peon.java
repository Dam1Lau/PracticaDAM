/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ajedrez;

/**
 *
 * @author Laura
 */
public class Peon extends Piezas {
    //constructores
    
    public Peon() {
        nombre = "Peon";
        color = "Blanca";
    }

    public Peon(String color, String nombre) {
        super(color, nombre);
    }
    
    //Métodos
    
    @Override
    public boolean puedeMoverse(){
        boolean movimiento=false;
    
        
        return movimiento;
    }
    
    @Override
    public void pintarPieza(){
        if ("Blanca".compareToIgnoreCase(this.color)==0)
        System.out.println("\u2659");
        else
            System.out.println("\u265F");
    }


}
