/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ajedrez;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Movimiento {

    private Posicion posInicial;
    private Posicion posFinal;

    //construct
    public Movimiento() {
//        boolean noValido = true;
//        Scanner lector = new Scanner(System.in);
//        while (noValido == true) {
//            System.out.println("Introduzca su movimiento:");
//            String jugadaUsuario = lector.next();
//            if(jugadaUsuario.length()!=4)
//                System.out.println("Jugada inválida, introduce una jugada de cuatro caracteres en éste orden: A1C2");
//            else if(jugadaUsuario.toUpperCase().charAt(0)<'A' || jugadaUsuario.toUpperCase().charAt(0)> 'H' || jugadaUsuario.toUpperCase().charAt(2)<'A' || jugadaUsuario.toUpperCase().charAt(2)>'H')
//                System.out.println("Jugada incorrecta. Ha introducido una letra inválida o en posición errónea.");
//            else if(jugadaUsuario.charAt(1)<'1' || jugadaUsuario.charAt(1)>'8' || jugadaUsuario.charAt(3)<'1' || jugadaUsuario.charAt(3)>'8')
//                System.out.println("Jugada incorrecta. Ha introducido un número inválido o en posición incorrecta.");
//            else{
//                Posicion ini = new Posicion(jugadaUsuario.toUpperCase().charAt(0)- 65,jugadaUsuario.toUpperCase().charAt(1) - 49);
//                posInicial = ini;
//                Posicion fin = new Posicion(jugadaUsuario.toUpperCase().charAt(2) - 65,jugadaUsuario.toUpperCase().charAt(3) - 49);
//                posFinal = fin;
//                noValido = false;
//            }
//        }
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

    public int numHorizontal() {
        return 9;
    }

    public int numVertical() {
        return 9;
    }

    @Override
    public String toString() {
        return "Movimiento{" + "posInicial=" + posInicial + ", posFinal=" + posFinal + '}';
    }

}
