/*
CSU Global CSC 372 Module 4: Critical Thinking

Critical Thinking Assignment (70 Points)

Option #2:  Creating an Abstract Class Shape II

III.

Create a class "Triangle" that extends the Shape class with the following specifications:

    Attributes:
        length of side1, length of side2, length of side3, each is a double
    Constructor:
        Implement a parameterized constructor to initialize the data.
    toString:
        Implement a "toString" method that prints out the area and perimeter.

Implement methods to compute the area and perimeter.
 */
package edu.csuglobal.csc372.milestone2.shapes;

//CHECKSTYLE:OFF: checkstyle:magicnumber
public class Triangle extends Shape2D {

    private final double sideA;
    private final double sideB;
    private final double sideC;
    private final double height;

    /**
     * Constructs a triangle with the given sides.
     * Calculates the height of the triangle.
     *
     * @param sideA the length of the first side of the triangle.
     * @param sideB the length of the second side of the triangle.
     * @param sideC the length of the third side of the triangle.
     */
    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.height = (2 * area()) / sideB;
    }

    /**
     * Calculates the perimeter and area of the triangle.
     *
     * @return the calculations in human-readable format.
     */
    @Override
    public String toString() {
        return String.format("The area of a triangle with sides of length %f, %f, and %f is %f.%n" +
                             "The perimeter of a triangle with sides of length %f, %f, and %f is %f.%n%n",
                sideA, sideB, sideC, area(), sideA, sideB, sideC, perimeter());
    }

    /**
     * Calculates the area of the triangle.
     *
     * @return the area of the triangle.
     */
    @Override
    public double area() {
        double s = (this.sideA + this.sideB + this.sideC) / 2;
        return Math.sqrt(s * (s - this.sideA) * (s - this.sideB) * (s - this.sideC));
    }

    /**
     * Calculates the perimeter of the triangle.
     *
     * @return the perimeter of the triangle.
     */
    @Override
    public double perimeter() {
        return this.sideA + this.sideB + this.sideC;
    }

    /**
     * Returns the height of the triangle.
     *
     * @return the height of the triangle.
     */
    public double height() {
        return this.height;
    }
}
