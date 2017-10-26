/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PP9_5;

/**
 *
 * @author jakobtottrup
 */
public class Politician implements Speaker {

    public static String str;

    public Politician() {
    }

    @Override
    public void speak() {
        System.out.print("I'm a politician");
    }

    @Override
    public void announce(String str) {
        this.str = "I lie often";
        System.out.println(str);
    }

}
