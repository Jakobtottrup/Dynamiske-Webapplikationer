/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jvt.obl1;

/**
 *
 * @author jakobtottrup
 */
public class MonopolyDriver {

    public static FieldInterface[] monopolyBoard = new FieldInterface[40];

    public void fillBoard() {
        /*for (int i = 0; i < monopolyBoard.length; i++) {
            monopolyBoard[i] = new StreetField("yo", i, 2);
        }*/
    }

    public static void main(String[] args) {
        int roundsToStop = 3;
        MonopolyDriver driver = new MonopolyIODriver(2, "MonopolyData.txt");
        driver.fillBoard();

        Player p1 = new Player("Spiller1",  monopolyBoard[0]);
        Player p2 = new Player("Spiller2",  monopolyBoard[0]);
        DiceCup cup = new DiceCup(6);

        do {
            p1.move(cup);
            p2.move(cup);

        } while ((p1.getRounds() <= roundsToStop) || (p2.getRounds() <= roundsToStop));
        System.out.println("Rounds played:\n" + "Player1: " + p1.getRounds() + "\nPlayer2: " + p2.getRounds());

    }
}
