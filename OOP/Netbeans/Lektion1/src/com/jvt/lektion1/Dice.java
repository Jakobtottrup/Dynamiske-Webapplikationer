/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jvt.lektion1;

/**
 *
 * @author jakobtottrup
 */
public class Dice  {
    int sides = 6;
    int face;

    Dice(int numSides) {
        sides = numSides;
        
    }

    public int roll(){
        face = (int) Math.ceil(Math.random() * sides);       
        return face;
    }
    
    
    
}
