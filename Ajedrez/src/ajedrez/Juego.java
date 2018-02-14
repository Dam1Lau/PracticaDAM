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
public class Juego {
    /**
     * Turno tomará dos valores: 
     *   0 si es el turno de las piezas blancas
     *   1 si lo es el de las piezas negras
     */
    private int turno;
    
    
    /**
     * CONSTRUCTOR DEL JUEGO
     * El juego siempre comienza en el turno de las piezas blancas.
     */
    public Juego() {
        this.turno = 0;
    }
    
    //Get y Set del Turno

    public int getTurno() {
        return turno;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }
    
    // Métodos 
    public void comenzarJuego(Tablero tablero){
    
    }
    public void pintaTablero(){
        for (int i = 0; i < 16; i++) {
            if(i%2==0)
                System.out.println("_________________");
            else if (i==1 || i ==15)
                System.out.println("T C A D R A C T");
            else if (i== 3 || i == 13)
                System.out.println("P P P P P P P P");
            else
                System.out.println("                ");
        }
    
    }
    
}
