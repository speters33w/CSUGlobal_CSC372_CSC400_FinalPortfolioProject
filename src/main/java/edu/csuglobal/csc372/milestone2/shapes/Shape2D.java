/*
CSU Global CSC 372 Module 4: Critical Thinking

Critical Thinking Assignment (70 Points)

Option #2:  Creating an Abstract Class Shape II

Create an abstract class "Shape" with the following specifications:

    an abstract method "area()" of return type double
    an abstract method "perimeter()" of return type double.
 */

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
