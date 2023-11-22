package edu.csuglobal.csc372.milestone2.shapes;
/**
 * Abstract class for 2D shapes.
 * Extends Shape.java
 */
abstract class Shape2D extends Shape {

    /**
     * Calculates the area of the shape.
     *
     * @return the area of the shape.
     */
    abstract double area();

    /**
     * Calculates the perimeter of the shape.
     *
     * @return the perimeter of the shape.
     */
    abstract double perimeter();
}
