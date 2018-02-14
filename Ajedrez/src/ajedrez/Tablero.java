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

    //Metodos
    /**
     * Hay pieza: Nos indica que en el lugar especificado del tablero hay una
     * pieza. SI no hay una pieza en esa casilla, devuelve false.
     *
     * @param fila perteneciente al array de piezas llamado casillas.
     * @param columna pertenecsiente al array casillas.
     * @return true = si hay una pieza en esa fila y columna, false si está
     * vacia.
     */
    public boolean hayPieza(int fila, int columna) {
        boolean hay = true;
        if (casillas[fila][columna] == null) //si la casilla esta a null es que no hay pieza ---> hay pieza = false
        {
            hay = false;
        }
        return hay;
    }

    /**
     * Hay pieza V2: En la posición introducida por el parametro posicion de
     * tipo/clase Posicion comprueba si hay una pieza en ese lugar.
     *
     * @param posicion de tipo Posición, compuesto a su vez de dos atributos
     * fila y columna.
     * @return hay de tipo boolean. Toma el valor true si hay una pieza en ese
     * lugar, y false y está a null.
     */
    public boolean hayPieza(Posicion posicion) {
        boolean hay = true;
        if (casillas[posicion.getFila()][posicion.getColumna()] == null) {
            hay = false;
        }
        return hay;
    }

    public void pintaTabla() {

    }

    public void pinta() {
        int num = 8;
        System.out.println("   _____________________");
        System.out.println("  |a  b  c d  e f  g  h |");
        for (int i = 0; i < casillas.length; i++, num--) {
            System.out.print(num + " |");
            for (int j = 0; j < casillas.length; j++) {
                if (casillas[i][j] != null) {
                    System.out.print(casillas[i][j].pintarPieza() + " ");
                } else {
                    System.out.print("\u2003 ");
                }
            }
            System.out.println("|");
        }
        System.out.println("   ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");

    }

}
