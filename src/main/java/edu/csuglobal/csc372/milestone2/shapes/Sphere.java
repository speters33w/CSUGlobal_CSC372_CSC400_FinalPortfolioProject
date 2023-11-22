package edu.csuglobal.csc372.milestone2.shapes;

//CHECKSTYLE:OFF: checkstyle:magicnumber

/**
 * Creates a sphere with the given radius.
 */
public class Sphere extends Shape3D {

    private final double radius;

    /**
     * Constructs a sphere with the given radius.
     *
     * @param radius the radius of the sphere.
     */
    public Sphere(double radius) {
        this.radius = radius;
    }

    /**
     * Calculates the surface area and volume of the sphere.
     *
     * @return the calculations in human-readable format.
     */
    @Override
    public String toString() {
        return String.format("The surface area of a sphere with radius %f is %f.%n" +
                             "The volume of a sphere with radius %f is %f.%n%n",
                radius, surfaceArea(), radius, volume());
    }

    /**
     * Calculates the surface area of the sphere.
     *
     * @return the surface area of the sphere.
     */
    @Override
    public double surfaceArea() {
        return 4 * Math.PI * Math.pow(this.radius, 2);
    }

    /**
     * Calculates the volume of the sphere.
     *
     * @return the volume of the sphere.
     */
    @Override
    public double volume() {
        return (4 / 3d) * Math.PI * Math.pow(this.radius, 3);
    }
}
