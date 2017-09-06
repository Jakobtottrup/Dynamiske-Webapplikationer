/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jvt.lektion1;

import java.util.Scanner;

/**
 *
 * @author jakobtottrup
 */

public class Cup {
    static boolean cont = true;
    
    public static void main(String[] args) {
        
        while(cont = true){
            
            System.out.print("Welcome to die roller 5000. How many dice would you like to roll?");
            Scanner scan = new Scanner(System.in);
            int numDice = scan.nextInt();
            System.out.println("With how many sides?");
            int numSides = scan.nextInt();

            System.out.println("\nRolling "+numDice+" dice with "+numSides+" sides:");

            for(int i = 0; i< numDice; i++){
                Dice dice = new Dice(numSides);
                System.out.print(dice.roll()+"\t");
            }



            System.out.println("\nFinished rolling dice. Roll again? (y/n)");
        
            if (scan.hasNext("n")){
                cont = false;
                break;
            }
                
                
        }
    }
}
