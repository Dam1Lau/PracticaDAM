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
public class Tablero {
    
    public Piezas[][] casillas = new Piezas[8][8];
    
    //constructor
    public Tablero() {
        casillas[0][0] = new Torre("blanca");
        casillas[0][1] = new Caballo("blanca");
        casillas[0][2] = new Alfil("blanca");
        casillas[0][3] = new Dama("blanca");
        casillas[0][4] = new Rey("blanca");
        casillas[0][5] = new Alfil("blanca");
        casillas[0][6] = new Caballo("blanca");
        casillas[0][7] = new Torre("blanca");
        for (int i = 0; i < 8; i++) {
            casillas[1][i] = new Peon("blanca");
            casillas[6][i] = new Peon("negra");
        }
        casillas[7][0] = new Torre("negra");
        casillas[7][1] = new Caballo("negra");
        casillas[7][2] = new Alfil("negra");
        casillas[7][3] = new Dama("negra");
        casillas[7][4] = new Rey("negra");
        casillas[7][5] = new Alfil("negra");
        casillas[7][6] = new Caballo("negra");
        casillas[7][7] = new Torre("negra");
    }
    
}
