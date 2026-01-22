/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Othello;

/**
 *
 * @author aleja
 */
public class Board {

    protected nodeDisc start;

    public Board() {
        this.start = null;
    }

    /**
     * este metodo es para inicializar todos los nodos del tablero se hace
     * automaticamente con dos for
     */
    public void buildBoard() {

        nodeDisc prevRowStart = null;

        for (int i = 0; i < 8; i++) {

            nodeDisc firstInRow = null;//inicio
            nodeDisc left = null;//
            nodeDisc above = prevRowStart;

            for (int j = 0; j < 8; j++) {
                nodeDisc current = new nodeDisc();
                if (i == 0) {
                    firstInRow = current;

                }
                if (j == 0 && i == 0) {
                    start = current;//se guarda el inicio de cada fila
                }

                if (left != null) {//izquierda y derecha
                    current.left = left;
                    current.right = current;
                }
                if (above != null) {//arriba y abajo
                    current.up = above;
                    above.down = current;
                    if (above.left != null) {
                        current.upLeft = above.left;
                        above.left.downRight = current;
                    }
                }
            }

        }

    }

}
