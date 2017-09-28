/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PP8_4;

/**
 *
 * @author jakobtottrup
 */
public class Driver {

    static Football s1 = new Football("Barcelona",90, 11, true);
    static Tennis s2 = new Tennis("Wimbledon",100, 2, true);
    static Darts s3 = new Darts("CoolDarts",20, 2, false);
    static Formula1 f1 = new Formula1("Silverstone",120, 20, false);

    public static void main(String[] args) {

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(f1);

    }

}
