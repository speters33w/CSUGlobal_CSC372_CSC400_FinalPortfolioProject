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
