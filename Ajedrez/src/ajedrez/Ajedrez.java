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
        
        Torre t1 = new Torre("negra","Torre1");
        t1.pintarPieza();
        Torre t2 = new Torre ("blanca", "caballito");
        t2.pintarPieza();
    }
    
}
