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
    public void comenzarJuego(){
        System.out.println("***¡Comienza el juego!***");
        Tablero tab = new Tablero();
        pintaMe(tab);
    }
    
    public void pintaMe(Tablero tablero) {
        int num = 1;
        System.out.println("   a  b  c d  e f  g  h  ");
        System.out.println("   _____________________");
        for (int i = 0; i < tablero.casillas.length; i++, num++) {
            System.out.print(num + " |");
            for (int j = 0; j < tablero.casillas.length; j++) {
                if (tablero.casillas[i][j] != null) {
                    System.out.print(tablero.casillas[i][j].pintarPieza() + " ");
                } else {
                    System.out.print("\u2003 ");
                }
            }
            System.out.println("|");
        }
        System.out.println("   ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");

    }
    /**
     * Preguntará al usuario el movimiento que quiere hacer (su jugada) y eso hará que se genere un movimiento.
     * @param jugada El usuario solo puede introducir una juegada de esta forma "A1B1" donde las letras son las
     * columnas del movimiento, y los números las filas del movimiento generado. Si la jugada genera un movimiento no válido, le debe 
     * preguntar de nuevo por el movimiento que desea introducir.
     * @param tablero 
     * @return 
     */
//    public Movimiento meterJugada(String jugada, Tablero tablero){
//        System.out.println("Introduce la jugada: ");
//        return 77;
//    }
    
    
    
    @Override
    public String toString(){
        String color;
        if(turno == 0 )
            color = " BLANCAS";
        else
            color = " NEGRAS";
        return "Es el turno de" + color;
    }
}
