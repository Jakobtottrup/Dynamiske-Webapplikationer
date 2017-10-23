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
public class MonopolyIODriver extends MonopolyDriver {

    private String fileName;

    public MonopolyIODriver(int noOfPlayers, String fileName) {
        //super(noOfPlayers);
        this.fileName = fileName;

    }
    
    
    
    @Override
    public void fillBoard() {
       
    }
    
}
