/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jvt.obl1;

import java.util.List;

/**
 *
 * @author jakobtottrup
 */
public class MonopolyDriver {

    public static FieldInterface[] monopolyBoard = new FieldInterface[40];
    static Player p2;
    static Player p1;

    public void fillBoard() {
        /*for (int i = 0; i < monopolyBoard.length; i++) {
            monopolyBoard[i] = new StreetField("yo", i, 2);
        }*/
    }

    public static void main(String[] args) {
        int roundsToStop = 40;
        MonopolyDriver driver = new MonopolyIODriver(2, "MonopolyData.txt");
        driver.fillBoard();

        Player p1 = new Player("Spiller1", monopolyBoard[0], MonopolyConstants.START_MONEY);
        Player p2 = new Player("Spiller2", monopolyBoard[0], MonopolyConstants.START_MONEY);

        p1.other = p2;
        p2.other = p1;

        DiceCup cup = new DiceCup(6);
        //System.out.println(p1.getBalance());
        //System.out.println(p2.getBalance());
        do {
            if ((p1.getBalance() <= 0) || (p2.getBalance() <= 0)) {
                break;
            }
            p1.move(cup);
            //System.out.println(p1.getBalance());
            p2.move(cup);
            //System.out.println(p2.getBalance());

        } while (((p1.getBalance() > 0) || (p2.getBalance() > 0)) && ((p1.getRounds() < roundsToStop) && (p2.getRounds() < roundsToStop)));
        System.out.println("Penge på kontoen:\n" + "Spiller1: " + p1.getBalance() + "\nSpiller2: " + p2.getBalance());
        if ((p1.getBalance() > 0) && (p2.getBalance() > 0)) {
            System.out.println("Spillet er stoppet efter 40 runder.");
            if (p1.getBalance() > p2.getBalance()) {
                System.out.println("Spiller1 har vundet!");
            } else {
                System.out.println("Spiller2 har vundet!");
            }
        } else {
            if (p1.getBalance() < 0) {
                System.out.println("Spiller1 gik bankerot!");
            } else {
                System.out.println("Spiller2 gik bankerot!");
            }
        }

    }
}
