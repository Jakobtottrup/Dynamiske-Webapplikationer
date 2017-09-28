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
public class Rectangle extends Shape {

    double d;
    double d1;

    public Rectangle(double d, double d1) {
        this.d = d;
        this.d1 = d1;
    }

    @Override
    public double getCircumference() {
        return ((2 * d) + (2 * d1));
    }

    @Override
    public double getArea() {
        return d * d1;
    }

}
