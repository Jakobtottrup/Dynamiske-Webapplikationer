/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jvt.obl1;

import java.util.Scanner;

/**
 *
 * @author jakobtottrup
 */
public class StreetField extends OwnableField {

    public StreetField(String name, int number, int price, int rent) {
        super(name, number, price, rent);
    }

    @Override
    public void consequence(Player poorPlayer) {
        System.out.print("Du landede på: " + "\033[32m" + this.getName() + " (" + (this.getNumber() + 1) + ")\033[0m");
        if (this.getOwner() == null) {
            System.out.println(" Feltet er frit. Vil du købe grunden? (y/n) Pris: "+this.getPrice() + "kr.");
            Scanner scan = new Scanner(System.in);
            if ("y".equals(scan.next())) {
                this.setOwner(poorPlayer);
                poorPlayer.setBalance(poorPlayer.getBalance() - this.getPrice());
                System.out.println("Grunden er købt!");
            } else if ("n".equals(scan.next())) {
                System.out.println("Grunden blev ikke købt!");
            }
        } else {
            System.out.println("Feltet ejes af: " + this.getOwner());
            

            // PAY RENT
//            if ("Spiller1".equals(poorPlayer.getName())) {
//                poorPlayer.setBalance(poorPlayer.getBalance() - this.getRent());
//
//            } else if ("Spiller2".equals(poorPlayer.getName())) {
//
//            }
        }
        /*
      Konsekvens: Hvis feltet ikke ejes - kan det købes for prisen, ellers skal der betales leje
         */
    }

    @Override
    public String info() {
        return "Pris: " + this.getPrice() + "\tLeje: " + this.getRent();
    }

}
