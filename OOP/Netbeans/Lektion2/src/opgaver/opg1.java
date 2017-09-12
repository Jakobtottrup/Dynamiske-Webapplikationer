/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opgaver;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author jakobtottrup
 */
public class opg1 {
    static int min = 10;
    static int max = 99;
    static int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);
    
    public static void main(String[] args) {
        System.out.println("Enter first and then last name");
        Scanner scan = new Scanner(System.in);
        String fname = scan.next();
        String lname = scan.next();
        while(lname.length() < 5){
            lname += "_";
        }
        String usrname = (fname.substring(0, 1) + lname.substring(0, 4));
        System.out.println("Your username is: "+usrname+randomNum);

    }

}
