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

    public boolean color; // true para negro, false para blanco

    public Disc(boolean color) {

        this.color = color;
    }

    public boolean isColor() {
        return color;
    }

    public void setColor(boolean color) {
        this.color = color;
    }

}
