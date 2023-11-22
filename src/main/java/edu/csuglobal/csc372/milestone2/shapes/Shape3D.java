package edu.csuglobal.csc372.milestone2.shapes;
/**
 * Abstract class for 3D shapes.
 * Extends Shape.java
 */
abstract class Shape3D extends Shape {

    /**
     * Calculates the surface area of the shape.
     *
     * @return the surface area of the shape.
     */
    abstract double surfaceArea();

    /**
     * Calculates the volume of the shape.
     *
     * @return the volume of the shape.
     */
    abstract double volume();

}
