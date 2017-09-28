/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PP8_1;

import java.util.Random;

/**
 *
 * @author jakobtottrup
 */
public class MonetaryCoin extends Coin {
    private static int value;
    private Random gen;

    public MonetaryCoin(int value) {
        this.value = value;
        this.gen = new Random();
    }
    public int Value(){
        return gen.nextInt(value)+1;
    }
    
    
}
