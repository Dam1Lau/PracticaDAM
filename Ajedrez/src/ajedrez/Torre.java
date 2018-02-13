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
        nombre = "Torre";
        color = "Blanca";
    }

    public Torre(String color, String nombre) {
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
        if (this.color.compareToIgnoreCase("blanca")==0)
        System.out.println("\u2656");
        else
            System.out.println("\u265C");
    }


}
