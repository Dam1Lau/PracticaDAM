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
public class Movimiento {

    private Posicion posInicial;
    private Posicion posFinal;

    //construct
    public Movimiento() {
    }

    public Movimiento(Posicion posInicial, Posicion posFinal) {
        this.posInicial = posInicial;
        this.posFinal = posFinal;
    }

    //get set
    public Posicion getPosInicial() {
        return posInicial;
    }

    public void setPosInicial(Posicion posInicial) {
        this.posInicial = posInicial;
    }

    public Posicion getPosFinal() {
        return posFinal;
    }

    public void setPosFinal(Posicion posFinal) {
        this.posFinal = posFinal;
    }

    // metodos
    public boolean esVertical() {
        return true;
    }

    public boolean esHorizontal() {
        return false;
    }
    public boolean esDiagonal() {
        return false;
    }
    
    public int numHorizontal(){
        return 9;
    }
    public int numVertical(){
        return 9;
    }

    @Override
    public String toString() {
        return "Movimiento{" + "posInicial=" + posInicial + ", posFinal=" + posFinal + '}';
    }
    
    
}
