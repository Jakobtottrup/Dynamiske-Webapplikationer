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

    public static Field[] monopolyBoard = new Field[40];

    public static void fillBoard() {
        for (int i = 0; i < monopolyBoard.length; i++) {
            monopolyBoard[i] = new Field("Field" + i, i);
        }
    }

    public static void main(String[] args) {
        int roundsToStop = 3;
        MonopolyDriver driver
                //= new MonopolyDriver(2); //udkommentér den gamle driver
                = new MonopolyIODriver(2, "MonopolyData.txt");// og Brug denne driver.fillFields();
        driver.fillBoard();
        //driver.play();
        //MonopolyDriver md = new MonopolyDriver();
       // MonopolyDriver.fillBoard();
        Player p1 = new Player("Mig", monopolyBoard[0]);
        Player p2 = new Player("Dig", monopolyBoard[0]);
        DiceCup cup = new DiceCup(6);

        do {
            p1.move(cup);
            p2.move(cup);

        } while ((p1.getRounds() <= roundsToStop) || (p2.getRounds() <= roundsToStop));
        System.out.println("Rounds played:\n" + "Player1: " + p1.getRounds() + "\nPlayer2: " + p2.getRounds());

    }
}
