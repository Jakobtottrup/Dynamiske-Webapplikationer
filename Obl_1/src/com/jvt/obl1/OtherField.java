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
public class OtherField implements FieldInterface {

    String name = "";
    int number;
    
    public OtherField(String name, int number) {
        this.name = name;
        this.number = number;
    }    
    
    @Override
    public void consequence(Player poorPlayer) {
        System.out.print("Du landede på: "+ "\033[35m"+ this.getName() +" ("+ (this.getNumber()+1)+ ")\033[0m");
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

    
}
