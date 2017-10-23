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
    private FieldInterface currentField;
    private int rounds;

    public Player(String name, FieldInterface currentField) {
        this.name = name;
        this.currentField = currentField;
    }

    public void move(DiceCup cup) {

        do {

            int steps = cup.throwCup() + 2;
            if ("Spiller1".equals(this.name)) {
                System.out.print("\033[41mSpiller1\033[0m");
            } else if ("Spiller2".equals(this.name)) {
                System.out.print("\033[43mSpiller2\033[0m");
            }
            System.out.print(" står på " + currentField.getName() + " (" +  (currentField.getNumber()+1) +  "), og");
            //System.out.println("Nuværende felt#: " + currentField.getNumber()+" \tNavn: "+currentField.getName());
            int oldPos = currentField.getNumber();
            int newPos = (oldPos + steps) % MonopolyDriver.monopolyBoard.length;
            currentField = MonopolyDriver.monopolyBoard[newPos];

            //System.out.println(cup + "\nNyt felt: " +currentField.getNumber()+": "+currentField.getName() + "\n");
            currentField.consequence(this);
            System.out.print(" Efter at have slået: ");
            System.out.println(cup);
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

    public FieldInterface getCurrentField() {
        return currentField;
    }

    public void setCurrentField(FieldInterface currentField) {
        this.currentField = currentField;
    }

    int getRounds() {
        return this.rounds;
    }

    void setCurrentField(int JAIL_POS) {
        currentField = MonopolyDriver.monopolyBoard[10];
    }

}
