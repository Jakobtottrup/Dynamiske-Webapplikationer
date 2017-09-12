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
public class opg2 {
private static float num;
private static float num2;
private static long result;
private static long result2;

    public static void main(String[] args) {
        System.out.println("Enter two numbers to cube and then sum");
        Scanner scan = new Scanner(System.in);
        num = scan.nextInt();       
        num2 = scan.nextInt();
        result = (long) Math.pow(num, 3);
        result2 = (long) Math.pow(num2, 3);
        
        System.out.println(result + result2);
               
        
        
       
        
    }
    
}
