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
public class Ajedrez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Juego j1 = new Juego();
        j1.comenzarJuego();
        System.out.println(j1.toString());
        
        // pruebas con tablero
        Tablero p4 = new Tablero();
        System.out.println(p4.hayPieza(5, 5));
        p4.ponerPieza(new Caballo(), 5, 5);
        
        Posicion posicionTest = new Posicion(2,3);
        p4.ponerPieza(new Dama("negra"), posicionTest);
        j1.pintaMe(p4);
        System.out.println(p4.buscarPieza(0,0).pintarPieza());
        System.out.println(p4.buscarPieza(0,0));
        System.out.println(p4.buscarPieza(7,4));  //los nombres salen con null en todas menos caballo y reina WHY
        System.out.println(p4.buscarPieza(posicionTest));
        

    }
    
}
