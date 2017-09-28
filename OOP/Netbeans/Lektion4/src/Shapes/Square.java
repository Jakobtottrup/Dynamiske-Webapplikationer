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
public class Square extends Rectangle {

    private double d;

    public Square(double d) {
        super(d, d);
        this.d = d;
    }

    @Override
    public double getCircumference() {
        return 4 * d;
    }

    @Override
    public double getArea() {
        return Math.pow(d, 2);
    }

}
