
import Othello.Disc;
import Othello.nodeDisc;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author aleja
 */
public class Player {

    nodeDisc disc;

    public Player(nodeDisc disc) {
        this.disc = disc;
    }

    public nodeDisc getDisc() {
        return disc;
    }

    public void setDisc(nodeDisc disc) {
        this.disc = disc;
    }

    public void discOnBoard(Disc discOnBoard) {
        disc.putDisc(discOnBoard);
    }
    
}
