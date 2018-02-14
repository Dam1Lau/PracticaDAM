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
public class Dama extends Piezas {
    //constructores
    
    public Dama() {
        nombre = "D";
        color = "Blanca";
    }

    public Dama(String color) {
        super(color);
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
        System.out.println("\u2655");
        else
            System.out.println("\u265B");
    }


}
