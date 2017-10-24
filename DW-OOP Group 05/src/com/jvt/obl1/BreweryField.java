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
public class BreweryField extends OwnableField{
    
    public BreweryField(String name, int number, int price, int rent) {
        super(name, number, price, rent);
    }

    @Override
    public void consequence(Player poorPlayer) {
        System.out.print("Du landede på: " + "\033[32m" + this.getName() + " (" + (this.getNumber() + 1) + ")\033[0m");
        if (this.getOwner() == null && poorPlayer.getBalance() >= this.getPrice()) {
            System.out.println(" Feltet er frit. Vil du købe grunden? (y/n) Pris: " + this.getPrice() + "kr.");
            Scanner scan = new Scanner(System.in);
            String answer = null;

            while (!"y".equals(answer) && !"n".equals(answer)) {
                answer = scan.next();
            }

            if ("y".equals(answer)) {
                this.setOwner(poorPlayer);
                poorPlayer.setBalance(poorPlayer.getBalance() - this.getPrice());
                System.out.println("Grunden er købt!");
            } else {
                System.out.println("Grunden blev ikke købt!");
            }
        } else if (this.getOwner() != null) {
            System.out.println(" Feltet ejes af: " + "\033[46m" + this.getOwner().getName() + "\033[0m");
            if (this.getOwner().getName().equals(poorPlayer.getName())) {
                System.out.println(poorPlayer.getName() + " landede på sit eget felt!");
            } else {

                System.out.println("Du har landet på et felt ejet af en anden spiller!");
                poorPlayer.changeBalance(0 - this.getRent());
                poorPlayer.other.changeBalance(this.getRent());
                System.out.println("Du betaler " + this.getRent() + "kr. til " + poorPlayer.other.getName() + ". Du har nu " + poorPlayer.getBalance() + "kr. tilbage.");
            }
        } else {
            System.out.println("\nDu har ikke råd til at købe feltet!");
        }
    }

    @Override
    public String info() {
        return "Pris: " + this.getPrice() + "\tLeje: " + this.getRent();
    }

    
}
