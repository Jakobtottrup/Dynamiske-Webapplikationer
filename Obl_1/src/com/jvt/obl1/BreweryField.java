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
public class BreweryField extends OwnableField{
    
    public BreweryField(String name, int number, int price, int rent) {
        super(name, number, price, rent);
    }

    @Override
    public void consequence(Player poorPlayer) {
        System.out.print(" landede på: "+ "\033[33m"+ this.getName() +" ("+ (this.getNumber()+1)+ ")\033[0m");
    }

    
}
