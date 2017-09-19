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
public class Sphere {

    private float diameter;
    private float volume;
    private float surface;
    //private final float radius = diameter / 2;

    public Sphere(float diameter) {
        this.diameter = diameter;
    }

    public float getDiameter() {
        return diameter;
    }

    public void setDiameter(float diameter) {
        this.diameter = diameter;
    }
    
    //V = (4/3)πr^3
    public float calcVol() {
        float radius = diameter/2;
        return volume = (float) ((1.333333)*(Math.PI)*(Math.pow(radius, 3)));
                
        

    }
    //A = 4πr^2
    public float calcSurface() {
        float radius = diameter/2;
        return surface = (float) (4*(Math.PI)*(Math.pow(radius, 2)));
    }

    @Override
    public String toString() {
        return "Sphere{" + "diameter=" + diameter + ", volume=" + volume + ", surface=" + surface + '}';
    }

}
