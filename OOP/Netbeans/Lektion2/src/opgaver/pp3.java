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
public class pp3 {


    private static float f1, f2;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        f1 = scan.nextFloat();
        f2 = scan.nextFloat();
        System.out.println("Sum: "+sum(f1, f2));
        System.out.println("Difference: " + diff(f1, f2));
        System.out.println("Product: "+ prod(f1, f2));
    }
    private static float sum(float f1, float f2) {
        return f1+f2;
    }
    private static float diff(float f1, float f2) {
        return f1-f2;
    }
    private static float prod(float f1, float f2) {
        return f1*f2;
    }
}
