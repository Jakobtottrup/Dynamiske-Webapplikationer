package Shapes;

import java.util.ArrayList;

/*
 * Opgave i klassen, DynWeb OOP E16, Lektion 4
 * Implementer klasserne Ellipse og Rectangle, s� de extender Shape
 * Implementer klasserne Circle og Squere, s� de extender hhv Ellipse og Rectangle
 * Fjern ud-kommenteringerne i driver-klassens main()-metode efterh�nden, til test.
 * 
 * @author erso
 */
public class ShapeDriver {

    public static void main(String[] args) {

        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(new Rectangle(3.9, 4.1));
        shapes.add(new Ellipse(2.0, 3.0));
        shapes.add(new Square(4.0));
        shapes.add(new Circle(2.5));

        for (Shape sh : shapes) {
            System.out.println(sh);
        }
    }

}
