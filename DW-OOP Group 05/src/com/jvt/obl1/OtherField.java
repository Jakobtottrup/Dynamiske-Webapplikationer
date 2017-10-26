/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jvt.obl1;

import java.util.Random;

/**
 *
 * @author jakobtottrup
 */
public class OtherField implements FieldInterface {

    String name = "";
    int number;
    private String type;

    public OtherField(String name, int number, String type) {
        this.name = name;
        this.number = number;
        this.type = type;
    }

    @Override
    public void consequence(Player poorPlayer) {
        System.out.println("Du landede på: " + "\033[35m" + this.getName() + " (" + (this.getNumber() + 1) + ")\033[0m");

        //BETAL SKAT
        if ("tax".equals(type)) {
            System.out.println("Du skal betale skat!");
            if ("Indkomstskat".equals(name)) {
                poorPlayer.changeBalance(-MonopolyConstants.INDKOMSTSKAT);
                System.out.println("Du betalte " + MonopolyConstants.INDKOMSTSKAT + "kr. i indkomstskat.");
            } else {
                poorPlayer.changeBalance(-MonopolyConstants.STATSSKAT);
                System.out.println("Du betalte " + MonopolyConstants.STATSSKAT + "kr. i statsskat.");
            }
            poorPlayer.showBalance();
        }

        //PRØV LYKKEN
        if ("?".equals(type)) {
            System.out.println("LYKKEHJULET!!! DAD ADAD AD AD ADA");
            Random rand = new Random();
            int chance = rand.nextInt(100);
            if (chance > 80) {
                System.out.println("Du har vundet 200kr!");
                poorPlayer.changeBalance(200);
            } else if (chance > 40 && chance < 80) {
                System.out.println("Du har vundet 50kr!");
                poorPlayer.changeBalance(50);
            } else if (chance > 10 && chance < 40) {
                System.out.println("Du skal betale 100kr til din modstander!");
                poorPlayer.changeBalance(-100);
                poorPlayer.other.changeBalance(100);
            } else {
                System.out.println("GÅ I FÆNGSEL! (så snart politibilen er fikset)");
            }
            poorPlayer.showBalance();
        }

        if ("parking".equals(type)) {
            System.out.println("Der er fri parkering. Her er godt at holde pause.");
        }

        if ("jail".equals(type)) {
            System.out.println("Du er på besøg i fængslet.");
        }
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String info() {
        return "";
    }

    public String getType() {
        return type;
    }

}
