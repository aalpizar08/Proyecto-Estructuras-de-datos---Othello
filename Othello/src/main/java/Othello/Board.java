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

    public nodeDisc start;
    

    public Board() {
        this.start = null;
        
        buildBoard();

    }

    

    /**
     * este metodo es para inicializar todos los nodos del tablero se hace
     * automaticamente con dos for
     */
    public void buildBoard() {

        nodeDisc prevRowStart = null;

        for (int i = 0; i < 8; i++) {//crea la columna y sus conexiones

            nodeDisc rowStart = null;//inicio
            nodeDisc left = null;//
            nodeDisc aboveRowConnect = prevRowStart;

            for (int j = 0; j < 8; j++) {//crea la fila y sus conexiones
                nodeDisc current = new nodeDisc();
                if (j == 0) {
                    rowStart = current;

                }
                if (j == 0 && i == 0) {
                    start = current;//se guarda el inicio de cada fila
                }

                if (left != null) {//izquierda y derecha
                    current.left = left;
                    left.right = current;
                }
                if (aboveRowConnect != null) {//arriba y abajo
                    current.up = aboveRowConnect;
                    aboveRowConnect.down = current;
                    if (aboveRowConnect.left != null) {//diagonal izquierda
                        current.upLeft = aboveRowConnect.left;
                        aboveRowConnect.left.downRight = current;
                    }
                    if (aboveRowConnect.right != null) {//diagonal izquierda
                        current.upRight = aboveRowConnect.right;
                        aboveRowConnect.right.downLeft = current;
                    }
                }
                left = current;
                if (aboveRowConnect != null) {
                    aboveRowConnect = aboveRowConnect.right;
                }
            }
            prevRowStart = rowStart;

        }

    }

    /**
     * metodo para imprimir el tablero
     */
    public void print() {
        nodeDisc aux = start;   // esquina superior izquierda

        while (aux != null) {//hasta que el la columna sea null (esquina abajo derecha)
            nodeDisc current = aux;

            while (current != null) {//hasta que la fila se acabe
                if (current.getIdValidPlay() > 0) {
                    System.out.println(current.getIdValidPlay());
                }
                if (current.getIdValidPlay() < 0) {
                    char print = current.isEmpty() ? '.'
                            : (current.getDisc().color ? 'X' : 'O');

                    System.out.print(print + " ");
                    current = current.right;
                }
            }

            System.out.println();
            aux = aux.down;
        }
    }

}
