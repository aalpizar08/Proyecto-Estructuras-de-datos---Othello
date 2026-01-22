/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Othello;

/**
 * La clase esta cargada con el color de la ficha
 *
 * @author aleja
 */
public class Disc {

    protected byte id; //id para el tablero
    protected boolean color; // true para negro, false para blanco

    public Disc(byte id, boolean color) {

        this.color = color;
    }

    Disc(boolean color) {
        this.color = color;
    }

    public boolean isColor() {
        return color;
    }

    public void setColor(boolean color) {
        this.color = color;
    }

}
