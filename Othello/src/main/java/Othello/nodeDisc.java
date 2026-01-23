/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Othello;

/**
 *
 * Clase nodeDisc simboliza cada casilla dek tablero, tiene sus vecinos y ademas
 * tiene la clase disco que es para los atributos de cada ficha del juego.
 *
 * @author aleja
 */
public class nodeDisc {

    public nodeDisc up;
    public nodeDisc down;
    public nodeDisc left;
    public nodeDisc right;

    public nodeDisc upRight;
    public nodeDisc upLeft;

    public nodeDisc downRight;
    public nodeDisc downLeft;

    private Disc disc;

    private int idValidPlay; //id para el tablero

    public nodeDisc() {
    }

    public nodeDisc(Disc disc) {
        this.disc = disc;
    }

    public Disc getDisc() {
        return this.disc;
    }

    public void setDisc(Disc disc) {
        this.disc = disc;
    }

    public boolean isEmpty() {
        return this.disc == null;
    }

    public void removeDisc() {
        this.disc = null;
    }

    public int getIdValidPlay() {
        return idValidPlay;
    }

    public void setIdValidPlay(int idValidPlay) {
        this.idValidPlay = idValidPlay;
    }

    public void clearValidPlay() {
        this.idValidPlay = 0;
    }
}
