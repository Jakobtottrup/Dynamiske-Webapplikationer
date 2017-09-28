/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shapes;

/**
 *
 * @author jakobtottrup
 */
public class Ellipse extends Shape {

    double r2;
    double r1;

    public Ellipse(double r1, double r2) {
        this.r1 = r1;
        this.r2 = r2;
    }

    @Override
    public double getCircumference() {
        return 2 * Math.PI * (Math.sqrt((0.5 * (Math.pow(r1, 2) + Math.pow(r2, 2)))));
        //2*pi*(sqrt((0.5*(r1^2 + r2^2))
    }

    @Override
    public double getArea() {
        return Math.PI * r1 * r2;
    }

}
