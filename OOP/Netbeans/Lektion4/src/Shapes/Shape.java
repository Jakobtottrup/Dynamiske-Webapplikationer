package Shapes;



/*
 * Opgave i klassen, DynWeb OOP E16, Lektion 4
 * Implementer klasserne Ellipse og Rectangle, s� de extender Shape
 * Implementer klasserne Circle og Squere, s� de extender hhv Ellipse og Rectangle
 * Fjern ud-kommenteringerne i driver-klassens main()-metode efterh�nden, til test.
 * 
 * @author erso
 */
public abstract class Shape {
    
    public abstract double getCircumference();
    public abstract double getArea();

    @Override
    public String toString() {
        return "Shape: " + getClass().getSimpleName() + " Area=" + getArea() 
                + " Circum: " + getCircumference();
    }
    
}
