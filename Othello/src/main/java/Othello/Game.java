/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Othello;

/**
 *
 * @author aleja
 */
public class Game {

    public Board board;

    public Game() {
        board = new Board();
        arrangeDiscs();
    }

    public Board getBoard() {
        return board;
    }

    public void arrangeDiscs() {

        nodeDisc aux = board.start;

        for (int i = 0; i < 3; i++) {
            aux = aux.down;
        }

        for (int i = 0; i < 3; i++) {
            aux = aux.right;
        }
        
        if (aux == null || aux.right == null || aux.down == null || aux.down.right == null) return;
        
        
        aux.setDisc(new Disc(true));
        aux.right.setDisc(new Disc(false));
        aux.down.right.setDisc(new Disc(true));
        aux.down.setDisc(new Disc(false));

    }

}
