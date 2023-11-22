/*
CSU Global CSC 372 Module 4: Critical Thinking

Critical Thinking Assignment (70 Points)

Option #2:  Creating an Abstract Class Shape II

II.

Create a class "Circle" that extends the Shape class with the following specifications:

    Attributes:
        radius

    Constructor:
        Implement a parameterized constructor to initialize the data.

    toString:
        Implement a "toString" method that prints out the area and perimeter.

Implement methods to compute the area and perimeter.
 */
package edu.csuglobal.csc372.milestone2.shapes;
//CHECKSTYLE:OFF: checkstyle:magicnumber

/**
 * Creates a Circle with the given radius.
 */
public class Circle extends Shape2D {

    private final double radius;

    /**
     * Constructs a circle with the given radius.
     *
     * @param radius the radius of the circle.
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Calculates the perimeter and area of the circle.
     *
     * @return the calculations in human-readable format.
     */
    @Override
    public String toString() {
        return String.format("The area of a circle with radius %f is %f.%n" +
                             "The perimeter of a circle with radius %f is %f.%n%n",
                radius, area(), radius, perimeter());
    }

    /**
     * Calculates the area of the circle.
     *
     * @return the area of the circle.
     */
    @Override
    public double area() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    /**
     * Calculates the perimeter of the circle.
     *
     * @return the perimeter of the circle.
     */
    @Override
    public double perimeter() {
        return 2 * Math.PI * this.radius;
    }
}
