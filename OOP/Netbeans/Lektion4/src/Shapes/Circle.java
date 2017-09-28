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
public class Circle extends Ellipse {

    private final double d;

    public Circle(double d) {
        super(d, d);
        this.d = d;
    }

    @Override
    public double getCircumference() {
        return Math.PI * 2 * d;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(d, 2);
    }

}
