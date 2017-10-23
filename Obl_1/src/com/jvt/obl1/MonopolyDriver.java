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

        Player p1 = new Player("Spiller1",  monopolyBoard[0], MonopolyConstants.START_MONEY);
        Player p2 = new Player("Spiller2",  monopolyBoard[0], MonopolyConstants.START_MONEY);
        DiceCup cup = new DiceCup(6);
        System.out.println(p1.getBalance());
        System.out.println(p2.getBalance());
        do {
            p1.move(cup);
            p2.move(cup);

        } while ((p1.getBalance() > 0) || (p2.getBalance() > 0));
        System.out.println("Penge på kontoen:\n" + "Spiller1: " + p1.getBalance() + "\nSpiller2: " + p2.getBalance());

    }
}
