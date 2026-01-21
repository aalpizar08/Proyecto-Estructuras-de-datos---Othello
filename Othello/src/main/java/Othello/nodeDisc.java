/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Othello;

/**
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
    public nodeDisc downWest;

    public Disc disc;

    public nodeDisc(Disc disc) {
        disc = null;
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
    
}
