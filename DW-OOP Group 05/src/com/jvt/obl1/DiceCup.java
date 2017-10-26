/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jvt.obl1;

/**
 * Raflebaeger med to vilkaarlige terninger.
 *
 * @author erso
 */
public class DiceCup {

    private Die d1;
    private Die d2;
    private int eyes1; // Husker sidste kast
    private int eyes2;

    public DiceCup(int size) {
        d1 = new Die(size);
        d2 = new Die(size);
    }

    public int throwCup() {
        eyes1 = d1.throwDie();
        eyes2 = d2.throwDie();
        return eyes1 + eyes2;
    }

    // Tjek for 2 ens
    public boolean isEqual() {
        return eyes1 == eyes2;
    }

    @Override
    public String toString() {
        if (eyes1 == eyes2) {
            return (eyes1 + 1 + eyes2 + 1) + "\nTerning1: " + (eyes1 + 1) + "\t Terning2: " + (eyes2 + 1) + ")\tDOBBELTSLAG!\n";
        } else {
            return (eyes1 + 1) + (eyes2 + 1) + "\n(Terning1: " + (eyes1 + 1) + "\t Terning2: " + (eyes2 + 1) + ")\n";
        }
    }
}