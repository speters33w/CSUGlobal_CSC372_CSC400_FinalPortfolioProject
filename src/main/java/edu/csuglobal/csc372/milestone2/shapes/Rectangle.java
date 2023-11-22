/*
CSU Global CSC 372 Module 4: Critical Thinking

Critical Thinking Assignment (70 Points)

Option #2:  Creating an Abstract Class Shape II

I.

Create a class "Rectangle" that extends the Shape class with the following specifications:

    Attributes:
        width, length

    Constructor:
        Implement a parameterized constructor needed initialize the data.

    toString:
        Implement a "toString" method that prints out the area and perimeter.

Implement methods to compute the area and perimeter.
 */
package edu.csuglobal.csc372.milestone2.shapes;
//CHECKSTYLE:OFF: checkstyle:magicnumber

/**
 * Creates a rectangle with the given width and height.
 */
public class Rectangle extends Shape2D {

    private final double width;
    private final double height;

    /**
     * Constructs a rectangle with the given width and height.
     *
     * @param width  the width of the rectangle.
     * @param height the height of the rectangle.
     */
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    /**
     * Calculates the perimeter and area of the rectangle.
     *
     * @return the calculations in human-readable format.
     */
    @Override
    public String toString() {
        return String.format("The area of a rectangle with width %f and height %f is %f.%n" +
                             "The perimeter of a rectangle with width %f and height %f is %f.%n%n",
                width, height, area(), width, height, perimeter());
    }

    /**
     * Calculates the area of the rectangle.
     *
     * @return the area of the rectangle.
     */
    @Override
    public double area() {
        return this.width * this.height;
    }

    /**
     * Calculates the perimeter of the rectangle.
     *
     * @return the perimeter of the rectangle.
     */
    @Override
    public double perimeter() {
        return 2 * (this.width + this.height);
    }
}
