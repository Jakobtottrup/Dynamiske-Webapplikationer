/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PP5_4;

/**
 *
 * @author jakobtottrup
 */
public class MultiSphere {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Sphere sphere1 = new Sphere((float) 3);
        Sphere sphere2 = new Sphere((float) 1.88238492348);
        Sphere sphere3 = new Sphere(20);
        float t1 = ((4 / 3));
        System.out.println(t1);

        sphere1.calcSurface();
        sphere1.calcVol();

        sphere2.calcSurface();
        sphere2.calcVol();

        sphere3.calcSurface();
        sphere3.calcVol();

        System.out.println(sphere1.toString());
        System.out.println(sphere2.toString());
        System.out.println(sphere3.toString());
    }

}
