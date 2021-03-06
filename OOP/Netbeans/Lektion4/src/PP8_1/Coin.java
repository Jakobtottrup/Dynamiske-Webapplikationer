/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PP8_1;

/**
 *
 * @author jakobtottrup
 */
public class Coin {

    //private final int HEADS = 0; // tails is 1
    private boolean face; // current side showing

    // -----------------------------------------------------
    // Sets up this coin by flipping it initially.
    // -----------------------------------------------------
    public Coin() {
        flip();
    }

    // -----------------------------------------------------
    // Flips this coin by randomly choosing a face value.
    // -----------------------------------------------------
    public void flip() {
        if (1 == (int) (Math.random() * 2)) {
            face = false;
        } else {
            face = true;
        }

    }

    // -----------------------------------------------------
    // Returns true if the current face of this coin is heads.
    // -----------------------------------------------------
    public boolean isHeads() {
        return face;
    }

    // -----------------------------------------------------
    // Returns the current face of this coin as a string.
    // -----------------------------------------------------
    public String toString() {
        return (face == true) ? "Heads" : "Tails";
    }
}
