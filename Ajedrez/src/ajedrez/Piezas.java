/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ajedrez;

/**
 *
 * @author dam1
 */
public abstract class  Piezas {
    protected String color;
    protected String nombre;
    
    //Constructores

    public Piezas() {
    }
    /**
     * Constructor para generar una pieza cualquiera.
     * @param color - Para ideantificar si la pieza es blanca o negra
     */
    public Piezas(String color) {
        this.color = color;
    }
    
    //getset

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    // Métodos
    /**
     * Método por el que cada pieza nos dirá si puede moverse en el tablero dependiendo de su forma de moverse
     * y de si tiene otras piezas a su alrededor. Método abstracto que cambiará en cada clase que herede de pieza.
     * @return true = si se puede mover, false = si tiene otras piezas bloqueando su movimiento.
     */
    public abstract boolean puedeMoverse();
    public abstract void pintarPieza();

    @Override
    public String toString() {
        return "Piezas{" + "color=" + color + ", nombre=" + nombre + '}';
    }  
}
