/*
CSU Global CSC 372 Module 4: Critical Thinking

Critical Thinking Assignment (70 Points)

Option #1: Creating an Abstract Class Shape I

Create an abstract class "Shape" with the following specifications:

    An abstract method "surface_area()" of return type double
    An abstract method "volume()" of return type double

 */
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
