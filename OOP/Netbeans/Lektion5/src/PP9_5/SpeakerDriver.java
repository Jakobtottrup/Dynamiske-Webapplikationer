/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PP9_5;

import java.util.ArrayList;

/**
 *
 * @author jakobtottrup
 */
public class SpeakerDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        ArrayList<Speaker> speakers = new ArrayList<>();
//        String str = null;
//        speakers.add(new Politician());
//        speakers.add(new Teacher());
//        speakers.add(new Radiohost());
//
//        for (Speaker sp : speakers) {
//            sp.speak();
//            if (sp instanceof Politician) {
//                str = "\tI lie often";
//            } else if (sp instanceof Teacher) {
//                str = "\t\tI teach people and they listen.. sometimes";
//            } else if (sp instanceof Radiohost) {
//                str = "\t\tI talk alot and people don't listen";
//            }
//            sp.announce(str);
//
//        }

        Speaker current;

        current = new Politician();
        current.speak();
        String str = null;
        if (current instanceof Politician) {
            str = "\tI lie often";
        }
        current.announce(str);
        
        
        current = new Teacher();
        current.speak();
        if (current instanceof Teacher) {
            str = "\t\tI teach people and sometimes they listen..";
        }
        current.announce(str);

        current = new Radiohost();
        current.speak();
        if (current instanceof Radiohost) {
            str = "\t\tI talk a lot and people rarely listen";
        }
        current.announce(str);

    }

}
