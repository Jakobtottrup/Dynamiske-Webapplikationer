/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opgaver;

import java.util.Scanner;

/**
 *
 * @author jakobtottrup
 */
public class pp10 {
    private static int side;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter square side length: ");
        side = scan.nextInt();
        System.err.println("Perimiter: " + perimiter(side));
        System.out.println("Area: " + area(side));
        
    }

    private static float perimiter(int side) {
       return side*4;
    }

    private static float area(int side) {
       return (float) Math.pow(side, 2);
    }
    
}
