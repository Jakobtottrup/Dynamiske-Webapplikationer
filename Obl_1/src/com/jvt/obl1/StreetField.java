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
public class StreetField extends OwnableField {

    public StreetField(String name, int number, int price, int rent) {
        super(name, number, price, rent);
    }

    @Override
    public void consequence(Player poorPlayer) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
