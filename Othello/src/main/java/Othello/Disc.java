/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Othello;

/**
 *
 * @author aleja
 */
public class Disc {

    public byte id; //id para el tablero
    private boolean color; // true para negro, false para blanco

    public Disc(byte id, boolean color) {
        this.id = id;
        this.color = color;
    }

    public byte getId() {
        return id;
    }

    public boolean isColor() {
        return color;
    }

    public void setID(byte id) {
        this.id = id;
    }
}
