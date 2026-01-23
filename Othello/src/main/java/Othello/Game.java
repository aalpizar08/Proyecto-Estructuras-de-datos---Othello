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
        //validPlays();
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

        aux.setDisc(new Disc(true));
        aux.right.setDisc(new Disc(false));
        aux.downRight.setDisc(new Disc(true));
        aux.down.setDisc(new Disc(false));

    }

    public void validPlays() {
        nodeDisc aux = board.start;
        int contValidPlays = 1;

        while (aux != null) {
            nodeDisc current = aux;

            while (current != null) {
                if (!current.isEmpty()) {

                    if (current.up != null && current.up.isEmpty()) {
                        current.up.setIdValidPlay(contValidPlays++);
                    }

                    if (current.down != null && current.down.isEmpty()) {
                        current.down.setIdValidPlay(contValidPlays++);
                    }

                    if (current.left != null && current.left.isEmpty()) {
                        current.left.setIdValidPlay(contValidPlays++);
                    }

                    if (current.right != null && current.right.isEmpty()) {
                        current.right.setIdValidPlay(contValidPlays++);
                    }

                    if (current.upLeft != null && current.upLeft.isEmpty()) {
                        current.upLeft.setIdValidPlay(contValidPlays++);
                    }

                    if (current.upRight != null && current.upRight.isEmpty()) {
                        current.upRight.setIdValidPlay(contValidPlays++);
                    }

                    if (current.downRight != null && current.downRight.isEmpty()) {
                        current.downRight.setIdValidPlay(contValidPlays++);
                    }

                    if (current.downLeft != null && current.downLeft.isEmpty()) {
                        current.downLeft.setIdValidPlay(contValidPlays++);
                    }
                }

                current = current.right;
            }

            aux = aux.down;
        }
    }

}
