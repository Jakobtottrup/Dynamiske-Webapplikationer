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
public class pp2 {

    static int i1,i2,i3;
    public static void main(String[] args) {
        System.out.println("Input 3 integers: ");
        Scanner scan = new Scanner(System.in);
        i1 = scan.nextInt();
        i2 = scan.nextInt();
        i3 = scan.nextInt();
        System.out.println("Average: "+(float)(i1+i2+i3)/3);        
    }
}
