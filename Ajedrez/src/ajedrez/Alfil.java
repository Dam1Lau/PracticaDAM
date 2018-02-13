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
public class Alfil extends Piezas {
    //constructores
    
    public Alfil() {
        nombre = "Alfil";
        color = "Blanca";
    }

    public Alfil(String color, String nombre) {
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
        if ("Blanca".equals(this.color))
        System.out.println("\u2657");
        else
            System.out.println("\u265D");
    }


}
