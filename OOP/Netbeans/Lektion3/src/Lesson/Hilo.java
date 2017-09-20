/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author jakobtottrup
 */
public class Hilo {

    /**
     * @param args the command line arguments
     */
    private static int randomNum;
    private static int guess;
    private static int numGuesses;
    private static boolean correct;

    public static void main(String[] args) {
       
        boolean playAgain;
        while (playAgain = true) {
            randomNum = ThreadLocalRandom.current().nextInt(1, 100 + 1);
            //System.out.println("Random number is: " + randomNum);
            correct = false;
            numGuesses = 0;
            System.out.println("Random number has been generated between 1-100. Guess it!");
            Scanner scan = new Scanner(System.in);
            while (!correct) {
                guess = scan.nextInt();
                numGuesses++;
                if (guess == randomNum) {
                    correct = true;
                    System.out.println("Correct! Amount of guesses: " + numGuesses);
                } else if (guess < randomNum) {
                    System.out.println("Incorrect! Random number is HIGHER");
                } else if (guess > randomNum) {
                    System.out.println("Incorrect! Random number is LOWER");
                }
            }
            System.out.println("Play again? (y/n)");
            if ("y".equals(scan.next())) {
                playAgain = false;
            }else{
                break;
            }
        }

    }

}
