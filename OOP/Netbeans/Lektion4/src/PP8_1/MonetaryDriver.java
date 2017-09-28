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
public class MonetaryDriver {


    private static int total;
    private static MonetaryCoin coin;
    
    public static void main(String[] args) {
        for(int i = 0; i<10; i++){
            coin = new MonetaryCoin(10);
            System.out.println("Coin " + (i+1) + " value: " + coin.Value());
            coin.flip();
            System.out.println("Is Coin " + (i+1) + " heads?: " + coin.isHeads() + "\n");
            total += coin.Value();
        }
        System.out.println("Total value of 10 coins: " + total);
        
    }
    
    
}
