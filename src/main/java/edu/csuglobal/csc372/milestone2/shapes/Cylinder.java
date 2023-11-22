package edu.csuglobal.csc372.milestone2.shapes;
//CHECKSTYLE:OFF: checkstyle:magicnumber

/**
 * Creates a right circular cylinder with the given radius and height.
 */
public class Cylinder extends Shape3D {

    private final double radius;
    private final double height;

    /**
     * Constructs a right cylinder with the given radius and height.
     *
     * @param radius the radius of the cylinder.
     * @param height the height of the cylinder.
     **/

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    /**
     * Calculates surface area and volume of the cylinder.
     *
     * @return the calculations in human-readable format.
     */
    @Override
    public String toString() {
        return String.format("The surface area of a cylinder with radius %f and height %f is %f.%n" +
                             "The volume of a cylinder with radius %f and height %f is %f.%n%n",
                radius, height, surfaceArea(), radius, height, volume());
    }

    /**
     * Calculates the surface area of the cylinder.
     *
     * @return the surface area of the cylinder.
     */
    @Override
    public double surfaceArea() {
        return (2 * Math.PI * radius * height) + (2 * Math.PI * Math.pow(radius, 2));
    }

    /**
     * Calculates the volume of the cylinder.
     *
     * @return the volume of the cylinder.
     */
    @Override
    public double volume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }
}
