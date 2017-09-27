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
public class Player {

    private String name;
    private Field currentField;
    private int rounds;

    public Player(String name, Field currentField) {
        this.name = name;
        this.currentField = currentField;
    }

    public void move(DiceCup cup) {

        do {
            if ("Mig".equals(this.name)) {
                System.out.println("Min tur: ");
            } else if ("Dig".equals(this.name)) {
                System.out.println("Din tur: ");
            }
            int steps = cup.throwCup();
            int oldPos = currentField.getNumber();
            int newPos = (oldPos + steps) % MonopolyDriver.monopolyBoard.length;
            currentField = MonopolyDriver.monopolyBoard[newPos];
            System.out.println(cup + "\nNyt felt: " + currentField.getName() + "\n");
            if (newPos < oldPos) {
                rounds++;
                System.out.println("\n========= START PASSERET!!!! ===========");
                //System.out.println("Player1 rounds: " +this.getRounds());
            }
        } //Check for dobbebltslag
        while (cup.isEqual());

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Field getCurrentField() {
        return currentField;
    }

    public void setCurrentField(Field currentField) {
        this.currentField = currentField;
    }

    int getRounds() {
        return this.rounds;
    }

}
