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

    public int move(DiceCup cup) {

        do {
            System.out.println(this + " throws ");
            int steps = cup.throwCup();
            int oldPos = currentField.getNumber();
            int newPos = (oldPos + steps) % MonopolyDriver.monopolyBoard.length;
            currentField = MonopolyDriver.monopolyBoard[newPos];
            System.out.println(cup + " and landed on " + currentField);
            if (newPos < oldPos) {
                rounds++;
            }
        }

            while (cup.isEqual()); 
        
        //temp return statement
        return 0;


    
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

}
