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
public class Torre extends Piezas {
    //constructores
    
    public Torre() {
        nombre = "T";
        color = "B";
    }

    public Torre(String color) {
        super(color);
    }
    
    //Métodos
    
    @Override
    public boolean puedeMoverse(){
        boolean movimiento=false;
    
        
        return movimiento;
    }
    
    @Override
    public String pintarPieza(){
        String pieza;
        if (this.color.compareToIgnoreCase("blanca")==0)
        pieza = "\u2656";
        else
            pieza = "\u265C";
        return pieza;
    }


}
