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
public class Teacher implements Speaker {

    public Teacher() {
    }

    @Override
    public void speak() {
        System.out.print("I'm a teacher");
    }

    @Override
    public void announce(String str) {
        System.out.println(str);
    }
    
}
