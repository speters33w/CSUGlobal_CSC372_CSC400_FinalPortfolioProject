package edu.csuglobal.csc372.milestone2.shapes;
//CHECKSTYLE:OFF: checkstyle:magicnumber

/**
 * Creates a right circular cylinder with the given radius and height.
 */
public class Cone extends Shape3D {

    private final double radius;
    private final double height;

    /**
     * Constructs a right circular cone with the given radius and height.
     *
     * @param radius the radius of the cone.
     * @param height the height of the cone.
     **/

    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    /**
     * Calculates surface area and volume of the cone.
     *
     * @return the calculations in human-readable format.
     */
    @Override
    public String toString() {
        return String.format("The surface area of a cone with radius %f and height %f is %f.%n" +
                             "The volume of a cone with radius %f and height %f is %f.%n%n",
                radius, height, surfaceArea(), radius, height, volume());
    }

    /**
     * Calculates the surface area of the cone.
     *
     * @return the surface area of the cone.
     */
    @Override
    public double surfaceArea() {
        return Math.PI * radius * (radius + Math.sqrt(Math.pow(radius, 2) + Math.pow(height, 2)));
    }

    /**
     * Calculates the volume of the cone.
     *
     * @return the volume of the cone.
     */
    @Override
    public double volume() {
        return Math.PI * Math.pow(radius, 2) * (height / 3);
    }
}
