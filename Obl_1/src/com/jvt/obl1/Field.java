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
public class Field {
    private String name;
    private int number;

    public Field(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    
    @Override
    public String toString() {
        return "Field{" + "name=" + name + ", number=" + number + '}';
    }
    
//    public static void main(String[] args) {
//        System.out.println(new Field("mig", 5));
//    }
//    
}
